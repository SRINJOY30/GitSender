public class FindValue {
    public static void main(String[] args) {
        int[] a = {24, 48, 64, 18, 10}; // input array
        int n = a.length; // array length
        int find = 48;
        int index = -1; // assume not found

        for (int i = 0; i < n; i++) {
            if (find == a[i]) {  // if found
                index = i;       // store index
                break;           // exit loop once found
            }
        }

        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nIndex of " + find + ": " + index);
    }
}
