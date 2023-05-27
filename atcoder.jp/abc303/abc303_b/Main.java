import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  /**
   * 一度も隣接しなかった個数を数えます
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 長さ
    var n = Integer.parseInt(sc.next());
    var m = Integer.parseInt(sc.next());

    Set<Pair> set = new HashSet<>();
    for (int i1 = 0; i1 < m; i1++) {
      String[] photo = new String[n];
      for (int i = 0; i < n; i++) {
        photo[i] = sc.next();
      }

      for (int i = 0; i < photo.length; i++) {
        if (i != 0) {
          set.add(new Pair(photo[i - 1], photo[i]));
        }

        if (i != photo.length - 1) {
          set.add(new Pair(photo[i], photo[i + 1]));
        }
      }
    }

    // nC2 を計算
    var all = n * (n - 1) / 2;

    // 出力
    System.out.println(all - set.size());
  }

  private static class Pair {

    String a;
    String b;

    public Pair(String a, String b) {
      this.a = a;
      this.b = b;
    }

    public String getA() {
      return a;
    }

    public String getB() {
      return b;
    }

    @Override
    public boolean equals(Object obj) {
      return obj instanceof Pair && (
          ((Pair) obj).getA().equals(this.a) && ((Pair) obj).getB().equals(this.b)
              || ((Pair) obj).getA().equals(this.b) && ((Pair) obj).getB().equals(this.a));
    }

    @Override
    public int hashCode() {
      return a.hashCode() + b.hashCode();
    }
  }

}