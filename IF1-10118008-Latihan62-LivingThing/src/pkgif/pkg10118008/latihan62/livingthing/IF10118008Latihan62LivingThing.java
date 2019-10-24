/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg10118008.latihan62.livingthing;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ASU * 
 * NAMA			: Michael Nagaku Milenn Salim
 * KELAS		: IF-1
 * NIM			: 10118008
 * Deskripsi Program	: Menampilkan Output sesuai ketentuan
 */
public class IF10118008Latihan62LivingThing {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Human saya = new Human();
		saya.setNama("Rizky Adaman Kurniawan");
		saya.walk(saya.getNama());
		saya.breath(saya.getNama());
		saya.eat(saya.getNama());
	}
	
}
