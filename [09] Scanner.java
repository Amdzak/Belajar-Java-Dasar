// 2022/11/11 22:05

import java.util.Scanner; //PEMANGGILAN LIBRARY SCANNER PADA JAVA

/*
	Scanner merupakan library pada java yang mana library memungkinkan kita untuk mengambil apapun itu yang ada di dalam java 
	Scanner sendiri berguna untuk mengambil hasil stream inputan dari user 
	syntax : 
		Scanner NamaVariabel = ObjekBaru; 
		Scanner input = new Scanner(System.in);   System.in berfungsi untuk mengambil input dari sisi user

	LANGSUNG KE KASUS PEMBUATAN PROGRAM PERHITUNGAN LUAS PERSEGI PANJANG
*/
public class Main {
	public static void main (String[] args){
		//PEMBUATAN OBJEK SCANNER 
		Scanner scan = new Scanner(System.in);
		
		//DEKLARASI TIPE DATA 
		int panjang,lebar,luas;
		
		//INPUTAN USER 
		System.out.println("Rumus luas Persegi Panjang \n");
		System.out.print("Panjang : ");
		panjang = scan.nextInt();
		System.out.print("Lebar : ");
		lebar = scan.nextInt();
		luas = panjang *  lebar;
		System.out.println("Luas : " + luas);
	}
}