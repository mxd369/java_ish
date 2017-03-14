// Listing 4.9
//******************************************************************
// URLDissector.java
//
// Demonstrates the use of Scanner to read file input
// and parse it using alternative delimiters.
//******************************************************************
package ch4;

import java.util.Scanner;
import java.io.*;
//import websites;
public class Listing_4_9_URLDissector {
	
	//--------------------------------------------------------------
	// Reads urls from a file and prints their path components.
	//--------------------------------------------------------------
	public static void main(String[] args) throws IOException 
	{
		String url;
		Scanner fileScan, urlScan;
		
		fileScan = new Scanner(new File("websites.inp"));
		
		// Read and process each line of the file
		
		while (fileScan.hasNext()){
			url = fileScan.nextLine();
			System.out.println("URL: " + url );
			
			urlScan = new Scanner(url);
			urlScan.useDelimiter("/");
			
			// Print each part of the url
			
			while (urlScan.hasNext())
				System.out.println(" " + urlScan.next());
			System.out.println();
		}
	}
	//fileScan.close();
	//urlScan.close();
}