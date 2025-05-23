import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class n_log_n {
    public static void main(String[] args) {
        for (int n = 64; n <= 528_789; n *= 2) {
          int[] array = createRandomArray(n);
      
          long runtime = System.nanoTime();

          // O(n*log(n))
          
          runtime = System.nanoTime() - runtime;
      
          System.out.printf("n = %d -> time = %d ns%n", n, runtime);
        }
      }
      
      private static int[] createRandomArray(int n) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int[] randomArray = new int[n];
        for (int i = 0; i < n; i++) {
          randomArray[i] = random.nextInt();
        }
        return randomArray;
      }
}
