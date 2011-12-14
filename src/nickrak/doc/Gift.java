package nickrak.doc;

import org.bukkit.entity.Player;

public interface Gift
{
	public void giveGiftNow(final Player p, final int count);
	public String getName();
}
