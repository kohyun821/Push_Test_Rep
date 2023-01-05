import java.util.Scanner;

public class BaseBall_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Answer=327;//정답 미리정함

		Scanner scanner = new Scanner(System.in);
		
		int [] AnswerArr = new int [3];
		int tmp = Answer;
		for(int i=2;i>-1;i--) {
			AnswerArr[i]=tmp%10;
			tmp = tmp / 10;
		}
			
		
//		System.out.println("Test");
//		for(int i=0; i<AnswerArr.length;i++)
//			System.out.println(AnswerArr[i]);
		
		
		while(true) {
			System.out.print("정답을 맞춰 보세요! >");
			int question = scanner.nextInt();
			int ball=0, strike=0;
			
			int Qtmp=question;
			int [] QueArr = new int [3];
			for(int i=2;i>-1;i--) {
				QueArr[i]=Qtmp%10;
				Qtmp = Qtmp / 10;
			}
			
			if(QueArr[0]==QueArr[1] || QueArr[0]==QueArr[2] || QueArr[1]==QueArr[2]) {
				System.out.println("중복 숫자입력 X !!");
			}
			
//			System.out.println("QueTest");
//			for(int i=0; i<QueArr.length;i++)
//				System.out.println(QueArr[i]);
			
			for(int x=0;x<AnswerArr.length;x++) {//정답 포 문  
				for(int y=0;y<QueArr.length;y++) {//맞추는 포 문 
					if(AnswerArr[x]==QueArr[y]) {//값이 같을 경우 
						if(x==y) {
							strike++;//자리가 같다면 스트라이크 추가
						}else {
							ball++;//볼 추가 
						}
							 

					}
				}//맞추는 포문 끝 
			}//정답 포문 끝 
			System.out.println(ball+"B  /  "+strike+"S");
			if(ball==0 && strike==3) {
				System.out.println("정답 !");
				break;
			}
			
		}//무한루프 끝 
	}


}
