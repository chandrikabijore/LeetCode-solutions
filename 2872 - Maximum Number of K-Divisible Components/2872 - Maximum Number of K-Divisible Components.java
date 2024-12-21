import java.util.*;

class Solution {
    public int maxKDivisibleComponents(int n, int[][] v, int[] values, int k) {
        List<Integer>[] adj = new ArrayList[n + 1];
        int[] in = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            int u = v[i][0];
            int w = v[i][1];
            if (adj[u] == null) {
                adj[u] = new ArrayList<>();
            }
            if (adj[w] == null) {
                adj[w] = new ArrayList<>();
            }
            adj[u].add(w);
            adj[w].add(u);
            in[u]++;
            in[w]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (in[i] == 1 || in[i] == 0) {
                q.offer(i);
            }
        }
        int c = 0;
        while (!q.isEmpty()) {
            Queue<Integer> q1 = new LinkedList<>();
            while (!q.isEmpty()) {
                int f = q.poll();
                in[f] = 0;
                if (values[f] % k == 0) {
                    c++;
                    values[f] = 0;
                }
                for (int i : adj[f]) {
                    if (in[i] != 0) {
                        in[i]--;
                        values[i] += values[f];
                        if (in[i] == 1) {
                            q1.offer(i);
                        }
                    }
                }
            }
            q = q1;
        }
        return c;
    }
}
