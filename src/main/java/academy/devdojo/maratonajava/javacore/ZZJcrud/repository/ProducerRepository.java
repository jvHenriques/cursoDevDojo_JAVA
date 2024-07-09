package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;


import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        log.info("Finding producers by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.info("error while trying to find all producer", e);
        }
        return producers;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding producers by id '{}'", id);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            return Optional.of(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
        } catch (SQLException e) {
            log.info("error while trying to find all producer", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatementFindById(Connection connection, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where id = ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(conn, id)) {
            ps.execute();
            log.info("delete producer '{}' from DataBase", id);
        } catch (SQLException e) {
            log.info("error while trying to delete producer '{}' in the DataBase", id, e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }


    public static void save(Producer producer) {
        log.info("Saving producers '{}'", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementSave(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.info("error while trying to update producer '{}' in the DataBase", producer.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection connection, Producer producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static void update(Producer producer) {
        log.info("updating producer '{}'", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = creatPreparedStatementUpdate(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.info("error while trying to update producer '{}' in the DataBase", producer.getId(), e);
        }
    }

    private static PreparedStatement creatPreparedStatementUpdate(Connection connection, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }
}
