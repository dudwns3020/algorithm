class sort {
    public void select(int[] a) {
        for(int i = a.length-1 ; i >= 0; i--) {
            int m = 0;
            for(int j = 0; j <= i; j ++) {
               if( a[j] > a[m] ) {
                    m = j;
               }
            }
            swap(a, i, m);
        }
    }

    public void swap(int[] a, int b, int c) {
        int tmp = a[b];
        a[b] = a[c];
        a[c] = tmp;
    }
}
public class selectsort {
    public static void main(String[] args) {
        sort s = new sort();

        int[] arr = {3, 8, 2, 0, 1, 9, 5, 7};

        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        s.select(arr);

        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
