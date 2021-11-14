package biblioteca;

public class Manual extends Carte{
       private String materie;
       private String clasa;
       private String profil;

    public Manual(String titlu, String autor, String editura, String an, String ISBN, String limba, boolean esteDisponibila, boolean poateFiImprumutata) {
        super(titlu, autor, editura, an, ISBN, limba, esteDisponibila, poateFiImprumutata);
    }

    public String getMaterie() {
                return materie;
        }

        public void setMaterie(String materie) {
                this.materie = materie;
        }

        public String getClasa() {
                return clasa;
        }

        public void setClasa(String clasa) {
                this.clasa = clasa;
        }

        public String getProfil() {
                return profil;
        }

        public void setProfil(String profil) {
                this.profil = profil;
        }
}
