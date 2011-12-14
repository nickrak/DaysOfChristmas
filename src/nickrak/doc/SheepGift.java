package nickrak.doc;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;

public class SheepGift implements Gift
{
	private final DyeColor color;

	public SheepGift(final DyeColor color)
	{
		this.color = color;
	}

	@Override
	public void giveGiftNow(Player p, int count)
	{
		final Location l = p.getLocation();
		final World w = l.getWorld();

		for (int i = 0; i < count; i++)
		{
			final LivingEntity le = w.spawnCreature(l, CreatureType.SHEEP);
			final Sheep sheep = (Sheep) le;
			sheep.setColor(this.color);
		}
	}

	@Override
	public String getName()
	{
		return this.color.name() + " Sheep";
	}

}
