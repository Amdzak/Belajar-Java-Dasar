// 2022/11/30 14:53

/*
	FUNGSI REKURSI 
	MERUPAKAN SEBUAH FUNGSI LOOPING YANG MEMANFAATKAN CODE return 
	HAMPIR SAMA SEPERTI WHILE LOOP 
	YAITU FUNGSINYA DI PANGGIL LAGI OLEH CODE return 
	FUNGSI REKURSIF SELALU MEMILIKI KONDISI DIMANA DIA AKAN MEMBERHENTIKAN PROGAM NYA KARENA JIKA TIDAK MAKA AKAN TERJADI ERROR
	memiliki syntax 
	return fungsi(parameter);
*/

import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		int nilai; 
		
		System.out.print("Masukan nilai:");
		nilai = input.nextInt();
		
		System.out.println("Anda memasukan nilai = "+nilai );
		
		int hasil = penjumlahan(nilai);
		System.out.println("Total penjumlahan = " + hasil);
		
		int kali = faktorial(nilai);
		System.out.println("Total penjumlahan = " + kali);
	}
	
	//FUNGSI REKURSIF penjumlahan 
	private static int penjumlahan(int hasil){
		System.out.println("Nilai = " + hasil);
		if(hasil == 0){
			return hasil;
		}
		return hasil + penjumlahan(hasil -1);
	}
	
	//FUNGSI REKURSIF FAKTORIAL 
	private static int faktorial(int hasil){
		System.out.println("Nilai = " + hasil);
		if(hasil == 1){
			return hasil;
		}
		return hasil * faktorial(hasil -1);
	}
}