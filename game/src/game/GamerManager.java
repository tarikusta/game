package game;

public class GamerManager implements GamerServices  {

public void add(Gamers gamer) {
	
	System.out.println("Oyuncu eklendi : " + gamer.getFirstName());
} 
	public void update(Gamers gamer) {
		System.out.println("Oyuncu g�ncellendi : " + gamer.getFirstName());
	
}
	@Override
	public void delete(Gamers gamer) {
		System.out.println("Oyuncu kald�r�ld� : " + gamer.getFirstName() );
		
	}

}
