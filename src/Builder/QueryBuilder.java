package Builder;

public interface QueryBuilder {
    QueryBuilder select(String table, String... columns);
    QueryBuilder where(String columns, String operator,Object value);
    QueryBuilder limit(int start, int offset);
    String Build();
}
