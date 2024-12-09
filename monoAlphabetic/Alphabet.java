

class Alphabet {
    private static Alphabet  instance = null;

    public static synchronized Alphabet getInstance(){
        if (instance == null)
            instance = new Alphabet();

        return instance;
    }

    public String[] getAlphabet(){
        return new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    }
    
}
