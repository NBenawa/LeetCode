public class SecondHighestSalary {
    public static void main(String[] args) {
        int[] salaries = {100, 200, 300, 400, 500};
        int secondHighest = findSecondHighestSalary(salaries);
        System.out.println("The second highest salary is: " + secondHighest);
    }

    public static int findSecondHighestSalary(int[] salaries) {
        Integer highest = null;
        Integer secondHighest = null;

        for (int salary : salaries) {
            if (highest == null || salary > highest) {
                secondHighest = highest;
                highest = salary;
            } else if (salary != highest && (secondHighest == null || salary > secondHighest)) {
                secondHighest = salary;
            }
        }

        return secondHighest != null ? secondHighest : -1; // Return -1 if there is no second highest
    }
}