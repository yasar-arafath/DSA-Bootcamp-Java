public class Spiral3 {
    int index = 1;
    int row;
    int col;
    int rows;
    int cols;

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int moves = 0;
        row = rStart;
        col = cStart;
        this.rows = rows;
        this.cols = cols;
        result[0] = new int[]{rStart, cStart};
        while (index < result.length) {
            ++moves;
            addToResult(result, moves, 1, 0);
            addToResult(result, moves, 0, 1);
            ++moves;
            addToResult(result, moves, -1, 0);
            addToResult(result, moves, 0, -1);
        }
        return result;
    }

    public void addToResult(int[][] result, int moves, int horizontal, int vertical) {
        for (int i = 0; i < moves; ++i) {
            row += vertical;
            col += horizontal;
            if (row < rows && row > -1 && col < cols && col > -1) {
                result[index] = new int[]{row, col};
                ++index;
            }
        }
    }

    public static void main(String[] args) {
        Spiral3 solution = new Spiral3();

        int rows = 5;
        int cols = 5;
        int rStart = 0;
        int cStart = 0;
        int[][] spiralMatrix = solution.spiralMatrixIII(rows, cols, rStart, cStart);
        System.out.println("Spiral Matrix:");
        for (int[] coordinate : spiralMatrix) {
            System.out.println("(" + coordinate[0] + ", " + coordinate[1] + ")");
        }
    }
}
