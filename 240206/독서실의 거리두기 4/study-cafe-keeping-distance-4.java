import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    /**
    * 독서실에 두 명 더 넣었을 때 가장 가까운거리를 구하는 문제
    * 1. 완전 탐색으로 0으로 된 곳을 찾아 1로 만들어 본다.
    * 2. 만약 한 곳이라도 1인곳이 있으면 다음 자리로 이동한다
    * 3. 둘 다 빈자리면 서로간 가장 먼 거리를 계산하여 저장한다.
    */
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String sitNumbers = br.readLine();
        int[] sitNums = str2IntArray(sitNumbers);

        int maxDistance = -1;
        boolean bTouch = false;
        for (int i = 0; i < N - 1; ++i) {
            for (int j = i + 1; j < N; ++j) {
                if (sitNums[i] == 1 || sitNums[j] == 1) continue;
                bTouch = true;
                sitNums[i] = 1; sitNums[j] = 1;
                maxDistance = Math.max(maxDistance, calcMinDistance(sitNums));
                sitNums[i] = 0; sitNums[j] = 0;
            }
        }
        if (bTouch == true) {
            System.out.println(maxDistance);
        } else {
            System.out.println(0);
        }
        
    }

    private static int[] str2IntArray(String _sitNumbers) {
        int[] nums = new int[_sitNumbers.length()];
        char[] str = _sitNumbers.toCharArray();
        for (int idx = 0; idx < _sitNumbers.length(); ++idx) {
            nums[idx] = str[idx] - '0';
        }
        return nums;
    }

    private static int calcMinDistance(int[] _sitNums) {
        int idx1 = -1; int idx2 = -1;
        int mindistance = _sitNums.length;
        for(int i = 0; i < _sitNums.length; ++i) {
            if (_sitNums[i] == 0) continue;
            else if (idx1 == -1) idx1 = i;
            else {
                idx2 = i;
                mindistance = Math.min(mindistance, idx2 - idx1);
                idx1 = idx2;
            }
        }
        return mindistance;
    }
}