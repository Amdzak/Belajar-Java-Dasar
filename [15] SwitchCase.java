// 2022/11/15 17:18

import java.util.*;

/* 
	Switch Case merupakan sebuah syntax yang kegunaan naya sama seperti if else 
	tetapi untuk if else lebih fleksibel kalau switch case tidak fleksibel, swotch case biasanya digunakan untuk pergantian menu atau behavior 
	switch case sendiri memiliki 3 unsur utama dalam penyusunan syntax :
		1. switch -> digunaka untuk ekspresi atau kondisi yang aka di eksekusi 
		2. case  -> merupakan pilihan yang digunakan untuk kondisi pilihan jika terpenuhi disini tempatnya code di tulis
		3. break -> di gunakan untuk melakukan pemberhentian jika suatu kondisi sudah terpenuhi supaya tidak semua code keluar 
		4. default -> yaitu digunakan untuk output default jika semua kondisi tidak terpenuhi 
	Syntax switch case : 
		switch (ekspresi){
			case pilihan : 
				Statmen;
			break;
			case pilihan2 : 
				Statment;
			break;
			default
		}
*/
public class Main {
	public static void main (String[] args){
		//PEMBUATAN OBJEK SCANNER 
		Scanner input = new Scanner (System.in);
		
		//TIPE DATA 
		String masukan; 
		
		//INPUT USER 
		System.out.print("Masukan nama: ");
		masukan = input.next();
		
		//SWITCH CASE 
		switch (masukan) {
			case "Ahmad" :
				System.out.println("Halo " + masukan +"  Selamat Datang yah kamu orang pertama");
				break;
			case "Muhammad" : 
				System.out.println("Halo " + masukan +" Maaf kamu orang ke 2 :(");
				break;
			default : 
				System.out.println("Nama " + masukan + " Tidak ada");
		}
	}
}