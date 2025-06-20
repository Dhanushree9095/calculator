public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 35, 15, 35, 5, 20};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element (all elements may be equal)");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
