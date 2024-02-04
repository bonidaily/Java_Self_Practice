package day_09_arrays;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int i : arr1) { // here we start a for each loop and starts from first element of first array and goes to all element
            for (int j : arr2) {// one by one in the second array and it checks if there are the same.
                if (i == j){
                    System.out.println(i);
                }
            }
        }

//        for (int i = 0; i < arr1.length; i++) {
//            for (int i1 = 0; i1 < arr2.length; i1++) {
//                if(arr1[i]==arr2[i1]){
//                    System.out.println(arr1[i]);
//            }
//        }

    }

}
/*7. Create a class named CommonElements and write a program that prints out the common elements from two integer arrays.

Example:
arr1: {1,2,3,4,5}
arr2: {4,5,6,7,8}

Output:
        4
        5

 */