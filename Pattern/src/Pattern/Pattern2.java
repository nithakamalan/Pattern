package Pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i,j;
        for(i=0;i<n;i++) {
        	for(j=n-i;j>i;j++) {
        	System.out.println(" ");
        	
        
        for(j=0;j<=i;j++) {
        	System.out.printf("* ");
        	
        }
        }

	}

}}
