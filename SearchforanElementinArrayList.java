package learn.btlab7;
import java.util.Scanner ;
import java.util.ArrayList ;
public class SearchforanElementinArrayList {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Nhap so luong ngon ngu lap trinh :");
        int n = input.nextInt() ;
        ArrayList<String> Code = new ArrayList() ;
        for(int i = 0 ; i < n ;i++) {
            String nn = input.nextLine() ;
            Code.add(nn) ;
        }
        boolean result = Code.contains("Python") ;
        if (result) {
            System.out.println("Python co trong danh sach");
        }
        else {
            System.out.println("Python khong co trong danh sach");
        }
    }
}
