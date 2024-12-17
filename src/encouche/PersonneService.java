package encouche;

public class PersonneService  {
    private final PersonneData personneData;

    public PersonneService(PersonneData personneData) {
        this.personneData = personneData;
    }

    public PersonneDTO get(final int id) {
        return personneData.get(id);
    }

    public void ajouterPersonne(PersonneDTO personne) {
        personneData.add(personne);
    }

    public void save(PersonneDTO personne) {
        personneData.save(personne);
    }

    public void delete(int id) {
        personneData.delete(id);
    }
}
