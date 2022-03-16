class searchtree {
  public static void main(String[] args) {
    int[] arr = {30, 20, 40 , 10, 25, 35, 45};
    search(arr, 0, 10);
  }
  static void search(int[] a, int t, int x) {
    if(a[t] == x) {
      System.out.println(t);
    }
    else if(a[t] > x) {
      search(a, 2*t+1, x);
    }
    else {
      search(a, 2*t+2, x);
    }
  }
}