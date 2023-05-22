package mayis22;

import java.util.Scanner;

public class Dikdörtgen implements Islemler {
    Scanner scan =new Scanner(System.in);
    int kisaKenar,uzunKenar,cevreSonuc,alanSonuc;
    @Override
    public void cevre() {
        System.out.println("KISA KENAR UZUNLUGUNU GIRINIZ");
        kisaKenar=scan.nextInt();
        System.out.println("UZUN KENAR UZUNLUGUNU GIRINIZ");
        uzunKenar=scan.nextInt();
        cevreSonuc=2*(kisaKenar+uzunKenar);
        System.out.println("Dikdortgenin cevresi: "+cevreSonuc);

    }

    @Override
    public void alan() {

        alanSonuc=kisaKenar*uzunKenar;
        System.out.println("DIKDORTGENIN ALANI :"+alanSonuc);

    }
}
