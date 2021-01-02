
public class User {
	private String username;
	private String password;
	public int gold;
	boolean revive=false;
	boolean ghost=true;


public User(String u, String p)
{
	this.username=u;
	this.password=p;
	this.gold=0;
}
public int GetGold()
{
return this.gold;
}	
}
