package mayis22;

import java.util.Scanner;

public class Kare implements Islemler{
    Scanner scan =new Scanner(System.in);
    int kenar,cevreSonuc,alanSonuc;
    @Override
    public void cevre() {

        System.out.println("KARENIN KENAR UZUNLUGUNU GIRINIZ");
        kenar=scan.nextInt();
        cevreSonuc=4*kenar;
        System.out.println("KARENIN CEVRESI :"+cevreSonuc);


    }

    @Override
    public void alan() {

        alanSonuc=kenar*kenar;
        System.out.println("KARENIN ALANI :"+ alanSonuc);

    }
}
