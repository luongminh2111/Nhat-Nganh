package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
public class LoginDAO {
    public Connection DatabaseLink;
    public Connection ConnectionDb()
    {
        String DatabaseName="Computer";
        String DatabaseUser="postgres";
        String Databasepass="luongminh";
        String url= "jdbc:postgresql://localhost:5432/" + DatabaseName;
        try
        {
            Class.forName("org.postgresql.Driver");
            DatabaseLink= DriverManager.getConnection(url,DatabaseUser,Databasepass);

        }catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return DatabaseLink;
    }

}
