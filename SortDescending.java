public class SortDescending {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 1, 8, 17, 97, 23, 167};

        // Sort the array in descending order using a simple bubble sort algorithm
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted numbers in descending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}