/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annam
 */
public class DriverManager {
        
    try static {
        Connection con = DriverManager.getConnection(
        "jdbc:postgresql://localhost/mydb", "dbuser", "secret");
    }
    catch (SQLException e) {
 e.printStacktrace();
}

}
