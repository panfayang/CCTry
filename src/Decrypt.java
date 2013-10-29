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
	
	public char decryptChar(char c, int twist){
		int temp = (int)c;
		return (char)((temp-32-twist+95)%95+32);
	}
	
	public String decrypt(String string, int twist){
		StringBuilder sb = new StringBuilder();
		for (char i: string.toCharArray()){
			if (((int)i)<127 && ((int)i) > 31){
				sb.append(decryptChar(i,twist));
			}
			else{
				sb.append(i);
			}
		}
		return sb.toString();
	}

}
