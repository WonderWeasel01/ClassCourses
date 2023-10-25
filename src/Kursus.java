import javax.swing.*;
import java.util.Arrays;

public class Kursus {
    private int kursusNr;
    private String kursusNavn;
    private int antalEcts;
    private String ugeDage;
    private String tid;
    private Klasse [] deltagere;
    private int antalDeltagere;

    public Kursus(int kursusNr, String kursusNavn, int antalEcts, String ugeDage, String tid) {
        this.kursusNr = kursusNr;
        this.kursusNavn = kursusNavn;
        this.antalEcts = antalEcts;
        this.ugeDage = ugeDage;
        this.tid = tid;
        this.deltagere=new Klasse[40];
        this.antalDeltagere = 0;
    }

    public void tilfoejStuderende(Klasse navn){
   if(antalDeltagere <40){
       deltagere[antalDeltagere] = navn;
       antalDeltagere++;

   }else {
       System.out.println("der ikke flere pladser");
   }

    }

    public int getKursusNr() {
        return kursusNr;
    }

    public void setKursusNr(int kursusNr) {
        this.kursusNr = kursusNr;
    }

    public String getKursusNavn() {
        return kursusNavn;
    }

    public void setKursusNavn(String kursusNavn) {
        this.kursusNavn = kursusNavn;
    }

    public int getAntalEcts() {
        return antalEcts;
    }

    public void setAntalEcts(int antalEcts) {
        this.antalEcts = antalEcts;
    }

    public String getUgeDage() {
        return ugeDage;
    }

    public void setUgeDage(String ugeDage) {
        this.ugeDage = ugeDage;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public Klasse[] getDeltagere() {
        return deltagere;
    }

    public void setDeltagere(Klasse[] deltagere) {
        this.deltagere = deltagere;
    }

    public int getAntalDeltagere() {
        return antalDeltagere;
    }

    public void setAntalDeltagere(int antalDeltagere) {
        this.antalDeltagere = antalDeltagere;
    }

    @Override
    public String toString() {
        return "Kursus{" +
                "kursusNr=" + kursusNr +
                ", kursusNavn='" + kursusNavn + '\'' +
                ", antalEcts=" + antalEcts +
                ", ugeDage='" + ugeDage + '\'' +
                ", tid='" + tid + '\'' +
                ", antalDeltagere=" + antalDeltagere +
                ", deltagere=" + Arrays.toString(deltagere) +

                '}';
    }
}
