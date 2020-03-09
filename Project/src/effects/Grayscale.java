package effects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Grayscale {
	
	File inputFile= null;
	BufferedImage image= null;
	
	public Grayscale()
	{
		//empty constructor
	}
	
	public Grayscale(File inputFile)
	{
		this.inputFile= inputFile;
	}
	
	public void GrayScale() throws IOException {
		
	    image= ImageIO.read(inputFile);
	    
		int imageHeight= image.getHeight();
		 int imageWidth= image.getWidth();
		
		for(int y= 0; y < imageHeight; y++){
		    for(int x= 0; x < imageWidth; x++){
		    	
		    	int pixel= image.getRGB(x,y);
		    	int alpha= (pixel>>24)&0xff;
		    	
		        int r= (pixel>>16)&0xff;
		        int g= (pixel>>8)&0xff;
		        int b= pixel&0xff;
		        
		         int average= (r+g+b)/3 ;

		        pixel= (alpha<<24) | (average<<16) | (average<<8) | average;
		         image.setRGB(x, y, pixel);
		    	
		    }
		}
	}
	
	public void save() throws IOException
	{
		if(image!= null)
		ImageIO.write(image, "jpg", new File("src/resources/output/Grayscale.jpg"));
		
		else
			System.out.println("Can't Save image!");
	}

}
