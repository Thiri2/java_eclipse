package day18;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Writing_with_Channel {

	public static void main(String[] args) {
	
		String data = """
				FileChannel can be faster than 
				Standard IO if you're dealing with larger files.
				""";
		
		try (RandomAccessFile inputFile = new RandomAccessFile("data.txt", "rw");
				FileChannel channel = inputFile.getChannel()){
				
				byte [] byteData = data.getBytes();
				ByteBuffer buffer =ByteBuffer.allocate(byteData.length);
				buffer.put(byteData);
				buffer.flip();
				channel.write(buffer);
				System.out.println("saved");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
