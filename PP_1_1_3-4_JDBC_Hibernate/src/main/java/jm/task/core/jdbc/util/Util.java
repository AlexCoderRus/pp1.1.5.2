package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/myfirstsql_test";
    private static final String USER = "root";
    private static final String PASSWORD = "Rhenbpyfpdjybn1996";
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties prop = new Properties();
                prop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                prop.put(Environment.URL, URL);
                prop.put(Environment.USER, USER);
                prop.put(Environment.PASS, PASSWORD);
                prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

                prop.put(Environment.SHOW_SQL, "true");

                prop.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                prop.put(Environment.HBM2DDL_AUTO, "");

                configuration.setProperties(prop);

                sessionFactory = configuration.addAnnotatedClass(User.class).buildSessionFactory();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
    public static Connection getConnection() {

        Connection connection = null;

        try  {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (!connection.isClosed())
                System.out.println("Соединение установлено");
                return connection;
        }catch (SQLException ex){
            System.err.println("Соединение не установлено");
            ex.printStackTrace();
        }

       return connection; 
    }
}
