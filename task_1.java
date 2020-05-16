import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] in = br.readLine().split(" ");
        int[] arr = Stream.of(in)
                .mapToInt(Integer::parseInt)
                .toArray();
        
        System.out.println(findSecondLargest(arr));
    }
    
    private static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i + 1] > arr[i]) {
                return arr[i];
            }
        }
        
        return 0;
    }
}
