package tw.org.iii.teresaaaaapp;

public class TerePokerV2 {

	public static void main(String[] args) {
		//1.洗牌 2.發牌 3.攤牌+里牌
		int[] poker=new int[52];
		boolean isRepeat;
		int temp;
		for(int i=0; i<poker.length; i++) {
			do {
							
			temp=(int)(Math.random()*52);
			isRepeat=false;
			for(int j=0;j<i;j++) {
				if (poker[j]==temp) {
					isRepeat=true;
					break;
				}
			} }
			while(isRepeat);
			
		
				poker[i]=temp;
				System.out.println(temp);
//		long end=System.currentTimeMillis();
//		System.out.println(end);
	}}}