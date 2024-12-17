package hexagonale;


import java.util.List;

public interface ServiceData {
    List<ServiceDTO> getAll();
    ServiceDTO get(int id);
    void add(ServiceDTO personne);
    void save(ServiceDTO personne);
    void delete(int id);
}
