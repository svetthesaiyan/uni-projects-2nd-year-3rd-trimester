package pu.fmi.cowbull;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class GameServiceImplTest {

	@Test
	void test() {
		var gameService = new GameServiceImpl();
		var gameInfo = gameService.startGame();
		assertNotNull(gameInfo);
		assertNotNull(gameInfo.getGameId());
		assertNotNull(gameInfo.getNumber());
		assertEquals(4, gameInfo.getNumber().length);
		assertEquals(0, gameInfo.getHistory().size());
	}

}
