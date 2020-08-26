package testA;

public class Operation {

		
public int Oper(String buf0, String buf1) throws OperationException{
		
		int result=0, result1=0, result2 = 0;
		
	//	System.out.println("Operation=" +(StringProcessor.getKodOperation()));
		result1=List.arab.indexOf(""+buf0);
	//	System.out.println("result1="+result1);
		result2=List.arab.indexOf(""+buf1);
	//	System.out.println("result2="+result2);
		
		if((result1>0 && result1<11) && (result2>0 && result2<11)){
			
		switch (StringProcessor.getKodOperation()) {
				
		case 0:{//+
			result=result1+result2;
			
			break;
		}
		
		case 1:{//-
			
			result=result1-result2;
			
			break;
		}
		
		case 2:{//*
			
			result=result1*result2;
			
			break;
		}
		
		case 3:{// /
			
			result=result1/result2;
			
			break;
		}
		}
		}
				
		return result;
				
	}

}
