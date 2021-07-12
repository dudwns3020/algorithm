class selectionsort {
  public static void main(String[] args) {
    int arr[] = {8, 2, 31, 48, 7};
    for(int i = 0; i < arr.length; i++) {
      int large = 0;
      for(int j = 0; j < arr.length - i; j++){
        if(arr[j] > large){
          large = arr[j];
        }
      }
      int tmp = large;
      // large = arr[];
      // arr[] = tmp;
      }
    for(int k = 0; k < arr.length; k++){
      System.out.print(arr[k] + " ");
    }
  }
}