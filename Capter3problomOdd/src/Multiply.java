// 15

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n,m;

        while(true){
            try{
                System.out.print("곱하고자 하는 두 수 입력 >>");
                n= scanner.nextInt();
                m= scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("실수는 입력하면 안됩니다.");
                scanner.nextLine();
            }
        }


        System.out.print(n+"x"+m+"="+n*m);
        scanner.close();
    }
}
