package DAO_DTO;

import java.util.List;

public interface PersonneDAO {

    public List<PersonneDTO> getAll();
    public int get(int id);
    public void save(PersonneDTO personne);
    public void delete(int id);
    public void add(PersonneDTO personne);

}
