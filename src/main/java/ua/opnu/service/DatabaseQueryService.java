package ua.opnu.service;

import ua.opnu.database.Database;

import java.sql.*;

import ua.opnu.model.*;
import ua.opnu.SqlReader;
import ua.opnu.model.MaxProjectCountClient;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {

    public List<MaxProjectCountClient> findMaxProjectsClient() {
            List<MaxProjectCountClient> result = new ArrayList<>();
            String sql = SqlReader.readSqlFile("sql/find_max_projects_client.sql");


            try (PreparedStatement ps = Database.getInstance().getConnection().prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    result.add(new MaxProjectCountClient(
                            rs.getString("name"),
                            rs.getInt("project_count")
                    ));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }

    public List<LongestProject> findLongestProject() {
        List<LongestProject> result = new ArrayList<>();
        String sql = SqlReader.readSqlFile("sql/find_longest_project.sql");

        try (PreparedStatement ps = Database.getInstance().getConnection().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                result.add(new LongestProject(
                        rs.getString("NAME"),
                        rs.getInt("MONTH_COUNT")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<MaxSalaryWorker> findMaxSalaryWorker() {
        List<MaxSalaryWorker> result = new ArrayList<>();
        String sql = SqlReader.readSqlFile("sql/find_max_salary_worker.sql");

        try (PreparedStatement ps = Database.getInstance().getConnection().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                result.add(new MaxSalaryWorker(
                        rs.getString("NAME"),
                        rs.getInt("SALARY")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<YoungestEldestWorker> findYoungestEldestWorkers() {
        List<YoungestEldestWorker> result = new ArrayList<>();
        String sql = SqlReader.readSqlFile("sql/find_youngest_eldest_workers.sql");

        try (PreparedStatement ps = Database.getInstance().getConnection().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                result.add(new YoungestEldestWorker(
                        rs.getString("TYPE"),
                        rs.getString("NAME"),
                        rs.getString("BIRTHDAY")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}