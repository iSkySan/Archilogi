package hexagonale;


import java.util.List;

public interface LangueData {
    List<LangueDTO> getAll();
    LangueDTO get(int id);
    void add(LangueDTO personne);
    void save(LangueDTO personne);
    void delete(int id);
}
