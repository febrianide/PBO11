/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tm11;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Henry Manampiring");
        Pengarang pengarang2 = new Pengarang("Mark Manson");
        
        Buku buku1 = new Buku("Filosofi Teras", pengarang1);
        Buku buku2 = new Buku("Sebuah Seni untuk Bersikap Bodo Amat", pengarang2);
        
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        
        perpustakaan.tampilanInfoBuku();
    }
}

