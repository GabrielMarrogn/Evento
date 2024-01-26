import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();

            if(a == 0 && b == 0){
                break;
            }

            System.out.println(a*b);
        }

        sc.close();
    }
}
