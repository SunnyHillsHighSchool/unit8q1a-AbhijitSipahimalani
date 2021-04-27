import java.util.*;
class Main {
  public static void main(String[] args) {
    int[][]arr = {{1,5,4,5,7,3},{2,4,3,5,7,6},{2,4,3,3,6,0},{9,8,9,9,4,1}};
for(int [] row:arr)
System.out.println(Arrays.toString(row));
System.out.println();
System.out.println("New Array");
Unit8_1a test = new Unit8_1a();
for(int [] row: test.modifyColumns(arr))
System.out.println(Arrays.toString(row));

  }
}

//output should be
//1 1 4 4 7 7
//2 2 3 3 7 7
//2 2 3 3 6 6
//9 9 9 9 4 4