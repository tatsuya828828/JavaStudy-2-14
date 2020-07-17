
public class Main {
	public static void main(String[] args) {
		System.out.println("アサートにわざと失敗します");
		// JVMは、デフォルトでは、アサーション機能が無効の状態で動作するため
		// アサーションを有効にしたい場合は、実行構成の引数に-eaを追加する必要がある
		assert 1 == 0 : "値が不正です";
		System.out.println("正常終了します");
	}
}
