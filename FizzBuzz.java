package tb課題;
public class FizzBuzz {
public static void main(String[] args) {
		
		int max = Integer.parseInt(args[0]);
		for (int i = 1; i <= max; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}else if (i % 3 == 0) {
				System.out.println("Fizz");
			}else if (i % 5 == 0) {
				System.out.println("Buzz");
			}else {
			System.out.println(i);		
			}
		}
	}

}
