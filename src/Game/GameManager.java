package Game;

public class GameManager implements GameService {

	@Override
	public void addGame(Game game) {
		System.out.println("new game added");

	}

	@Override
	public void deleteGama(Game game) {
		System.out.println("game delete");
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("game update");
	}

}
