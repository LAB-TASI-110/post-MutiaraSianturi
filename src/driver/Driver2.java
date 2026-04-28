//NAMA    : MUTIARA Y.H. SIANTURI
//NIM     : 12S24045

package driver;

import java.util.*;

public class Driver2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] stok = new int[N];

        for (int i = 0; i < N; i++) {
            stok[i] = input.nextInt();
        }

        String kategori = input.next();

        int total = 0;

        for (int i = 0; i < N; i++) {
            if (kategori.equals("A")) {
                if (i % 2 == 0) total += stok[i];
            } else {
                if (i % 2 != 0) total += stok[i];
            }
        }

        System.out.println("Total stok kategori " + kategori + ": " + total);
    }
}

