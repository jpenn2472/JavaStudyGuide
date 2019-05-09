import java.util.Scanner;
public class Methods {
public static void main (String args []) {
	int a = 3;
	int b = 4;
	int c = max(a,b);
	System.out.println("The maximum number between " + a + " and " + b + " is " + c);
	//If code is ran hello yolo will print once as the message created from nPrintln is out of scope of the original program
	//When the message parameter is passed through the method the original hello yolo message is stored in memory before the method is invoked
	//So the original message string is kept intact while the nprintln method creates a copy and modifies the String to display the hello message.
	String message = ("helloyolo");
	nPrintln("Hello", 4);
	System.out.println(message);
	
	printGrade(returnUserIn());
	
	
	//A java method is similar to a function in c programming. It is a collection of statements that are grouped togethter to perform an operation.
	//In general a methods syntax is 
	// modifier returnValuteType methodName (list of parameters) {
	// Method Body;
	//}
	//Modifiers: Tells the compiler how to call the method. Is optional
	//Return Type: A method may return a value. The returnValueYupe is the type of data the method returns. Sometimes method work with out a return value. Void methods.
	//Method Name: Actual name of the method. This plus the parameter list is the method signature
	//Method Body: The method body contains a collection of statements that the method processes
	
	//Example method return the max number between two numbers:
	
	
}
//simple compare values method
	public static int max(int num1, int num2) {
		int result;
		if (num1 > num2) {
			result = num1;
		}
		else {
			result = num2;
	} return result;
}
	//Calculate Grade Score by entering returnUserIn method as double score. Double due to decimal place
	public static void printGrade(double score) {
		if (score >= 90.0) {
			System.out.println('A');
		}
		else if (score >= 80) {
			System.out.println('B');
		}
		else if (score >= 70) {
			System.out.println('C');
		}
		else if (score >= 60) {
			System.out.println('D');
		}
		else {
			System.out.println('F');
		}
	}
	//Take user input for the grade Score
	public static double returnUserIn() {
		System.out.println("Enter Score to be calclulated with printGrade method");
		Scanner sc = new Scanner(System.in);
		double userinput = sc.nextDouble();
		return userinput;
	}
	public static void nPrintln(String message, int n) {
		for (int i =0; i < n; i++) {
			System.out.println(message);
		}
			
	}
}
