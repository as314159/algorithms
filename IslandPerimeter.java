public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    if (cols != 1) {
                        if (j != cols - 1) {
                            if (grid[i][j + 1] == 1) {
                                perimeter -= 2;
                            }
                        }
                    }
                    if (i != 0) {
                        if (grid[i - 1][j] == 1) {
                            perimeter -= 2;
                        }
                    }
                }
            }
        }
        return perimeter;
    }
}
