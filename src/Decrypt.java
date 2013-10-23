/**
 * 
 */

/**
 * @author Fayang Pan
 * Oct 22, 2013
 * CCTry
 */
public class Decrypt {
	public Decrypt(){}
	
	public char decrypt(char c, int twist){
		int temp = (int)c;
		return (char)((temp-32-twist)%95+32);
	}

}
