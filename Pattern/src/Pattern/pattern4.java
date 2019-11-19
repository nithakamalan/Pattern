package Pattern;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int i,j;
		int a = 65;
		for(i=0;i<=n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print((char) (a)+ " ");
			
			a++;
			}
			System.out.println();
		}
		

	}

}
