
package learn.btlab7;
import java.util.Scanner ;
import java.util.ArrayList ;

public class RemoveanElementfromArrayList {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Nhap so luong : ");
        int n = input.nextInt() ;
        System.out.println("Nhap so muon xoa :");
        int numDelete = input.nextInt() ;
        ArrayList<Integer> number = new ArrayList() ;
        for(int i =0 ; i < n ;i++) {
            int num = input.nextInt() ;
            number.add(num) ;
        }
        for(int i =0 ;  i < n ;i++) {
            if (number.get(i) == numDelete ) {
                number.remove(i) ;
            }
        }
        for(int x : number ) {
            System.out.print(x + " ");
        }
    }
}