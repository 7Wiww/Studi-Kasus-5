package Modulsmt2;

import java.util.ArrayList;
import java.util.Scanner;

public class latihanAL {
    public static void tambah(ArrayList<Integer> bilangan, int value) {
        bilangan.add(value);
        System.out.println(value +" ditambahkan");
        System.out.println();
    }

    public static void tambahDenganIndex(ArrayList<Integer> bilangan, int index, int elemen) {
        if (index >= 0 && index <= bilangan.size()) {
            bilangan.add(index, elemen);
            System.out.println(elemen + " ditambahkan pada index ke-" + index);
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public static void ubah(ArrayList<Integer> bilangan, int index, int value) {
        if (index >= 0 && index < bilangan.size()) {
            int lama = bilangan.get(index);
            bilangan.set(index, value);
            System.out.println("Elemen pada index ke-" + index + " diubah dari " + lama + " menjadi " + value);
        } else {
            System.out.println("Index tidak valid.");
        }
        System.out.println(value +" ditambahkan pada index ke " +index);
        System.out.println();
    }

    public static int cari(ArrayList<Integer> bilangan, int index) {
        return bilangan.get(index);
    }

    public static void hapus(ArrayList<Integer> bilangan, int index) {
        if (index >= 0 && index < bilangan.size()) {
            bilangan.remove(index);
            System.out.println("Nilai pada index ke " +index +" telah dihapus");
        } else {
            System.out.println("Index tidak valid untuk hapus: " + index);
        }
    }

    public static void display(ArrayList<Integer> bilangan) {
        System.out.println("Isi ArrayList");
        for (int i=0; i<bilangan.size(); i++) {
            System.out.print(bilangan.get(i) +" ");
        }
        System.out.println();
        System.out.println();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> bilangan = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("--- Menu ---");
            System.out.println("1. Tambah data");
            System.out.println("2. Ubah data");
            System.out.println("3. Hapus data");
            System.out.println("4. Cari data");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1: {
                    System.out.print("Masukkan elemen: ");
                    int value = input.nextInt();
                    tambah(bilangan, value);
                    break;
                    }
                case 2: {
                    System.out.print("Masukkan index yang ingin diubah: ");
                    int index = input.nextInt();
                    System.out.print("Masukkan elemen baru: ");
                    int value = input.nextInt();
                    ubah(bilangan, index, value);
                    break;
                    }
                case 3: {
                    System.out.print("Masukkan index yang ingin dihapus: ");
                    int index = input.nextInt();
                    hapus(bilangan, index);
                    System.out.println();
                    break;
                    }
                case 4: {
                    System.out.print("Masukkan index yang dicari: ");
                    int cari = input.nextInt();
                    int hasil = cari(bilangan, cari);
                    if (hasil != -1) {
                        System.out.println("Elemen ditemukan dengan nilai: " + hasil);
                        System.out.println();
                    } else {
                        System.out.println("Elemen tidak ditemukan.");
                        System.out.println();
                    }
                    break;
                    }
                case 5: {
                    display(bilangan);
                    break;
                    }
                case 6: {
                    System.out.println("Anda keluar.");
                    break;
                    }
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
    }

    public static void main(String[] args) {
        menu();
    }
}
