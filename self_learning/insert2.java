class insert2 {
  public static void main(String[] args) {
    int arr[] = {3, 31, 48, 73, 8, 11, 20, 29, 65, 15};

    for(int i = 1; i < arr.length; i++){
      int j = i - 1;
      int tmp = arr[i];
      while(j >= 0 && tmp < arr[j]){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = tmp;
      }
      for(int k = 0; k < arr.length; k++){
        System.out.print(arr[k] + " ");
    }
  }
}