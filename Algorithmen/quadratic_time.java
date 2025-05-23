import java.util.concurrent.ThreadLocalRandom;

public class quadratic_time {
    public static void main(String[] args) {
        for (int n = 32; n <= 400_789; n *= 2) {
          int[] array = createRandomArray(n);
      
          long time = System.nanoTime();

          // O(n²)

            for (int i = 1;i<n; i*=2){

                    for (int j=101; j<n ;j*=2){
                    array[i] = i;
                }
            }

          time = System.nanoTime() - time;
      
          System.out.printf("n = %d -> time = %d ns%n", n, time);
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
