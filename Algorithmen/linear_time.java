public class linear_time {

public static void main(String[] args) {
  for (int n = 32; n <= 624_525; n *= 2) {
    int[] array = createArray(n);

    long linearSum = 0;
    long runtime = System.nanoTime();
    
    // O(n)

    runtime = System.nanoTime() - runtime;

    System.out.printf("n= %d --> Laufzeit= %d ns%n", n, runtime);
  }
}

private static int[] createArray(int n) {
  int[] array = new int[n];
  for (int i = 0; i < n; i++) {
    array[i] = i;
  }
  return array;
}
}