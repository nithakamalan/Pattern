package Pattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int i,j;
		int a = 65;
		for(i=n;i>=0;i--) {
			for(j=i;j>=0;j--) {
				System.out.print((char) (a+j)+ " ");
			}
			
			System.out.println();
	}
}
	}