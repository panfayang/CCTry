import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> testStrings = new ArrayList<String>();
		StringBuilder sbTest = new StringBuilder();
		for (int i = 32;i<127;i++){
			sbTest.append((char)i);
		}
		testStrings.add(sbTest.toString());
//		testStrings.add('e');
//		testStrings.add(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~");
	
		Encrypt testEn = new Encrypt();
		Decrypt testDe = new Decrypt();
		for (int testChar= 32; testChar<127; testChar++){
			for (int twist = 1; twist<95; twist++){
			
				char inputText = (char)testChar;
				char encryptedChar = testEn.encryptChar((char)testChar, twist);
				
				char inputText2 = encryptedChar;
				char decryptedChar = testDe.decryptChar(encryptedChar,twist);
//				System.out.print("\n");
				if (inputText != decryptedChar || encryptedChar != inputText2){
					System.out.println(Character.toString(inputText) + Character.toString(encryptedChar) + Character.toString(inputText2) + Character.toString(decryptedChar) + Integer.toString(twist));
					
				}
				
			}
			
		}
		System.out.println("Test for individual characters has passed");
		
		for (String testString: testStrings){
			for (int twist = 0; twist<95; twist++){
				String encryptedText = testEn.encrypt(testString, twist);
				String decryptedText = testDe.decrypt(encryptedText, twist);
				if (!testString.equals(decryptedText)){
					System.out.println(testString  + "\n" + decryptedText + "\n" +Integer.toString(twist));
				}
			}
		}
		System.out.println("Test for strings has passed");

	}

}
