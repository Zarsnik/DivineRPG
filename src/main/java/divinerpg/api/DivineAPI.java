package divinerpg.api;

import divinerpg.api.arcana.IArcana;
import divinerpg.api.armor.cap.ArmorProvider;
import divinerpg.api.armor.cap.IArmorPowers;
import divinerpg.api.armor.registry.IArmorDescription;
import divinerpg.api.armorNew.MainArmorEvents;
import divinerpg.api.armorNew.interfaces.IPoweredArmor;
import divinerpg.utils.attributes.IReflectionHelper;
import divinerpg.utils.attributes.ReflectionHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryManager;

import javax.annotation.Nullable;

import static divinerpg.api.arcana.ArcanaProvider.ARCANA_CAP;

/**
 * Main API class.
 */
public class DivineAPI {
    /**
     * Reflection helper working with obfuscated code
     */
    public final static IReflectionHelper reflectionHelper = new ReflectionHelper();

    /**
     * Contains all possible power sets data
     * Will be deleted soon
     */
    @Deprecated
    public static IForgeRegistry<IPoweredArmor> getPowerSetRegistry() {
        return RegistryManager.ACTIVE.getRegistry(IPoweredArmor.class);
    }


    public static IForgeRegistry<IArmorDescription> getArmorDescriptionRegistry() {
        return RegistryManager.ACTIVE.getRegistry(IArmorDescription.class);
    }

    /**
     * Gets the arcana capability
     *
     * @param entity - any entity, but we are using player
     * @return - IArcana capability
     */
    public static IArcana getArcana(Entity entity) {
        return entity.getCapability(ARCANA_CAP, null);
    }

    /**
     * Gets armor capability
     *
     * @param entity
     * @return
     */
    @Nullable
    public static IArmorPowers getArmorPowers(Entity entity) {
        if (entity == null)
            return null;

        return entity.getCapability(ArmorProvider.ArmorCapability, null);
    }

    /**
     * Checks if player wears that type of armor
     *
     * @param entity - player
     * @param id     - ID of powered armor set
     */
    public static boolean isOn(Entity entity, ResourceLocation id) {
        if (id == null || !(entity instanceof EntityPlayer))
            return false;

        return MainArmorEvents.findPlayerArmorObserver((EntityPlayer) entity).isOn(id);
    }
}
