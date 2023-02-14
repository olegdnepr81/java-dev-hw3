package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitService {
    public static void main(String[] args) throws IOException, SQLException {
        Connection conn = Database.getInstance().getConnection();
        String sql = String.join("\n",
                     Files.readAllLines(Paths.get("sql/init_db.sql")));

        PreparedStatement stat = conn.prepareStatement(sql);
        stat.executeUpdate();

    }
}
