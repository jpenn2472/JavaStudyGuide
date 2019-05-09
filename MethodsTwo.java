
public class MethodsTwo {
public static void main(String args[]) {
	//Scope of Variables is where the variables can be referenced
	int num1 = 1;
	int num2 = 2;
	double decnum = 11.3;
	double normnum = 12.0;
	//Prints out original variables
	System.out.println("Before swap method, num1 is " + num1 + " and num2 is " + num2);
	
	swap(num1, num2);
	//even though this println is created after the swap method has been ran it will still print same results as above
	//This is because the compiler holds onto the original variables in memory when the method is ran. The compiler points to
	//our original ints when asked in the main method, but the print in the swap method uses the parameters passed in the method for its print
	//therefore printing the variables after they were calculated in the swap method
	System.out.println(" Before swap method, num1 is " + num1 + " and num2 is " + num2);
	System.out.println(max(decnum,normnum));
}
//A parameter is actually a local variable. Scope of a method parameter covers the entire method
public static void swap(int n1, int n2) {
	int temp = n1;
	n1 = n2;
	n2 = temp;
	System.out.println("After swappinString result;g n1 is " + n1 + " n2 is " + n2);
	// If this code was uncommented it would not work due to this num1 being out of scope of the main method num1 += 3;
}


//Method overloading example: Max method from the other java class Methods
//Overloading methods is when you use a method name that is already defined and change its parameter lists
//The original max methods uses ints. (See Methods.java)
//This iteration uses the double datatype to check for decimals
public static double max(double num1, double num2) {
	double result;
	if (num1 > num2) {
		result = num1;
	}
	else {
		result = num2;
} return result;
}
}

