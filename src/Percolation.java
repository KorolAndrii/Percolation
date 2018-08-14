import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
  private int[][] system;
  private int openSites;

  public Percolation(int n) {
    if (n <= 0) {
      throw new IllegalArgumentException();
    }
    system = new int[n][n];
    openSites = 0;
  }

  public void open(int row, int col) {
    if (row <= 0 || col <= 0) {
      throw new IllegalArgumentException();
    }
    if (isFull(row, col)) {
      openSites++;
    }
    system[row - 1][col - 1] = 1;
  }

  public boolean isOpen(int row, int col) {
    if (row <= 0 || col <= 0) {
      throw new IllegalArgumentException();
    }
    return system[row - 1][col - 1] == 1;
  }

  public boolean isFull(int row, int col) {
    if (row <= 0 || col <= 0) {
      throw new IllegalArgumentException();
    }
    return system[row - 1][col - 1] == 0;
  }

  public int numberOfOpenSites() {
    return openSites;
  }

  public boolean percolates() {
    return true;
  }

  public void showSystem() {
    for (int i = 1; i <= system.length; i++) {
      for (int j = 1; j <= system.length; j++) {
        System.out.print(system[i - 1][j - 1]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Percolation percolation = new Percolation(5);
    percolation.open(1,1);
    percolation.open(1,1);
    percolation.open(1,1);
    percolation.open(1,2);
    percolation.open(1,5);
    percolation.open(3,1);
    percolation.showSystem();
    System.out.println(percolation.numberOfOpenSites());
  }
}
