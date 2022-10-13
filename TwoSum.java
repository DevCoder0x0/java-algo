

import java.util.HashMap;

public class TwoSum {
    // Given an array of integers [numArr] and one integer [targetNum], return the indices of the
    // two integers which add up to the [targetNum].
    private static int[] numArr = {1, 3, 5, 8, 9, 11, 14, 16, 17, 18, 21, 22};

    public static void main(String[] args) {
        findTwoSum(numArr, 22);
    }

    public static void findTwoSum(int[] arr, int targetNum) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int difference = targetNum - arr[i];
            if(map.containsKey(difference)) {
                System.out.println("Target sum = " + difference + " + " + arr[i]);
                return;
            } else {
                map.put(arr[i], true);
                System.out.println("Added " + arr[i] + " to map.");
            }
        }
        System.out.println("Did not find target sum in array");
    }
}