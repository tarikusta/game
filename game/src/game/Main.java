package game;


public class Main {

	public static void main(String[] args) {
	
		
		Game game = new Game();
		game.setId(1);
		game.setGameName("CSGO");
		

		GameManager gameManager = new GameManager();
		gameManager.add(game);
		System.out.println("-------------------");
		gameManager.remove(game);
		System.out.println("-------------------");
		gameManager.update(game);
		System.out.println("-------------------");
		gameManager.sell(game); 
		System.out.println("-------------------");
		
        
		Gamers gamer = new Gamers();
		gamer.setNationalId("1596874326");
		gamer.setBirthday("25/05/1978");
		gamer.setFirstName("tarik");
		gamer.setLastName("usta");

		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer);
		System.out.println("-------------------");
		gamerManager.delete(gamer);
		System.out.println("-------------------");
		gamerManager.update(gamer);
		System.out.println("-------------------");
		
		


		Campaign campaign = new Campaign();
		campaign.setUnitPrice(8000);
		campaign.setName(" Black Friday discount");
		campaign.setDiscount(10);
		System.out.println(campaign.getAfterDiscountPrice());
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign, game);
		System.out.println("-------------------");
		campaignManager.delete(campaign,game);
		System.out.println("-------------------");
		campaignManager.update(campaign,game);
		System.out.println("-------------------");

	}
}
