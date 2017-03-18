package org.java2;

import java.util.Scanner;

public class TryParseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValueWrapper valueWrapper = new ValueWrapper();
		
		TryParse tryParse = new TryParse();
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String text = sc.next();
			String text2 = sc.next();
			Boolean result = tryParse.intTryParse(text, text2, valueWrapper);
			
			if(result){
				System.out.println(valueWrapper.pointX + " " + valueWrapper.pointY);
			}
			else{
				System.out.println(valueWrapper.pointX + " " + valueWrapper.pointY);
			}
		}
	}
}

class ValueWrapper{
	int pointX = 0;
	int pointY = 0;
}

class TryParse{
	public Boolean intTryParse(String text, String text2, ValueWrapper valueWrapper){
		
		try{
			valueWrapper.pointX = Integer.parseInt(text);
			valueWrapper.pointY = Integer.parseInt(text2);
			
			return true;
		}
		catch(Exception e){
			valueWrapper.pointX = 0;
			valueWrapper.pointY = 0;
			
			return false;
		}
	}
}
