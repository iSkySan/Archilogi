package lspnok;

class Carre implements FormleLSP {
    private double cote;

        public double getCote() {
            return cote;
        }

        public void setCote(int cote) {
            this.cote = cote;
        }

        @Override
        public double getSurface() {
            return cote * cote;
        }
}
