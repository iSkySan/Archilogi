import Builder.MongoDBBuilder;
import Builder.MysqlQueryBuilder;
import Builder.PostgresQueryBuilder;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
    public static void main(String[] args) {
//        exo1.Singleton instance = exo1.Singleton.getInstance();
//        System.out.println(instance.GetMessage());
//        instance.SetMessage("salut toi!");
//        System.out.println(instance.GetMessage());
//        exo1.Singleton anotherInstance = exo1.Singleton.getInstance();
//        System.out.println(anotherInstance.GetMessage());

        MysqlQueryBuilder mysqlQueryBuilder = new MysqlQueryBuilder();
        String mysqlQuery = mysqlQueryBuilder.select("users", "name", "email")
                .where("age", ">", 18)
                .limit(10, 20)
                .Build();
        System.out.println("MySQL Query: " +mysqlQuery);

        PostgresQueryBuilder postgresQueryBuilder = new PostgresQueryBuilder();
        String postgresQuery = postgresQueryBuilder.select("users", "name", "email")
                .where("age", ">", 18)
                .limit(10, 20)
                .Build();
        System.out.println("Postgres Query: "+postgresQuery);

        MongoDBBuilder mongoDBBuilder = new MongoDBBuilder();
        String mongoDBQuery = mongoDBBuilder.select("users", "name", "email")
                .where("age", ">", 18)
                .limit(10, 20)
                .Build();
        System.out.println("MongoDB Query: "+mongoDBQuery);

    }

}

