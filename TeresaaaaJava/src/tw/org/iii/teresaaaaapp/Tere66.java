package tw.org.iii.teresaaaaapp;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tere66 {

	public static void main(String[] args) {

		ServerSocket server;
		try {
			server = new ServerSocket(9999); //80 http:// 443 https://
			System.out.println("Wait...");
			Socket socket = server.accept();
			
			String urip = socket.getInetAddress().getHostAddress();
			
			FileOutputStream fout = new FileOutputStream("dir/brad.jpg");
			
				InputStream in = socket.getInputStream();
				BufferedInputStream bin = new BufferedInputStream(in);
			
				byte[] buf = new byte[4*1024*1024];
				int len; while ((len = bin.read(buf)) !=-1) {
					fout.write(buf, 0, len);
				}
				bin.close();
			
			fout.flush();
			fout.close();
			
			server.close();
			System.out.println("\nServer OK");
	
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
