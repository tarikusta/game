package game;

public class CampaignManager implements CampaignServices {

	@Override
	public void add(Campaign campaign, Game game) {
		System.out.println(game.getGameName()+" ürününde yeni bir kampanya var" );
		
	}

	@Override
	public void delete(Campaign campaign, Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName()+" ürününün kampanyasý sona erdi" );
	}

	@Override
	public void update(Campaign campaign, Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName()+" ürününün kampanyasýndaki deðiþikliklere bir göz at" );
	}

	

}
