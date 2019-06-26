

/**
 * Beispielimplementierung der C�sar Verschl�sselung (ROT13) als Java
 * Konsolenprogramm.
 */
public class CaeserCipher {


    /**
     * Verschl�sselt oder Entschl�sselt den �bergebenen Text.
     * 
     * @param strContent Der zu ver- oder endschl�sselnte Text.
     * @return Der ver- oder entschl�sselte Text.
     */
    static private String crypt_decrypt( String strContent ) {

        StringBuilder sbNew = new StringBuilder();

        for (byte bASCII : strContent.toUpperCase().getBytes()) {

            if (Character.isLetter(bASCII)) {

                byte bAlphabet = (byte) (bASCII - 65);

                bAlphabet = (byte) ((bAlphabet + 13) % 26);

                sbNew.append((char) (bAlphabet + 65));
            } else {

                if (bASCII == 32) {

                    sbNew.append((char) 32);
                }
            }
        }

        return sbNew.toString();
    }


    /**
     * Einstiegspunkt der Anwendung.
     * 
     * @param args
     */
    public static void main( String[] args ) {

        String strExample = "HANS HUSTET IN DER NACHT";
        String strResult = crypt_decrypt(strExample);
        String strCheck = crypt_decrypt(strResult);

        System.out.println(strExample);
        System.out.println(strResult);
        System.out.println(strCheck);
    }

}
