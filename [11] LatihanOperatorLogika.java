// 2022/11/11 22:43

/*
	PROGRAM MENEBAK ANGKA SEDERHANA
*/
import java.util.*; //MENGIMPORT SEMUA LIBRARY YANG ADA PADA FOLDER UTIL

public class Main {
	public static void main (String[] args){
		//PEMBUATAN OBJEK SCANNER 
		Scanner input = new Scanner(System.in);
		
		//TIPE DATA 
		int master = 6;
		int tebak;
		boolean status;
		
		//INPUT USER 
		System.out.println("Tebak Angka Sederhana ");
		System.out.print("Masukan angka : ");
		tebak = input.nextInt();
		System.out.println("Tebakan anda : " + tebak);
		
		//PROSES PENCARIAN KEBENARAN 
		status = (master == tebak); 
		System.out.println("Status tebakan anda = " + status);
		
		//PROGRAM RENTANG ANGKA 
		System.out.print("Masukan nilai di antara 4 dan 9: ");
		tebak = input.nextInt();
		status = (tebak >= 4) && (tebak <= 9);
		System.out.println("Status Tebakan Anda = " + status);
	}
}