package tb課題;

public class Trycatch {
	public static void main(String[] args) {
		try {
			System.out.println("エラー起きるかもしれない処理↓");
			int num = Integer.parseInt("111");
			System.out.println("②変換成功: " + num);
			System.out.println("エラー起きなかったときの処理");
		} catch (NumberFormatException e) {
			System.out.println("上でエラーおきた時の処理");
		} finally {
			System.out.println("どっちにしろやる処理");

		}
	}

}
