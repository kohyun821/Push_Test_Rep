import java.util.Arrays;
import java.util.Scanner;

public class ArrangeTestMain {
	
	public static void main(String[] args) {
		
		String [] string = new String[3];
		
		char [] ch = new char[3];
		
		int [] integer = new int[3];
		
		double [] db = new double[3];

		String a = "a";
		String b = "b";
//		a= a+ b;          //ERROR
		a= "a"+"b";
		
		
		string[1]="Test";
		ch[1]='A';
		integer[1]=10;
		db[1]=0.001;
		
		
		for(int i=0; i<3; i++) {
			System.out.println("str" +i +" : "+ string[i]);
		}
		System.out.println("====================================");
		
		for(int i=0; i<3; i++) {
			System.out.println("ch" +i +" : "+ ch[i]);
		}
		System.out.println("====================================");
		for(int i=0; i<3; i++) {
			System.out.println("integer" +i +" : "+ integer[i]);
		}
		System.out.println("====================================");
		for(int i=0; i<3; i++) {
			System.out.println("db" +i +" : "+ db[i]);
		}
		
		System.out.println("====================================");
		System.out.println(db);
		System.out.println("====================================");
		System.out.println(ch);
		integer[2]=100;
		System.out.println("====================================");
		System.out.println(Arrays.toString(integer));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("args 길이 : "+args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args" +i +" : "+ args[i]);
		}

	}

}
