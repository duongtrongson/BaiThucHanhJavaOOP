import java.util.Scanner;

public class App2 {
        private static Scanner abc = new Scanner(System.in);

        public static void main(String[] args) {      
            System.out.print("Nhập cạnh thứ nhất = ");
            int a = abc.nextInt();
            System.out.print("Nhập cạnh thứ hai = ");
            int b = abc.nextInt();
            System.out.print("Nhập cạnh thứ ba = ");
            int c = abc.nextInt();

            if( a<b+c && b<a+c && c<a+b ){
                if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
                    System.out.printf("Đây là tam giác vuông");            
                    else if(a==b && b==c)
                    System.out.printf("Đây là tam giác đều");            
                    else if(a==b || a==c || b==c)
                    System.out.printf("Đây là tam giác cân");               
                    else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b)
                    System.out.printf("Đây là tam giác tù");            
                    else
                    System.out.printf("Đây là tam giác nhọn");
                }
                else
                System.out.printf("Ba cạnh a, b, c không phải là ba cạnh của một tam giác");
    }
    
}
