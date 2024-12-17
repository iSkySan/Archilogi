package dipnok;

class Interrupteur {
    private Appareil appareil;
    public Interrupteur(Appareil appareil) {
        this.appareil = appareil;
    }
    public void action() {
        appareil.allumer();
    }
}
