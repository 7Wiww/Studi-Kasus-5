package smt2;

import java.util.ArrayList;
import java.util.Scanner;

public class studiKasus5 {

    ArrayList<String> buku = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public void menu() {
        int pilihan;

        do{
            System.out.println("--- Menu ---");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Tampilkan semua Buku");
            System.out.println("Keluar");
    
            System.out.print("Pilih menu : ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1: {
                    System.out.println("Pilih kategori buku yang ingin ditambahkan?");
                    System.out.println("1. Teknologi");
                    System.out.println("2. Sains");
                    System.out.println("3. Sosial");

                    System.out.print("Kategori buku : ");
                    int kategoriTambah = scanner.nextInt();
                    scanner.nextLine();

                    String judulBuku;
                    if (kategoriTambah == 1) {
                        System.out.println("Kategori buku yang dipilih adalah Teknologi.");
                        System.out.print("Masukkan judul buku : ");
                        judulBuku = scanner.nextLine();
                        tambahBuku(buku, kategoriTambah ,judulBuku);
                    } else if (kategoriTambah == 2 ) {
                        System.out.println("Kategori buku yang dipilih adalah Sains.");
                        System.out.print("Masukkan judul buku : ");
                        judulBuku = scanner.nextLine();
                        tambahBuku(buku, kategoriTambah ,judulBuku);
                    } else if (kategoriTambah == 3) {
                        System.out.println("Kategori buku yang dipilih adalah Sosial.");
                        System.out.print("Masukkan judul buku : ");
                        judulBuku = scanner.nextLine();
                        tambahBuku(buku, kategoriTambah ,judulBuku);
                    } else {
                        System.out.println("Pilihan tidak valid");
                    }
                }
                    break;
                case 2: {
                    System.out.println("Pilih kategori buku yang ingin dihapus");
                    System.out.println("1. Teknologi");
                    System.out.println("2. Sains");
                    System.out.println("3. Sosial");

                    System.out.println("Kategori buku : ");
                    int kategoriHapus = scanner.nextInt();
                    scanner.nextLine();

                    String judulBuku;
                    if (kategoriHapus == 1) {
                        System.out.println("Kategori buku yang akan dihapus adalah Teknologi.");
                        System.out.print("Masukkan judul buku : ");
                        judulBuku = scanner.nextLine();
                        hapusBuku(buku, kategoriHapus, judulBuku);
                    } else if (kategoriHapus == 2 ) {
                        System.out.println("Kategori buku yang dipilih adalah Sains.");
                        System.out.print("Masukkan judul buku : ");
                        judulBuku = scanner.nextLine();
                        hapusBuku(buku, kategoriHapus, judulBuku);
                    } else if (kategoriHapus == 3) {
                        System.out.println("Kategori buku yang dipilih adalah Sosial.");
                        System.out.print("Masukkan judul buku : ");
                        judulBuku = scanner.nextLine();
                        hapusBuku(buku, kategoriHapus, judulBuku);;
                    } else {
                        System.out.println("Pilihan tidak valid");
                    }
                }
                    break;
                case 3: {
                    System.out.println("Pilih kategori apa yang ingin dicari");
                    System.out.println("1. Teknologi");
                    System.out.println("2. Sains");
                    System.out.println("3. Sosial");

                    System.out.print("Kategori buku : ");
                    int kategoriCari = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Cari judul buku : ");
                    String judulBuku = scanner.nextLine();
                    cariBuku(buku, judulBuku);
                }
                    break;
                case 4: {
                    display();
                }
                    break;
                case 5: {
                    System.out.println("Anda telah keluar.");
                }
            
                default:
                    System.out.println("Angka tidak valid.");
                    break;
            }
        } while (pilihan != 5);
    }

    public void tambahBuku(ArrayList<String> buku, int kategoriTambah, String judulBuku) {
        if (kategoriTambah == 1) {
            buku.add(judulBuku);
            System.out.println("Buku dengan judul " +judulBuku +" berhasil ditambahkan di kategori Teknologi.");
        } else if (kategoriTambah == 2) {
            buku.add(judulBuku);
            System.out.println("Buku dengan judul " +judulBuku +" berhasil ditambahkan di kategori Sains.");
        } else if (kategoriTambah == 3) {
            buku.add(judulBuku);
            System.out.println("Buku dengan judul " +judulBuku +" berhasil ditambahkan di kategori Sosial.");
        }
    }
    
    public void hapusBuku(ArrayList<String> buku, int kategoriHapus, String judulBuku) {
        if (kategoriHapus == 1) {
            buku.remove(judulBuku);
            System.out.println("Buku dengan judul " +judulBuku +" berhasil dihapus.");
        } else if (kategoriHapus == 2) {
            buku.remove(judulBuku);
            System.out.println("Buku dengan judul " +judulBuku +" berhasil dihapus.");
        } else if (kategoriHapus == 3) {
            buku.remove(judulBuku);
            System.out.println("Buku dengan judul " +judulBuku +" berhasil dihapus");
        }
    }

    public void cariBuku(ArrayList<String> buku, String judulBuku) {
        if (buku.contains(judulBuku)) {
            System.out.println("Buku " +judulBuku +" ditemukan.");
        } else {
            System.out.println("Buku " +judulBuku +" tidak ditemukan");
        }
    }

    public void display() {
        for (int i=0; i<buku.size(); i++) {
            System.out.println("1. " +buku.get(i));
        }
    }

    public static void main(String[] args) {
        studiKasus5 kasus = new studiKasus5();
        kasus.menu();
    }
}
