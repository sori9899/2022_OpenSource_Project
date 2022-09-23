public class Number13 {
    public static void main(String[] args){
        int num=0, temp=0, count=0;
        for(int i=1; i<100; i++){
            num =i;
            while(num >0){
                temp = num%10;
                num = num/10;
                if(temp==3 || temp ==6|| temp ==9 ){
                    count++;
                }
            }

            if(count != 0){
                System.out.print(i+" 박수 " );
                while(count>0){
                    System.out.print("짝");
                    count--;
                }
                System.out.println();
            }
        }
    }
}
