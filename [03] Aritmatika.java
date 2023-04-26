// 2022/09/18 19:31

/*
	Aritmatika memiliki 5 macam yaitu 
	penjumlahan       +
	pengurangan       -
	perkalian              *
	pembagian           /
	modulu                 %
*/
public class Main {
	
	public static void main (String[] args){
		
		//Tipe data 
		float bil1 = 17;
		float bil2 = 3;
		float hasil;
		
		//Penjumlahan 
		hasil = bil1 + bil2;
		System.out.println(bil1 + "+" + bil2 + "=" + hasil);
		
		//Pengurangan 
		hasil = bil1 - bil2;
		System.out.println(bil1 + "-" + bil2 + "=" + hasil);
		
		//Perkalian 
		hasil = bil1 * bil2;
		System.out.println(bil1 + "x" + bil2 + "=" + hasil);
		
		//Pembagian 
		hasil = bil1 / bil2;
		System.out.println(bil1 + ":" + bil2 + "=" + hasil);
		
		//Modulo 
		hasil = bil1 % bil1;
		System.out.println(bil1 + "%" + bil2 + "=" + hasil);
		}
}