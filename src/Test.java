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

        //Task 4: Print all even array's element
        int[] arr5 = {1, 2, 3, 5, 8, 13, 21, 34, 55};
        for (int i = 0; i < arr5.length; i++){
            if (arr5[i] % 2 == 0){
                System.out.println(" " + arr5[i]);
            }
        }

        //Task 5: Print the sum of all even array's element
        int[] arr6 = {1, 2, 3, 5, 8, 13, 21, 34, 55};
        int sumOfEvenElements = 0;

        for (int i = 0; i < arr6.length; i++){
            if (arr6[i] % 2 == 0){
                System.out.println(" " + arr6[i]);
            }
            sumOfEvenElements = sumOfEvenElements + arr[i];
        }
        System.out.println("Sum of the even elements of array " + Arrays.toString(arr6) + " is " + sumOfEvenElements);

        //Task 6: Create an array of 20 even numbers
        int[] arr7 = new int[20];
        for (int i = 0; i < arr7.length; i++){
            //1. get a random  number
            //2. it has to be an even number
            int rnd; //the variable is local in the loop
            do {
                rnd = (int) (Math.random() * 100); //we define that elements of array will in the range of 0...99
                //Math.random() returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
            } while (rnd % 2 != 0); //while the number is odd we are in the loop otherwise we exit the loop
            arr7[i] = rnd; //assign element to this number
        }
        System.out.println("The array of random even integers is " + Arrays.toString(arr7));

    }
}
