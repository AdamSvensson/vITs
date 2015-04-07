/**
 * Created on: 2015-04-01
 * Klas Tärnström
 * klas ( at ) tarnstrom.se
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class DBConnect {

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;


    public void readDataBase() throws Exception {
        try {
            // Laddar MySQL-driver.
            Class.forName("com.mysql.jdbc.Driver");
            // Setup för DB-uppkopplingen
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/feedback?"
                            + "user=root&password=")
        }
    }
}
