package mayis22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("HESAPLAMAK ISTEDIGIMIZ GEOMETRIK SEKLI SECINIZ: \n" +
                "1. Dikdotgen\n" +
                "2. Kare\n" +
                "3. Daire\n" +
                "CIKIS ICIN Q HARFINE BASINIZ...");

        try {
            int secim = scan.nextInt();
            switch (secim) {
              case 1: {
                Dikdörtgen dikdörtgen = new Dikdörtgen();
                dikdörtgen.cevre();
                dikdörtgen.alan();
                menu();
            }
              case 2: {
                Kare kare=new Kare();
                kare.cevre();
                kare.alan();
                menu();
            }
              case 3: {
                Daire daire=new Daire();
                daire.cevre();
                daire.alan();
                menu();
             }
              default: {
                System.out.println("HATALI GITRIS YAPTINIZ");
                menu();
            }
        }
        }catch (InputMismatchException e) {
            char secim = scan.next().toUpperCase().charAt(0);
            if (secim == 'Q') {
                System.out.println("CIKIS YAPILIYOR");
                System.exit(0);
            } else {
                System.out.println("HATALI GİRİŞ YAPTINIZ...");
                menu();
            }

        }

    }
}




