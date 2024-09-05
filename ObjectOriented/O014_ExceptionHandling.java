package ObjectOriented;

class CustomException extends Exception {
    @Override
    public String toString() {
        return ("Custom Exception: length and bredth should be >0.");
    }
}

public class O014_ExceptionHandling {
    public static void main(String[] args) {
        int l = 10, b = 10;
        try {
            int out = area(l, b);
            System.out.println(out);

        } catch (CustomException e) {
            // prints stack trace
            e.printStackTrace();
            System.out.println(e);
        } 
        finally {
            System.out.println("End of Program");
        }
        System.err.println("Hello");
    }

    public static int area(int l, int b) throws CustomException {
        if (l < 0 || b < 0) {
            throw new CustomException();
        }
        int a = l * b;
        return a;
    }
}
