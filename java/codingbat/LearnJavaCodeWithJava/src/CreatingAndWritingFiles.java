// Creating Files
// Formatter
// used to create content and write it to files

import java.util.Formatter;

public class CreatingAndWritingFiles
{
	public static void main(String[] args)
	{
		try {
			Formatter f = new Formatter("C:\\sololearn]\tests.txt");
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}