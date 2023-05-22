package mayis22;

import java.util.Scanner;

public class Daire implements Islemler{
    Scanner scan =new Scanner(System.in);
    double yaricap,cevreSonuc,alanSonuc;
    @Override
    public void cevre() {
        System.out.println("DAIRENIN YARICAPINI GIRINIZ");
        yaricap=scan.nextInt();
        cevreSonuc=2*(Math.PI)*yaricap;
        System.out.println("DAIRENIN CEVRESI :"+cevreSonuc);

    }

    @Override
    public void alan() {

        alanSonuc=(Math.PI)*(Math.pow(yaricap,2));
        System.out.println("DAIRENIN ALANI :"+alanSonuc);
    }
}
