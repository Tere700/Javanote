package tw.org.iii.teresaaaaapp;
//單行註解
/*
 * 多行註解
 */
/**非註解 產生javadoc
 * 
 * @param args
 */
public class Tere01 {
	//紅色通通都是java關鍵字永遠全小寫 黑色由開發者定義
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO 還沒寫完 頁簽 未來要寫可以從TODO抓
		/*JAVA屬於強型別的程式語言 規定很嚴格
		弱型別 給什麼就放什麼
		型別 基本:整數、浮點數、布林、字元
		型別 物件:
			*/
		byte var1;//宣告而已
		var1 =123;//給值-完成第一次的給值=完成初始化
		System.out.println(var1);
		byte var2=-128;//區域變數=var2 任何數字都有型別
		System.out.println(var2);
		short $_$=200;
		System.out.println($_$);
		short var3=10000; //java支持unicode
		System.out.println(var3);
	}
	//SHORT=2的16次方=-32768~32767,0被歸為正數
	/*Java變數名稱的正確規則
	  [a-zA-Z$_][a-zA-Z0-9$_]*前面東西出現0或多個 
	  $_很特殊盡量不要用,保留給其他人做偉大的事
	  int 2的32次方=十位數 十個大小加正負號=十一位數
	  預設是使用int存放
	  1.int 2.byte 3.short or long
	  42億=4G=2的32次方
	  long 2的64次方
	 */
	/*變數命名規則
	不能與保留字相同
	字首不能是數字
	字首可以是底線('_')或錢字符號('$')
	Java將大小寫英文視為不同字元*/

}
