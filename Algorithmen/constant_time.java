import java.util.LinkedList;

public class constant_time {
    public static void main(String[] args) {
        for (int n = 32; n <= 128_789; n *= 2) {
            
          LinkedList<Integer> list = createLinkedList(n);
      
          long runtime = System.nanoTime();
          list.add(0, 1);
          runtime = System.nanoTime() - runtime;
      
          System.out.printf("n= %d --> Laufzeit= %d ns%n", n, runtime);
        }
      }
      
      private static LinkedList<Integer> createLinkedList(int n) {
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
          linkedList.add(i);
        }
        return linkedList;
      }
}
