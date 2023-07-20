import java.util.Scanner;

public class ValidPerfectSquare {
    static boolean square(int n){
        for(int i=1;i*i<=n;i++){
            if(i*i==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(square(n));
    }
}
