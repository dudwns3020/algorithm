class heap {
  public static void main(String[] args) {
    int[] arr = {7, 9, 4, 8, 6, 3};

    System.out.println("BEFORE");
    for(int result : arr) {
      System.out.print(result + " ");
    }
    System.out.println("");

    for(int i = arr.length/2-1; i >= 0; i--){
      heapify(arr, i, arr.length);
    }
    
    System.out.println("AFTER");
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
   
}
