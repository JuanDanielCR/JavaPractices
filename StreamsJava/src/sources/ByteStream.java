package sources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	//All byte stream classes are descended from InputStream and OutputStream 
	//File byte stream specialized classes.
	private FileInputStream in =  null;
	private FileOutputStream out = null;
	int c;
	//Constructor
	public ByteStream(String input, String output){
		try{
			this.c = 0;
			in = new FileInputStream(input);
			out  = new FileOutputStream(output);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	//Copy
	public void copyBytes(){
		try {
			//variable c, holds one stream at time, with an InputStream each stream holds 8bit bytes
			while((c = in.read())!=-1){
				out.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//Close
	public void closeBytesStream(){
		try{
			//If no source is connected, stream are null
			if(in != null){
				in.close();
			}
			if(out != null){
				out.close();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}