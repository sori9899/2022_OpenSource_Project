public class Number7 {
    public static void main(String[] args){
        int num[] = new int[10];
        int sum =0;

        System.out.print("랜덤한 정수들 : ");
        for(int i=0; i<num.length; i++){
            num[i] = (int)(Math.random()*10+1);
            sum += num[i];
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("평균은 "+(float)sum/(float)10);
    }
}
