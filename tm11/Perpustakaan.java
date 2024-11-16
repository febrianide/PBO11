/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tm11;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
class Perpustakaan {
    private ArrayList<Buku> daftarBuku;
    
    public Perpustakaan(){
        daftarBuku = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku){
        daftarBuku.add(buku);
    }
    public void tampilanInfoBuku(){
        System.out.println("Daftar Buku di Perpustakaan");
        for (Buku buku : daftarBuku){
            buku.infoBuku();
        }
    }
}
