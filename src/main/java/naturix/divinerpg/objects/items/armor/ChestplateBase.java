package naturix.divinerpg.objects.items.armor;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.objects.items.ArmorBase;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ChestplateBase extends ArmorBase {

	private String name, textname;

	public ChestplateBase(String name, ArmorMaterial material, String textname) {
		super(material, EntityEquipmentSlot.CHEST, name);
		this.textname = textname;
		this.name = name;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return "divinerpg:textures/models/armor/" + textname + ".png";
	}

	@Override
	public int getMaxDamage() {
		return 2010;
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.RARE;
	}

	@Override
	public boolean isDamageable() {
		return true;
	}

	public void registerItemModel() {
		DivineRPG.proxy.registerItemRenderer(this, 0, name);

	}

}