public class Transposition extends Cipher{
    
    private int collumns;

    public Transposition(int collumns){
        this.collumns = collumns;
    }

    public Transposition(){
        this(10);
    }

    @Override
    public String encrypt(String plain){
        String cipher = "";
        int cel = 0;
        int col = 0;

        while (cipher.length() < plain.length()){
            cipher = cipher + plain.substring(cel, cel + 1);
            if ( cel + collumns >= plain.length()) {
               col++;
               cel = col;
            } else {
               cel = cel + collumns;
            }
            
        }
        
        return cipher;
    }

    @Override
    public String decrypt(String cipher){
        String plain="";

        return plain;
    }

    
}
