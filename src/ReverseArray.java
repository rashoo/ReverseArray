import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Array has " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));

    }

    public static void reverse(int[] array){
        int maxIndex = array.length-1; //Length of array, -1 for index starting at 0
        int halfLength = array.length/2;
        for(int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i]=temp;
        }
    }
}
