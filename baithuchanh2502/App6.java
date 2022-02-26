import java.util.Scanner;

public class App6 {
    public static int sht(int n){
        int S = 0;
        for(int i = 1; i < n ; i++){
            if(n % i == 0){
                S += i;
            }
        }
        if( S == n){
            return 1;
        }
        else{
        return 0;
        }
    }

    public static void liet_ke_sht(int n){
        System.out.println("cac so hoan hao truoc "+ n + " la ");
        for (int i = 1; i < n/2; i++){
              if (sht(i) == 1){
                 System.out.println(i);
              }
        
        }
    }
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("Moi nhap n ");
        int n = abc.nextInt();
        if (n < 0){
            System.out.printf("vui long nhap lai");
        }
        else{
            liet_ke_sht(n);
            }    
    }

    // public static int sht(int n){
    //     int S = 0;
    //     for(int i = 1; i < n/2; i++){
    //         if(n % i == 0){
    //             S += i;
    //         }
    //     }
    //     if( S == n){
    //         return 1;
    //     }
    //     return 0;
    // }
    
    // public static void liet_ke_sht(int n){
    //     for (int i = 1; i < n; i++){
    //           if (sht(i) == 1){
    //              System.out.println(i);
    //           }
        
    //     }
    // }


}
