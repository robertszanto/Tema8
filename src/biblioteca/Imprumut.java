package biblioteca;

import java.time.LocalDate;

public class Imprumut {
   private LocalDate dataImprumutului;
   private LocalDate dataReturnare;
   private  Utilizator utilizator;
   private  Carte carte;

    public Imprumut(LocalDate dataImprumutului, LocalDate dataReturnare, Utilizator utilizator, Carte carte) {
        this.dataImprumutului = dataImprumutului;
        this.dataReturnare = dataReturnare;
        this.utilizator = utilizator;
        this.carte = carte;
    }

    public LocalDate getDataImprumutului() {
        return dataImprumutului;
    }

    public void setDataImprumutului(LocalDate dataImprumutului) {
        this.dataImprumutului = dataImprumutului;
    }

    public LocalDate getDataReturnare() {
        return dataReturnare;
    }

    public void setDataReturnare(LocalDate dataReturnare) {
        this.dataReturnare = dataReturnare;
    }

    public Utilizator getUtilizator() {
        return utilizator;
    }

    public Carte getCarte() {
        return carte;
    }
}
