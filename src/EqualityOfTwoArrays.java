import java.util.Arrays;



public class EqualityOfTwoArrays {


    //main method
    public static void main ( String[] args ){

      // we declare and initialize two integer arrays arr1 and arr2 with same elements.
          int [] arr1 =  {40 , 4, -97, 45, 19};
          int [] arr2 =   {40, 4, -97, 45,19};


       // store the return value in the boolean variable isEqual
        boolean isEqual = checkEquality(arr1, arr2);

        // we print message indicating whether the two arrays are equal or not based on the value of isEqual
        if (isEqual) {
            System.out.println("The two arrays are equal.");


        } else{
            System.out.println("The two arrays are not equal.");

              }
        }
         public static boolean checkEquality
             (int[] arr1, int[] arr2){

        //check if either of the arrays have is null or they have  different  length
        if (arr1 == null || arr2 == null || arr1.length != arr2.length){
              return false;
        }
        for (int i =0; i < arr1.length; i++){
            // if both arrays have the same length
            if (arr1[i] != arr2[i]) {
                return  false;

            }

        }
        return true;

    }

          }


