package hu.petrik.StatikusOsztalyok;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public final class Veletlen {
    private Veletlen(){}
    private static final Random rnd = new Random();
    private static final List<String> vezNevek = feltolt("files/veznev.txt");
    private static final List<String> ferfiKerNevek = feltolt("files/ferfikernev.txt");
    private static final List<String> NoiKerNevek = feltolt("files/noikernev.txt");
    private static final List<String> sportAg = feltolt("files/sportag.txt");
    private static final List<String> egyesulet = feltolt("files/egyesulet.txt");
    private static List<String> feltolt(String fajlnev){
        List<String> list = new ArrayList<>();
        try {
            Scanner file = new Scanner(new File(fajlnev));
            while (file.hasNext()){
                String sor = file.nextLine();
                list.add(sor);
            }
            file.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return list;
    }

    public static int velEgesz(int min, int max){
        return rnd.nextInt(max - min + 1) + min;
    }

    public static char VeletlenKar(char min, char max){
        return (char) velEgesz(min, max);
    }

    public static String velVezetekNev(){
        return vezNevek.get(rnd.nextInt(vezNevek.size()));
    }

    /**
     * Véletlen magyar kersztnév generálása
     * @param nem A generált keresztnév neme. Férfi esetén true, Nő esetén false.
     * @return A generált keresztnév
     */
    public static String velKeresztnev(boolean nem){
        String keresztNev;
        if (nem){
            keresztNev = velFerfiKeresztNev();
        }else {
            keresztNev = velNoiKeresztNev();
        }
        return keresztNev;
    }

    private static String velFerfiKeresztNev(){
        return  ferfiKerNevek.get(rnd.nextInt(ferfiKerNevek.size()));
    }
    private static String velNoiKeresztNev(){
        return  NoiKerNevek.get(rnd.nextInt(NoiKerNevek.size()));
    }

    /**
     * Véletlen magyar név generálása
     * @param nem A generált tnév neme. Férfi esetén true, Nő esetén false.
     * @return A generált név
     */
    public   static String velTeljesNev(boolean nem){
        return velVezetekNev() + " " + velKeresztnev(nem);
    }

    public static String velDatum(int ev1, int ev2) {
       int ev = rnd.nextInt(ev1 - ev2);
       int honap = rnd.nextInt(1 - 12);
       int nap = rnd.nextInt(1- 31);
        DateFormat forma = new SimpleDateFormat("yyyy:MM:dd");
       return forma.format(ev + honap + nap);
    }

    public static String velEmail(String nev){
        String email;
        email = String.format("%s-%d @gmail.com", nev.toLowerCase(), velEgesz(1,50));
        return email;
    }

    public static String velMobil(){
        String alap = "+36 (30) ";
        for (int i = 0; i < 7; i++) {
            alap += velEgesz(1,9);
        }
        return alap;
    }

    public static String velSportAg(){
        return sportAg.get(rnd.nextInt(sportAg.size()));
    }

    public static String velEgyesulet(){
        return egyesulet.get(rnd.nextInt(egyesulet.size()));
    }
}
