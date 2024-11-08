package learn.btlab7;
import java.util.Scanner ;
import java.util.ArrayList ;
public class UpdateanElementinArrayList {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap so luong mang :");
        int n = input.nextInt() ;
        ArrayList<Integer> number = new ArrayList() ;
        for(int i =0 ; i < n ;i++) {
            int num = input.nextInt() ;
            number.add(num) ;
        }
        for(int i = 0 ; i < n ;i++) {
            number.set(3 , 100) ;
            System.out.print(number.get(i) + " ");
        }
    }
}
