// 2022/11/15 17:44

import java.util.*;

/*
	Operator Ternary merupakan sebuah opertor If Else 
	yang mana operator ini adalah sorthand (persingkat syntax) 
	operator ini cocok di gunakan jika percabangan nya hanya 1 saja 
	operator ini memiliki ciri khas ada tanda ? nya
	operator ternary memiliki syntax sebagai berikut :
		variabel_x = ekspresi ? Kondisi_True : Kondisi_False;
*/
public class Main {
	public static void main (String[] args){
		//PEMBUATAN OBJEK SCANNER
		Scanner input = new Scanner(System.in);
		
		//TIPE DATA 
		int x,nilai ;
		
		//INPUT USER 
		System.out.print("Masukan nilai: ");
		nilai = input.nextInt();
		
		//OPERATOR TERNARY
		x = (nilai == 10) ? (nilai*nilai) : (nilai/2);
		System.out.println("Hasil Nilai: " + x);
	}
}