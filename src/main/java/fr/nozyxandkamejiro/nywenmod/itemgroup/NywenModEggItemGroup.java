
package fr.nozyxandkamejiro.nywenmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import fr.nozyxandkamejiro.nywenmod.NywenmodModElements;

@NywenmodModElements.ModElement.Tag
public class NywenModEggItemGroup extends NywenmodModElements.ModElement {
	public NywenModEggItemGroup(NywenmodModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnywen_mod_egg") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.ZOGLIN_SPAWN_EGG);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
