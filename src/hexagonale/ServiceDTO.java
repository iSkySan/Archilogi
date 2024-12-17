package hexagonale;


public class ServiceDTO {
    private int id;
    private String nom;

    public ServiceDTO() {
    }

    public ServiceDTO(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
