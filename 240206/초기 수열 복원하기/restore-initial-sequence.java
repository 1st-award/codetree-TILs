import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;

public class Main {
    /**
    * 
    *
    */
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N - 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; ++i) {
            result[i] = Integer.parseInt(st.nextToken());
        }

        String numbers = "";
        int[] nums;
        Set<Integer> set;
        int start = (int) Math.pow(10, (N - 1));
        int end = (int) Math.pow(10, N);
        for (int i = start; i < end; ++ i) {
            nums = str2IntArr(String.valueOf(i));
            set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
            if (isCorrect(nums, result, N) && set.size() == N && !set.contains(0)) {
                for (int num : nums) System.out.print(num + " ");
                break;
            }
        }
    }

    private static int[] str2IntArr(String _str) {
        int[] nums = new int[_str.length()];
        char[] strs = _str.toCharArray();
        for (int idx = 0; idx < _str.length(); ++idx) {
            nums[idx] = strs[idx] - '0';
        }   
        return nums;
    }

    private static boolean isCorrect(int[] _nums, int[] _result, int N) {
        // System.out.println(Arrays.toString(_nums));
        // System.out.println(Arrays.toString(_result));
        for (int idx = 0; idx < N - 1; ++ idx) {
            if (_result[idx] != _nums[idx] + _nums[idx + 1]) {
                return false;
            }
        }
        return true;
    }
}