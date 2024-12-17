package lspnok;

class Rectangle implements FormleLSP {
    private double largeur;
    private double hauteur;

    public double getHauteur() {
        return hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
@Override
    public double getSurface() {
        return largeur * hauteur;
    }
}
