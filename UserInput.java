//Accepting user input class example
//first import Scanner package
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.Reader;
public class UserInput {
	
	public static void main (String args[]) {
		//Create a new Scanner object. This scanner will be responsible for handling numeric data or an int value
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number , then enter a word");
		//following line gets user int input by using the .nextInt method from scanner sc
		int usernum = sc.nextInt();
		String s = sc.next();
		//Their is no api method to retrieve char data from the user via Scanner. You have to store the data in a string the select which index to store with .next and charAt
		
		System.out.println(usernum);
		System.out.println(s);
	}

}
