public class utils {

    public static int gcd(int a, int b){
        
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int[] gcdExtended(int a, int b){

        int x = 0, y = 1, lastx = 1, lasty = 0, temp;
        while (b != 0) {
            int q = a / b;
            int r = a % b;
          
            a = b;
            b = r;

            temp = x;
            x = lastx - q * x;
            lastx = temp;

            temp = y;
            y = lasty - q * y;
            lasty = temp;
        }
        int[] result = {a, lastx, lasty};
        return result;
    }
    
}
