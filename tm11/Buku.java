/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tm11;

/**
 *
 * @author Lenovo
 */
class Buku {
    private String judul;
    private Pengarang pengarang;
    
    public Buku(String judul, Pengarang pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
    }
    public void infoBuku(){
        System.out.println("\nJudul Buku: " +judul);
        if (pengarang != null){
            pengarang.infoPengarang();
        }
    }
    
}
