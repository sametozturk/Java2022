

public class switchDemo {

	public static void main(String[] args) {

		char grade = 'H';

		switch (grade) {
		case 'A':
			System.out.println("Great : You Pass");
			break;
		case 'B':
			System.out.println("Very Good : you Pass");
			break;
		case 'C':
			System.out.println("Good : you Pass");
			break;
		case 'D':
			System.out.println("Not Bad: you Pass");
			break;
		case 'F':
			System.out.println("You Fail");
			break;
		default:
			System.out.println("Undefined grade");

		}
	}
}
