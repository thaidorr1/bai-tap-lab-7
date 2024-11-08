
package learn.btlab7;
import java.util.Scanner ;
import java.util.ArrayList ;

public class ConvertArrayListtoArray {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap so luong mang :");
        int n = input.nextInt() ;
        ArrayList<Integer> number = new ArrayList() ;
        for(int i =0 ; i < n ;i++) {
            int num = input.nextInt() ;
            number.add(num) ;
        }
        Integer[] array = new Integer[number.size()] ;
        array = number.toArray(array) ;
        for(int x : array) {
            System.out.print(x + " ");
        }
    }
}
