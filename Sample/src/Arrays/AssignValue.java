package Arrays;

public class AssignValue {
    public static void main(String[] args){
       /*
        int[] arr =new int[] {24,34,14};
       // int[] arr = {24,34,14};

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    */
    int[][] arr = {
            new int[]{23, 34, 45},
            new int[]{56, 67, 78},
            new int[]{12, 23, 34},
    };
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }

}
