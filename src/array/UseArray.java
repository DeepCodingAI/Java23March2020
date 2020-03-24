package array;
import java.util.Scanner;

public class UseArray {

	public static void main(String[] args) {
		int [] numberList = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Numbers: ");
		for(int i=0; i<numberList.length; i++) {
		  numberList[i] = sc.nextInt();
		}
	    sc.close();
		for(int i=0; i<numberList.length; i++) {
		  System.out.println(numberList[i]);
		}

	}

}
