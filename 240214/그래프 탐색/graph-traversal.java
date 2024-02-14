import java.io.*;
import java.util.*;
import java.lang.*;

class DFS {
    private ArrayList<Integer>[] dfs;
    private boolean[] visited;

    public DFS(int n) {
        dfs = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i = 0; i < n + 1; ++ i) {
            dfs[i] = new ArrayList<>();
        }
    }

    public void addNode(int x, int y) {
        dfs[x].add(y);
        dfs[y].add(x);
    }

    public boolean[] getNodeCount(int vertex, int count) {
        for (Integer currV : dfs[vertex]) {
            if (visited[currV] == false) {
                visited[currV] = true;
                getNodeCount(currV, count);
            }
        }
        return visited;
    }
}

public class Main {
    private static int n, m;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        DFS dfs = new DFS(n);
        for (int i = 0; i < m; ++ i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            dfs.addNode(x, y);
        }
        boolean[] visited = dfs.getNodeCount(1, 0);
        int count = 0;
        for (int i = 2; i < n + 1; ++ i) {
            if(visited[i])  count += 1;
        }
        System.out.println(count);
    }
}