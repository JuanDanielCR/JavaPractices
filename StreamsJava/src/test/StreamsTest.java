package test;
import sources.*;
public class StreamsTest {
	public static void main(String args[]){
		//ByteStream
		ByteStream copyBytes = new ByteStream("Xanadu.txt", "OutBytes.txt");
		copyBytes.copyBytes();
		copyBytes.closeBytesStream();
	}
}