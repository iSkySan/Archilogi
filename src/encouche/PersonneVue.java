package encouche;

import java.util.List;
import java.util.Scanner;

public class PersonneVue {
    static Scanner scanner;
    PersonneService personneService;


    public static void afficherAccueil() {
        PersonneData personneData = new PersonneDataImpl();
        List<PersonneDTO> personnes = personneData.getAll();
        for (PersonneDTO personne: personnes) {
            System.out.println("ID : " + personne.getId() + ", " +
                    "Nom : " + personne.getNom() + ", " +
                    "Prénom : " + personne.getPrenom());
        }

        System.out.println("Vous pouvez : ");
        System.out.println("H) Réafficher la page d'accueil");
        System.out.println("A) Ajouter une personne");
        System.out.println("M) Modifier une personne");
        System.out.println("S) Supprimer une personne");
        System.out.println("X) Sortir de l'application");
        saisirMenu();
    }

    private static void saisirMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que voulez-vous faire ? ");
        String menu = scanner.nextLine().toUpperCase();
        switch (menu) {
            case "H":
                afficherAccueil();
                break;
            case "A":
                afficherAjouterPersonne();
                break;
            case "M":
                afficherModifierPersonne();
                break;
            case "S":
                afficherSupprimerPersonne();
                break;
            case "X":
                break;
            default:
                saisirMenu();
        }
    }

    public static void afficherAjouterPersonne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez l'id de la personne à ajouter (<Enter> pour annuler) :");
        int id = scanner.nextInt();
        if (id == 0) {
            afficherAccueil();
        }
        System.out.println("Saisissez le nom de la personne à ajouter (<Enter> pour annuler) :");
        String nom = scanner.nextLine();
        if (nom.isBlank()) {
            afficherAccueil();
        }
        System.out.println("Saisissez le prénom de la personne à ajouter (<Enter> pour annuler) :");
        String prenom = scanner.nextLine();
        if (prenom.isBlank()) {
            afficherAccueil();
        }

       PersonneDTO personne = new PersonneDTO(id, nom, prenom);
        PersonneService personneService = new PersonneService(new PersonneDataImpl());
        personneService.ajouterPersonne(personne);


        System.out.println("A faire => AjouterPersonne()");

        afficherAccueil();
    }

    public static void afficherModifierPersonne() {
        System.out.println("A faire => ModifierPersonne()");
        // TODO
        afficherAccueil();
    }

    public static void afficherSupprimerPersonne() {
        System.out.println("Saisissez l'id de la personne à supprimer (<Enter> pour annuler) :");
        String val = scanner.nextLine();
        if (!val.isBlank()) {
            try {
                int id = Integer.parseInt(val);
                PersonneData personneData = new PersonneDataImpl();
                personneData.delete(id);
            } catch (Exception e) {
                System.out.println("Erreur sur la suppression de la personne avec l'id " + val);
                System.out.println(e.getMessage());
            }

        }

        afficherAccueil();
    }
}
