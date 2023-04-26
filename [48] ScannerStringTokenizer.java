//2023/02/17 22:11

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
	Scanner dam StringTokenizer
	
	Kita akan megambil kalimat per kata bukan lagi per character 
	Jika kita ingin mengambil 1 kata dengan pemisahnya adalah spasi kita dapat menggunakan scanner 
	pertama kita buka file nya > lalu kita masukan ke memory > dari memory kita masukan kedalam scanner 
	contoh 
		FileReader file = new FileReader("input.txt");
		BufferedReader buff = new BufferedReader(file); 
		
		Scanner ambilKata = new Scanner(buff); 
		System.out.println(ambilKata.next()); // akan mengambil 1 kata dalam sebuah kalimat di file 
		
	jika kita ingin melakukan pengecekan apakah masih ada kata atau tidak setelah kata yang kita ingin kan kita dapat menggunakan hasNext() 
		System.out.println(ambilKata.hasNext()); Jika True maka ada Jika False maka tidak ada 
		
	Jika kita ingin memisahkan sebuah kata dengan delimiter tertentu kita harus menggunakan code .useDelimiter() 
	contoh 
		ambilKata.useDelimiter(","); jadi dia akan menganggap tanda , sebagai spasi atau penghabis sebuah kata 
		
	Jika memakai StringTokenizer maka delimiter di taruh di dalam nya
	tetapi ada sebuah kekurangan yaitu kita tidak dapat melakukan nya hanya untuk 1 baris/line yang mana dia akan membaca seluruh isi file lalu dia akan berhenti 
	jika hanya ingin menggunakan 1 baris saja maka sebaiknya menggunakan StringTokenizer yang mana kita harus melakukan import java.util.ScannerTokenizer terlebih dahulu 
	Contoh:
		import java.util.StringTokenizer; 
		StringTokenizer token = new StringTokenizer(namaVariabel,delimiterYabgAkanDiPakai);
*/

public class Main{
	public static void main(String[] args) throws IOException{
		
		FileReader inputFile = new FileReader("input.txt"); //Untuk Membuka file
		BufferedReader buffer = new BufferedReader(inputFile); //Untuk membuat memori yang berisikan file yang sudah di buka 
		
		//Megambil 1 kata dalam sebuah file dengan scanner
		Scanner kata = new Scanner(buffer); // memasukam buffer kedalam Scanner 
		
		//Untuk mengecek kata 
		System.out.println(kata.hasNext()); //true
		
		//untuk membaca kata dengan pemisah/delimeter (spasi)
		System.out.println(kata.next()); //Membaca hanya 1 kata saja 
		System.out.println(kata.next()); //Membaca hanya 1 kata saja 
		System.out.println(kata.next()); //Membaca hanya 1 kata saja 
		
		System.out.println(kata.hasNext()); //false 
		
		//Menggunakan delimiter tertentu 
		FileReader inputFile2 = new FileReader("input2.txt");
		buffer  = new BufferedReader(inputFile2); 
		buffer.mark(200);// biar bisa fi gunakan terus menerus 
		
		kata = new Scanner(buffer);
		kata.useDelimiter(",");
		while(kata.hasNext()){
			System.out.println(kata.next());
		}
		
		//menggunakan String tokenizer 
		buffer.reset();
		String data = buffer.readLine(); //untuk melakukan pembacaan pada 1 baris line, yang mna angka dari tipe readline aka otomatis menjadi huruf 
		System.out.println(data); //menampilkan bukti 
		
		StringTokenizer token = new StringTokenizer(data,",");
		
		while(token.hasMoneToken){ //hasMoreToken sama seperti hasNext() perbedaan hanya pada penulisan sebab kita menggunakan StringTokenizer bukan String biasa
			System.out.println(token.nextToken()); //.nextToken() juga sama seperti .next()
		}
	}
}