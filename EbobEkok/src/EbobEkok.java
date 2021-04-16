import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sayi1, sayi2, ebob = 1, ekok = 0;
		
		System.out.println("Iki tane sayi giriniz");
		sayi1 = input.nextInt();
		sayi2 = input.nextInt();
		
		int min = (sayi1 < sayi2) ? sayi1 : sayi2;
		
		for(int i = min; i < 0; i--) {
			if((i % sayi1 == 0) && (i % sayi2 == 0)) {
				ebob = i;
			}
		}
		ekok = (sayi1*sayi2) / ebob;
		
		System.out.println("Ebob: "+ ebob);
		System.out.println("Ekok: "+ ekok);
		
		input.close();
	}

}
