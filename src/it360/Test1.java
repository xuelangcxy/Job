package it360;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	/*public static ArrayList<String> judge(){
	    Scanner sc = new Scanner(System.in);
		ArrayList<String> sl = new ArrayList<String>();
		
		while(true){
			if(sc.hasNext()){
				sl.add(sc.nextLine());
			}else{
				break;
			}	
		}
		return sl;
	}*/
	private static String reverse(String s) {
		  int length = s.length();
		  String reverse = "";
		  for (int i = 0; i < length; i++)
		   reverse = s.charAt(i) + reverse;
		  return reverse;
		 }
	private static boolean subStrTF(String s, String sub1, String sub2){
		int m1 = s.indexOf(sub1);
		int m2 = s.indexOf(sub2);		
		if(m1 >= 0 && m2 >= 0){
			s = s.substring(m1);
			m2 = m1 + s.indexOf(sub2);
		}
		
		if(m1 >= 0 && m2 >= 0 && m2 > m1){
			return true;
		}
		return false;
	}
	public static String judge(String str, String str1, String str2){
		
		String strR = reverse(str);
		boolean bool1 = subStrTF(str, str1, str2);
		boolean bool2 = subStrTF(strR, str1, str2);
		if(bool1 && bool2){
			return "both";
		}else if(bool1 && !bool2){
			return "forward";
		}else if(!bool1 && bool2){
			return "backward";
		}else{
			return "invalid";
		}
	}
	public static void main(String[] args){
		
	}
}
