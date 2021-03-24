import java.sql.Connection;

public class DBUtil {
    private Connection conn;
    public Connection geTConnection(){
        System.out.println("连接数据库");
        return conn;
    }
}
