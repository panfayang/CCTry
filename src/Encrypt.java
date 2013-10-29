/**
 * 
 */

/**
 * @author Fayang Pan
 *
 */
public class Encrypt {
	
	public Encrypt(){}
	
	public char encryptChar(char c, int twist){
		int temp = (int)c;
		return (char)((temp-32+twist)%95+32);
	}
	
	
	public String encrypt(String string, int twist){
		StringBuilder sb = new StringBuilder();
		for (char i: string.toCharArray()){
			if (((int)i)<127 && ((int)i) > 31){
				sb.append(encryptChar(i,twist));
			}
			else{
				sb.append(i);
			}
		}
		return sb.toString();
	}

}
