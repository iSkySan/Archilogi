package hexagonale;


public class LangueDTO {
    private int id;
    private String nom;

    public LangueDTO() {
    }

    public LangueDTO(int id, String nom) {
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
