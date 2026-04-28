//NAMA    : MUTIARA Y.H. SIANTURI
//NIM     : 12S24045


package driver;

import java.util.*;
import model.*;

public class Driver3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Model1[] menu = {
            new Model1("Nasi Goreng", 15000),
            new Model1("Mie Goreng", 12000),
            new Model1("Es Teh", 5000)
        };

        Queue<Model2> antrian = new LinkedList<>();

        while (true) {

            System.out.println("\n=== MENU ===");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i].nama);
            }

            int pilih = input.nextInt();
            if (pilih == 0) break;

            String nama = input.next();
            int jumlah = input.nextInt();

            Model2 pesanan = new Model2(nama, menu[pilih - 1].nama, jumlah);
            antrian.add(pesanan);

            System.out.println("Masuk antrian");
        }

        while (!antrian.isEmpty()) {
            Model2 p = antrian.poll();
            System.out.println("Proses: " + p.kode + " - " + p.tujuan);
        }
    }
}