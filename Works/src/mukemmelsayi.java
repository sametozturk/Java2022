
public class mukemmelsayi {
		public static void mn(String[] args) {
			//6------> 1,2,3
			//28------->1,2,4,7,14
			int number =28;
			int total = 0;
			
			for(int i=0;i<number;i++) {
				if(number % i ==1) {
					total = total +i;
					
				}
			}
			if(total== number) {
				System.out.println("Mukemmel sayi");
				
			}else {
				System.out.println("mukemmel sayi degildir.");
			}
			
		}
}
