import java.util.Scanner;

    public class App74 {
        
        public static void main(String[] args) {
            System.out.println("Moi nhap cac phan tu trong mang :");
            Scanner abc = new Scanner(System.in);
            int n = abc.nextInt();
            int[] a = new int[n];
            double tong = 0;
            for( int i = 0; i < a.length; i++)
            {
                System.out.println("Moi nhap gia tri a[" + i + "] : ");
                a[i] = abc.nextInt();
            }
           
            for(int i = 0; i < a.length ; i++)
            {
                tong+=a[i];
            }
            System.out.format("tong la %f", tong);

        }
    }


   