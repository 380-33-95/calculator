package testA;

public class Operation {

		
public int Oper(String buf0, String buf1){
		
		int result=0, result1=0, result2 = 0;
		
		System.out.println("Operation=" +(StringProcessor.getKodOperation()));
		
		switch (StringProcessor.getKodOperation()) {
				
		case 0:{//+
			
			System.out.println("AO+");
			
		result1=List.arab.indexOf(""+buf0);
		System.out.println("result1="+result1);
		result2=List.arab.indexOf(""+buf1);
		System.out.println("result2="+result2);
		result=result1+result2;
			
			break;
		}
		
		case 1:{//-
			System.out.println("AO-");
			
			result1=List.arab.indexOf(""+buf0);
			System.out.println("result1="+result1);
			result2=List.arab.indexOf(""+buf1);
			System.out.println("result2="+result2);
			result=result1-result2;
			
			break;
		}
		
		case 2:{//*
			System.out.println("AO*");
			
			result1=List.arab.indexOf(""+buf0);
			System.out.println("result1="+result1);
			result2=List.arab.indexOf(""+buf1);
			System.out.println("result2="+result2);
			result=result1*result2;
			
			break;
		}
		
		case 3:{// /
			System.out.println("AO/");	
			
			result1=List.arab.indexOf(""+buf0);
			System.out.println("result1="+result1);
			result2=List.arab.indexOf(""+buf1);
			System.out.println("result2="+result2);
			result=result1/result2;
			
			break;
		}
		
		}
		return result;
	}

}
