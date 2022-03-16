class partition {
  public static void main(String[] args) {
  int[] arr = {10, 25, 15, 13, 22, 12, 20};

  for(int i: arr){
    System.out.print(i + " ");
  }
  System.out.println();

  partitionsort(arr, 0, arr.length-1);

  for(int i: arr){
    System.out.print(i + " ");
  }
  System.out.println();
 }

 static void partitionsort(int[] a, int s, int e){
    int p = a[(s+e)/2];
    System.out.println(p);
    while(s<=e){
      while(a[s] < p) {
        s++;
      }
      while(a[e] > p) {
        e--;
      }
      if(s <= e) {
        int tmp = a[s];
        a[s] = a[e];
        a[e] = tmp;
        s++;
        e--;
      }
    }
  }
}