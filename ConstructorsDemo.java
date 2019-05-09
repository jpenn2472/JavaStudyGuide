

public class ConstructorsDemo {
		public static void main(String args[]) {
			//following 2 lines create two objects with in i parameters.
			consObj t2 = new consObj(4);
			consObj t3 = new consObj(12);
			System.out.println(t2.x + t3.x);
		}
		//Construct object consObj and instantiate x var.
		static class consObj {
			int x;
			consObj(int i) {
				x = i;
			}
		}
}
