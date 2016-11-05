package source;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedStreams {
	private PrintWriter outputStream = null;

	int c;
	public BufferedStreams(String output){
		try{
			this.c =0;
			outputStream = new PrintWriter(new FileWriter(output));		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeFile(StringBuilder s){
		outputStream.append(s);
		closeBufferedStream();
	}
	
	public void closeBufferedStream(){
		if(outputStream != null){
			outputStream.close();
		}
	}
}
