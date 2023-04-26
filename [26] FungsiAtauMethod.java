// 2022/11/27 10:04

/*
	fungsi atau method merupakan sebuah cara untuk mempermudah penulisan code  
	jika tipe data pada fungsi selain void maka di perlukan return namaVariabel;
	void merupakan tipe data kosong jadi kita tidak perlu menambahkan return pada akhir code 
		tipe data VOID biasa di gunakan untuk melakukan sebuah kegiatan saja tapa proses perhitungan 
		hanya sebuah aksi saja tanpa melakukan sebuah proses perhitungan 
	
	
	fungsi sendiri memiliki syntax penulisan sederhana sebagai berikut 
	static TipeData NamaFungsi(){
		}
		
	jika suatu fungsi itu merupakan Operasi matematika maka akan di perlukan parameter didalam fungsinya 
	penulisan parameter lebih dari 1 di pisahkan dengan tanda koma 
	syntax penulisan sebagai berikut 
	static TipeData NamaFungsi(tipeData Parameter,tipeData Parameter) {
		}
*/

public class Main {
	
	//FUNGSI TANPA KEMBALIAN
	public static void main (String[] args){
		int x,y;
		
		x = 10;
		y = hitung(x);
		
		System.out.println("Nilai x = " +x+" y = " +y);
		x = 18;
		y = hitung(x);
		
		System.out.println("Nilai x = " +x+" y = " +y);
		x = 20;
		y = hitung(x);
		
		System.out.println("Nilai x = " +x+" y = " +y);
	}
	
	//FUNGSI DENGAN KEMBALIAN (return) UNTUK MEGEMBALIKAN NILAINYA
	private static int hitung(int masuk){
		int hasil; 
		
		hasil = (masuk+10) * masuk;
		
		return hasil;
	}
}