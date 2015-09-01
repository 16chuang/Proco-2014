import java.util.Scanner;

/**
 * STANFORD PROCO 2014 | NOV E
 * Given a string encrypted with a box cipher, decrypt the string.
 * 
 * 4 3
 * hlifeorflgae
 * 
 * make a 4x3 box:
 * hel
 * log
 * ira
 * ffe
 * 
 * @author clairehuang
 *
 */

public class novE {

	public static void main(String[] args) {
		// set up
		Scanner reader = new Scanner(System.in);
		
		// parse box size from input
		String[] boxSize = reader.nextLine().split(" ");
		int rows = Integer.parseInt(boxSize[0]);
		int cols = Integer.parseInt(boxSize[1]);
		String encrypted = reader.nextLine();
		
		// create box with parsed size
		char[][] box = new char[rows][cols];
		
		// put characters from the encrypted string into the box
		for (int i = 0; i < encrypted.length(); i++) {
			char letter = encrypted.charAt(i);

			// row = i % rows b/c we want the remainder regardless of the column (i / 4)
			// column = i / rows
			box[i%rows][i/rows] = letter;
		}
		
		// reconstruct decrypted string
		String decrypted = "";
		for (char[] row : box) {
			for (char letter : row) {
				decrypted += letter;
			}
		}
		
		System.out.println(decrypted);
	}

}
