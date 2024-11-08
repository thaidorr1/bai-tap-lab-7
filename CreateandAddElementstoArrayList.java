
package learn.btlab7;
import java.util.Scanner ;
import java.util.ArrayList ;

public class CreateandAddElementstoArrayList {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Nhap so luong ban be : ");
        int n = input.nextInt() ;
        ArrayList<String> ListFriends = new ArrayList() ;
        for(int i = 0; i < n ;i++) {
            String friends = input.nextLine() ;
            ListFriends.add(friends) ;
        }
        for(String x : ListFriends) {
            System.out.print(x + " " ) ;
        }
    }
}
