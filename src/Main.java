
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int testChar= 32; testChar<127; testChar++){
			for (int twist = 1; twist<95; twist++){
				Encrypt testEn = new Encrypt();
				char inputText = (char)testChar;
				char encryptedText = testEn.encrypt((char)testChar, twist);

				Decrypt testDe = new Decrypt();
				char inputText2 = (char)(testChar+twist);
				char decryptedText = testDe.decrypt((char)(testChar+twist),twist);
				System.out.print("\n");
			}
		}


	}

}
