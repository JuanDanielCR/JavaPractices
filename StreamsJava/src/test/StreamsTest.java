package test;
import sources.*;
public class StreamsTest {
	public static void main(String args[]){
		//ByteStream
		ByteStream copyBytes = new ByteStream("Xanadu.txt", "OutBytes.txt");
		copyBytes.copyBytes();
		copyBytes.closeBytesStream();
		
		//CharacterStream
		CharacterStream copyChars = new CharacterStream("Xanadu.txt", "OutChars.txt");
		copyChars.copyCharacters();
		copyChars.closeCharacterStream();
		
		//BufferedStream
		BufferedStreams copyBuffered = new BufferedStreams("Xanadu.txt", "OutBuffered.txt");
		copyBuffered.copyBufferedChars();
		copyBuffered.closeBufferedStream();
	}
}