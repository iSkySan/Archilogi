package hexagonale;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceDataImpl extends DataSQLite implements ServiceData {
    public ServiceDataImpl() {
        super();
        try (Statement statement = getConnection().createStatement()) {
            statement.setQueryTimeout(30);
//            statement.executeUpdate("DROP TABLE service");
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS service (" +
                            "   id INTEGER PRIMARY KEY, " +
                            "   nom TEXT" +
                            ")");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    @Override
    public List<ServiceDTO> getAll() {
        List<ServiceDTO> services = new ArrayList<>();

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM service")) {

            while (resultSet.next()) {
                ServiceDTO service = new ServiceDTO(resultSet.getInt("id"),
                        resultSet.getString("nom"));
                services.add(service);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return services;
    }

    @Override
    public ServiceDTO get(final int id) {
        ServiceDTO service = null;

        try (PreparedStatement preparedStatement = getConnection().prepareStatement("SELECT * FROM service WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    service = new ServiceDTO(resultSet.getInt("id"),
                            resultSet.getString("nom"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return service;
    }

    @Override
    public void add(ServiceDTO service) {
        try (PreparedStatement preparedStatement = getConnection().prepareStatement("INSERT INTO service (nom) VALUES (?)")) {
            preparedStatement.setString(1, service.getNom());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(ServiceDTO service) {
        try (PreparedStatement preparedStatement = getConnection().prepareStatement("UPDATE service SET nom = ?WHERE id = ?")) {
            preparedStatement.setString(1, service.getNom());
            preparedStatement.setInt(2, service.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (PreparedStatement preparedStatement = getConnection().prepareStatement("DELETE FROM service WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
