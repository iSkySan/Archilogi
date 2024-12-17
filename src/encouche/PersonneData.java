package encouche;

import java.util.List;

public interface PersonneData {
    List<PersonneDTO> getAll();
    PersonneDTO get(int id);
    void add(PersonneDTO personne);
    void save(PersonneDTO personne);
    void delete(int id);
}
