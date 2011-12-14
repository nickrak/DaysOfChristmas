package nickrak.doc;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemGift implements Gift
{
	private final Material mat;
	
	public ItemGift(final Material mat)
	{
		this.mat = mat;
	}

	@Override
	public void giveGiftNow(Player p, int count)
	{
		final ItemStack stack = new ItemStack(this.mat, count);
		p.getInventory().addItem(stack);
	}

	@Override
	public String getName()
	{
		return this.mat.name();
	}
}
