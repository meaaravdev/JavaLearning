public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] myArr = new int[2][3];
        int [][] arr= {{1,8,7},{6,9,2}};

        //Traversal
        int i=0;
        while (i< arr.length){
            int j=0;
            while (j<arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
