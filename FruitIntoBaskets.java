public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {0,1,6,6,4,4,6};
        System.out.println(totalFruit(fruits));
    }

    private static int totalFruit(int[] fruits) {
        int maxFruits = 0;
        int current = 0;
        int first = -1;
        int second = -1;
        int secondCount = 0;

        for (int fruit : fruits) {
            if (fruit == first || fruit == second) {
                if (fruit == second) {
                    secondCount++;
                }
                current++;
            } else if (second != -1) {
                current = secondCount+1; // Reset current count for the new fruit
                first = second; // Shift the second fruit to first
                second = fruit; // Set the new fruit as second
                secondCount = 1;
            }
            if (first == -1) {
                first = fruit;
                current++;
            } else if (second == -1 && fruit != first) {
                second = fruit;
                current++;
                secondCount++;
            }
            maxFruits = Math.max(maxFruits, current);
        }

        return maxFruits;
    }
}
