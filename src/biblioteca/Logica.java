package biblioteca;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;

public class Logica {
    public static void main(String[] args) throws ParseException {

        List<Imprumut> imprumuturiActive = new ArrayList<>();
        List<Imprumut> imprumuturiTrecute = new ArrayList<>();

        //Utilizatori
        Utilizator utilizator1 = new Utilizator("Robert", "Szanto", "5020512080011", "0722405282", "robertszanto64@gmail.com");
        Utilizator utilizator2 = new Utilizator("Eduard", "Kunz", "456051654208561", "0755823106", "xbox3@gmail.com");

        Map<String, Utilizator> utilizatori = new HashMap<>();
        utilizatori.put("5020512080011", utilizator1);
        utilizatori.put("456051654208561", utilizator2);

        //Carti

        Carte carte1 = new Carte("Winnetou", "Karl May", "Little Lamb", "1865", "394867", "Romana", true, true);
        Carte carte2 = new Carte("Mintea, o calatorie spre centrul fiintei noastre", "Daniel Siegel", "#CeiCareStiu", "2005", "25743822", "Romana", true, true);

        Map<String, Carte> carti = new HashMap<>();
        carti.put("394867", carte1);
        carti.put("25743822", carte2);

        //Imprumuturi active
        Utilizator utilizator = new Utilizator("Robert", "Szanto", "5020512080011", "0722405282", "robertszanto64@gmail.com");
        Carte carte = new Carte("Winnetou", "Karl May", "Little Lamb", "1865", "394867", "Romana", true, true);

        imprumutaCarte(carte1, utilizator, imprumuturiActive);
        imprumutaCarte(carte2, utilizator, imprumuturiActive);
        returnareCarte(utilizator, carte1, imprumuturiActive, imprumuturiTrecute);
    }

    public static void imprumutaCarte(Carte carte, Utilizator utilizator, List<Imprumut> imprumuturiActive) {
        if (carte.poateFiImprumutata() && carte.isEsteDisponibila() && utilizator.getLimitaInprumut() > 0){
            LocalDate dataImprumut = LocalDate.now();
            LocalDate dataReturnare = dataImprumut.plusWeeks(2);

            imprumuturiActive.add(new Imprumut(dataImprumut, dataReturnare, utilizator, carte));

            utilizator.setLimitaInprumut(utilizator.getLimitaInprumut() - 1);
            carte.setPoateFiImprumutata(false);
            carte.setEsteDisponibila(false);
        }
    }

    public static void returnareCarte(Utilizator utilizator, Carte carte, List<Imprumut> imprumuturiActive, List<Imprumut> imprumuturiTrecute) {
        for(Imprumut imprumut: imprumuturiActive){
            if (imprumut.getCarte().equals(carte)) {
                imprumut.setDataReturnare(LocalDate.now());
                imprumuturiTrecute.add(imprumut);
            }
        }
        imprumuturiActive.removeIf(imprumut -> imprumut.getCarte().equals(carte));
        carte.setPoateFiImprumutata(true);
        carte.setEsteDisponibila(true);
        utilizator.setLimitaInprumut(utilizator.getLimitaInprumut() + 1);
    }
}

