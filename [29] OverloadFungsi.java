// 2022/12/01 19:16

/*
	OVERLOAD FUNGSI ATAU METODE 
	MERUPAKAN SUATAU CARA YANG BERGUNA JIKA KITA INGIN MENGGUNAKAN 1 NAMA FUNGSI 
	SECARA BERULANG ULANG TETAPI ARGUMEN NYA BISA BERUBAH UBAH 
	DALAM CONTOH KASUS JIKA KITA INGIN MENGINPUT NILAI DENGAN BEDA TIPE DATA MAKA OVERLOAD METODE DI GUNAHAKN DI SINI 
	OVERLOAD METHOD MERUPAKAN SEBUAH CARA YANG MANA KITA 
	MENULISKAN FUNGSI YANG SAMA SECARA PERISIS TETAPI DIA MEMILIKI TIPE DATA YANG BEDA
*/

public class Main {
	public static void main(String[] args){
		integer(10);
		integer(10.5f);
	}
	
	private static void integer(float angkaFloat){
		System.out.println("Nilai dari angka Float adalah = " + angkaFloat);
	}
	
	private static void integer(int angkaInt){
		System.out.println("Nilai dari angka integer adalah = " + angkaInt);
	}
}