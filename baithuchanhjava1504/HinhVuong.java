package Shapes;
import java.util.Scanner;
public class HinhVuong extends HinhChuNhat {
    public static void main(String[] args){
    //Constructor
    public HinhVuong() {
        ten = " Hình Vuông";
    }

    public void nhapCanh() {
        System.out.println("Cạnh = ");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
}
    
    

