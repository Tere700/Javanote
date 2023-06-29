package tw.org.iii.teresaaaaapp;

public class TerePokerV1 {

	public static void main(String[] args) {
		//1.洗牌 2.發牌 3.攤牌+里牌
		int[] poker=new int[52];
		for(int i=0; i<poker.length; i++) {
			int temp=(int)(Math.random()*52);
			boolean isRepeat=false;
			for(int j=0;j<i;j++) {
				if (poker[j]==temp) {
					isRepeat=true;
					break;
				}
			}
			if(!isRepeat) {
				poker[i]=temp;
				System.out.println(poker[i]);
							
			}else {i--;
		}
		long end=System.currentTimeMillis();
		System.out.println(end);
	}}}

