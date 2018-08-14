public class Percolation {
  private int[][] system;



  public Percolation(int n) {
    system = new int[n][n];
  }

  public void open(int row, int col) {
    system[row][col] = 1;
  }

  public boolean isOpen(int row, int col) {
    return system[row][col] == 1;
  }

  public boolean isFull(int row, int col) {
    return system[row][col] == 0;
  }

  public int numberOfOpenSites() {
    return 1;
  }

  public boolean percolates() {
    return true;
  }

  public void showSystem() {
    for (int i = 0; i < system.length; i++) {
      for (int j = 0; j < system.length; j++) {
        System.out.print(system[i][j]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Percolation percolation = new Percolation(20);
    percolation.showSystem();
  }
}
