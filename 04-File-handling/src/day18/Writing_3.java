package day18;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Writing_3 {

	public static void main(String[] args) {
		Path path = Path.of("src/tester.text");
		try(BufferedWriter writer = Files.newBufferedWriter(path)) {
			writer.write("HTML, Javascript, CSS");
			writer.write("C++");
			writer.write("\nDatabase");
			writer.newLine();
			writer.write("Python");
			writer.flush(); //
			writer.write("Java");
			System.out.println("Saved");
		} catch (Exception e) {
			
		}
	}
}
