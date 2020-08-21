package testA;

import java.util.ArrayList;

import testA.test;

public class StringProcessor extends Operation{
	
private	static String num;
		
	public  String getNum() {
		return num;
	}

	public  void setNum(String num) {
		this.num = num;
	}
	
private static int kodOperation;

public static int getKodOperation() {
		return kodOperation;
	}

	public static void setKodOperation(int kodOperation) {
		StringProcessor.kodOperation = kodOperation;
	}
	
	
	private static int MestoVStrokeOperation;
	
	public static int getMestoVStrokeOperation() {
		return MestoVStrokeOperation;
	}

	public static void setMestoVStrokeOperation(int mestoVStrokeOperation) {
		MestoVStrokeOperation = mestoVStrokeOperation;
	}

	
	

	private static boolean ArabicRime;
	
	public static boolean isArabicRime() {
		return ArabicRime;
	}

	public static void setArabicRime(boolean arabicRime) {
		ArabicRime = arabicRime;
	}
	
	
	
	
	public static void DeleteProbel() {
	num=num.replace(" ","");
		}
	
	public void RasbivkaStroki() {
		List.buffer.add(0, getNum().substring(0, getMestoVStrokeOperation()));
		List.buffer.add(1, getNum().substring(getMestoVStrokeOperation()+1));
		System.out.println("bufer1="+List.buffer.get(0)+" bufer2="+List.buffer.get(1));
		
	}
	
	public void VerefyOperation() {
		for(int io=0; io<=3; io++) {
			if(-1!=getNum().indexOf(List.operation.get(io))) {
			setKodOperation(io);
			setMestoVStrokeOperation(getNum().indexOf(List.operation.get(getKodOperation())));
			System.out.println(">>"+List.operation.get(io)+" mesto = "+ getMestoVStrokeOperation());
			}
		}
		
	}

	public boolean VerifyArabic() {
		boolean buf=false, buf1=false, buf2=false;
		
		for (int ei=0; ei<=List.arab.size()-1;ei++) {
				if(List.buffer.get(0).equals(List.arab.get(ei))){
				buf1=true;
				}
			//	else buf1=false;
				
			for (int ei2=0; ei2<=List.arab.size()-1;ei2++) {
			if(List.buffer.get(1).equals(List.arab.get(ei2))) {
			buf2=true;
			}
		//	else buf2=false;
		}
	}
		if((buf1==true) && (buf2==true)) {
		buf=true;
		setArabicRime(true);
	}
return buf;
}
	
	public boolean VerifyRime() {
		boolean bufr=false, bufr1=false, bufr2=false;
		
		for (int ei=0; ei<=List.rime.size()-1;ei++) {
				if(List.buffer.get(0).equals(List.rime.get(ei))){
				bufr1=true;
				}
			//	else buf1=false;
				
			for (int ei2=0; ei2<=List.rime.size()-1;ei2++) {
			if(List.buffer.get(1).equals(List.rime.get(ei2))) {
			bufr2=true;
			}
		//	else buf2=false;
		}
	}
		if((bufr1==true) && (bufr2==true)) {
		bufr=true;
		setArabicRime(false);
	}
return bufr;
}
	
	
}	
