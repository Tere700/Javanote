package tw.org.iii.teresaaaaapp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Tere64 {

		public static void main(String[] args) {
			byte[]data = new byte[1024];
			try {
				DatagramSocket socket = new DatagramSocket(8888);
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				socket.close();
				
				InetAddress urip = packet.getAddress();
				
				System.out.println(new String(packet.getData()));
			} catch (Exception e) {
				System.out.println(e);
			}
			

		}

	}