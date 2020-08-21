package testA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class List {
	
static	ArrayList <String> arab = new ArrayList <String>();


public static void ArabIni() {
	arab.add(0,"");	
	
	for (int ini=1; ini<=10; ini++)
		{
				arab.add(ini,""+ini);
		}
}
	
	
static	Map<Integer, String> rime = new HashMap<Integer, String>();
	
	public static void RimeIni() {
		
		rime.put(1,"I");
		rime.put(2,"II");
		rime.put(3,"III");
		rime.put(4,"IV");
		rime.put(5,"V");
		rime.put(6,"VI");
		rime.put(7,"VII");
		rime.put(8,"VIII");
		rime.put(9,"IX");
		rime.put(10,"X");
		rime.put(40,"XL");
		rime.put(50,"L");
		rime.put(60,"LX");
		rime.put(70,"LXX");
		rime.put(80,"LXXX");
		rime.put(90,"LXXXX");
		rime.put(100,"C");
}

	static	ArrayList <String> buffer = new ArrayList <String>();
	
	static	ArrayList <String> operation = new ArrayList <String>();
	
	public static void OperationIni() {
		operation.add(0,"+");
		operation.add(1,"-");
		operation.add(2, "*");
		operation.add(3, "/");
	}
	
	
}
