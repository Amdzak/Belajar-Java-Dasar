//2023/02/10 14:50 

import java.io.FileInputStream; //UNTUK BYTE STREAM
import java.io.FileOutputStream; //UNTUK BYTE STREAM
import java.io.FileReader; //UNTUK CHARCTER STREAM
import java.io.IOException;
import java.io.FileWriter;

/*
	Character Stream (Un Buffer I/O)
	
	memiliki kelebihan untuk mempunyai banyak bahasa 
	sedangkan byte stream dia hanya memiliki ruang lingkup untuk 8bit 
	jika terkena bahasa jepang,korea atau bahasa bukan huruf alfabet maka character stream akan berguna 
	jadi character Stream ini berfungsi sebagai bahasa internasional bagi pemrograman 
	saat menampilkan suatu bahasa yg bukan alfabet ini sangat berguna
	
	jika memakai byte stream maka selalu pakai FileInputStream 
	jika memakai character stream maka memakai FileReader 
	syntax: 
		import java.io.FileReader; 
		FileReader namaVariabel = new FileReader("namaFile");
		FileReader fileInput = new FileReader("input.txt");
		
	jika ingin menulis menggunakan character stream maka memaki FileWriter 
	syntax: 
		import java.io.FileWriter;
		FileWriter namaVariabel = new FileWriter("namaOutput");
		FileWriter output = new FileWriter("output.txt");
*/

public class Main {
	public static void main(String[] args) throws IOException{
		
		//membuka file 
		FileInputStream fileByte = new FileInputStream("input.txt"); //Byte Stream 
		FileOutputStream fileOut = new FileOutputStream("outputByte.txt"); //ouput byte stream
		FileReader carFile = new FileReader("input.txt"); //Charcter Stream 
		FileWriter carOut = new FileWriter("outputChar.txt");
		
		//membaca file 
		
		//untuk bytefile
		int a = fileByte.read();
		
		while (a != -1){
			System.out.print((char)a);
			fileOut.write(a);
			a = fileByte.read();
		}
		
		System.out.println("\n");
		
		//untuk character 
		a = carFile.read();
		
		while (a != -1){
			System.out.print((char)a);
			carOut.write(a);
			a = carFile.read();
		}
		
		
		
		//mentup file 
		fileByte.close();
		carFile.close();
		fileOut.close();
		carOut.close();
	}
}