package pokerWins;

import Util.Util;

public class Checker {
	private int[] value=null;
	private int[] suit=null;
	private int[] card=null;
	
	/**
	 * 初始化 检查器 将花色和牌面大小分开统计
	 * @param ints
	 */
	public Checker(int[] ints){
		card=ints;
		suit=new int[ints.length];
		value=new int[ints.length];
		for(int i=0;i<ints.length;i++){
			suit[i]=card[i]/13;
		}
		Util.sortInt(suit);
		for(int i=0;i<ints.length;i++){
			value[i]=card[i]%13;
		}
		Util.sortInt(value);
	}
	public  MyPoker check(int[] cards){
		
		return null;
	}
	public int haveFlush(int[] cards){
		int[] sameSuit=Util.findSame(suit);
		
		return 0;
	}
	public boolean haveShunza(int[] cards){
		
		return false;
	}
	public int havePair(int[] cards){
		return 0;
	}
	public int maxMulti(int[] cards){
		return 0;
	}
}
