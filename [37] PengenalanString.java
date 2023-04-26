//2023/02/02 16:47

import java.util.Arrays;

/*
	String merupakan tipe data yang high level sebab kita bisa melakukan operasi khusus pada string
	jika char memakai tanda kutip nya 1 jika string memakai tanda kutip 2
	perbedaan pengguna String dengan char[] array 
	jika memakai char array akan lebih repot sebab jika katanya banyak maka akan menyusakhan kita contoh : 
		
		String haloString = "Hallo dunia";
		char[] haloChar = {'H','a','l','o',' ','d','u','n','i','a'};
		
		System.out.println(haloString);
		System.out.println(Arrays.toString(haloChar));
	Sama sama menampilkan hallo world tapi jika char akan semakin lebih sulit
	
	perbedaan penggunaan String dan char saat melakukan pergantian nama 
	jika kita menggunakan tipe data Char maka kita melakukan pergantian pasa tulisan itu sedangkan address nya tetap 
	tetapi jika saat menggunakan tipe data String dan melakukan pergantian nama maka kita melakukan pembuatan address baru lalu kita timpa 
	
	String itu Reuseable selama program itu berjalan di java 
	sebab merory string di java itu stringpool jadi address dalam java akan sama dengan sebelumnya 
	Kesimpulan: 
	String di java itu immutable 
	String yang berada di stirng pool akan reuseable jad memori lebih efisien krn di pke terus 
	pembuat string dengan metode baru maka ia akan di taruh di memory lain, bukan di string pool 
	
	sebaiknya memakai String daripada Char array sebab pengelolaan memory string di java sangat efisien 
*/

public class Main {
	
	public static void main(String[] args){
		String kataString = "Halo dunia";
		char[] kataChar = {'H','a','l','o',' ','d','u','n','i','a'};
		
		//Perbedaan print tipe data Char dan String
		System.out.println(kataString);
		System.out.println(Arrays.toString(kataChar));
		
		//Perbedaan mengakses komponen pada String dan Char
		System.out.println(kataChar[5]);
		System.out.println(kataString.charAt(5));
		
		//Merubah komponen pada String itu tidak bisa, sebab stirng di java immutable(tidak dapat di rubah nilainya)
		kataChar[0] = 'B';
		System.out.println(kataChar);
		
		//Kita bisa merubah kompknen scr tidk lgsg 
		kataString = "c" + kataString.substring(1,4);
		System.out.println(kataString); //(1,4 merupakan rangge yang ingin di tampilkan)
	}
}