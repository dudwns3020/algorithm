class Main {
  public static void main(String[] args) {
    int arr[] = {31, 8, 48, 73, 11, 3, 20, 29, 65, 15};

    partition(arr, 0, arr.length - 1);

    // for(int data : arr){
    //   System.out.print(data + " ");
    // }
  }


  static void partition(int a[], int p, int r) {
    int i = 0;
    int j = p;

    for(int k = 0; k < r; k++){
      if ( a[r] <= a[p]) {
        a[j] = a[p];
        p++;
        j++;
      }
      else {
        int tmp = a[i];
        a[i] = a[p];
        a[p] = tmp;
        i++;
        j++;
        p++;
      }
    }
    int tmp = a[j];
    for(int o = j; o < i; o--){
      a[o] = a[o-1];
      System.out.print(a[o]);
    }
  }
}