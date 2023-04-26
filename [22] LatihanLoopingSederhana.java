// 2022/11/19 12:30
// PROGRAM PENJUMLAHAN SEDERHANA 

import java.util.*;

public class Main {
	public static void main (String[] args){
		//PEMBUATAN OVJEK SCANNER
		Scanner input = new Scanner(System.in);
		
		//TIPE DATA
		int a,a1,akhir1,akhir,toal=0,total=0;
		
		//INPUT USER MENENTUKAN NILAI AWAL DAN AKHIR 
		System.out.println("Program penjumlahan deret sederhana");
		System.out.print("Masukan nilai awal = ");
		a = input.nextInt();
		System.out.print("Masukan nilai akhir = ");
		akhir = input.nextInt();
		
		//PERULANGAN While
		while (a <= akhir){
			total += a ;
			a++;
		}
		
		//OUTPUT HASIL
		System.out.println("Total Nilai = "+total);
		
		//INPUT USER MENENTUKAN NILAI AWAL DAN AKHIR 
		System.out.println("Program penjumlahan deret sederhana");
		System.out.print("Masukan nilai awal = ");
		a1 = input.nextInt();
		System.out.print("Masukan nilai akhir = ");
		akhir1 = input.nextInt();
		
		//PERULANGAN ForLoop
		for (;a1 <= akhir1; a1++){
			toal+= a1 ;
		}
		
		//OUTPUT HASIL
		System.out.println("Total Nilai = "+total);
	}
}