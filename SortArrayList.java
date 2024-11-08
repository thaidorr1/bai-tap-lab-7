package learn.btlab7;
import java.util.Scanner ;
import java.util.ArrayList ;

public class SortArrayList {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap so luong mang :");
        int n = input.nextInt() ;
        ArrayList<Integer> number = new ArrayList() ;
        for(int i =0 ; i < n ;i++) {
            int num = input.nextInt() ;
            number.add(num) ;
        }
        sort(number,n) ;
        for(int x : number ) {
            System.out.print(x + " ");
        }
    }
    public static void sort (ArrayList<Integer> a , int n) {
        for(int i =0 ; i < n - 1 ;i++) {
            int min = i ;
            for(int j = i + 1 ; j < n ;j++) {
                if (a.get(j) < a.get(min) ) {
                    min = j ;
                }
            }
            int tmp = a.get(min) ;
            a.set(min , a.get(i)) ;
            a.set(i, tmp) ;
        } 
    }
}
