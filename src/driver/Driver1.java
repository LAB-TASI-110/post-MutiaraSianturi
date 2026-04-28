//NAMA    : MUTIARA Y.H. SIANTURI
//NIM     : 12S24045

package driver;

import java.util.*;

public class Driver1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Integer> kota = new HashMap<>();
        kota.put("MDN", 10000);
        kota.put("JKT", 15000);
        kota.put("BLG", 8000);
        kota.put("SBY", 20000);

        String kode = input.next();
        int beratButet = input.nextInt();

        int beratUcok = (beratButet * 3) / 2;

        int totalBerat = beratButet + beratUcok;

        int ongkir = kota.get(kode) * totalBerat;

        System.out.println("Kota: " + kode);
        System.out.println("Berat Butet: " + beratButet);
        System.out.println("Berat Ucok: " + beratUcok);
        System.out.println("Total: " + totalBerat);
        System.out.println("Ongkir: " + ongkir);
    }
}