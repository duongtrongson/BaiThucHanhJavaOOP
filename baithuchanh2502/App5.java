import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen n : ");
        int n = abc.nextInt();
        if(sht(n) == 0 ){
            System.out.println(n + " khong la so hoan thien");
        }
        else{
            System.out.println(n + " la so hoan thien");
        }
    }

    public static int sht(int n){
    int S = 0;
    for (int i = 1; i < n; i++)
        if (n % i == 0)
            S += i; 

    if (S == n)
        return 1;
    return 0; 
    }
}
