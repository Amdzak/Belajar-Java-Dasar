// 2023/02/08 19:17

import java.util.Scanner;

/*
	Mengenal Exception lebih dalam 
	
	dalam Exception bisa di lakukan secara rantai 
	
	throws merupakan sebuah cara untuk mengetahui apakah ada Exception pada suatu program kita 
	pemahaman lebih mudah nya yaitu untuk memudahkan kita mengecek suatu program apakah bakal terjadi Exception atau tidak 
	untuk membuat lebih simpel tanpa menggunakan try,catch maka penggunakan throws akan lebih membantu 
	
	Jika menaruh throws code di dalam metode main maka kita akan mendapatkan pesan error tanpa harus melakukan uji coba try,catch dahulu 
	jika menaruh throws maka tidak perlu lagi adanya catch

	cara penulisanya bisa di dalam metode contoh : 
		private static int data(int data) throws Exception{
			int hasil = array[index];
			return hasil;
		}
*/

public class Main {
	public static void main(String[] args){
		int[] araydata = {0,1,2,3};
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan angka: ");
		int user = input.nextInt();
		
		//Exception biasa 
		System.out.println("\n\nException Biasa");
		try {
			System.out.printf("angka ke %d = data ke %d \n ",user,araydata[user]);
		} catch (Exception e){
			System.out.println(e);
		}
		
		//Exception didalam fungsi 
		System.out.println("\n\nException Didalam fungsi");
		int data = ambil(araydata,user);
		System.out.printf("angka ke %d = data ke %d \n ",user,data);
		
		//Exception throws by metode 
		System.out.println("\n\nException throws by metode");
		try {
			int data2 = ambil2(araydata,user);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.printf("angka ke %d = data ke %d \n ",user,data2);
		
		System.out.println("Akhir program");
	}
	
	private static int ambil2(int[] data,int user) throws Exception{
		int hasil = data[user];
		return hasil;
	}
	
	private static int ambil(int[] data,int user){
		int hasil = 0;
		try {
			hasil = data[user];
		} catch (Exception e){
			System.out.println(e);
		}
		return hasil;
	}
}