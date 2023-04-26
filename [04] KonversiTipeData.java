// 2022/09/29 15:20
public class Main {
	
	public static void main (String[] args){
		/*
		CASTING OPERATOR 
			Konversi tipe data numeric dengan menggunakan casting operator yang mana nanti akan menjadikan hasil yg kita inginkan berbeda ripe data tanpa mengganti tipe data awal nya 
			yaitu dengan cara memberi code (TipeData) saja di depan nya 
				(int)
				(byte)
				(float)
				(double)
				(long)
			contoh: 
			int a=1;
			print((float) a);  -> maka akan menjadi float 
		*/
		
		int a = 25730275;
		System.out.println("Nilai dari A adalah = " + (long)a);
		
		byte b = (byte) a;
		System.out.println("Nilai dari B adalah = " + b);
		}
}