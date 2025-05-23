import java.util.Arrays;

public class log_n {
    public static void main(String[] args) {
        for (int n = 32; n <= 624_528; n *= 2) {
          int[] array = createArray(n);
      
          long runtime = System.nanoTime();

          // Log(n)
          
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
