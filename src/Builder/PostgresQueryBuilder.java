package Builder;

public class PostgresQueryBuilder implements QueryBuilder {
    private String limit = "";
    private String where = "";
    private String select = "";

    @Override
    public QueryBuilder select(String table, String... columns) {
        this.select = "SELECT " + String.join(", ", columns) + " FROM " + table;
        return this;
    }
    public QueryBuilder where(String column, String operator, Object value) {
        this.where = " WHERE " + column + " " + operator + " " + value;
        return this;
    }
    public QueryBuilder limit(int start, int offset) {
        this.limit = " LIMIT " + start + " OFFSET " + offset;
        return this;
    }
    public String Build() {
        return this.select + this.where + this.limit;
    }

}
