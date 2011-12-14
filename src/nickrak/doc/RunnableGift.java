package nickrak.doc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class RunnableGift implements Runnable
{
	private final Gift g;
	private final int count;
	private final String playerName;
	
	public RunnableGift(final Gift g, final int count, final String player)
	{
		this.g = g;
		this.count = count;
		this.playerName = player;
	}
	
	@Override
	public void run()
	{
		this.g.giveGiftNow(Bukkit.getPlayer(this.playerName), this.count);
		Bukkit.broadcastMessage(ChatColor.DARK_GREEN + String.format("On the %d%s day of Christmas, %s got %d %s", this.count,
				DaysOfChristmas.getOrdinalExtension(this.count), this.playerName, this.count, this.g.getName()));
		DaysOfChristmas.instance.playerGifted(this.playerName, this.g, this.count);
	}
}
