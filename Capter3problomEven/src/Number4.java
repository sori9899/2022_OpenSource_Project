import java.util.Scanner;

public class Number4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        char c= s.charAt(0);

        for(char i=c; i>='a'; i--){
            for(char j='a'; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
