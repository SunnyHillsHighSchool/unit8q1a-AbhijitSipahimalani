public class Unit8_1a
{
  public int [] [] modifyColumns (int [] [] arr)
 {
  for(int i = 0; i < arr.length; i++){
    for(int j = 0; j < arr[0].length; j++){
      if(i % 2 != 0){
        arr [i] [j] = arr [i-1] [j];
      }
    }
  }
  return arr;
  }
}
 