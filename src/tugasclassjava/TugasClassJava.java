/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasclassjava;

/**
 *
 * @author rifial
 */
class Buah {
    String nama;
    String warna;
    String rasa;

    // Constructor
    Buah(String nama, String warna, String rasa) {
        this.nama = nama;
        this.warna = warna;
        this.rasa = rasa;
    }

    // Method untuk menampilkan informasi buah
    void showInfo() {
        System.out.println("1. Nama Buah: " + this.nama);
        System.out.println("2. Warna Buah: " + this.warna);
        System.out.println("3. Rasa Buah: " + this.rasa);
    }

    // Method untuk mengubah nama buah
    void setNama(String nama) {
        this.nama = nama;
    }

    // Method untuk mendapatkan nama buah
    String getNama() {
        return this.nama;
    }

    // Method untuk mendapatkan deskripsi rasa buah
    String deskripsiRasa(String pesan) {
        return pesan + " " + this.nama + " rasanya " + this.rasa;
    }
}

public class TugasClassJava {
    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("Informasi Buah-buahan:");
        System.out.println("======================");
        

        // Membuat objek buah
        Buah buah1 = new Buah("Apel", "Merah", "Manis");
        Buah buah2 = new Buah("Mangga", "Kuning", "Manis");
        
        // Mendapatkan Nama Buah
        buah1.getNama();
        buah2.getNama();

        // Menampilkan informasi buah
        System.out.println("Informasi Buah 1");
        buah1.showInfo();
        System.out.println("Informasi Buah 2");
        buah2.showInfo();

        // Mengubah nama buah
        buah1.setNama("Apel Hijau");

        // Menampilkan informasi buah setelah nama diubah
        System.out.println(" ");
        System.out.println("==============================");
        System.out.println("Informasi buah setelah diubah:");
        System.out.println("==============================");
        //System.out.println("");
        buah1.showInfo();

        // Mendapatkan deskripsi rasa buah
        System.out.println("===============================");
        String deskripsi = buah2.deskripsiRasa("Saya suka");
        System.out.println("" + deskripsi);
        
        
    }
    
}
