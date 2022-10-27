
package fr.nozyxandkamejiro.nywenmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import fr.nozyxandkamejiro.nywenmod.itemgroup.NywenModItemItemGroup;
import fr.nozyxandkamejiro.nywenmod.NywenmodModElements;

@NywenmodModElements.ModElement.Tag
public class NywenSwordItem extends NywenmodModElements.ModElement {
	@ObjectHolder("nywenmod:nywen_sword")
	public static final Item block = null;

	public NywenSwordItem(NywenmodModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3031;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 9f;
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
		}, 3, -3.8f, new Item.Properties().group(NywenModItemItemGroup.tab)) {
		}.setRegistryName("nywen_sword"));
	}
}
