class Solution {
    int defcol[] = { -1, 0, 1, 0 };
    int defrow[] = { 0, 1, 0, -1 };

    public void bfs(int row, int col, boolean[][] arr, char[][] grid) {
        arr[row][col] = true;
        Queue<Integer> pair = new LinkedList<>();
        pair.add(row);
        pair.add(col);
        int n = grid.length;
        int m = grid[0].length;
        while (!pair.isEmpty()) {
            int r = pair.remove();
            int c = pair.remove();
            for (int i = 0; i < 4; i++) {
                int nr = r + defrow[i];
                int nc = c + defcol[i];
                if (nc < 0 || nc >= m || nr < 0 || nr >= n) {
                    continue;
                }
                if (!arr[nr][nc] && grid[nr][nc] == '1') {
                    pair.add(nr);
                    pair.add(nc);
                    arr[nr][nc] = true;
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean arr[][] = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!arr[i][j] && grid[i][j] == '1') {
                    bfs(i, j, arr, grid);
                    count++;
                }
            }
        }
        return count;
    }
}