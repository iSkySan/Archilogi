package DAO_DTO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonneDAOimpl implements PersonneDAO {
    private List<PersonneDTO> personnes = new ArrayList<PersonneDTO>();

    public List<PersonneDTO> getAll() {
        return personnes;
    }

    public int get(int id) {
        for (PersonneDTO p : personnes) {
            if (p.getId() == id) {
                return id;
            }
        }
        return -1;
    }

    public void save(PersonneDTO personne) {
        Iterator<PersonneDTO> it = personnes.iterator();
        while (it.hasNext()) {
            PersonneDTO p = it.next();
            if (p.getId() == personne.getId()) {
                p.setNom(personne.getNom());
                p.setPrenom(personne.getPrenom());
                return;
            }
        }
        personnes.add(personne);
//        for (PersonneDTO p : personnes) {
//            if (p.getId() == personne.getId()) {
//                p.setNom(personne.getNom());
//                p.setPrenom(personne.getPrenom());
//                return;
//            }
//            else if (p.getId() != personne.getId()) {
//                System.out.println("Cette id n'existe pas");
//        }
    }

    public void delete(int id) {
        for (PersonneDTO p : personnes) {
            if (p.getId() == id) {
                personnes.remove(p);
                return;
            }
        }
    }

    public void add(PersonneDTO personne) {
        personnes.add(personne);
    }
}
