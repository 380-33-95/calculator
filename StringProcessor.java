package testA;


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
		
			if(List.rime.containsKey(List.buffer.get(0))){
				bufr1=true;
			}
			
				
			if(List.rime.containsKey(List.buffer.get(1))){
				bufr2=true;
			}
		
	
		if((bufr1==true) && (bufr2==true)) {
		bufr=true;
		setArabicRime(false);
	}
return bufr;
}
	
	 public  String ToRime(int mInt) {
	    String[] rnChars = { "M",  "CM", "D", "C",  "XC", "L",  "X", "IX", "V", "I" };
	    int[] rnVals = {  1000, 900, 500, 100, 90, 50, 10, 9, 5, 1 };
	    String retVal = "";

	    for (int i = 0; i < rnVals.length; i++) {
	        int numberInPlace = mInt / rnVals[i];
	        if (numberInPlace == 0) continue;
	        retVal += numberInPlace == 4 && i > 0? rnChars[i] + rnChars[i - 1]:
	            new String(new char[numberInPlace]).replace("\0",rnChars[i]);
	        mInt = mInt % rnVals[i];
	    }
	    return retVal;
	}
	
	
}	
