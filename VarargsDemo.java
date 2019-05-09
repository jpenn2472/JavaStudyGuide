
public class VarargsDemo {
	//Pass multiple arguements through the printMax method
public static void main(String args[]) {
	printMax(34, 3, 4, 1, 56.5);
	printMax(new double[] {1,2,3});
}
//the elipsis (...) allows you to pass multiple arguments through the method however all the data must be of the same type and this param has to be the last param
public static void printMax(double...numbers) {
	if (numbers.length == 0) {
		System.out.println("No arguement passed");
		return;
	}

	double result = numbers[0];
	
	for (int i =1; i < numbers.length; i++) {
		if (numbers[i] > result)
			result = numbers[i];
	}
		System.out.println("The max value is " + result);
	}
}
