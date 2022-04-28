package pu.fmi.cowbull;

import java.util.Random;
import java.util.UUID;

public class GameServiceImpl implements GameService
{
	@Override
	public GameInfo startGame()
	{
		var gameInfo=new GameInfo();
		gameInfo.setGameId(UUID.randomUUID().toString());

		var random=new Random();
		var number=new int[4];
		
		for(int i=0; i<4; i++)
			number[i]=random.nextInt(9);

		gameInfo.setNumber(number);
		return gameInfo;
	}

	@Override
	public GameInfo getGame(String gameId) 				{return null;}
	@Override
	public GameInfo makeTry(String gameId, int[] guess) {return null;}
}
