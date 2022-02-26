import java.util.Scanner;

public class App4{
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("nhap vao so nguyen n ");
        int n = abc.nextInt();
            if (n >= 2) {
                System.out.print(2 + "\n");
            }
                for (int i = 3; i <= n; i+=2) {
                    if (snt(i) == 1) {
                        System.out.println(i);
                    }
                }
            }          
    
    public static int snt(int n){
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;

    }
}
