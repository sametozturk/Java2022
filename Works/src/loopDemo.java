
public class loopDemo {

	public static void main(String[] args) {
		// for
		for (int i = 2; i < 10; i+=2)

		{
			System.out.println(i);
		}
		System.out.println("For-loop is over");

		int i = 2;
		// while
		while (i < 10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("while-loop is over");
		
		//Do-while
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("DO_while-loop is over");
	}

}
