package hexagonale;


import java.util.List;
import java.util.Scanner;

public class ApplicationVue {
    private final RHDomaine rhDomaine;
    private final Scanner scanner;

    public ApplicationVue(RHDomaine rhDomaine) {
        this.rhDomaine = rhDomaine;
        scanner = new Scanner(System.in);
    }

    public void run() {
        this.afficherAccueil();
    }

    public void afficherAccueil() {
        System.out.println("Liste des personnes");
        System.out.println("-------------------");
        List<PersonneDTO> personnes = rhDomaine.getAllPersonne();
        for (PersonneDTO personne: personnes) {
            System.out.println("ID : " + personne.getId() + ", " +
                    "Nom : " + personne.getNom() + ", " +
                    "Prénom : " + personne.getPrenom());
        }
        System.out.println("-------------------");

        if (saisirMenu()) {
            afficherAccueil();
        }
    }

    public boolean saisirMenu() {
        System.out.println("Vous pouvez : ");
        System.out.println("H) Réafficher la page d'accueil");
        System.out.println("A) Ajouter une personne");
        System.out.println("M) Modifier une personne");
        System.out.println("S) Supprimer une personne");
        System.out.println("L) Afficher la page des langues");
        System.out.println("V) Afficher la page des services");
        System.out.println("X) Sortir de l'application");
        System.out.println("Que voulez-vous faire ? ");
        String menu = scanner.nextLine().toUpperCase();
        switch (menu) {
            case "H":
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
            case "L":
                afficherPageLangue();
                break;
            case "V":
                afficherPageService();
                break;
            case "X":
                return false;
        }
        return true;
    }

    public void afficherAjouterPersonne() {
        System.out.println("Saisissez le nom de la nouvelle personne :");
        String nom = scanner.nextLine();
        System.out.println("Saisissez le prénom de la nouvelle personne :");
        String prenom = scanner.nextLine();
        PersonneDTO nouvellePersonne = new PersonneDTO();
        nouvellePersonne.setNom(nom);
        nouvellePersonne.setPrenom(prenom);
        try {
            rhDomaine.ajouterPersonne(nouvellePersonne);
        } catch (Exception e) {
            System.out.println("Erreur sur l'ajout d'une personne");
            System.out.println(e.getMessage());
        }
    }

    public void afficherModifierPersonne() {
        System.out.println("Saisissez l'id de la personne à modifier (<Enter> pour annuler) :");
        String val = scanner.nextLine();
        if (!val.isBlank()) {
            try {
                int id = Integer.parseInt(val);
                PersonneDTO personne = rhDomaine.getPersonne(id);
                if (personne != null) {
                    System.out.println("Modifiez le nom de la personne : '" + personne.getNom() + "' (<Enter> pour ne rien modifier)");
                    String nom = scanner.nextLine();
                    if (!nom.isBlank()) {
                        personne.setNom(nom);
                    }
                    System.out.println("Modifiez le prénom de la personne : '" + personne.getPrenom() + "' (<Enter> pour ne rien modifier)");
                    String prenom = scanner.nextLine();
                    if (!prenom.isBlank()) {
                        personne.setPrenom(prenom);
                    }
                    rhDomaine.modifierPersonne(personne);
                }
            } catch (Exception e) {
                System.out.println("Erreur sur la modification de la personne avec l'id " + val);
                System.out.println(e.getMessage());
            }
        }
    }

    public void afficherSupprimerPersonne() {
        System.out.println("Saisissez l'id de la personne à supprimer (<Enter> pour annuler) :");
        String val = scanner.nextLine();
        if (!val.isBlank()) {
            try {
                int id = Integer.parseInt(val);
                rhDomaine.supprimerPersonne(id);
            } catch (Exception e) {
                System.out.println("Erreur sur la suppression de la personne avec l'id " + val);
                System.out.println(e.getMessage());
            }
        }
    }

    public void afficherPageLangue() {
        System.out.println("Liste des langues");
        System.out.println("-------------------");
        // TODO
        System.out.println("-------------------");

        if (saisirMenuLangue()) {
            afficherPageLangue();
        }
    }

    public boolean saisirMenuLangue() {
        System.out.println("Vous pouvez : ");
        System.out.println("A) Ajouter une langue");
        System.out.println("M) Modifier une langue");
        System.out.println("S) Supprimer une langue");
        System.out.println("X) Revenir à la page d'accueil");
        System.out.println("Que voulez-vous faire ? ");
        String menu = scanner.nextLine().toUpperCase();
        switch (menu) {
            case "A":
                // TODO
                break;
            case "M":
                // TODO
                break;
            case "S":
                // TODO
                break;
            case "X":
                return false;
        }
        return true;
    }

    public void afficherPageService() {
        // TODO
    }
}
