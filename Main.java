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
		t.setNum( in.nextLine());

		System.out.println();
		System.out.printf("Output: \n");
		//  System.out.printf(t.getNum()+" length= "+ t.getNum().length());
		System.out.println();

		in.close();
		t.DeleteProbel();
		
		try{
		t.VerefyOperation();
		}
		catch(OperationException eex){
		System.out.println(eex.getMessage());
		System.exit(0);
		}
		
		t.RasbivkaStroki();

		try{
			t.VerifyArabic();
		}
		catch(OperationException av){
		System.out.println(av.getMessage());
		System.exit(0);
		}

		if(isArabicRime()) {
			try {
				System.out.println("Result arabic="+t.Oper(List.buffer.get(0), List.buffer.get(1)));
			} catch (OperationException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}
		else {
			try {
				System.out.println("Result rime="+t.ToRime(t.Oper(List.buffer.get(0), List.buffer.get(1))));
			} catch (OperationException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}


	//		RimeConverter.ConvertToArabic();
	//		System.out.println("Result arabic="+t.Oper(List.buffer.get(0), List.buffer.get(1)));
	//		System.out.println("Result rime="+t.ToRime(t.Oper(List.buffer.get(0), List.buffer.get(1))));
	

		//1/5  System.out.printf(t.getNum()+" length= "+ t.getNum().length());

	}
	
}
