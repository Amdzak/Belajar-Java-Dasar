//2023/02/09 20:03

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
	Byte Stream | File input output (Unbuffer I/O)
	
	Untuk melakukan Output file maka akan di butuhkan objek bernama 
		java.io.FileOutputStream;  
	penulisan hampir sama dengan file input hanya berbeda di tengah" contoh : 
		FileOutputStream fileOutput = new FileOutputStream("output.txt"); 
	
	dengan ada nya FileOutputStream maka sistem akan secara otomatis membuat kan file kosong 
	intinya adalah untuk memudahkan kita dalam membuat file kosong
	
	byte stream merupakan sebuah metode untuk membaca isi file dengan satuan byte 
	yang mana satuan byte itu nanti jika di tampilkan akan berupa angka 
	hanya membutuhkan code namaVariabel.read() saja
		contoh 
		FileInputStream file = new FileInputStream("ins.txt");
		System.out.print(file.read()); 
		
	setiap kali ada code .read() maka itu sudah membaca 1 karakter di file 
	
	untuk melakukan menulis file ke dalam file maka hanya membutuhkan code .write(); 
	dengan syarat kita harus sudah membuka filenya dengan menggunakan 
		FileOutputStream fileOutput = new FileOutputStream("output.txt");
	contoh : 
		int mbih = fileInput.read(); 
		fileOutput.write(mbih); //ini sudah menuliskan 1 karakter yg ada pada fileInput

	try with resources merupakan sebuah cara untuk otomatis menutup file jika selesai di eksekusi 
	Syntax : 
	Jika hanya 1 seperti ini, jika ingin 2 maka di kasih ; saja
		try(ObjekFileYangAkanDiPakai){
			//CODE
		}
		
		try(ObjekFileYangAkanDiPakai ; ObjekFileYangAkanDiPakai){
			//CODE
		}
		
		contoh
		try(FileInputStream tutup = new FileInputStream("input.txt"); FileOutputStream keluar = new FileOutputStream("output.txt")){
			//CODE 
		}
*/

public class Main {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInput = null; 
		FileOutputStream fileOutput = null;
		
		//MEMBUKA FILE
		fileInput = new FileInputStream("input.txt");
		
		//MEMBACA FILE
		int data = fileInput.read(); //berupa byte Stream
		
		while (data != -1){ //Proses pembacaan byte secara satu per satu
			System.out.println((char)data);  //menampilkan hasil bacaan byte stream
			data = fileInput.read();
		}
		
		//MENUTUP FILE
		fileInput.close(); 
		
		//salah satu contoh skenario untuk membuka menutup file 
		try {
			//buka file
			fileInput = new FileInputStream("input.txt");
			fileOutput = new FileOutputStream("output.txt");
			
			//baca file 
			int bufer = fileInput.read();
			
			while (bufer != -1){
				fileOutput.write(bufer); //menuliskan ke output file
				bufer = fileInput.read(); // memanggil buffer lg untuk membaca filenya
			}
			
		} finally {
			if (fileInput != null){
				fileInput.close();
			}
			
			if(fileOutput != null){
				fileOutput.close();
			}
		}
		
		// try with resources yaitu otomatis menutup file jika sudah selesai di baca 
		try(FileInputStream close = new FileInputStream("input.txt"); FileOutputStream tutup = new FileOutputStream("output.txt")) {
			int data2 = close.read();
			
			//menampilkan
			while(data2 != -1){
				tutup.write(data2);
				data2 = close.read();
			}
			
		}
	}
}