import java.sql.*;

public class ExecuteQuery01 {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
        Statement statement = connection.createStatement();


        //1. Örnek:  region_id'si 1 olan "country_name" değerlerini çağırın.;
        System.out.println("\n===== 1. Örnek =====\n");
        String sql1 = "SELECT country_name FROM countries WHERE region_id = 1";
        boolean r1 = statement.execute(sql1);
        System.out.println("r1 = " + r1);//true ==> DQL ile data çağırıyoruz

        //Datayı çağırıp okumak için executeQuery methodunu kullanmalıyız. execute() methodu sadece tru yada false döner
        ResultSet resultSet = statement.executeQuery(sql1);

        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }

        //2.Örnek: "region_id"nin 2'den büyük olduğu "country_id" ve "country_name" değerlerini çağırın.
        System.out.println("\n===== 2. Örnek =====\n");
        String sql2 = "SELECT country_id, country_name FROM countries WHERE region_id > 2";

        ResultSet resultSet2 = statement.executeQuery(sql2);

        while (resultSet2.next()) {
            System.out.println(resultSet2.getObject(1) + "-- " + resultSet2.getObject(2));
        }

        //3.Örnek: "number_of_employees" değeri en düşük olan satırın tüm değerlerini çağırın.
        System.out.println("\n===== 3. Örnek =====\n");
        String sql3 = "SELECT * FROM companies WHERE number_of_employees = (SELECT MIN(number_of_employees) FROM companies)";
        ResultSet resultSet3 = statement.executeQuery(sql3);

        while (resultSet3.next()) {
            System.out.println(resultSet3.getObject(1) + "--" + resultSet3.getObject(2) + "--" + resultSet3.getObject(3));
        }

        connection.close();
        statement.close();
    }
}
