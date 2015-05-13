package java21;

import java.util.StringTokenizer;

/**
 *@author 祥
 *@desperation: 
 *@2014-7-23
 */
public class TokenTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringTokenizer str1,str2;
		
		String quote1 = "GOOD 601.1 -56";
		str1 = new StringTokenizer(quote1);
		System.out.println("Token1: " + str1.nextToken());
		System.out.println("Token2: " + str1.nextToken());
		System.out.println("Token3: " + str1.nextToken());
		
		String quote2 = "RHT*123*-12.52";
		str2 = new StringTokenizer(quote2, "*");
		System.out.println("\nToken1: " + str2.nextToken());
		System.out.println("Token2: " + str2.nextToken());
		System.out.println("Token3: " + str2.nextToken());
	}
}
