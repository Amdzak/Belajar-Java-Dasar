//2023/02/04 16:36 

import java.util.Scanner;
import java.lang.String;

/*
	Operasi Pada String 
	
	jika ingin mengenal lebih dalam tentang String bisa search di google 
	docs java se x.x.x String
	
	String literal adalah penulsan tipe data String secara Assingment contoh 
		String kata = "Sekarang hari sabtu";
	
	Replace String atau megganti sebuah komponen dengan sesuatu yg baru 
	Setiap kita mengubah string maka ia akan selalu membuat memory baru 
	selalu perhatikan kaena bisa membuat kehabisan memory 
	Syntax :
		NamaVariabel.replace("kataAwal","kataBaru");
	Contoh : 
		String kata = "Admin Kucing";
		String kata1 = kata.replace("Admin", "Anggota");
		
	equallity(Persamaan) 
	ada 2 cara yaitu dengan operator == atau .equals()
	untuk penggunaan operator == pada tipedata String hanya akan mengecek apakah addres dari kedua string itu sama atau tidak 
	untuk penggunakan operator .equals() pada tipedata string dia akan mengecek nilai atau isi dari tepdata tersebut
	contoh : 
		String kata = "test";
		String kata1 = "test";
		if (kata == kata1){
			System.out.println("sama");
		} else{
			System.out.println("Beda");
		}
		//OUTPUT = SAMA 
		
		String kata2 = new String("test");
		if (kata2.equals(kata1)){
			System.out.println("sama");
		} else{
			System.out.println("Beda");
		}
		//OUTPUT = SAMA 
		
		Komparasi String 
		membandingkan berdasarkan urutan alfabetnya dengan memanfaatkan code .compareTo();
		jarak antara alfabet nya jika nilainya tidak minus berarti dia lebih besar nilai nya
*/

public class Main{
	public static void main(String[] args){
		String kata = "Admin Kucing";
		
		//Mengambil Char pada string 
		System.out.println(kata.charAt(2));
		
		//Menggunakan SubString 
		System.out.println(kata.substring(2,6));
		
		//operasi di atas di namaka ConCatalicion atau di sebut Concat, jika di MSExcel concat artinya menyambungkan 
		//melakukan dengan concat 
		String kata2 = kata + " Aku"; 
		System.out.println(kata2);
		
		kata = kata + " Cireng"; //Menjadika adanya String baru yg immutable
		System.out.println(kata);
		
		//concat dengan beda tipe data 
		int jumlah = 20;
		String kata3 = kata + " " + jumlah; //casting menggabungkan tipedata yg beda
		System.out.println(kata3);
		
		// Compare
        String motor1 = "royal enfield himalayan";
        String motor2 = "kawasaki w175";
        System.out.println(motor1.compareTo(motor2)); // klmnopqr
        System.out.println(motor2.compareTo(motor1));

        String gorengan1 = "bakwan";
        String gorengan2 = "bala-bala";
        System.out.println(gorengan1.compareTo(gorengan2));
        System.out.println(gorengan2.compareTo(gorengan1));
		
		//lowercase dan upercase 
		System.out.println(kata3.toUpperCase()); //Upercase (capslock semua)
		System.out.println(kata3.toLowerCase());//Menjadika adanya String baru yg immutable
		
		//replace atau menganti kompenen denagn komponen yg lain 
		String kata4 = kata3.replace("Admin", "Anggota");
		System.out.println(kata4);
		
		//equallity(persamaan)
		
		String kalimat = "test";
		String kalimat2 = "test";  
		if (kalimat == kalimat2){ //memory berada pada stringpool karena sama
			System.out.println("Sama");
		} else{
			System.out.println("Beda");
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nMengambil input user: ");
		String inputUser = input.next();
		
		if (inputUser.equals(kalimat)){ //memory berada pada stringpool karena sama
			System.out.println("Sama");
		} else{
			System.out.println("Beda");
		}
		
	}
}