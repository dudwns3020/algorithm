class Main {
  public static void main(String[] args) {
    int arr[] = {3, 31, 48, 73, 8, 11, 20, 29, 65, 15};

    for(int i = 1; i < arr.length; i++){
      for(int j = i - 1; j >= 0; j--){
          if (arr[j+1] < arr[j]){
            int tmp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = tmp;
          }
        }
    }
    for(int k = 0; k < arr.length; k++){
      System.out.print(arr[k] + " ");
    }
  }
}