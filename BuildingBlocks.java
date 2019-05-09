import java.util.Scanner;

public class BuildingBlocks {
public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("The second large class is all about the building blocks of java: Variables, Data Types, and Values");
	System.out.println("Lesson one: What is a variable?");
	System.out.println("A variable in java is basically a container for data, that data is known as the variables value");
	System.out.println("Their are 8 primitive data types and they can all be used differently to see a list of the eight data types enter 1");
	System.out.println("To see these examples in action press 2. The var is composed of the maximum amount of numerrical values the data type can handle.");
	int input = sc.nextInt();
	
	if (input == 1) {
		
		System.out.println(" Here is a list of all primitives in Java:\n" + 
				"\n" + 
				"    byte (The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.1"
				+ ")\n" + 
				"    short (The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.)\n" + 
				"    int (By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1. Use the Integer class to use int data type as an unsigned integer. See the section The Number Classes for more information. Static methods like compareUnsigned, divideUnsigned etc have been added to the Integer class to support the arithmetic operations for unsigned integers.)\n" + 
				"    long (The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1. Use this data type when you need a range of values wider than those provided by int. The Long class also contains methods like compareUnsigned, divideUnsigned etc to support arithmetic operations for unsigned long.)\n" + 
				"    float (The float data type is a single-precision 32-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification. As with the recommendations for byte and short, use a float (instead of double) if you need to save memory in large arrays of floating point numbers. This data type should never be used for precise values, such as currency. For that, you will need to use the java.math.BigDecimal class instead. Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.)\n" + 
				"    double (The double data type is a double-precision 64-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification. For decimal values, this data type is generally the default choice. As mentioned above, this data type should never be used for precise values, such as currency.`)\n" + 
				"    char (The char data type is a single 16-bit Unicode character. It has a minimum value of '\\u0000' (or 0) and a maximum value of '\\uffff' (or 65,535 inclusive).)\n" + 
				"    boolean (The boolean data type has only two possible values: true and false. Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its \"size\" isn't something that's precisely defined.)\n" + 
				"\n" + 
				"Java is a strong typed language, which means variables need to be defined before we use them.");
	}
	if (input == 2) {
		byte bytevar = 123;
		short shortvar = 12345;
		int intvar = 1234567891;
		double doublevar = 12.34567891;
		long longvar = 1234567891;
		float floatvar = 123434;
		boolean booleanvar = true;
		char charvarone = 'a';
		char[] charArray = {'a', 'b'};
		
		System.out.println(bytevar);
		System.out.println(shortvar);
		System.out.println(intvar);
		System.out.println(doublevar);
		System.out.println(longvar);
		System.out.println(floatvar);
		System.out.println(booleanvar);
		System.out.println(charvarone);
		System.out.println(charArray[1]);
		
	
}
}
}