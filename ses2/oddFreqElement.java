package ses2;
import java.util.*;

public class oddFreqElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,3,4,5,4,5,9,9,9};
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i= 0;i<nums.length;i++){
            if(countOcc(nums,nums[i])%2 != 0){
                result.add(nums[i]);
            }
        }
        
        
        System.out.println(Arrays.toString(removeDup(result)));
    }
    public static int countOcc(int[] nums, int target){
        int count  = 0;
        for(int element : nums){
            if(element == target){
                count++;
            }
        }
        return count;
    }
    public static int[] removeDup(ArrayList<Integer> result){
        Set<Integer> unique = new HashSet<>();
        for( int element : result){
            unique.add(element);
        }
        int[] uniqueArr = new int[unique.size()];
        int index = 0;
        for (int element: unique) {
            uniqueArr[index++] = element;
        }
        return uniqueArr;
    }
    
    
}
//The above code have the time complexity of O(n^2).

//Solution 2 (with Time Complexity O(n))
// import java.util.*;

// public class OddFreqElement {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 1, 3, 3, 4, 5, 4, 5, 9, 9, 9};

//         List<Integer> result = findOddFrequencyElements(nums);

//         System.out.println(result);
//     }

//     public static List<Integer> findOddFrequencyElements(int[] nums) {
//         Map<Integer, Integer> frequencyMap = new HashMap<>();

//         for (int element : nums) {
//             frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
//         }

//         List<Integer> oddFrequencyElements = new ArrayList<>();

//         for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//             if (entry.getValue() % 2 != 0) {
//                 oddFrequencyElements.add(entry.getKey());
//             }
//         }

//         return oddFrequencyElements;
//     }
// }
