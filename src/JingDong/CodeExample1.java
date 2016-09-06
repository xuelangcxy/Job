package JingDong;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeExample1 {
	private static Scanner sc;

	public static void jdCode(){
		sc = new Scanner(System.in);
		ArrayList<Integer> aList = new ArrayList<Integer>();		
		// sc.nextInt() + sc.nextInt() + 2;
		sc.close();
		for(int i = 0; i < aList.size(); i++){
			System.out.println(aList.get(i)); 
		}
		// return aList.toArray();
	}
	public static int[] test(){
		sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int[] a = {one, two, three};
		return a;
	}
	public static void main(String[] args) {
		// jdCode();
		int[] arr = test();
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
