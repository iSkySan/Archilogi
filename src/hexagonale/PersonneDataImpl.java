package hexagonale;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonneDataImpl extends DataSQLite implements PersonneData {
    public PersonneDataImpl() {
        super();
        try (Statement statement = getConnection().createStatement()) {
            statement.setQueryTimeout(30);
//            statement.executeUpdate("DROP TABLE personne ");
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS personne (" +
                            "   id INTEGER PRIMARY KEY, " +
                            "   nom TEXT, " +
                            "   prenom TEXT," +
                            "   langue_id INTEGER," +
                            "   service_id INTEGER" +
                            ")");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    @Override
    public List<PersonneDTO> getAll() {
        List<PersonneDTO> personnes = new ArrayList<>();

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM personne")) {

            while (resultSet.next()) {
                PersonneDTO personne = new PersonneDTO(resultSet.getInt("id"),
                        resultSet.getString("nom"),
                        resultSet.getString("prenom"));
                personnes.add(personne);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return personnes;
    }

    @Override
    public PersonneDTO get(final int id) {
        PersonneDTO personne = null;

        try (PreparedStatement preparedStatement = getConnection().prepareStatement("SELECT * FROM personne WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    personne = new PersonneDTO(resultSet.getInt("id"),
                            resultSet.getString("nom"),
                            resultSet.getString("prenom"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return personne;
    }

    @Override
    public void add(PersonneDTO personne) {
        try (PreparedStatement preparedStatement = getConnection().prepareStatement("INSERT INTO personne (nom, prenom) VALUES (?, ?)")) {
            preparedStatement.setString(1, personne.getNom());
            preparedStatement.setString(2, personne.getPrenom());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(PersonneDTO personne) {
        try (PreparedStatement preparedStatement = getConnection().prepareStatement("UPDATE personne SET nom = ?, prenom = ? WHERE id = ?")) {
            preparedStatement.setString(1, personne.getNom());
            preparedStatement.setString(2, personne.getPrenom());
            preparedStatement.setInt(3, personne.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (PreparedStatement preparedStatement = getConnection().prepareStatement("DELETE FROM personne WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
