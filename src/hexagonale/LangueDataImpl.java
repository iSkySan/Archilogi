package hexagonale;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LangueDataImpl extends DataSQLite implements LangueData {
    public LangueDataImpl() {
        super();
        try (Statement statement = getConnection().createStatement()) {
            statement.setQueryTimeout(30);
//            statement.executeUpdate("DROP TABLE langue");
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS langue (" +
                            "   id INTEGER PRIMARY KEY, " +
                            "   nom TEXT" +
                            ")");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    @Override
    public List<LangueDTO> getAll() {
        List<LangueDTO> langues = new ArrayList<>();

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM langue")) {

            while (resultSet.next()) {
                LangueDTO langue = new LangueDTO(resultSet.getInt("id"),
                        resultSet.getString("nom"));
                langues.add(langue);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return langues;
    }

    @Override
    public LangueDTO get(final int id) {
        LangueDTO langue = null;

        try (PreparedStatement preparedStatement = getConnection().prepareStatement("SELECT * FROM langue WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    langue = new LangueDTO(resultSet.getInt("id"),
                            resultSet.getString("nom"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return langue;
    }

    @Override
    public void add(LangueDTO langue) {
        try (PreparedStatement preparedStatement = getConnection().prepareStatement("INSERT INTO langue (nom) VALUES (?)")) {
            preparedStatement.setString(1, langue.getNom());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(LangueDTO langue) {
        try (PreparedStatement preparedStatement = getConnection().prepareStatement("UPDATE langue SET nom = ?WHERE id = ?")) {
            preparedStatement.setString(1, langue.getNom());
            preparedStatement.setInt(2, langue.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (PreparedStatement preparedStatement = getConnection().prepareStatement("DELETE FROM langue WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
