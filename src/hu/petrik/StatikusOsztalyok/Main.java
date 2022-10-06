package hu.petrik.StatikusOsztalyok;

public class Main {
    /*int nemStatikusAdattag;
    static  int statikusTag;
    public static void main(String[] args) {
        Main objektum = new Main();
        System.out.println(objektum.nemStatikusAdattag);
        System.out.println(Main.statikusTag);
    }
*/

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Veletlen.velEgesz(5,10));
        }
        System.out.println();
        for (int i = 0; i <50 ; i++) {
            System.out.println(Veletlen.VeletlenKar('A', 'Z'));
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(Veletlen.velTeljesNev(true));
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(Veletlen.velTeljesNev(false));
        }

       /* System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.println(Veletlen.velDatum(1777 , 2022));
        }*/

        System.out.println();
        for (int i = 0; i < 2 ; i++) {
            System.out.println(Veletlen.velEmail("Kecske Gábor"));
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.println(Veletlen.velMobil());
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.println(Veletlen.velSportAg());
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.println(Veletlen.velEgyesulet());
        }
    }
}