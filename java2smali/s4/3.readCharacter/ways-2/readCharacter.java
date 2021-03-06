/**
 * Read a character from console. 
 * If encountered 'e' or 'E', quit.
 * Accomplish it in two ways. This is the 2nd way that uses (InputStream) System.in.
 *
 * 
 * 1. InputStreamReader:
 * 	InputStreamReader is a briedge from byte streams to character streams. It read bytes and decodes them into characters using a specified charset.
 *
 * 	2. BufferedReader
 * Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.
 *
 * 3. Fields of java.lang.System
 * {
 * 		static PrintStream err;
 * 		static PrintStream out;
 * 		static InputStream in;
 * }
 *
 * 3. a method of BufferedReader
 * {
 * 	int read(); // Reads a single charactor.
 * 	...
 * }
 *
 * 4.  a method of InputStream
 * {
 * ...
 * abstract int read(); // Reads the next data from the input stream.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class readCharacter
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Input characters, \'E\' or \'e\' to quit.");
		int cha = System.in.read();
		
		while (cha != 'e' && cha != 'E')
		{
			System.out.printf("Read: %c\n", (char)cha);
			cha = System.in.read();
		}
	
	}
}
