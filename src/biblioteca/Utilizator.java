package biblioteca;

import java.util.Date;

public class Utilizator {

    private String nume;
    private String prenume;
    private String CNP;
    private String nrTel;
    private String email;
    private Date valabilitateCarnet;
    private Integer limitaInprumut = 3;


    public Utilizator(String nume, String prenume, String CNP, String nrTel, String email) {
        this.nume =nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.nrTel = nrTel;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getNrTel() {
        return nrTel;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getValabilitateCarnet() {
        return valabilitateCarnet;
    }

    public void setValabilitateCarnet(Date valabilitateCarnet) {
        this.valabilitateCarnet = valabilitateCarnet;
    }

    public Integer getLimitaInprumut() {
        return limitaInprumut;
    }

    public void setLimitaInprumut(Integer limitaInprumut) {
        this.limitaInprumut = limitaInprumut;
    }
}
