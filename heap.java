class Main {
  public static void main(String[] args) {
    int[] arr = {7, 9, 4, 8, 6, 3};

    System.out.println("BEFORE");
    for(int result : arr) {
      System.out.print(result + " ");
    }
    System.out.println("");

    heapbuild(arr, arr.length);
    
    System.out.println("AFTER heapfiy");
    for(int result : arr) {
      System.out.print(result + " ");
    }
    System.out.println("");

    heapsort(arr, arr.length-1);

    System.out.println("AFTER heapsort");
    for(int result : arr) {
      System.out.print(result + " ");
    }
    System.out.println("");
  }

  static void swap(int a[], int i, int j){
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

  static void heapify(int a[],int i, int s) {
    int p = i;
    int l = i*2+1;
    int r = i*2+2;

    if ( l < s && a[l] < a[p]){
      p = l;
    }
    if ( r < s && a[r] < a[p]){
      p = r;
    }
    if (p != i){
      swap(a, i, p);
      heapify(a, p, s);
    }
  }

   static void heapbuild(int a[], int n){
    for(int i = n/2; i >= 0; i--){
      heapify(a, i, n);
    }
  }

  static void heapsort(int a[], int n){
    for(int i = n; i>0; i--){
      int tmp = a[0];
      a[0] = a[i];
      a[i] = tmp;
      heapify(a, 0, i-1);
    }
  }
}
