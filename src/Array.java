public class Array {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        myArr[0]=98;
        myArr[1]=25;
        myArr[2]=89;
        myArr[3]=87;
        myArr[4]=23;

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);

        System.out.println("\n");

        int[] newArr = {98, 25, 89, 87, 23};
        int index = 2;

        System.out.println(newArr[0]);
        System.out.println(newArr[1]);
        System.out.println(newArr[index]);
        System.out.println(newArr[3]);
        System.out.println(newArr[4]);

        System.out.println("\n");

        //Array Traversal
        int iindex=0;
        while (iindex<newArr.length){
            System.out.println(newArr[iindex]);
            iindex++;
        }

        System.out.println("\n");

        //String Array

        String[] strArr = new String[5];
        strArr[0]="Hello";

        String[] newStrArr = {"First", "Second", "Third"};
        System.out.println("Length of array is: "+newStrArr.length);
        int StrArrindex =0;
        while (StrArrindex<newStrArr.length){
            System.out.println(newStrArr[StrArrindex]);
            StrArrindex++;
        }
    }
}
