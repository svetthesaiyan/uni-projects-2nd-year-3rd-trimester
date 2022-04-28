package pu.fmi.cowbull;

import java.util.ArrayList;
import java.util.List;

public class GameInfo
{
	String gameId;
	private int[] number;
	List<TryInfo> history=new ArrayList<TryInfo>();

	public String getGameId() {return gameId;}
	public void   setGameId(String 	  gameId) {this.gameId=gameId;}

	public int[] getNumber() {return number;}
	public void  setNumber(int[] 	 number) {this.number=number;}

	public List<TryInfo> getHistory() {return 	  history;}
	public void 		 setHistory(List<TryInfo> history) {this.history=history;}
}
