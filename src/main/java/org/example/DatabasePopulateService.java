package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DatabasePopulateService {
    public static void main(String[] args) throws IOException, SQLException {
        Connection conn = Database.getInstance().getConnection();
        String sql = String.join("\n",
                Files.readAllLines(Paths.get("sql/populate_db.sql")));
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.executeUpdate();

    }
}
