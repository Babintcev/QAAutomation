import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int[] arr = {4, 2, 3, 4, 5, 6, 7, 11, 20, 21};

        System.out.println(a);
        System.out.println(arr[0]);
        System.out.println(arr[9]);

        int[] arr1 = {3, 4, 5};

        int[] arr2 = new int[100];

        for (int i = 1; i < arr2.length; i++){
            arr2[i] = i + 10;
        }
        System.out.println(Arrays.toString(arr2));

        int [][] arr3 = {
                {3, 5, 7},
                {8, 10, 12},
                {5, 7, 0}
        };
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(arr3[0][1]); //print element "5"

        for (int i = 0; i < arr3.length; i++){
            for (int j = 0; j < arr3[i].length; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        int[] arr4 = {10, 9, 6, 8, 12, 15};

        //Task 1: Find the max element in array, print its value and its index.
        int indexOfMax = 0;// index of array's element
        int max = arr4[indexOfMax]; //let the first element is max

        for (int i = 0; i < arr4.length; i++){ //from the first to the last array's elements
            if (max < arr4[i]) { // if max is less than current array's element
                max = arr4[i]; //then we assign to max the value of current array's element
                indexOfMax = i; //and assign to index the index of max array's element - i.
            }
        }
        System.out.println(max);//print the max element in console
        System.out.println(indexOfMax);//print the index of max element in console

        //Task 2: Find the min element in array, print its value and its index.
        int indexOfMin = 0;// index of array's element
        int min = arr4[indexOfMin]; //let the first element is min

        for (int i = 0; i < arr4.length; i++){ //from the first to the last array's elements
            if (min > arr4[i]) { // if min is more than current array's element
                min = arr4[i]; //then we assign to min the value of current array's element
                indexOfMin = i; //and assign to index the index of min array's element - i.
            }
        }
        System.out.println(min);//print the min element in console
        System.out.println(indexOfMin);//print the index of min element in console

        //Task 3: The sum of all elements of array.
        int sum = 0;
        for (int i = 0; i < arr4.length; i++){
            sum = sum + arr4[i];// sum += arr4[i];
        }
        System.out.println(sum);
    }
}
