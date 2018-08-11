import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a=150,b=160;
	System.out.println("values before swapping");
	System.out.println("a="+a);
	System.out.println("b="+b);
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("values after swapping");
		System.out.println("a="+a);
	System.out.println("b="+b);

	
	}
}
