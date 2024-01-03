import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    String[] scrambledArray = {"Nour", "Martyna", "Christian", "Ryan", "Adrian", "Sheikh", "Shreeyam", "Riana", "Ashika", "Matija"};

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Your scrambled array:");
    System.out.println();

    for(String student: scrambledArray){
      System.out.println(student);
    }

    String[] sortedArray = {"Nour", "Martyna", "Christian", "Ryan", "Adrian", "Sheikh", "Shreeyam", "Riana", "Ashika", "Matija"};

    bubbleSort(sortedArray);

    System.out.println("");
    System.out.println("Your sorted array:");
    System.out.println("");
    
    for(String sort: sortedArray){
      System.out.println(sort);
    }

    System.out.println("");
    System.out.println("Enter a name to search for:");
    String name = scan.nextLine();

    linearSearch(scrambledArray, name);

    binarySearch(sortedArray, name);
  }

  public static void bubbleSort(String[] sortedArray) {

    String temp;
    
    for (int j = 0; j < sortedArray.length; j++) {
         for (int i = j + 1; i < sortedArray.length; i++) {
            if (sortedArray[i].compareTo(sortedArray[j]) < 0) {
               temp = sortedArray[j];
               sortedArray[j] = sortedArray[i];
               sortedArray[i] = temp;
            }
         }
      }
  }

  public static void linearSearch(String[] array, String name){
    for (int i = 0; i < array.length; i++){
      if (array[i].compareTo(name) == 0){
        System.out.println(name + " is found in scrambledArray at index " + i);
        return;
      }
    }
    System.out.println(name + " was not found in scrambledArray");
    System.out.println(name + " was not found in sortedArray");
  }

  public static int binarySearch(String[] array, String name) {
  int low = 0;
  int high = array.length - 1;
 
  while (low <= high) {
    int mid = low + (high - low)/2;
    int com = name.compareTo(array[mid]);
   
    if (com == 0) {
      System.out.println(name + " was found in sortedArray at index " +mid);
    }
   
    if (com > 0) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }
    return low;
}
}