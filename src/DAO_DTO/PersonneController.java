package DAO_DTO;

public class PersonneController {
    private PersonneDTO dto;
    private PersonneVue vue;
    private PersonneDAO dao;

    public PersonneController(PersonneDAO dao, PersonneDTO dto,PersonneVue vue){
        this.dto = dto;
        this.vue = vue;
        this.dao = dao;


    }
    public void SetNom(String nom){
        dto.setNom(nom);
    }
    public void SetPrenom(String prenom){
        dto.setPrenom(prenom);
    }
    public void enregistrer(){
        dao.save(dto);
    }
    public void afficherPage(){
        for (PersonneDTO p : dao.getAll()) {
            vue.afficherDetail(p);
        }
    }
}
