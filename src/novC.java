/**
 * STANFORD PROCO 2014 | NOV C
 * Replace all instances of the character ‘&’ in a given string with the string “&amp;”
 * 
 * @author clairehuang
 *
 */

import java.util.Scanner;

public class novC {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();
		System.out.println(line.replaceAll("&", "&amp;"));
	}
}
