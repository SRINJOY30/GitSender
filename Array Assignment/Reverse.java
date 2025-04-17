public class Reverse {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10}; // input array
        int n = a.length; // array length
        int[] reverse = new int[n]; // new array to store reversed elements

        for (int i = 0; i < n; i++) {
            reverse[i] = a[n - 1 - i]; // reversing logic
        }

        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nReversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(reverse[i] + " ");
        }
    }
}
