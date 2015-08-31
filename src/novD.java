 import java.util.Scanner;

 /**
  * STANFORD PROCO 2014 | NOV D
  * Print an upside-down triangle using the characters ‘x’ and ‘.’
  * 
  * x.....x 
  * xx...xx 
  * xxx.xxx 
  * xxxxxxx
  * 
  * @author clairehuang
  *
  */
 
public class novD {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int width = Integer.parseInt(reader.nextLine());
		int height = (width + 1) / 2;
		
		// print layers with dots
		for (int numX = 2; numX < width; numX += 2) { // for each layer
			// numX is the number of x's to put on the outsides of the layer
			// minimum of 2 x's, increases by 2 each layer
			
			for (int i = 0; i < numX / 2; i++) {
				System.out.print("x");
			}
			for (int i = 0; i < width - numX; i++) {
				System.out.print(".");
			}
			for (int i = 0; i < numX / 2; i++) {
				System.out.print("x");
			}
			System.out.print("\n");
		} 
		
		// print last layer (only x's)
		for (int i = 0; i < width; i++) {
			System.out.print("x");
		}
	}
}
