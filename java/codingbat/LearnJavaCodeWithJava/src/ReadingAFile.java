// Reading a File
// files are useful for storing and retrieving data, and there are a number of ways
// to read from a file
// one way:
// Scanner class
// the constructor of the Scanner class can take a File object as input
/*
 * create File object with the corresponding path and pass it to the Scanner object
 * surrounded with try/catach block if file does not exist
 * 
 * try {
 *   File x = new File("C:\\soilorlearn\\test.txt");
 *   Scanner scanner = new Scanner(x);
 * }
 * catch(FileNotFoundException e){
 *   
 * }
 */

/*
// Print the contents of a file then close
try
{
  File f = new File("a.txt");
  Scanner sc = new Scanner(f);
  while (sc.hasNext())
  {
  	String a = sc.next();
  	String b = sc.next();
  	System.out.println(a + " " + b);
  }
  sc.close();
}
sc.close();
}
catch (Exception e){
System.out.println("Error");
}
*/
