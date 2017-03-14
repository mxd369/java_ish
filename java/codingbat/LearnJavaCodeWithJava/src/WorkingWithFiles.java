// java.io
// includes a File class
// allows work with files
// to start:
// create a File object
// specify the path of the file in the constructor

// import java.io.File;
// ...
// File file = new File("C:\\data\\input-file.txt");


// exit(): determines whether a file exists

import java.io.File;
public class WorkingWithFiles
{
	public static void main(String[] args)
	{
		File x = new File("C:\\sololearn\\tests.txt");
		if(x.exists())
		{
			// returns the name of the file
			System.out.println(x.getName() + "exists");
		}
		else
		{
			System.out.println("The file does not exists");
		}
	}
}