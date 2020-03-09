import java.io.File;
import java.io.IOException;

import effects.Grayscale;
import effects.Negative;
import effects.Sepia;
import effects.Threshold;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		
		System.out.println("Applying Effects... ");
		
		Grayscale grayscale= new Grayscale(new File("src/resources/input.jpg"));
		grayscale.GrayScale();
		grayscale.save();
		
		
		Sepia sepia= new Sepia(new File("src/resources/input.jpg"));
		sepia.sepia();
		sepia.save();
		
		Negative negative= new Negative(new File("src/resources/input.jpg"));
		negative.negative();
		negative.save();
		
		Threshold threshold= new Threshold(new File("src/resources/input.jpg"));
		threshold.threshold();
		threshold.save();
		
		System.out.println("Done");
		
		
		
		
	
	}

}
