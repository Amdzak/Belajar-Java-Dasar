// 2022/10/18 17:07

public class Main {
	public static void main (String[] args){
		/* OPERATOR LOGIKA 
				Merupakan operasi yang bekerja pada tipe ata BOOLEAN 
				Memiliki 3 simbol operasi 
				AND          &&
				OR             ||
				XOR           ^
				NEGASI    !
		*/
		
		// TIPE DATA 
		boolean a,b,c;
		
		// BOOLEAN AND
		System.out.println("##### AND dan (&&) #####");
		a = true;
		b = true;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);
		a = true;
		b = false;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);
		a = false;
		b = true;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);
		a = false;
		b = false;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);
		
		// BOOLEAN OR 
		System.out.println("##### OR atau (||) #####");
		a = true;
		b = true;
		c = (a || b);
		System.out.println(a + " || " + b + " = " + c);
		a = true;
		b = false;
		c = (a || b);
		System.out.println(a + " || " + b + " = " + c);
		a = false;
		b = true;
		c = (a || b);
		System.out.println(a + " || " + b + " = " + c);
		a = false;
		b = false;
		c = (a || b);
		System.out.println(a + " || " + b + " = " + c);
		
		//BOOLEAN XOR 
		System.out.println("##### XOR Exclusive OR (^) #####");
		a = true;
		b = true;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);
		a = true;
		b = false;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);
		a = false;
		b = true;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);
		a = false;
		b = false;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);
		
		//BOOLEAN NEGASI 
		System.out.println("##### NEGASI Kebalikan (!) #####");
		a = true;
		b = (!a);
		System.out.println("Negasi !" + a + " = " + b);
		a = false;
		b = (!b);
		System.out.println("Negasi !" + a + " = " + b);
	}
}