// 2022/11/13 16:48

/*
	If statment atau Percabangan
	Merupakan sebuah code yang memungkinkan kira untuk mengatur arah nya alur suarau program 
	if statment memiliki syntax sebagai berikut 
	if (Ekspresi) {     --------->     Ekspresi harus bernilai BOOLEAN 
		//CODE EKSEKUSI
	}
	
	else statment merupakan default jika ekspresi nya tidak terpenuhi 
	else statment memiliki syntax sebagai berikut 
	else {
		//CODE EKSEKUSI
	}
	
	FULL SYNTAX: 
	if (ekspresi){
		//CODE
	} else {
		//CODE
	}
*/

public class Main {
	public static void main (String[] args){
		int a = 4;
		
		System.out.println("nilai = " +a);
		
		if (a == 4){
			System.out.println("JALUR TRUE");
		} else {
			System.out.println("JALUR FALSE");
		}
		System.out.println("Selesai");
	}
}