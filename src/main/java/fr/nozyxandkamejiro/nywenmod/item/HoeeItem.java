
package fr.nozyxandkamejiro.nywenmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import fr.nozyxandkamejiro.nywenmod.itemgroup.NywenModItemItemGroup;
import fr.nozyxandkamejiro.nywenmod.NywenmodModElements;

@NywenmodModElements.ModElement.Tag
public class HoeeItem extends NywenmodModElements.ModElement {
	@ObjectHolder("nywenmod:hoee")
	public static final Item block = null;

	public HoeeItem(NywenmodModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 3031;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 18;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NywenIngotItem.block));
			}
		}, 0, -3f, new Item.Properties().group(NywenModItemItemGroup.tab)) {
		}.setRegistryName("hoee"));
	}
}
