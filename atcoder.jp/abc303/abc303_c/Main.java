import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    var count = Integer.parseInt(sc.next());
    var healthResetCount = Integer.parseInt(sc.next());
    var health = Integer.parseInt(sc.next());
    var afterHealthReset = Integer.parseInt(sc.next());

    var commands = sc.next().toCharArray();

    var healthResetItems = new HashSet<Point>();
    for (int i = 0; i < healthResetCount; i++) {
      var x = Integer.parseInt(sc.next());
      var y = Integer.parseInt(sc.next());
      healthResetItems.add(new Point(x, y));
    }

    var currentPoint = new Point(0, 0);
    for (char command : commands) {

      if (command == 'R') {
        currentPoint = new Point(currentPoint.getX() + 1, currentPoint.getY());
      } else if (command == 'U') {
        currentPoint = new Point(currentPoint.getX(), currentPoint.getY() + 1);
      } else if (command == 'L') {
        currentPoint = new Point(currentPoint.getX() - 1, currentPoint.getY());
      } else if (command == 'D') {
        currentPoint = new Point(currentPoint.getX(), currentPoint.getY() - 1);
      }

      health--;

      if (health < 0) {
        break;
      } else {
        if (health < afterHealthReset && healthResetItems.contains(currentPoint)) {
          health = afterHealthReset;
          healthResetItems.remove(currentPoint);
        }
      }
    }

    System.out.println(health < 0 ? "No" : "Yes");
  }

  private static class Point {

    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Point point = (Point) o;
      return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
      return Objects.hash(x, y);
    }
  }

}