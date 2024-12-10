import java.lang.Math;

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
        int i = 0;
        int j = 0;

        while ( cipher.length() < plain.length() ) {
            cipher = cipher + plain.substring(i, i+1);
            if ( i + collumns >= plain.length() ) {
               j++;
               i = j;
            } else {
               i = i + collumns;
            }
            
        }
        
        return cipher;
    }

    @Override
    public String decrypt(String cipher){
        String plain="";
        int i = 0;
        int j = 0;
        int rows = (int) Math.ceil(cipher.length() / (double) collumns);
        int lastRow = cipher.length() % collumns;

        while ( plain.length() < cipher.length() ) {

            for (int k = 0; k < lastRow; k++){
                plain = plain + cipher.substring(i, i+1);
                i = i + rows;
            }
            if ( plain.length() != cipher.length()) {
                for (int l = 0; l < collumns - lastRow; l++){
                    plain = plain + cipher.substring(i, i+1);
                    if (lastRow != 0){
                        i = i + rows - 1;
                    }else{
                        i = i + rows;
                    }    
                }
            }
            j++;
            i=j; 
        }

        return plain;
    }

    
}
