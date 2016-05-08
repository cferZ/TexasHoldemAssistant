package pokerWins;

import java.util.List;

public class mainInterface {
	public static void main(String[] args){
		String[] hands={"As","Ah"};
		int[] handsCode=Translator.translate(hands);
		Checker checker=new Checker(handsCode);
		MyPoker mp=checker.check(handsCode);
		List<MyPoker> biggerList=Searcher.findBigger(mp);
		Calculator cal=new Calculator(5);
		double winP=cal.calculateP(mp);
		System.out.println(winP);
	}
}
