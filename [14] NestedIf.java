// 2022/11/15 13:30


/* 
	NESTED IF ATAU IF BERSARANG MERUPAKAN SEBUAH METODE ATAU CARA YANG MANA ADA IF DI DALAM IF 
	JADI INI MERUPAKAN SEBUAH CARA YANG MEMUNGKINKAN KITA MEMVALIDASI PILIHAN DI DALAM PILIHAN CONTOH SYNTAX 
	if (ekspresi 1){
		if (ekspresi 1.1){
			Statement aksi 1.1;
		}else {
			ststment default 1.1;
		}
	}else {
		Staatment default 1;
	}
*/
public class Main {
	public static void main (String[] args){
		
		//CONTOH PROGRAM 
		
		int a = 5;
		int b = 7;
		
		//AWAL PROGRAM
		System.out.println("INI ADALAH AWAL PROGRAM \n");
		
		//NESTED IF ATAU IF BERSARANG 
		if (a == 5){
			if (b == 7){
				System.out.println("Nilai a 5 dan nilai b 7");
			} else {
				System.out.println("Nilai a 5 dan nilai b bukan 7");
			}
		 } else {
			System.out.println("Nilai A bukan 5");
		}
		
		//AKHIR PROGRAM
		System.out.println("\nINI AKHIR DARI PROGRAM");
	}
}