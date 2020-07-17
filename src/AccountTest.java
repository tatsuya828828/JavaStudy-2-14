
public class AccountTest {
	// 本番クラスにmainメソッドを定義することもできるが、もし本番クラスで定義して
	// 本番では使用しないはずのメソッドを利用者が誤って起動してしまうなど、本番稼働の不具合や
	// セキュリティホールにつながる可能性は0ではない
	// そのため本番稼働に不要なものは、本番稼働用のクラスの中に含めるべきではない
	public static void main(String[] args) {
		testInstantiate();
		testTransfer();
	}

	// じっさいにAccountをnewして使ってみるテスト
	private static void testInstantiate() {
		System.out.println("インスタンス化のテストを行います");
		Account a = new Account("ミナト", 30000);
		if(!"ミナト".equals(a.owner)) {
			System.out.println("エラー:名義人の値に問題があります");
		} else if(30000 != a.balance) {
			System.out.println("エラー:残高の値に問題があります");
		}
		System.out.println("問題はは検出されませんでした");
	}

	private static void testTransfer() {
		// テストの内容を記述
	}

	// 限られた時間の中で作ることができるテストケースの数は有限である
	// そのため、より多様な可能性を試せるような(広い範囲をカバーできる)テストケースだけを効率よく作っていくことが重要である
	// テストケースの作り方に迷ったときに便利なのが正常系と異常系というテストケースの分類
	// 正常系は、正常に動作することを確認するもので
	// 異常系は、引数がnullの場合やファイルが見つからない場合のように想定される異常な利用時に、エラー処理がなされているかを確認するもの
}
