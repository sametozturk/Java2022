
public class miniProjeAsalSayi {
	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
//			System.out.println(remainder);
		boolean inPrime = true;
		
		if(number==1) {
			System.out.println("Sayi asal degildir.");
		}
		
		if(number<1) {
			System.out.println("Gecersiz sayi");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				inPrime = false;

			}

		}

		if (inPrime == true) {
			System.out.println("Sayi asaldir.");
		} else {
			System.out.println("Sayi asal degildir.");
		}

	}
}
