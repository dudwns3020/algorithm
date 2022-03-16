class Main {
  public static void main(String[] args) {
    int arr[] = {8, 2, 31, 48, 7};
    int last = arr.length;

    for(int i = 0; i < arr.length; i++) {
      int large = i;
      for(int j = i + 1; j < arr.length; j++){
        if(arr[i] > arr[j]){
          int tmp = arr[j];
          arr[j] = arr[i];
          arr[i] = tmp;
        }
      } 
    }
    for(int k : arr){
      System.out.print(k + " ");
    }
  }
}