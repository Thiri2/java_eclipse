package day18;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadingWithChannel {

	public static void main(String[] args) {
		
		try (RandomAccessFile inputFile = new RandomAccessFile("src/employees.txt", "r"); 
				FileChannel channel = inputFile.getChannel()) {
			
				long file_size = channel.size(); //file size
				//create byte[]
				
				ByteBuffer buffer = ByteBuffer.allocate((int)file_size);
				
				channel.read(buffer);
				
				buffer.flip();
				String data = new String(buffer.array(),0,buffer.limit());
				System.out.println(data);
				
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
