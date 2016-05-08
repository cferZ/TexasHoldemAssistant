package pokerWins;

public class Translator {
	public static int[] translate(String[] cards){
		int[] cardCode=new int[cards.length];
		for(int i=0;i<cards.length;i++){
			cardCode[i]=getCardCode(cards[i]);
		}
		return cardCode;
	}
	public static int getCardCode(String card){
		int code=0;
		if(card.length()!=2){
			System.out.println("unrecognized card");
			return -1;
		}
		switch(card.charAt(1)){
		case 'c':code=0;break;
		case 'h':code=2;break;
		case 's':code=3;break;
		case 'd':code=1;break;
		default:
			System.out.println("unknow flowers");
			return -1;
		}
		code*=13;//花色基准
		switch(card.charAt(0)){
		case 'A':code+=12;
		case 'T':code+=8;
		case 'J':code+=9;
		case 'Q':code+=10;
		case 'K':code+=11;
		default:
			try{
			code+=Integer.parseInt(card.substring(0, 1));
			}catch(Exception e){
				System.out.println("unrecognized card number");
			}
			code-=2;
		}
		return code;
	}
}
