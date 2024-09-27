import java.util.HashMap;
import java.util.Map;

public class FruitBasket {

    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3, 2, 1};
        System.out.println("Maximum number of fruits you can pick: " + totalFruit(fruits));  // Output: 4
    }

    // Method to calculate the maximum number of fruits you can pick
    public static int totalFruit(int[] fruits) {
        // Map to store the count of each type of fruit in the current window
        Map<Integer, Integer> fruitCount = new HashMap<>();

        int left = 0;  // Left pointer for the sliding window
        int maxFruits = 0;  // To track the maximum number of fruits

        // Iterate over the array with the right pointer
        for (int right = 0; right < fruits.length; right++) {
            // Add the current fruit to the window (increase count in the map)
            fruitCount.put(fruits[right], fruitCount.getOrDefault(fruits[right], 0) + 1);

            // Check if we have more than 2 types of fruits
            while (fruitCount.size() > 2) {
                // Remove one fruit from the left side of the window
                fruitCount.put(fruits[left], fruitCount.get(fruits[left]) - 1);

                // If the count of a fruit type becomes zero, remove it from the map
                if (fruitCount.get(fruits[left]) == 0) {
                    fruitCount.remove(fruits[left]);
                }
                // Move the left pointer to shrink the window
                left++;
            }

            // Update the maximum number of fruits that can be picked
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}
