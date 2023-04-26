// 2022/10/13 10:49
public class Main{
	public static void main(String[] args){
		//TIPE DATA
		int a = 2;
		
		//OPERATOR ARITMATIKA
		/*a = a + 5;       // HASIL 2+5=7 
		   a = a + 10;    // HASIL 2+5+10 = 17
		   System.out.println("Nilai a = " + a);
		*/
		
		//OPERATOR ASSINGMENT PENJUMLAHAN
		a += 5;    // a + 5   ->    2+5=7
		System.out.println("Nilai a Setelah Assingment = " + a);
		
		//OPERATOR ASSINGMENT PENGURANGAN
		int b = 4;
		b -= 2;    // b - 2   ->  4-2=2
		System.out.println("Nilai b Setelah Assingmenet = " + b);
		
		//OPERATOR ASSINGEMENT PERKALIAN 
		int c = 3;
		c *= 5;   // c * 5  ->  3*5=15
		System.out.println("Nilai C setelah Assingement = " + c);
		
		//OPERATOR ASSINGEMENT PEMBAGIAN
		int d = 4; 
		d /= 2;  // d : 2   -> 4:2=2
		System.out.println("Nilai D setelah Assingement = " + d);
		
		//OPERATOR ASSINGEMENT MODULUS 
		int e = 3;
		e %= 2;  // e % 2  ->  3:2=1
		System.out.println("Nilai E setelah Assingement = " + e);
		
	}
}