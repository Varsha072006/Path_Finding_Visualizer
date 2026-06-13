import java.util.*;

public class pfv{

    static int ROWS = 5;
    static int COLS = 5;

    static int[][] grid = {
        {0, 0, 0, 1, 0},
        {1, 1, 0, 1, 0},
        {0, 0, 0, 0, 0},
        {0, 1, 1, 1, 0},
        {0, 0, 0, 0, 0}
    };

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static class Node {
        int r, c;
        Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) {

        int vr = 0, vc = 0;
        int er = 4, ec = 4;

        bfs(vr, vc, er, ec);
    }

    static void bfs(int vr, int vc, int er, int ec) {

        boolean[][] visited = new boolean[ROWS][COLS];
        int[][] parentR = new int[ROWS][COLS];
        int[][] parentC = new int[ROWS][COLS];

        for (int[] row : parentR)
            Arrays.fill(row, -1);

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(vr, vc));
        visited[vr][vc] = true;

        while (!q.isEmpty()) {

            Node cur = q.poll();

            if (cur.r == er && cur.c == ec) 
            break;

            for (int i = 0; i < 4; i++) {

                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];

                if (isValid(nr, nc, visited)) {
                    visited[nr][nc] =true;
                    q.add(new Node(nr, nc));
                    parentR[nr][nc] = cur.r;
                    parentC[nr][nc] = cur.c;
                }
            }
        }

        printPath(vr, vc, er, ec, parentR, parentC);
    }

    static boolean isValid(int r, int c, boolean[][] vis) {
        return r >= 0 && c >= 0 && r < ROWS && c < COLS
                && grid[r][c] == 0 && !vis[r][c];
    }

    static void printPath(int vr, int vc, int er, int ec,
                          int[][] parentR, int[][] parentC) {

        List<String> path = new ArrayList<>();

        int r = er, c = ec;

        while (r != -1 && c != -1) {
            path.add("(" + r + "," + c + ")");
            int pr = parentR[r][c];
            int pc = parentC[r][c];
            r = pr;
            c = pc;
        }

        Collections.reverse(path);

        System.out.println("Shortest Path:");
        for (String p : path) {
            System.out.print( p+ " ");
        }
    }
}
