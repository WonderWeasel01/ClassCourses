public class Klasse {
    private String fnavn;
    private String enavn;
    private String adresse;
    private String mobil;

    public Klasse(String fnavn, String enavn, String adresse, String mobil) {
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.adresse = adresse;
        this.mobil = mobil;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    @Override
    public String toString() {
        return "Klasse{" +
                "fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", mobil='" + mobil + '\'' +
                '}';
    }
}
