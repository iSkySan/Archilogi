package dipnok;

class Lampe  implements Appareil {
    @Override
    public void allumer() {
        System.out.println(getClass().getSimpleName() + " est allumé");
    }
}
