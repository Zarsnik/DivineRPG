package divinerpg.registries;

import divinerpg.client.particle.*;
import net.minecraft.client.*;
import net.minecraft.particles.*;
import net.minecraftforge.api.distmarker.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.registries.*;

import static divinerpg.DivineRPG.MODID;


@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ParticleRegistry {
    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MODID);

    public static final RegistryObject<BasicParticleType> APALACHIA_PORTAL = PARTICLES.register("apalachia_portal", () -> new BasicParticleType(false));
    public static final RegistryObject<BasicParticleType> EDEN_PORTAL = PARTICLES.register("eden_portal", () -> new BasicParticleType(false));
    public static final RegistryObject<BasicParticleType> MORTUM_PORTAL = PARTICLES.register("mortum_portal", () -> new BasicParticleType(false));
    public static final RegistryObject<BasicParticleType> SKYTHERN_PORTAL = PARTICLES.register("skythern_portal", () -> new BasicParticleType(false));
    public static final RegistryObject<BasicParticleType> WILDWOOD_PORTAL = PARTICLES.register("wildwood_portal", () -> new BasicParticleType(false));
    public static final RegistryObject<BasicParticleType> GREEN_PORTAL = PARTICLES.register("green_portal", () -> new BasicParticleType(false));
    public static final RegistryObject<BasicParticleType> BLACK_FLAME = PARTICLES.register("black_flame", () -> new BasicParticleType(false));
    public static final RegistryObject<BasicParticleType> BLUE_FLAME = PARTICLES.register("blue_flame", () -> new BasicParticleType(false));
    public static final RegistryObject<BasicParticleType> GREEN_FLAME = PARTICLES.register("green_flame", () -> new BasicParticleType(false));
    public static final RegistryObject<BasicParticleType> PURPLE_FLAME = PARTICLES.register("purple_flame", () -> new BasicParticleType(false));
    public static final RegistryObject<BasicParticleType> FROST = PARTICLES.register("frost", () -> new BasicParticleType(false));
    public static final RegistryObject<BasicParticleType> SPARKLER = PARTICLES.register("sparkler", () -> new BasicParticleType(false));
    public static final RegistryObject<BasicParticleType> ENDER_TRIPLETS = PARTICLES.register("ender_triplets", () -> new BasicParticleType(false));
    //TODO - add tar particle to tar
    public static final RegistryObject<BasicParticleType> TAR = PARTICLES.register("tar", () -> new BasicParticleType(false));

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void registerParticleFactories(ParticleFactoryRegisterEvent event) {
        //TODO - particles need custom classes
        //https://github.com/DivineRPG/DivineRPG/tree/1.12.2/src/main/java/divinerpg/particle
        Minecraft.getInstance().particleEngine.register(APALACHIA_PORTAL.get(), ParticleApalachiaPortal.Factory::new);
        Minecraft.getInstance().particleEngine.register(EDEN_PORTAL.get(), ParticleSparkler.Factory::new);
        Minecraft.getInstance().particleEngine.register(MORTUM_PORTAL.get(), ParticleSparkler.Factory::new);
        Minecraft.getInstance().particleEngine.register(SKYTHERN_PORTAL.get(), ParticleSkythernPortal.Factory::new);
        Minecraft.getInstance().particleEngine.register(WILDWOOD_PORTAL.get(), ParticleSparkler.Factory::new);
        Minecraft.getInstance().particleEngine.register(GREEN_PORTAL.get(), ParticleSparkler.Factory::new);
        Minecraft.getInstance().particleEngine.register(BLACK_FLAME.get(), ParticleSparkler.Factory::new);
        Minecraft.getInstance().particleEngine.register(BLUE_FLAME.get(), ParticleSparkler.Factory::new);
        Minecraft.getInstance().particleEngine.register(GREEN_FLAME.get(), ParticleSparkler.Factory::new);
        Minecraft.getInstance().particleEngine.register(PURPLE_FLAME.get(), ParticleSparkler.Factory::new);
        Minecraft.getInstance().particleEngine.register(FROST.get(), ParticleSparkler.Factory::new);
        Minecraft.getInstance().particleEngine.register(SPARKLER.get(), ParticleSparkler.Factory::new);
        Minecraft.getInstance().particleEngine.register(ENDER_TRIPLETS.get(), ParticleSparkler.Factory::new);
        Minecraft.getInstance().particleEngine.register(TAR.get(), ParticleTar.Factory::new);
    }
}
