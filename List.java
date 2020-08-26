package testA;

import java.util.ArrayList;
import java.util.HashMap;
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
	
	
static	Map<String, Integer> rime = new HashMap<String, Integer>();
	
	public static void RimeIni() {
		
		rime.put("I",1);
		rime.put("II",2);
		rime.put("III",3);
		rime.put("IV",4);
		rime.put("V",5);
		rime.put("VI",6);
		rime.put("VII",7);
		rime.put("VIII",8);
		rime.put("IX",9);
		rime.put("X",10);
		rime.put("XL",40);
		rime.put("L",50);
		rime.put("LX",60);
		rime.put("LXX",70);
		rime.put("LXXX",80);
		rime.put("LXXXX",90);
		rime.put("C",100);
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
