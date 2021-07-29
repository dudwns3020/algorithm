class counting {
	public static void main(String[] args){
	    int[] arr = {7, 2, 3, 5, 7, 1, 4, 6, 7, 5, 0, 1};
	    
	    System.out.print("before sort arr : ");
	    for(int i : arr){
	      System.out.print(i + " ");
	    }
	    System.out.println("");

	    countingsort(arr, 7);

	    System.out.print("after sort arr : ");
	    for(int i : arr){
	      System.out.print(i + " ");
	    }
	    System.out.println("");
	  }

	  static void countingsort(int[] a, int n) {
	    int[] count = new int[n+1];
	    int[] result = new int[a.length];

	    for(int i = 0; i < a.length; i++){
	      for(int j = 0; j < count.length; j++){
	        if(a[i] == j){
	          count[j]++;
	          }
	        }
	      }

	    for(int i = 1; i < count.length; i++){
	      count[i] += count[i-1];
	      }

	      // System.out.print("counting : ");
	      // for(int i : arr){
	      //   System.out.print(i + " ");
	      // }
	      // System.out.println("");

	    for(int i = a.length-1; i >= 0; i--){
	      count[a[i]]--;
	      result[count[a[i]]] = a[i];
	    }

	    for(int i = 0; i < a.length; i++){
	      a[i] = result[i];
	    }
	  }
	}