import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("điển vào số : ");
        int n = abc.nextInt();
        if (snt(n)) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không là số nguyên tố");
        }
    }
  
    public static boolean snt(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
