public class AddArray {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10}; // input array
        int n = a.length; // array length
	int total=0;
        for (int i = 0; i < n; i++) {
            total+=a[i];  //Total sum
        }
        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
	System.out.print("\nTotal value: "+total);
    }
}
