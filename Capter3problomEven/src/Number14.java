import java.util.Scanner;

public class Number14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int score[] = {95, 88, 76, 62, 55};
        String course[] = {"Java", "C", "HTML5", "컴퓨터구조", "안드로이드"};

        String s ;

        while(true){

            System.out.print("과목 이름>>");
            s=scanner.next();
            if(s.equals("그만"))
                break;

            for(int i =0; i< course.length; i++){
                if(course[i].equals(s))
                    System.out.println(course[i]+"의 점수는 "+score[i]);
            }
        }
        scanner.close();

    }
}
