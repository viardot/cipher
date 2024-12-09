import java.util.Arrays;

public class Substitute extends Cipher {

    private static final String[] key = new String[] {"L", "C", "K", "G", "P", "R", "T", "A", "D", "E", "F", "J", "M",
                                                      "W", "N", "Q", "S", "U", "V", "X", "H", "Y", "Z", "B", "O", "I"};
    
    private String[] alphabet;
    
    public Substitute(){
        Alphabet A = Alphabet.getInstance();
        this.alphabet = A.getAlphabet();
    }

    @Override
    public String encrypt(String plain){

        int position = -1;
        String cipher = "";

        for (int i = 0; i < plain.length(); i++){ 
            position = Arrays.binarySearch(alphabet, plain.substring(i,i+1));
            cipher = cipher + key[position];
        }

        return cipher;
    }

    @Override
    public String decrypt(String cipher){
        String plain = "";
        for (int i=0; i < cipher.length(); i++){
            for (int j=0; j < key.length; j++){
                if (key[j].compareTo(cipher.substring(i, i+1)) == 0){
                    plain = plain + alphabet[j];
                    break;
                }
            }
        }
        return plain;
    }
    
}
