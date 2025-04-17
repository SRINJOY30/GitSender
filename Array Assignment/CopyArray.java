public class CopyArray {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10}; // input array
        int n = a.length; // array length
        int[] copy = new int[n]; // new array to copy elements

        for (int i = 0; i < n; i++) {
            copy[i] = a[i]; // copying logic
        }

        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nCopied array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
