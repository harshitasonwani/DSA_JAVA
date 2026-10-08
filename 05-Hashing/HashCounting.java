class HashCounting{
  public static void main (String [] args){

    int arr[] = {5,2,7,5,7};
    int hashsize = 12;

    int hash[] = new int [hashsize];

    for (int i = 0; i < arr.length ; i++){
      int index = arr[i] % hashsize ;
      hash[index]++ ;
    }

    for (int i = 0; i < hashsize ; i++){
      if (hash [i] > 0) {
        System.out.println( i + " -->" + hash[i]);
      }
    }
  }
}

  
