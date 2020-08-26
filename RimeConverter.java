package testA;


public class RimeConverter{
	
	static int rimeInd, rimeInd1, rimeInd2;
	
	public static void ConvertToArabic() {
		if(List.rime.containsKey(List.buffer.get(0))) {
		rimeInd1=List.rime.get(List.buffer.get(0));
		}
		
		if(List.rime.containsKey(List.buffer.get(1))) {
		rimeInd2=List.rime.get(List.buffer.get(1));
		}
		
		List.buffer.add(0, ""+rimeInd1);
		List.buffer.add(1, ""+rimeInd2);
		
		
	}
		
	}
