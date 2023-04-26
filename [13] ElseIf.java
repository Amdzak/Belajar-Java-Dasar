// 2022/11/15 13:01

/*
	IF - ELSE - IF STATMENT 
	Merupakan sebuah code yang memungkinkan kita untuk membuat pernyataan lain jika pernyataan awal tidak di penuh i 
	bertempat setelah code if (){}, penulisan syntax 
	else if (Ekspresi_Yang_harus_dipenuhi) {
		Statement;
	}
	
	full syntax : 
	if (ekspresi_1){
		Statement _1;
	} else if (Ekspresi_2){
		Statement_2;
	} else {
		Statement_default
	}
*/
public class Main {
	public static void main (String[] args){
		//CONTOH PROGRAM ELSE IF 
		
		//AWAL 
		int a = 7; 
		
		System.out.println("Ini adalah awal"); 
		
		if (a == 5){
			System.out.println("Nilai = 5  (Aksi 1)");
		} else if (a == 7){
			System.out.println("Nilai = 7 (Aksi 2)");
		} else {
			System.out.println("Statement Default");
		}
		
		//AKHIR 
		System.out.println("INI ADALAH AKHIR");
	}
}