//                                              Assignment #35 List Funhouse 1
//                                                      Logan Weisgerber
//                                                          11/28/2023


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(getListOfFactors(762));

        Integer[] nums = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79}; // Creates the list with factors
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums));

        System.out.println("Original List" + list);
        keepOnlyCompositeNumbers(list);
        System.out.println("Composite List " + list);
    }

    public static ArrayList<Integer> getListOfFactors(int num) {
        ArrayList<Integer> results = new ArrayList<>(); // Creates the factor list
        for (int i = num - 1; i < num; i++) {
            if (num % i == 0) {
                results.add(i); // adds the number to list NOT ARRAY if it is a factory
            }
        }
        keepOnlyCompositeNumbers(results); // Checks the composite numbers in the list
        return results;

    }

    
    public static void keepOnlyCompositeNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> compositeArrayList = new ArrayList<>();
        compositeArrayList = nums;
        for (int i = 0; i < compositeArrayList.size(); i++) {
            if (isPrime(compositeArrayList.get(i))) { // Runs is prime to check if the number is prime, if so it is NOT a composite number.
                compositeArrayList.remove(i);
                i--;
            }
        }
    }

    public static boolean isPrime(Integer n){
        for (int i = 2; i < n; i++) { // Checks if the number is prime by n % i == 0 meaning can't be divisble by more then one thing.
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
