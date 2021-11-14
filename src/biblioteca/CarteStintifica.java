package biblioteca;

public class CarteStintifica extends Carte {
        public CarteStintifica(String titlu, String autor, String editura, String an, String ISBN, String limba, boolean esteDisponibila, boolean poateFiImprumutata) {
                super(titlu, autor, editura, an, ISBN, limba, esteDisponibila, poateFiImprumutata);
        }

        String subiect;
}
