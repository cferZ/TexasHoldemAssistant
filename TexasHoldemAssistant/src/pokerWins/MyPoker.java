package pokerWins;

public class MyPoker {
	private int priority=0;//同花顺>四条>葫芦>同花>顺子>三条>两对>一对>高牌
	int[] finalChoice=new int[5];
	
	/**
	 * 同花顺>四条>葫芦>同花>顺子 >三条  >两对   >一对 >高牌
	 *   a > b > c> d > e > f > g  > h >i
	 * d+e=a
	 * c=f+h
	 * g=2*h
	 * 
	 */
}
