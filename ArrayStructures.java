public class ArrayStructures {

  // Create a new array with 50 boxes (but they will not all be used)
  private int[] theArray = new int[50];
  // We will only use 10 boxes so set the size to 10 to use later on (instead of using length).
  private int arraySize = 10;

  // Generate random integers for array.
  public void generateRandomArray() {
    for (int i = 0; i < arraySize; i++) {
      theArray[i] = (int)(Math.random() * 10);
    }
  }

  // Prints the array in box-like format.
  public void printArray() {
    System.out.println("---------");

    for (int i = 0; i < arraySize; i++) {
      System.out.println("| " + i + " | " + theArray[i] + " |");
    }
    System.out.println("---------");
  }

  // Gets value of the array at the requested index.
  public int getValueByIndex(int index) {
      if (index < arraySize) return theArray[index];
      return 0;
  }

  // Finds out if the array contains a value and returns the indices where that value can be found or says that value is not in the array.
  public void doesArrayContain(int value) {
    String containingIndices = "";
    for (int i = 0; i < arraySize; i++) {
      if (theArray[i] == value) {
        containingIndices += i + " ";
      }
    }
    // Length of 2 means there is only one index plus a space.
    String indexWord = (containingIndices.length() == 2) ? " index " : " indices ";
    String result = (containingIndices.length() >= 1) ? "Value " + value + " found at" + indexWord + containingIndices : "Value " + value + " not found in array.";
    System.out.println(result);
  }

  public static void main(String[] args) {
    ArrayStructures array = new ArrayStructures();
    array.generateRandomArray();
    array.printArray();
    // System.out.println(array.getValueByIndex(9));
    // array.doesArrayContain(2);
  }

}
