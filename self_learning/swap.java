class swap {
    public static void main(String[] args){
       int s[] = {10, 8, 11, 1, 5, 9};

       for(int i = 0; i < s.length - 1; i++) {
         if (s[i] > s[i+1]) {
           swap(s, i, i+1);
         }
       }
       for(int i = 0; i < s.length; i ++) {
         System.out.print(s[i] + " ");
       }
    }

    static void swap(int a[], int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}