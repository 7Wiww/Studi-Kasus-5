package Modulsmt2;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> bilangan = new ArrayList<>();
        // Menambhakan elemen pada ArrayList
        bilangan.add(2);
        bilangan.add(14);
        bilangan.add(0);
        System.out.println(bilangan);

        //Menambahkan elemen pada ArrayList dengan Index
        bilangan.add(0, 30);
        System.out.println(bilangan);

        //Mengakses ArrayList
        System.out.println(bilangan.get(1));

        //Mengubah elemen ArrayList
        bilangan.set(2, 11);
        System.out.println(bilangan);

        //Menghapus elemen ArrayList
        bilangan.remove(3);
        System.out.println(bilangan);

        //Mengetahui ukuran list dengan size()
        System.out.println("Jumlah elemen ArrayList " +bilangan.size());

        //Pengulangan ArrayList
        System.out.println("Pengulangan ArrayList");
        for (int i=0; i<bilangan.size(); i++) {
            System.out.print(bilangan.get(i) +" ");
        }
    }
}
