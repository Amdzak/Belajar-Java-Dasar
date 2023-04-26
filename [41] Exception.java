// 2023/02/06 22:32

import java.io.FileInputStream; //untuk membaca inputan file
import java.io.IOException;
import java.util.Scanner;

/*
	Mengenal Exception 
	
	jika kita ingin si user melakukan inputan file maka kita harus melakukan import library java yg bernama 
		java.io.FileInputStream
	
	Exception merupakan code untuk menggantikan pesan error tetapi bukan dari salah coding 
	atau error terjadi saat program berjalan seperti user menginput sesuatu yang tidak sesuai dengan codingan yg ada 
	jika terjadi seperti itu maka sebuah program akan berakhir secara terpaksa atau langsg berakhir tanpa eksekusi program setelahnya 
	jika ingin menampilkan system error bisa memakai syntax 
		System.err.println(); maka akan berawrna merah jika error
		
	Hampir sama dengan syntax if else, yang berbeda jika try maka harus di sertakan catch jika tidak maka akan error 
	
	jika ingin melakukan file input stram sebaiknya di lakukan try catch
	
	Exception memiliki 3 keyword 
		try,catch,finally 
		
	Penjelasan 
		try {codeCodingan} = sebuah code untuk mencoba suatu program itu apakah ada exception/error yg terjadi 
		catch (TulisanErrorYangAda namaVariabelBebas) {codeCodingan} = catch merupakan sebuah code untuk mengambil pesan error yang ada pada try 
		finnaly = finnaly merupakan sebuah code yg akan di eksekusi setelah try dan catch, finnaly juga akan melakukan sesi closeing pada suatu file jika sudah selesai di lakukan
*/

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		FileInputStream inputan = null; 
		int[] aray = {1,2,3,4};
		
		System.out.print("Masukan Input array = ");
		int user = input.nextInt();
/*
		//System.out.printf("Index ke %d adalah %d \n", user,aray[user]); //tanpa Try Catch
		//Dengan try 
		try {
			System.out.printf("Index ke %d adalah %d \n", user,aray[user]);
		} catch (Exception e){
			System.out.println("Index salah atau lebih");
		}
		
		//runtime error jika file tidak ada khusus jika untuk file inout sebaiknya memakai try catch
		FileInputStream inputan = null; //unutk mengambil inputan file user 
		
		try {
			inputan = new FileInputStream("input.txt");
		} catch (Exception e){
			System.out.println("File Tidak Ada");
		}
*/
		//Menggabungkan 2 exception 
		System.out.println("Menggabungkan 2 buah Exception");
		// yang mana maka akan melakukan pemilihan otomatis jika ada yg tidak sesuai atau exception
		try {
			System.out.printf("Index ke %d adalah %d \n", user,aray[user]);
			inputan = new FileInputStream("input.txt");
		} catch (ArrayIndexOutOfBoundsException e){
			System.err.println("Jumlah max index salah");
		} catch (IOException e){ //IO.EXCEPTION HARUS IMPORT DUU
			System.err.println("File Tidak Di Temukan");
		}
		
		//finally
		System.out.println("\nException finally");
		try {
			System.out.printf("Index ke %d adalah %d \n", user,aray[user]);
			inputan = new FileInputStream("konz.txt");
		} catch (Exception e){
			System.err.println(e);
		} finally {
			System.out.println("Finnaly selsai");
		}
		System.out.println("Akhir program");
	}
}