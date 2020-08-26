package testA;

import java.util.*;

public class Main extends StringProcessor
{
	public static void main(String[] args) {

		Main t = new Main();

		List.ArabIni();
		List.RimeIni();
		List.OperationIni();

		Scanner in = new Scanner(System.in);
		System.out.printf("Input: \n");
		System.out.println();
		t.setNum( in.nextLine());

		System.out.println();
		System.out.printf("Output: \n");
		System.out.println();

		in.close();
		StringProcessor.DeleteProbel();
		
		try{
		t.PoiskZnaka();
		}
		catch(OperationException eex){
		System.out.println(eex.getMessage());
		System.exit(0);
		}
		
		t.RasbivkaStroki();

		try{
	
			t.VerifyEnterNumber();
		}
		catch(OperationException av){
		System.out.println(av.getMessage());
		System.exit(0);
		}

		
		if(isArabicRime()) {
			try {
				System.out.println(t.Oper(List.buffer.get(0), List.buffer.get(1)));
			} catch (OperationException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}
		else {
			try {
				System.out.println(t.ToRime(t.Oper(List.buffer.get(0), List.buffer.get(1))));
			} catch (OperationException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}

	}
	
}
