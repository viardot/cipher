import java.util.Arrays;

public class Vigenere extends Cipher {

    private String key;
    private String[] alphabet;

    public Vigenere(String key){
        this.key = key;
        Alphabet A = Alphabet.getInstance();
        this.alphabet = A.getAlphabet();
    }

    public Vigenere(){
        this("CAFE");
        Alphabet A = Alphabet.getInstance();
        this.alphabet = A.getAlphabet();
    }

    @Override
    public String encrypt(String plain){
        String cipher = "";
        int oldPosition = -1;
        int newPosition = -1;
        int shift = -1;

        for (int i = 0; i < plain.length(); i++){
            oldPosition = Arrays.binarySearch(alphabet, plain.substring(i,i+1));
            int j = i % key.length();
            shift = Arrays.binarySearch(alphabet, key.substring(j,j+1));
            newPosition = (oldPosition + shift) % 26;
            cipher = cipher + alphabet[newPosition];
        }
        return cipher;
    }
    @Override
    public String decrypt(String cipher){
        String plain = "";
        int oldPosition = -1;
        int newPosition = -1;
        int shift = -1;

        for (int i = 0; i < cipher.length(); i++){
            oldPosition = Arrays.binarySearch(alphabet, cipher.substring(i, i+1));
            int j = i % key.length();
            shift = Arrays.binarySearch(alphabet, key.substring(j, j+1));
            newPosition = (oldPosition - shift + 26) % 26;
            plain = plain + alphabet[newPosition]; 
        }

        return plain;
    }



}
