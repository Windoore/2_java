public class Java_2 {
    public static void main(String[] args) {
        int[][] array = new int[6][7];
        for (int i = 0; i <6; i++) {
            for (int j = 0; j <7; j++) {
                array[i][j] = (int)(Math.random()*10);

            }
        }
        for (int i = array.length-1; i>=0; i--) {
            int max=0;
            for (int j = 0; j <7; j++) {

                if (array[i][j] > max){
                   max=array[i][j];
                }
            }
            array[i][0]=max;
        }
        for (int i = 0; i <6; i++) {
            for (int j = 0; j <7; j++) {
                System.out.printf(" "+"%d",array[i][j]);
            }
            System.out.println();
        }
    }
}
