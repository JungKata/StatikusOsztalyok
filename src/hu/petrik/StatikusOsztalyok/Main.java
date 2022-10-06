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
    }
}