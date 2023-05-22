package mayis08_OkulYonetimPaneli;

public class Ogretmen extends Kisi{
    private String bolum;
    private String sicilNo;

    public Ogretmen(){

    }

    public Ogretmen(String ad, String sad, String tcKimlikNo, int yas, String bolum, String sicilNo) {
        super(ad, sad, tcKimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String bolum, String sicilNo) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }
}
