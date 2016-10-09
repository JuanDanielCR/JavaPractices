package sources;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	//File Character stream especial classes
	FileReader inputCharacterStream =  null;
	FileWriter outCharacterStream = null;
	int c;
	
	public CharacterStream(String input, String output){
		try{
			this.c = 0;
			inputCharacterStream = new FileReader(input);
			outCharacterStream = new FileWriter(output);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void copyCharacters(){
		try{
			while ((c = inputCharacterStream.read()) != -1) {
                outCharacterStream.write(c);
            }
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void closeCharacterStream(){
		try{
			if(inputCharacterStream != null){
				inputCharacterStream.close();
			}
			if(outCharacterStream != null){
				outCharacterStream.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
