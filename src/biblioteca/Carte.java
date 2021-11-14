package biblioteca;

public class Carte {
    private  String titlu;
    private  String autor;
    private  String editura;
    private  String an;
    private  String ISBN;
    private  String limba;
    private  boolean esteDisponibila;
    private boolean poateFiImprumutata;

    public Carte(String titlu, String autor, String editura, String an, String ISBN, String limba, boolean esteDisponibila, boolean poateFiImprumutata) {
        this.titlu = titlu;
        this.autor = autor;
        this.editura = editura;
        this.an = an;
        this.ISBN = ISBN;
        this.limba = limba;
        this.esteDisponibila = esteDisponibila;
        this.poateFiImprumutata = poateFiImprumutata;
    }


    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public String getAn() {
        return an;
    }

    public void setAn(String an) {
        this.an = an;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getLimba() {
        return limba;
    }

    public void setLimba(String limba) {
        this.limba = limba;
    }

    public boolean isEsteDisponibila() {
        return esteDisponibila;
    }

    public void setEsteDisponibila(boolean esteDisponibila) {
        this.esteDisponibila = esteDisponibila;
    }

    public boolean poateFiImprumutata() {
        return poateFiImprumutata;
    }

    public void setPoateFiImprumutata(boolean poateFiImprumutata) {
        this.poateFiImprumutata = poateFiImprumutata;
    }
}
