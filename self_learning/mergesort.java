class mergesort{
  public static void main(String[] args) {
    int arr[] = {31, 3, 65, 73, 8, 11, 20, 29, 48, 15};

  static void merge(int[] a, int p, int q, int r) {
    int i = p;
    int j = q+1;
    int t = 0;

    int[] tmp = new int[100];

    while (i <= q && j <= r) {
      if(a[i] <= a[j]){
        tmp[t++] = a[i++];
      }
      else {
        tmp[t++] = a[j++];
      }
    }
    while(i <= q){
      tmp[t++] = a[i++];
    }
    while(j <= r){
      tmp[t++] = a[j++];
    }

    i = p;
    t = 0;

    while(i <= r) {
      a[i++] = tmp[t++];
    }
  }
}