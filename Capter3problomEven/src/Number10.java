public class Number10 {
    public static void main(String[] args){

        int arr[][] = new int[4][4];
        int x,y;

        for(int i=0; i<10; i++){
            x = (int)(Math.random()*4);
            y=(int)(Math.random()*4);
            if(arr[x][y]==0){
                arr[x][y] = (int)(Math.random()*10+1);
            }else {
                i--;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                if(arr[i][j]==10){
                    System.out.print(arr[i][j]+"  ");
                }else
                    System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
