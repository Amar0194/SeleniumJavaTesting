package Arrays;

public class MultiDimensional_Array {
    public static void main (String[] args){
        int[][] arr = new int[3][2];
        arr[0][0]=45;
        arr[0][1]=43;
        arr[1][0]=56;
        arr[1][1]=67;
        arr[2][0]=54;
        arr[2][1]=78;
        //Nested for loop
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
