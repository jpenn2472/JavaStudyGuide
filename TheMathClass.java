import java.util.Scanner;

public class TheMathClass {
	public static void main(String args[]) {
		
	
System.out.println("The math class contains a lot of math specific methods such as 'round'. As with wrapper classes it is a part of the java.lang package");
System.out.println("Absolute Value: " + Math.abs(-1.2));
System.out.println("ArcSign: " + Math.asin(32));
System.out.println("Natural Log: " + Math.log(3));
System.out.println("Raise to a power: " + Math.pow(3,4));
System.out.println("Random: " + Math.random()* 10);
System.out.println("Euler's " + Math.exp(3));
System.out.println("Round to nearest int (double) : " + Math.rint(3.500));
System.out.println("Round: (float) " + Math.round(3.500));
System.out.println("Sin: " + Math.sin(3));
System.out.println("square root: " + Math.sqrt(16));
System.out.println("Tangent: " + Math.tan(3));
System.out.println("toDegrees: " + Math.toDegrees(3));
System.out.println("Euler's Number: " + Math.toRadians(3));

double rng = (Math.random() * 52);
System.out.println(rng);

}
}