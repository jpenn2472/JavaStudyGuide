public class TheStringClass {
	public static void main(String args[]) {
		String s1 = ("hello");
		String s2 = ("hey");
		String s3 = ("Hello");
		String s4 = ("String to array");
		char[] carray = s2.toCharArray();
		
System.out.println(" ");
System.out.println("Boolean Comparison: " + s1.equals(s3));
System.out.println("Return char at index: " + s1.charAt(1));
System.out.println("Boolean Comparison ignore capitals: " + s1.equalsIgnoreCase(s3));
System.out.println("Compares based on unicode value: " + s1.compareTo(s2));
System.out.println("Return hash of String: " + s1.hashCode());
System.out.println("Return index of character in String " + s1.indexOf('e'));
System.out.println("Return last occurence index of character in String " + s1.lastIndexOf('l'));
System.out.println("Concatenate: " + s1.concat(s2));
System.out.println("Return Length: " + s1.length());
System.out.println("Tangent: " + Math.tan(3));
System.out.println("toDegrees: " + Math.toDegrees(3));
System.out.println("Euler's Number: " + Math.toRadians(3));

//loop through array and print
for(char i: carray) {
	System.out.print(i);
}
}
}