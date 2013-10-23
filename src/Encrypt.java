/**
 * 
 */

/**
 * @author Fayang Pan
 *
 */
public class Encrypt {
	
	public Encrypt(){}
	
	public char encrypt(char c, int twist){
		int temp = (int)c;
		return (char)((temp-32+twist)%95+32);
	}

}
