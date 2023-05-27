import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 長さ
    int length = Integer.parseInt(sc.next());
    // 入力
    char[] x = sc.next().toCharArray();
    char[] y = sc.next().toCharArray();

    boolean result = true;

    for (int i = 0; i < length; i++) {
      char xi = x[i];
      char yi = y[i];

      if (xi == yi) {
        continue;
      }

      if ((xi == '1' || xi == 'l') && (yi == '1' || yi == 'l')) {
        continue;
      }

      if ((xi == '0' || xi == 'o') && (yi == '0' || yi == 'o')) {
        continue;
      }

      result = false;
    }

    // 出力
    System.out.println(result ? "Yes" : "No");
  }

}
