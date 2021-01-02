
public class Shop {

	User u;
	
	
	public Shop()
	{}
	
	public void purchaseRevive(User u)
	{
		if(u.gold < 50)
		{
			System.out.println("Not enough gold");
		}
		else
		{
			u.revive=true;
			u.gold=u.gold-50;
		}
	}
	public void purchaseGhost(User u)
	{
		if(u.gold < 70)
		{
			System.out.println("Not enough gold");
		}
		else
		{
			u.ghost=true;
			u.gold=u.gold-70;
		}
	}
}
