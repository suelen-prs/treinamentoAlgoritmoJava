import java.io.File;
import java.io.*;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {
	public static void main(String[] args) {
		ObjectOutputStream out;
		Socket socket;
		
		File f = new File("C:/Envio/foto.jpg");
		try {
			
			socket = new Socket("127.0.0.1", 9696);
			out = new ObjectOutputStream(socket.getOutputStream());
			System.out.println("Transferindo arquivo " + f.getName());
			out.writeUTF(f.getName());
			out.writeLong(f.length());
			FileInputStream in = new FileInputStream(f);
			byte[] buf = new byte[4096];
			
			while(true) {
				int len = in.read(buf);
				if(len == -1) break;
				out.write(buf, 0, len);
			}
			
			out.close();
			socket.close();
			//out.reset();
			System.out.println("Pronto.");
			
		}catch (Exception e){
			e.printStackTrace();
			
		}
		
		
		
	}

}
