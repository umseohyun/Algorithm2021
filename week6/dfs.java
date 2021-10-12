public class dfs {
    public static boolean[] visited = new boolean[9];
    static int[][] graph = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};

    public static void sol(int v) {
        visited[v] = true;

        System.out.print(v + " ");

        for (int node : graph[v]) {
            if (!visited[node]) {
                sol(node);
            }
        }
    }

    public static void main(String[] args) {
	    sol(1);
    }
}