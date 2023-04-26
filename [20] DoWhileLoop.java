// 2022/11/18 10:14

/*
	DO WHILE LOOP MERUPAKAN SEBUAH SYNTAC PROGRAM YANG MEMUNGKINKAN KITA UNTUK 
	MELAKUKAN EKSEKUSI PROGRAM TERLEBIH DAHULU LALU DI LAKUKAN PERULANGAN
	MEMILIKI SYNTAX PENULISAN SEBAGAI BERIKUT 
		do {
			//CODE PROGRAM 
		} while (KONDISI_TRUE/FALSE);
		
*/

public class Main {
	public static void main (String[] args){
		int a = 0;
		boolean kondisi = true;
		
		System.out.println("Ini adalah awal program");
		
		do {
			a++;
			System.out.println("Ini perulangan ke " + a);
			
			//UNTUK MENGHENTIKAN PERULANGAN DALAN WHILE 
			if (a == 10){
				kondisi = false;
			}
		} while(kondisi); //JIKA FALSE MAKA CODE PROGAM AKAN DI JALANKAN SEKALI
		
		System.out.println("Ini adalah akhir program");
	}
}