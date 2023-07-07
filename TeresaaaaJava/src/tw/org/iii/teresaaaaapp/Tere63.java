package tw.org.iii.teresaaaaapp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.xml.crypto.Data;

public class Tere63 {

	public static void main(String[] args) {
		while (true) {
			String mesg = "老師一起健身ㄇ";
		
		byte[]data=mesg.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(data,data.length,
				InetAddress.getByName("10.0.101.187"),8888);
			socket.send(packet);
			socket.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	}

}
