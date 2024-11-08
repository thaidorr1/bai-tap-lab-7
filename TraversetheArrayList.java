
package learn.btlab7;
import java.util.Scanner ;
import java.util.ArrayList ;

public class TraversetheArrayList {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Nhap so luong thanh pho : " );
        int n = input.nextInt() ;
        ArrayList<String> City = new ArrayList() ;
        for(int i = 0 ; i < n ;i ++) {
            String city = input.nextLine() ;
            City.add(city) ;
        }
        for (String x : City ) {
            System.out.println("Cac thanh pho la : " + x);
        }
    }
}
