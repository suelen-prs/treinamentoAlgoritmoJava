package envio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(1234);
		
		Socket sv = servidor.accept();
		
		
		ObjectInputStream out = new ObjectInputStream(sv.getInputStream());
		FileOutputStream file = new FileOutputStream("C:/Envio/ArquivoQueClienteEnviou.jpg");
		byte[] buf = new byte[4096];
		
		while(true) {
			int len = out.read(buf);
			if (len == -1) break;
			file.write(buf, 0, len);

	}
	}
}
