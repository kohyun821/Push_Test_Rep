import java.util.Scanner;

public class Binary_MAin {

	public static void main(String[] args) {
		
//		char test = '';
//		System.out.println(test);
//		System.out.printf(%);
		
		
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("2진수로 변환할 수를 입력해 주세요.");
			int i = scanner.nextInt();
			System.out.println("입력한 수는 "+i+"입니다.");
			do {
				int tmp = i%2;
				i=i/2; //몫 저장
//				System.out.println("몫 : " + i);
//				System.out.println("나머지 : " + tmp);
				System.out.println("tmp is"+tmp);
//				if(i/2==0) {
//					System.out.println("i is "+i);
//				}
			} while (i!=0);
			
		}
	}
//	int x;
//	1. (x>10) && (x<20);
//	 10<x<20
//	2. ch != '';
//	3. (ch == 120) || (ch == 88);//x -> 120 , X -> 88
//	4. (0 <= ch <= 9);
//	5. (65 <= ch <= 90) || (97 <= ch <= 122); //대문자 -> 65 ~ 90, 소문자 -> 97 ~ 122
//	6. ( (year%400 == 0) || (year % 4 == 0) )
//		&& (year%100 != 0);
//	7. !powerOn;
//	8. str.equals("yes");
	
	

}
