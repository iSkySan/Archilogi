package DAO_DTO;

public class PersonneVue {
    public void afficherDetail(PersonneDTO personne) {
        System.out.println(personne.getNom());
        System.out.println(personne.getPrenom());
        System.out.println(personne.getPrenom() + " " + personne.getNom().toUpperCase());

    }
}
