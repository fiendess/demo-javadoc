package com.example;

/**
 * Kelas utama (entry point) untuk mendemonstrasikan pembuatan dokumentasi Java menggunakan JavaDoc.
 *
 * <p>Program ini menampilkan teks <strong>"Hello World!"</strong> di console.</p>
 *
 * <p>Contoh dokumentasi proyek Java menggunakan JavaDocs.</p>
 *
 * @author Didan Rahmana
 * @version 1.0
 * @since 1.0
 */
public class App {

    /**
     * Menjalankan program utama untuk menampilkan teks ke konsol.
     *
     * <p>Metode ini tidak mengembalikan nilai apa pun, hanya menampilkan pesan sederhana ke layar.
     * Tidak ada exception yang dilempar secara eksplisit.</p>
     *
     * @param args argumen baris perintah 
     * @return tidak ada nilai yang dikembalikan
     * @throws NullPointerException  jika argumen baris perintah adalah null 
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
