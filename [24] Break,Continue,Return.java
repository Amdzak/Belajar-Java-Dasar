// 2022/11/22 20:50

/*
	Break : kode untuk memaksa keluar dari sebuah program 
	Continue :  kode untuk loncat atau memaksa kembali ke awal program 
	Return : kode yang memaksa kita selesai atau menyelesaikan program dari suatu metode/fungsi yang mana tidak akan mengeksekusi jika ada kode di bawahnya 
	intinya dimana ada return pasti progam akan keluar dari fungsi(metode)
*/

public class Main {
	public static void main (String[] args){
		//CONTOH PENGGUNAAN BREK , CONTINUE DAN RETURN DALAM LOOPING 
		int a = 0; 
		System.out.println("Awal program \n");
		while (true){
			a++;
			if (a == 10){
				break; // program looping akan berakhir di loopong ke 10
			} else if (a == 5){
				continue; // progam akan memulai dari awal lagi
			} else if (a == 7){
				return; //progam akan berakhir dari suatau metode yang mana tidak akan mengeksekusi jika ada kode di bawahnya
			}
			System.out.println("Ini looping ke - " + a);
		}
		System.out.println("\nAkhir Program ");
	}
}