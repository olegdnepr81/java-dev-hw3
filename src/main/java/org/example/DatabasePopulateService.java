package org.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class DatabasePopulateService {
    public static void main(String[] args) throws IOException, SQLException {

        Connection conn = Database.getInstance().getConnection();
        String workerSql = " INSERT INTO WORKER ( NAME, BIRTHDAY, LEVEL, SALARY) VALUES (?, ?, ?, ?)";
        PreparedStatement stat = conn.prepareStatement(workerSql);

        for (int i = 0; i < PopulateDb.workers.length; i++) {
            Worker worker = new Worker();
            worker = PopulateDb.workers[i];
            stat.setString(1, worker.getName());
            stat.setString(2, worker.getBirthday());
            stat.setString(3, worker.getLevel());
            stat.setDouble(4, worker.getSalary());
            stat.executeUpdate();
        }

        String clientsSql = " INSERT INTO CLIENT ( NAME) VALUES (?)";
        PreparedStatement statClients = conn.prepareStatement(clientsSql);

        for (int i = 0; i < PopulateDb.clients.length; i++) {
            Client client;
            client = PopulateDb.clients[i];
            statClients.setString(1, client.getName());
            statClients.executeUpdate();
        }

        String projectSql = " INSERT INTO PROJECT (CLIENT_ID, START_DATE, FINISH_DATE) VALUES (?, ?, ?)";
        PreparedStatement statProject = conn.prepareStatement(projectSql);

        for (int i = 0; i < PopulateDb.projects.length; i++) {
            Project project = new Project();
            project = PopulateDb.projects[i];
            statProject.setLong(1, project.getClientId());
            statProject.setString(2, project.getStartDate());
            statProject.setString(3, project.getEndDate());

            statProject.executeUpdate();
        }

        String projectWorkerSql = " INSERT INTO PROJECT_WORKER (PROJECT_ID, WORKER_ID) VALUES (?, ?)";
        PreparedStatement statProjectWorker = conn.prepareStatement(projectWorkerSql);

        for (int i = 0; i < PopulateDb.projectWorkers.length; i++) {
            ProjectWorker projectWorker = new ProjectWorker();
            projectWorker = PopulateDb.projectWorkers[i];
            statProjectWorker.setLong(1, projectWorker.getProjectId());
            statProjectWorker.setLong(2, projectWorker.getWorkerId());
            statProjectWorker.executeUpdate();
        }

        System.out.println("--------------------------------------");

        PreparedStatement prepWorker = conn.prepareStatement("Select * from Worker");
        ResultSet rsWorker = prepWorker.executeQuery();
        while (rsWorker.next()) {
            System.out.println(rsWorker.getString("NAME") + " " +
                    rsWorker.getString("BIRTHDAY") + " " +
                    rsWorker.getString("LEVEL") + " " +
                    rsWorker.getInt("SALARY"));
        }

        System.out.println("--------------------------------------");

        PreparedStatement prepClient = conn.prepareStatement("Select * from Worker");
        ResultSet rsClient = prepClient.executeQuery();
        while (rsClient.next()) {
            System.out.println(rsClient.getString("NAME"));
        }

        System.out.println("--------------------------------------");

        PreparedStatement prepProject = conn.prepareStatement("Select * from PROJECT");
        ResultSet rsProject = prepProject.executeQuery();
        while (rsProject.next()) {
            System.out.println(rsProject.getLong("CLIENT_ID") + " " +
                    rsProject.getString("START_DATE") + " " +
                    rsProject.getString("FINISH_DATE"));
        }

        System.out.println("--------------------------------------");

        PreparedStatement prepProjectWorker = conn.prepareStatement("Select * from PROJECT_WORKER");
        ResultSet rsProjectWorker = prepProjectWorker.executeQuery();
        while (rsProjectWorker.next()) {
            System.out.println(rsProjectWorker.getLong("PROJECT_ID") + " " +
                    rsProjectWorker.getLong("WORKER_ID"));
        }

        System.out.println("--------------------------------------");

    }
}
