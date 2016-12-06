import java.io.InputStream;
import java.util.Scanner;

import com.fazecast.jSerialComm.SerialPort;

public class Serial {
	private static SerialPort portArduino;
	private static Scanner sc;
	private static boolean flag = true;
	
	public static void main(String args[]){
		
		SerialPort comPort = SerialPort.getCommPorts()[0];
		comPort.openPort();
		comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 100, 0);
		InputStream in = comPort.getInputStream();
		try
		{
		   while(flag){
		      System.out.print((char)in.read());
		   }
		   in.close();
		} catch (Exception e) { e.printStackTrace(); }
		comPort.closePort();
	}
}
