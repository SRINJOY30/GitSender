public class MaxValue {
    public static void main(String[] args) {
        int[] a = {25, 47, 10, 84, 52}; // input array
        int n = a.length; // array length
	int max=a[0];
        for (int i = 0; i < n; i++) {
            if(max<a[i])  //Finding Maximum value
		max=a[i];  //// update max
        }
        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
	System.out.print("\nMaximum value: "+max);// Maximum Value of Array
    }
}
