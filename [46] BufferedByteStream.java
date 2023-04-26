// 2023/02/10 17:45

import java.io.*;

/*
	Buffered Byte Stream (Byte Stream yang ter memory/buffer)
	
	Jika byte Stream dia membaca setiap character jadi dia membacanya perkata bukan dalam 1 line
	
	Jika Buffered byte Stream dia akan membaca 1line lalu akan memasuk kan nya kedalam memory tersendiri 
	harus melakukan import java.io.BufferedInputStream terlebih dahulu lalu melakukan inisisasi objek Buffer : 
		BufferedInputStream buferInput = new BufferedInputStream(variabel yg ingin disimpan);
		BufferedInputStream buferInput = new BufferedInputStream(fileInput); 
		
	Buffered Input Stream akan jauh lebih cepat jika untuk mengelola atau membaca suatu file daripada Byte Stream 
	
	Jika memakai Buffer input stream maka kita bisa melakukan reset yang mana artinya kita bisa memakai file itu secara berulang kali dengan syarat kita harus memberikan mark atau tanda 
	dan setelah itu kita memberikan .reset() di akhir penulisan
		code: 
		buffer.mark(limitBufferDalamNilaiAngka);
		buffer.mark(200);
		
	String dapat mengambil data dari sebuah Araybyte, yg mana awalnya hanya angka lalu akan otomatis menjadi sebuah huruf 
	
	BufferedOutputStream merupakan sebuah buffer yg berfungsi untuk melakukan output atau hasil dari suatu file, biasanya digunakan untuk menuliskan ulang 
	dalam BufferedOutputStream penginisiasian nya sama seperti BufferedInputStream  
	jika selesai melakukan pemasukan data maka jangan lupa di pakaikan code .flush() yg berfungsi untuk menulis secara lgsg
	jika ingin menuliskan hanya tinggal menaruh .write() saja 
	Syntax :
		bufferOutput.write(VariabelDataByteArray,indexAwalArray,IndexAkhirArray);
		bufferOutput.write(data,0,data.length);
	
*/

public class Main {
	public static void main(String[] args) throws IOException{
		
		long waktuMulai, waktuSelesai;
		
		//Membaca dari file 
		FileInputStream fileInput = new FileInputStream("input.txt");
		System.out.println(fileInput.available()); //untuk melihat berapa banyak jumlah karakter 
		
		//menghitung waktu pembacaan 
		waktuMulai = System.nanoTime(); 
		System.out.println(fileInput.readAllBytes());// untuk membaca semuanya yg ada dalam file 
		waktuSelesai = System.nanoTime(); 
		System.out.println("waktu = " + (waktuSelesai - waktuMulai));
		fileInput.close(); //untuk menutup file 
		
		System.out.println();
		
		//membaca dari memory 
		FileInputStream fileInput2 = new FileInputStream("input.txt");
		BufferedInputStream buferInput = new BufferedInputStream(fileInput2);
		
		buferInput.mark(200); //memberi tanda supaya bisa di gunakan terus menerus
		//menghitung waktu
		waktuMulai = System.nanoTime();
		System.out.println(buferInput.readAllBytes()); 
		waktuSelesai = System.nanoTime();
		System.out.println("waktu = " + (waktuSelesai - waktuMulai)); 
		
		//baca ulang
		buferInput.reset();
		byte[] databyte = buferInput.readAllBytes(); 
		String dataString = new String(databyte); //untuk menjadikan String, yg awalnya sebuah byte angka maka akan secara otomatis menjadi String sebab String bisa membaca sebuah ArayByte
		System.out.println(dataString);
		fileInput2.close();
		buferInput.close();
		
		//menulis dengan buffered output 
		FileOutputStream fileOutput = new FileOutputStream("output.txt"); 
		BufferedOutputStream buferOut = new BufferedOutputStream(fileOutput); 
		
		//write data berupa byte 
		buferOut.write(databyte,0,databyte.length); //ini masih menampung sebuah data dalam bufer setelah itu di flush() supaya data bisa ter tulis
		buferOut.flush();
		
		buferOut.close(); 
		fileOutput.close();
		
	}
}