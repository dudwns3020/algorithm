class radix {
  public static void main(String[] args) {
    // int[] arr = {123, 2154, 222, 4, 283, 1560, 1061, 2150};
    int[] arr = {7, 2, 3, 5, 7, 1, 4, 6, 7, 5, 0, 1};

    System.out.print("arr : ");
    for(int i: arr){
      System.out.print(i + " ");
    }
    System.out.println("");

  }

  static void radixsort() {
      
  }

  static void countingsort(int[] a, int n) {
    int[] count = new int[n+1];
    int[] result = new int[a.length];

    for(int i = 0; i < a.length; i++) {
      count[a[i]]++;
    }
    
    for(int i = 1; i < count.length ; i++) {
      count[i] += count[i-1];
    }
    
    for(int i = a.length-1; i >= 0; i--) {
      count[a[i]]--;
      result[count[a[i]]] = a[i];
    }
    
    for(int i = 0; i < a.length; i++){
	    a[i] = result[i];
	  }
  }

  static void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

}