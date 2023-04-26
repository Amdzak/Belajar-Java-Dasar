// 2023/02/09 19:10

import java.io.FileInputStream;
import java.io.IOException;
/*
	Pengenalan tentang I/O Stream serta input file 
	
	Bagian ini merupakan bagian untuk membaca dan menulis suatu file 
	
	FileInputStream merupakan sebuah library dari dalam java.io yang mana berguna untuk mengambil file yang ada 
	java.io merupakan library khusus untuk melakukan Input Output 
	syntax 
		FileInputStream namaVariabel = new FileInputStream("namaFile");
		FileInputStream fileInput = new FileInputStream("input.txt"); 
		
	Jika ingin membaca file maka harus di tambahkan .read() pada nama variabel FileInputStream nya contoh 
		System.out.print(fileInput.read());
		
	.jar file merupakan sebuah komponen java archive file yg berguna menjadi sebuah aplikasi
	
	untuk menaruh file  harus 1 tempat dengan source codecode 
	
	jika kita melakukan atau membuat file stream lebih dari 1 lebih baik kita melakukan closeing terlebih dahulu terhadap file sebelumnya 
	dan supaya tidak ada memory tambahan yg ga guna dengan menggunakan .close() 
	syntax : 
		namaVariabelfile.close();
		fileInput.close();
*/

public class Main {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInput = null; 
		
		fileInput = new FileInputStream("input.txt"); //Syntax untuk mengambil file hasil inputan user 
		System.out.println((char)fileInput.read());
		System.out.println((char)fileInput.read());
		System.out.println((char)fileInput.read());
		System.out.println((char)fileInput.read());
		System.out.println((char)fileInput.read());
		System.out.println((char)fileInput.read()); 
		
		fileInput.close();
		fileInput = new FileInputStream("input.txt");
		System.out.println("nama file input = " + fileInput); 
		
		System.out.println("Closing");
		fileInput.close(); //Untuk menutup file sebelumnya 
		System.out.println("nama file input = " + fileInput); 
		
		fileInput = new FileInputStream("input2.txt");
		System.out.println("nama file input = " + fileInput); 
		
	}
}