
public class CommandLineMethods {
public static void main(String args []) {
	//A command-line argument is the information that directly follows the program's name on the command line when it is executed. 
	//To acces these arguments is quite easy.
	//They are stored as strings in the String array passed to main().
	
	for(int i = 0; i<args.length; i++) {
		System.out.println("args[" + i + " ]: " + args[i]);
		
		//if compile and ran in the terminal as: java CommandLineMethods Justin Penn You will get:
		//args[0 ]: Justin
		// " ": Penn
	}
}
}
