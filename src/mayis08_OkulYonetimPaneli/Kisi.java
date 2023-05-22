package mayis08_OkulYonetimPaneli;

public class Kisi {
    /*
    BİR OKUL YÖNETİM PLATFORMU KODLAYINIZ.
1.  Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir. Kayıtlarda şu bilgiler olabilmelidir.
    Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
    Öğrenci:  Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
2.  Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için aşağıdaki gibi bir menü gösterilsin.
    ====================================
     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
    ====================================
     1- ÖĞRENCİ İŞLEMLERİ
     2- ÖĞRETMEN İŞLEMLERİ
     Q- ÇIKIŞ
3.  Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
    ============= İŞLEMLER =============
         1-EKLEME
         2-ARAMA
         3-LİSTELEME
         4-SİLME
         Q-ÇIKIŞ
    SEÇİMİNİZ:
4.  İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili ekleme, kimlik no ile silme ve arama, var olan tüm kişileri
listeleme gibi işlemler yapılabilmelidir. Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.
NOT: PROJEYİ YAPARKEN MÜMKÜN OLAN EN KISA KODLARI YAZMAK İÇİN NESNE YÖNELİMLİ PROGRAMLAMANIN BİZE SAĞLADIĞI İMKANLARI KULLANMAYA DİKKAT EDİNİZ.
     */
    private String ad;
    private String sad;
    private String tcKimlikNo;
    private int yas;

    public Kisi(String ad, String sad, String tcKimlikNo, int yas) {
        this.ad = ad;
        this.sad = sad;
        this.tcKimlikNo = tcKimlikNo;
        this.yas = yas;
    }

    public Kisi() {

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSad() {
        return sad;
    }

    public void setSad(String sad) {
        this.sad = sad;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
