class bublesort {
    public static void main(String[] args){
       int arr[] = {3, 31, 48, 73, 8, 11, 20, 29, 65, 15};

       for(int i = 0; i < arr.length; i++) {
          for(int j = 0; j < arr.length - 1 - i ; j ++) {
              if (arr[j] > arr[j+1]) {
              swap(arr, j, j+1);
            }
          }

       }
       for(int i = 0; i < arr.length; i ++) {
         System.out.print(arr[i] + " ");
       }
    }

    static void swap(int a[], int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}