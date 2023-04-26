//2023/02/17 20:57 

import java.io.*;
import java.util.*;

/*
	Buffered Character Stream (Character Stream yang ter memory/buffer) 
	
	Konsepnya sama seperti BufferedByteStream hanya perbedaan nya ini menggunakan Character sebagai nilai utama nya
	menggunakan FileReader untuk membaca file dan BufferedReader untuk buffer memory nya
	
	Untuk membaca dengan menggunakan BufferedCharacterStream kita menggunakan BufferedReader yang mana dia berguna sebagai memory 
	tidak lupa juga berikan mark sebelum melakukan pembacaan supaya file tersebut dapat di gunakan berkali kali 
	Syntax pembaca an dengan BufferReader: 
		BufferedReader namaVariabel = new BufferedReader(namaVariabelYangAdaFileNya); 
		BufferedReader bufer = new BufferedReader(input.txt); 
		
	melakukan pembacaan dengan menggunakan readLine() 
		String data = bufer.readLine();
	readLine() akan secara otomatis melakukan pembacaan pada 1 Baris atau 1line saja 
	
	melakukan penulisan dengan menggunakan ReaderWriter merukan sebuah cara untuk menulis di character Stream 
	memiliki tatacara penulisan sbg berikut 
		pembuatan objek bufferwriter 
			BufferedWriter namaVariabel = new BufferedWriter(variabelYgAkanDiSimpan);
			BufferedWriter buferOut = new BufferedWriter(fileInp); 
			
		Melakukan assingment sebuah tipe data String yg berguna untuk menampilkan 
			String data = namaVariabelPembacaFile.readLine();
			String data = bufer.readLine();
			buferOut.write(namavariabelygsudahdiassiment,indexKe0,PanjangCharacter);
			buferOut.write(data,0,data.length());
		
		jangan lupa untuk melakukan flush jika sebuah data di simpan dalam buffer 
*/

public class Main{
	public static void main(String[] args) throws IOException{
		
		//membaca file 
		FileReader inputFile = new FileReader("input.txt");
		BufferedReader bufer = new BufferedReader(inputFile);
		bufer.mark(200);
		
		//membaca kedalam string secara langsung dengan readLine()
		String data = bufer.readLine();
		System.out.println(data);
		
		//membaca kedalam char 
		bufer.reset();
		char[] dataCar = new char[25]; 
		bufer.read(dataCar,0,dataCar.length);
		System.out.println(Arrays.toString(dataCar));
		
		//membaca perbaris
		bufer.reset();
		System.out.println(bufer.readLine());
		System.out.println(bufer.readLine());
		System.out.println(bufer.readLine());
		
		//menulis file 
		FileWriter fileOutput = new FileWriter("output.txt");
		BufferedWriter buferOut = new BufferedWriter(fileOutput);
		
		bufer.reset();
		String baris1 = bufer.readLine();
		buferOut.write(baris1,0,baris1.length());
		buferOut.flush();
		
		//menambahkan new line atau enter pada sebuah file 
		buferOut.newLine(); //newLine sebagai membuat line baru dalam sebuah file
		
		String baris2 = bufer.readLine();
		buferOut.write(baris2,0,baris2.length());
		buferOut.flush();
		
		buferOut.close();
		fileOutput.close();
		inputFile.close();
		bufer.close();
	}
}