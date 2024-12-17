package ispnok;

class Employe implements Travailleur {
    public void travailler() {
        System.out.println("Travailler");
    }

    public void prendrePause() {
        System.out.println("Prendre une pause");
    }

    public void dejeuner() {
        System.out.println("Déjeuner");
    }
}
