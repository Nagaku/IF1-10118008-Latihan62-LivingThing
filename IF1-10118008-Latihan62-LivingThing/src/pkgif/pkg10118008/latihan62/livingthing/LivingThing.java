/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg10118008.latihan62.livingthing;

/**
 *
 * @author ASUS
 */
public abstract class LivingThing {

	public void breath(String nama){
		System.out.println(nama + " Bernafas");
	}

	public void eat(String nama){
		System.out.println(nama + " Makan");
	}
	
	public abstract void walk(String nama);	
}
