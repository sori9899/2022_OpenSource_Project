public class WhileTest {
    /*
1-1
0부터 98까지 짝수만 더하는 코드
결과 2450
*/
    public static void main(String[] args){
        int sum=0, i=0;
        while(i<100){
            sum=sum+i;
            i+=2;
        }
        System.out.println(sum);
    }
// 1-2
}