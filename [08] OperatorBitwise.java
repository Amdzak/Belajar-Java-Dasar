// 2022/10/18 18:12
public class Main{
	public static void main (String[] args){
		//OPERATOR BITWISE MERUPAKAN OPERATOR YANG BERJALAN PADA NILAI BIT 
		
		//KODE PROGRAM PEMAHAMAN 
		//TIPE DATA 
		byte a = 3;  //tipe data byte supaya tidak terlalu panjang nilai bit nya 
		byte b,c ;
		String a_bits,b_bits,c_bits ; //deklarasi untuk menampilkan nilai bit ke string 
		
		//OPERATOR SHIFT LEFT 
		System.out.println("\n####OPERATOR SHIFT LEFT");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %d \n", a_bits,a);
		b = (byte)(a << 3);
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s = %d \n", b_bits,b);
		
		//OPERATOR SHIFT RIGHT 
		System.out.println("\n####OPERATOR SHIFT RIGHT"); 
		a = 24; 
		a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %d \n", a_bits,a);
		b = (byte)(a >> 1);
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s = %d \n",b_bits,b);
		
		//OPERATOR LOGIKA OR 
		System.out.println("\n####OPERATOR OR ( | ) ");
		a = 24;
		a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %d \n", a_bits,a);
		b = (byte)(a >> 1);
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s = %d \n",b_bits,b); 
		c = (byte)(a | b);
		c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
		System.out.printf("%s = %d \n",c_bits,c); 
		
		//OPERATOR LOGIKA AND
		System.out.println("\n####OPERATOR AND ( & ) ");
		a = 24;
		a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %d \n", a_bits,a);
		b = (byte)(a >> 1);
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s = %d \n",b_bits,b); 
		c = (byte)(a & b);
		c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
		System.out.printf("%s = %d \n",c_bits,c); 
		
	}
}