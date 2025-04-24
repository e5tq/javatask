package tb課題;
public class FizzBuzz {
    public static void main(String[] args) {
        // 引数チェック
        if (args.length == 0) {
            System.out.println("数値の引数が必要です");
            return;
        }

        int max = Integer.parseInt(args[0]); // 引数を整数に変換

        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
