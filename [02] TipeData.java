// 2022/09/17 20:30
public class Main {
	
	/*
		Tipe data pada java ada 7 :
		byte,char, short, integer, long, float,double,boolean
	*/
	public static void main (String[] args){
		//Tipe data byte 
		byte b = 1;
		System.out.println("========BYTE========");
		System.out.println("Nilai byte = " + b);
		System.out.println("Nilai Minimal = " + Byte.MIN_VALUE);
		System.out.println("Nilai Maximal = " + Byte.MAX_VALUE);
		System.out.println("Besar Bytes = " + Byte.BYTES + " bytes");
		System.out.println("Besar Bit = " + Byte.SIZE + " bit");
		
		//Tipe data char 
		char c = 'Y';   //char harus pakai petik 1
		System.out.println("\n========CHAR========");
		System.out.println("Nilai char = " + c);
		System.out.println("Nilai Minimal = " + Character.MIN_VALUE);
		System.out.println("Nilai Maximal = " + Character.MAX_VALUE);
		System.out.println("Besar Bytes = " + Character.BYTES + " bytes");
		System.out.println("Besar Bit = " + Character.SIZE + " bit");
		
		//Tipe data short 
		short s = 3;
		System.out.println("\n========SHORT========");
		System.out.println("Nilai short = " + s);
		System.out.println("Nilai Minimal = " + Short.MIN_VALUE);
		System.out.println("Nilai Maximal = " + Short.MAX_VALUE);
		System.out.println("Besar Bytes = " + Short.BYTES + " bytes");
		System.out.println("Besar Bit = " + Short.SIZE + " bit");
		
		//Tipe data integer
		int i = 4;
		System.out.println("\n========INTEGER========");
		System.out.println("Nilai Integer = " + i);
		System.out.println("Nilai Minimal = " + Integer.MIN_VALUE);
		System.out.println("Nilai Maximal = " + Integer.MAX_VALUE);
		System.out.println("Besar Bytes = " + Integer.BYTES + " bytes");
		System.out.println("Besar Bit = " + Integer.SIZE + " bit");
		
		//Tipe data long 
		long l = 5;
		System.out.println("\n========LONG========");
		System.out.println("Nilai long = " + l);
		System.out.println("Nilai Minimal = " + Long.MIN_VALUE);
		System.out.println("Nilai Maximal = " + Long.MAX_VALUE);
		System.out.println("Besar Bytes = " + Long.BYTES + " bytes");
		System.out.println("Besar Bit = " + Long.SIZE);
		
		//Tipe data float 
		float f = 6;
		System.out.println("\n========FLOAT========");
		System.out.println("Nilai float = " + f);
		System.out.println("Nilai Minimal = " + Float.MIN_VALUE);
		System.out.println("Nilai Maximal = " + Float.MAX_VALUE);
		System.out.println("Besar Bytes = " + Float.BYTES + " bytes");
		System.out.println("Besar Bit = " + Float.SIZE + " bit");
		
		//Tipe data double 
		double d = 7;
		System.out.println("\n========DOUBLE========");
		System.out.println("Nilai double = " + d);
		System.out.println("Nilai Minimal = " + Double.MIN_VALUE);
		System.out.println("Nilai Maximal = " + Double.MAX_VALUE);
		System.out.println("Besar Bytes = " + Double.BYTES + " bytes");
		System.out.println("Besar Bit = " + Double.SIZE + " bit");
		
		//Tipe data boolean 
		boolean bol = true; 
		System.out.println("\n========BOOLEAN========");
		System.out.println("Nilai boolean = " + bol);
		System.out.println("Nilai boolean True = " + Boolean.TRUE);
		System.out.println("Nilai boolean False = " + Boolean.FALSE);
		}
}