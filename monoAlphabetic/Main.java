public class Main {

    public static void main(String[] args){
        System.out.println("MonoAlphabatic encryption");

        String[] plain = new String[] { "ABC", "BCD", "CDE", "DEF", "UVW", "VWX", "WXY", "XYZ", "TELLHIMABOUTME"};
        for(int i = 0; i < plain.length; i++){
            shift(plain[i]);  
        }
        for(int i = 0; i < plain.length; i++){
            substitute(plain[i]);
        }
        for(int i = 0; i < plain.length; i++){
            vigenere(plain[i]);
        }

        transposition("COMPUTERGRAPHICSMAYBESLOWBUTATLEASTITSEXPENSIVE");
    }

    static private void shift(String plain){

        Shift cipher = new Shift();

        System.out.println(plain + " => " + cipher.encrypt(plain) + " => " + cipher.decrypt(cipher.encrypt(plain)));

    }

    static private void substitute(String plain){

        Substitute cipher = new Substitute();

        System.out.println(plain + " => " + cipher.encrypt(plain) + " => " + cipher.decrypt(cipher.encrypt(plain)));

    }

    static private void vigenere(String plain){

        Vigenere cipher = new Vigenere();
        System.out.println(plain + " =>  " + cipher.encrypt(plain) + " => " + cipher.decrypt(cipher.encrypt(plain)));

    }
    
    static private void transposition(String plain){
        Transposition cipher = new Transposition();
        System.out.println(plain + " => " + cipher.encrypt(plain)+ " => ");
    }


}