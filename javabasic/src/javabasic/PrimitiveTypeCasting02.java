package javabasic;

public class PrimitiveTypeCasting02 {
	
	public static void main(String[] args) {
		

	
	
	byte b = 1;
	short s = 2;
	int i = 4;
	long l = 8;
	float f = 4.0f;
	double d = 8.0;
	char c = '2';
	boolean bool = false;
	
	
	b = (byte)s;
	s = b;
	
	i = (int)l;
	l = i;
	
	f = (float)d;       
	d = f;
	
	f = 40;
	c = (char)f;
	System.out.println(c);

	
	
	}
	
}
