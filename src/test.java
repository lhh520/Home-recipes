import java.sql.*;
public class test {
    Connection con;
    public Connection getConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            System.out.println("���ݿ��������سɹ�");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/home_eat?characterEncoding=UTF-8","root","31415926");
            System.out.println("���ݿ����ӳɹ�");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        test c = new test();
        c.getConnection();
    }
}