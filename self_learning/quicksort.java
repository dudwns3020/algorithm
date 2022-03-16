class Main {
  public static void main(String[] args) {
    int arr[] = {31, 8, 48, 73, 11, 3, 20, 29, 65, 15};

    System.out.println("before");
    for(int data : arr){
      System.out.print(data + " ");
    }
    System.out.println("");

    quicksort(arr, 0, arr.length - 1);
    
    System.out.println("after");
    for(int data : arr){
      System.out.print(data + " ");
    }
    System.out.println("");
    
  }


  static void partition(int a[], int p, int r) {
    int i = p - 1;
    int j;
    int x = a[r];
    int tmp;

    for(j = p; j <= r-1; j++){
      if(a[j] <= x){
        tmp = a[++i];
        a[i] = a[j];
        a[j] = tmp;
      }
    }
    tmp = a[i+1];
    a[i+1] = a[r];
    a[r] = tmp;
  }

  static void quicksort(int a[], int p, int r){
    int q;
    if (p < r){
      q = partition(a, p, r);
      quicksort(a, p, q-1);
      quicksort(a, q+1, r);
    }
  }
}