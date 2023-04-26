//2022/11/27 13:45
//LATIHAN MEMBUAT KOTAK DAN MENGHITUNG LUAS+KELL

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int panjang, lebar ; 
		boolean kondisi = true;
		while (kondisi) {
			System.out.print("Masukan Panjang : ");
			panjang = input.nextInt();
			System.out.print("Masukan Lebar : ");
			lebar = input.nextInt();
			
			kotak(panjang,lebar);
			//MEMANGGIL KELILING 
			kell(panjang,lebar);
			//MEMANGGIL LUAS
			luas(panjang,lebar);
			//EXIT ATAU LANJUT 
			exit();
		}
	}
	
	//FUNGSI MEMBUAT PERSEGI
	private static void kotak(int panjang, int lebar){
		for (int i=1; i<=lebar;i++){
			for (int j=1; j<=panjang;j++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
	
	//FUNGSI KELILING 
	private static int kell (int panjang,int lebar){
		int kell;
		
		kell = 2 * (panjang + lebar);
		
		System.out.println("\nKeliling : " + kell);
		return kell;
	}
	
	//FUNGSI LUAS 
	private static int luas(int panjang, int lebar){
		int luas;
		
		luas = (panjang * lebar);
		
		System.out.println("Luas : " + luas);
		
		return luas;
	}
	
	//FUNGSI KELUAR 
	private static void exit(){
		int lanjut;
		boolean mboh = true;
		Scanner input = new Scanner(System.in);
		System.out.print("\n 1. Lanjut \n 2. Keluar \n Pilih Menu (1/2) :");
		lanjut = input.nextInt();
		do {
		switch (lanjut){
			case 1 : 
				mboh = false ;
				break;
			case 2 : 
				System.exit(0);
				break;
			}
		} while (mboh);
	}
	
}