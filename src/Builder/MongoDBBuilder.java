package Builder;

public class MongoDBBuilder implements QueryBuilder {
    private String limit = "";
    private String where = "";
    private String select = "";

    @Override
    public QueryBuilder select(String table, String... columns) {
        this.select = String.format("db. %s.find({},{%s})", table, String.join(", ", columns));
        return this;
    }
    public QueryBuilder where(String column, String operator, Object value) {
        this.where = ".where(" + column + " " + operator + " " + value + ")";
        return this;
    }
    public QueryBuilder limit(int start, int offset) {
        this.limit = ".limit(" + start + ", " + offset + ")";
        return this;
    }
    public String Build() {
        return this.select + this.where + this.limit;
    }

}
