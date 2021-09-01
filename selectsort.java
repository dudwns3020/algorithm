class sort {
    public void select(int[] a) {
        for(int i = a.length ; i >= 0; i--) {
            int m = a[0];
            for(int j = 0; j < a.length; j ++) {
                if( a[j] > m) {
                m = a[j];
                }
            }
            swap(i, m);
        }
        
    }

    public void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
public class selectsort {
    public static void main(String[] args) {
        int arr = {3, 8, 2, 0, 1, 9, 5, 7};
    }
}
