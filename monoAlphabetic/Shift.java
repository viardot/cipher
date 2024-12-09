import java.util.Arrays;

public class Shift extends Cipher {

    private int shift;
    private String[] alphabet;

    public Shift(int shift){
        this.shift = shift;
        Alphabet A = Alphabet.getInstance();
        this.alphabet = A.getAlphabet();
    }
    public Shift(){
        this(13);
        Alphabet A = Alphabet.getInstance();
        this.alphabet = A.getAlphabet();
    }

    @Override
    public String encrypt(String plain) {

        int oldPosition = -1;
        int newPosition = -1;
        String cipher = "";
        
        for (int i=0; i < plain.length(); i++) {
            oldPosition = Arrays.binarySearch(alphabet, plain.substring(i,i+1));
            newPosition = (oldPosition + shift) % 26;
            cipher = cipher + alphabet[newPosition];
        }
        return cipher;
    }

    @Override
    public String decrypt(String cipher){

        int oldPosition = -1;
        int newPosition = -1;
        String plain = "";
        for (int i = 0; i < cipher.length(); i++){
            oldPosition = Arrays.binarySearch(alphabet, cipher.substring(i,i+1));
            newPosition = (oldPosition - shift + 26) % 26;
            plain = plain + alphabet[newPosition];
        }
        return plain;
    }
    
}
