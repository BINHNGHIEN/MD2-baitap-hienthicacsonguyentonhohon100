import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.println(" so nguyen to la :2");
        for (int i = 3; i<100; i++) {
            boolean check = true;
            for (int j = 2; j < i ; j++) {
                if(i%j==0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(" so nguyen to la :" +i);
            }
        }
    }
}