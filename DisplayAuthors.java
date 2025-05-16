import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayAuthors {
    static final String DATABASE_URL = "jdbc:mysql://localhost//book";
public static void main(String[] args) {
    Connection connection = null; //manages connection;
    Statement statement = null; // query statement 
    ResultSet resultSet = null; // manages results

    try{
        //establish connection to database
        connection = DriverManager.getConnection(
            DATABASE_URL, "books", "books"
        );
        //create statement for querying database
        statement = connection.createStatement();
        //query database
        resultSet = statement.executeQuery("SELECT AuthorID, FirstName, LastName FROM authors");

        //process query results

        ResultSetMetaData metaData = resultSet.getMetaData();
        int numberOfColumns = metaData.getColumnCount();
        System.out.println("Authors Table of Books Database : \n");
        for(int i = 1; i <= numberOfColumns; i++)
        System.out.printf("%-8s\t", metaData.getColumnName(i));
        System.out.println();
        while(resultSet.next()){
            for(int i = 1; i<= numberOfColumns; i++)
            System.out.printf("%-8s \t", resultSet.getObject(i) );
            System.out.println();
        }//end while
    }//end try
    catch(SQLException sqlException){
        sqlException.printStackTrace();
    }//end catch
    finally{//ensure resultSet, statement and connection are closed
        try{
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }
}
}