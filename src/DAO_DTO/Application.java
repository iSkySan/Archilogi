package DAO_DTO;

public class Application {
    public static void main(String[] args) {
        PersonneDAOimpl personneDAOimpl = new PersonneDAOimpl();
        personneDAOimpl.add(new PersonneDTO(1, "Doe", "John"));
        personneDAOimpl.add(new PersonneDTO(2, "Doe", "Jane"));
        personneDAOimpl.add(new PersonneDTO(3, "Doe", "Alice"));
        personneDAOimpl.add(new PersonneDTO(4, "theo", "Bob"));

        System.out.println("liste départ :");
      for (PersonneDTO p : personneDAOimpl.getAll()) {
          System.out.println(p.getId() + " " + p.getNom() + " " + p.getPrenom());
          
      }
        System.out.println("liste après suppression :");
       personneDAOimpl.delete(3);
        for (PersonneDTO p : personneDAOimpl.getAll()) {
            System.out.println(p.getId() + " " + p.getNom() + " " + p.getPrenom());

        }
        System.out.println("liste après modification :");
        personneDAOimpl.save(new PersonneDTO(2, "bob", "bob"));
        for (PersonneDTO p : personneDAOimpl.getAll()) {
            System.out.println(p.getId() + " " + p.getNom() + " " + p.getPrenom());

        }

        System.out.println("liste si id n'existe pas  :");

        personneDAOimpl.save(new PersonneDTO(5, "bruce", "wayne"));
        for (PersonneDTO p : personneDAOimpl.getAll()) {
            System.out.println(p.getId() + " " + p.getNom() + " " + p.getPrenom());

        }
    }

}
