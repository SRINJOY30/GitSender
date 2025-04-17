public class Average {
    public static void main(String[] args) {
        double[] a = {2.9, 4.2, 6.5, 8.4, 10.0}; // input array
        int n = a.length; // array length
	double total=0.0;
        for (int i = 0; i < n; i++) {
            total+=a[i]; //Total sum
        }
        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
	System.out.print("\nTotal value: "+total);
	System.out.print("\nAverage value: "+total/n); //Average value
    }
}
