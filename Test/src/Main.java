
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		char ch = 'A';
		char ch2 = 65;
		int i=0;
		int j=0;
		ch : for(i=0;i<3;i++) {
			System.out.println("자바");
			if(i==2) {
				break;
			}
			ch2: while (true) {
				System.out.println("스터디");
				j++;
				if(j==3)
					break ch;
			}
		}
	}

}
