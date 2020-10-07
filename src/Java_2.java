public class Java_2 {
    public static void main(String[] args) {
        int[][] array = new int[6][7];
      full(array);
      print(array);


    }
    public static int full (int[][] x){
        for (int i = 0; i <6; i++) {
            for (int j = 0; j <7; j++) {
                x[i][j] = (int)(Math.random()*10);

            }
        }
        int max=0;
        for (int i = x.length-1; i>=0; i--) {
            for (int j = 0; j <7; j++) {

                if (x[i][j] > max){
                    max=x[i][j];
                }
            }
            x[i][0]=max;
        }
        return max;
    }
    public static void print (int[][] x){
        for (int i = 0; i <6; i++) {
            for (int j = 0; j <7; j++) {
                System.out.printf(" "+"%d",x[i][j]);
            }
            System.out.println();
        }
    }

}
