package testA;


public class StringProcessor extends Operation{
	
private	static String num;
		
	public  String getNum() {
		return num;
	}

	public  void setNum(String num) {
		StringProcessor.num = num;
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
	
	
	public boolean PoiskZnaka() throws OperationException {
		boolean ZnakOk=false;
		
		for(int io=0; io<=3; io++) {
							
			if(-1!=getNum().indexOf(List.operation.get(io))) {
			setKodOperation(io);
			setMestoVStrokeOperation(getNum().indexOf(List.operation.get(getKodOperation())));
			ZnakOk=true;
			}
			}
		
		if(!ZnakOk){
				throw new OperationException("разрешенные операции + - * /");
			}
		return ZnakOk;
	}
	
	
	public void RasbivkaStroki() {
		List.buffer.add(0, getNum().substring(0, getMestoVStrokeOperation()));
		List.buffer.add(1, getNum().substring(getMestoVStrokeOperation()+1));
	//	System.out.println("bufer1="+List.buffer.get(0)+" bufer2="+List.buffer.get(1));
	
	}
	
	
	public boolean VerifyEnterNumber() throws OperationException{
		boolean ven=false;
				
		if(List.arab.indexOf(List.buffer.get(0))>0 &&
				(List.arab.indexOf(List.buffer.get(1))>0)) {
				ven=true;
				setArabicRime(true);
				}
			
		else {
			if(List.rime.containsKey(List.buffer.get(0)) &&
					List.rime.containsKey(List.buffer.get(1))) {
					ven=true;
					setArabicRime(false);
					RimeConverter.ConvertToArabic();
				}
			}
				
		if(!ven) {throw new OperationException("разрешены или только арабские или только римские цыфры от 1 до 10 включительно");
		}		
		return ven;
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
