package mayis08_OkulYonetimPaneli;

public class Ogrenci extends Kisi {

    private int numara;
    private String sinif;

    public Ogrenci() {
        super();

    }

    public Ogrenci(String ad, String sad, String tcKimlikNo, int yas, int numara, String sinif) {
        super(ad, sad, tcKimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
}