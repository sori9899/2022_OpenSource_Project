import java.util.Scanner;

public class Number16 {
    public static void main(String[] args){
        String str[] = {"가위", "바위", "보"};

        Scanner scanner = new Scanner(System.in);

        String s;
        int com;
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while(true){
            System.out.print("가위 바위 보!>>");
            s=scanner.next();
            if(s.equals("그만")){
                System.out.println("게임을 종료합니다.");
                break;
            }
            com = (int)(Math.random()*3);
            System.out.println(com);
            for(int i=0; i< str.length; i++){
                if(str[i].equals(s)){
                    System.out.print("사용자 ="+str[i]+", 컴퓨터 ="+str[com]+", ");
                    if(i==com){
                        System.out.println("비겼습니다");
                    }else if((i+1)%3 == com){
                        System.out.println("컴퓨터가 이겼습니다.");
                    }else if(((3+(i-1))%3) == com){
                        System.out.println("사용자가 이겼습니다. ");
                    }
                }
            }
        }
    }
}
