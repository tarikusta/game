package game;

public class GameManager implements GameServices{
public void add(Game game) {
	System.out.println("Oyun eklendi : " + game.getGameName());
} 
	public void update(Game game) {
		System.out.println("Oyun güncellendi : " + game.getGameName());
	
}
	
	public void remove(Game game) {
	System.out.println("Oyun kaldýrýldý : " + game.getGameName() );
}
	@Override
	public void sell(Game game) {
		System.out.println( game.getGameName()+"oyunu baþarýyla alýndý");
		
	}


}

