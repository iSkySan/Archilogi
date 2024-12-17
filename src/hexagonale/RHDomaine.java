package hexagonale;


import java.util.List;

public class RHDomaine {
    private final PersonneData personneData;
    private final ServiceData serviceData;
    private final LangueData langueData;

    public RHDomaine(PersonneData personneData, ServiceData serviceData, LangueData langueData) {
        this.personneData = personneData;
        this.serviceData = serviceData;
        this.langueData = langueData;
    }

    public List<PersonneDTO> getAllPersonne() {
        return personneData.getAll();
    }

    public PersonneDTO getPersonne(int id) {
        return personneData.get(id);
    }

    private void verifierPersonne(PersonneDTO personne) throws Exception {
        if (personne.getNom() == null || personne.getNom().isBlank()) {
            throw new Exception("Le nom est obligatoire !!!");
        }
        if (personne.getPrenom() == null || personne.getPrenom().isBlank()) {
            throw new Exception("Le prénom est obligatoire !!!");
        }
    }

    public void ajouterPersonne(PersonneDTO nouvellePersonne) throws Exception {
        verifierPersonne(nouvellePersonne);
        personneData.add(nouvellePersonne);
    }

    public void modifierPersonne(PersonneDTO personne) throws Exception {
        verifierPersonne(personne);
        personneData.save(personne);
    }

    public void supprimerPersonne(int id) throws Exception {
        if (id < 5) {
            throw new Exception("Vous ne pouvez pas supprimer une personne dont l'id est inférieur à 5");
        }
        personneData.delete(id);
    }

    private void verifierLangue(LangueDTO langue) throws Exception {
        if (langue.getNom() == null || langue.getNom().isBlank()) {
            throw new Exception("Le nom est obligatoire !!!");
        }
    }

    public void ajouterLangue(LangueDTO nouvelleLangue) throws Exception {
        verifierLangue(nouvelleLangue);
        langueData.add(nouvelleLangue);
    }

    public void modifierLangue(LangueDTO langue) throws Exception {
        verifierLangue(langue);
        langueData.save(langue);
    }

    public void supprimerLangue(int id) throws Exception {
        // TODO
        langueData.delete(id);
    }

    // TODO
}
