package day18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Writing_2 {

	public static void main(String[] args) throws IOException {
		String data = """
				Name - Ag Ag
				Address - Yangon
				Age - 26
				""";
		
		Files.writeString(Path.of("src/student.txt"), data);
		System.out.println("Saved");
	}
}
