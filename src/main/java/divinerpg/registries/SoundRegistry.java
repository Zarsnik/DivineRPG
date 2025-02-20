package divinerpg.registries;

import divinerpg.DivineRPG;
import net.minecraft.util.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.*;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = DivineRPG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder("divinerpg")
public class SoundRegistry {

    private static final ArrayList<SoundEvent> SOUND_EVENTS = new ArrayList<SoundEvent>();

    public static final SoundEvent ACID_HAG = createEvent("acid_hag");
    public static final SoundEvent ACID_HAG_HURT = createEvent("acid_hag_hurt");
    public static final SoundEvent ALICANTO = createEvent("alicanto");
    public static final SoundEvent ALICANTO_HURT = createEvent("alicanto_hurt");
    public static final SoundEvent ARCANIUM_SABER = createEvent("arcanium_saber");
    public static final SoundEvent ARCHER = createEvent("archer");
    public static final SoundEvent ARID_WARRIOR = createEvent("arid_warrior");
    public static final SoundEvent ARID_WARRIOR_HURT = createEvent("arid_warrior_hurt");
    public static final SoundEvent AYERACO = createEvent("ayeraco");
    public static final SoundEvent AYERACO_HALF_HEALTH = createEvent("ayeraco_half_health");
    public static final SoundEvent AYERACO_HURT = createEvent("ayeraco_hurt");
    public static final SoundEvent AYERACO_PILLAR = createEvent("ayeraco_pillar");
    public static final SoundEvent AYERACO_SPAWN = createEvent("ayeraco_spawn");
    public static final SoundEvent AYERACO_TELEPORT = createEvent("ayeraco_teleport");
    public static final SoundEvent BIPHRON = createEvent("biphron");
    public static final SoundEvent BIPHRON_HURT = createEvent("biphron_hurt");
    public static final SoundEvent BLITZ = createEvent("blitz");
    public static final SoundEvent BOHEMITE = createEvent("bohemite");
    public static final SoundEvent BOHEMITE_HURT = createEvent("bohemite_hurt");
    public static final SoundEvent BUNNY = createEvent("bunny");
    public static final SoundEvent BUNNY_HURT = createEvent("bunny_hurt");
    public static final SoundEvent CADILLION = createEvent("cadillion");
    public static final SoundEvent CEILING_EXPLOSIONS = createEvent("ceiling_explosions");
    public static final SoundEvent CONSTRUCTOR_HURT = createEvent("constructor_hurt");
    public static final SoundEvent CONSTRUCTOR_PUNCH = createEvent("constructor_punch");
    public static final SoundEvent CORI = createEvent("cori");
    public static final SoundEvent CORI_HURT = createEvent("cori_hurt");
    public static final SoundEvent CORI_IDLE = createEvent("cori_idle");
    public static final SoundEvent CORI_SHOOT = createEvent("cori_shoot");
    public static final SoundEvent CRAB = createEvent("crab");
    public static final SoundEvent CRAB_HURT = createEvent("crab_hurt");
    public static final SoundEvent CRAWLER = createEvent("crawler");
    public static final SoundEvent CRAWLER_HURT = createEvent("crawler_hurt");
    public static final SoundEvent CROAK = createEvent("croak");
    public static final SoundEvent CYCLOPS = createEvent("cyclops");
    public static final SoundEvent CYCLOPS_HURT = createEvent("cyclops_hurt");
    public static final SoundEvent CYMESOID = createEvent("cymesoid");
    public static final SoundEvent CYMESOID_HURT = createEvent("cymesoid_hurt");
    public static final SoundEvent DEATHCRYX = createEvent("deathcryx");
    public static final SoundEvent DEATHCRYX_HURT = createEvent("deathcryx_hurt");
    public static final SoundEvent DEATH_HOUND = createEvent("death_hound");
    public static final SoundEvent DEATH_HOUND_HURT = createEvent("death_hound_hurt");
    public static final SoundEvent DEEP_LAUGH = createEvent("deep_laugh");
    public static final SoundEvent DEMON_OF_DARKNESS = createEvent("demon_of_darkness");
    public static final SoundEvent DENSOS = createEvent("densos");
    public static final SoundEvent DENSOS_HURT = createEvent("densos_hurt");
    public static final SoundEvent DISSIMENT = createEvent("dissiment");
    public static final SoundEvent DISSIMENT_HURT = createEvent("dissiment_hurt");
    public static final SoundEvent DIVINE_ACCUMULATOR = createEvent("divine_accumulator");
    public static final SoundEvent DRAMCRYX = createEvent("dramcryx");
    public static final SoundEvent DRAMCRYX_HURT = createEvent("dramcryx_hurt");
    public static final SoundEvent DRAMIX = createEvent("dramix");
    public static final SoundEvent DRAMIX_HURT = createEvent("dramix_hurt");
    public static final SoundEvent DREAMWRECKER = createEvent("dream_wrecker");
    public static final SoundEvent DREAMWRECKER_HURT = createEvent("dream_wrecker_hurt");
    public static final SoundEvent DUNGEON_PRISONER = createEvent("dungeon_prisoner");
    public static final SoundEvent DUNGEON_PRISONER_CHANGE = createEvent("dungeon_prisoner_change");
    public static final SoundEvent DUNGEON_PRISONER_HURT = createEvent("dungeon_prisoner_hurt");
    public static final SoundEvent DUO = createEvent("duo");
    public static final SoundEvent DUO_HURT = createEvent("duo_hurt");
    public static final SoundEvent ENDIKU = createEvent("endiku");
    public static final SoundEvent ENDIKU_HURT = createEvent("endiku_hurt");
    public static final SoundEvent ENT = createEvent("ent");
    public static final SoundEvent ENT_HURT = createEvent("ent_hurt");
    public static final SoundEvent EXPLOSIONS = createEvent("explosions");
    public static final SoundEvent FEEL_SOUL_ARKSIANE = createEvent("feel_soul_arksiane");
    public static final SoundEvent FIREFLY = createEvent("firefly");
    public static final SoundEvent FRACTITE = createEvent("fractite");
    public static final SoundEvent FRACTITE_ATTACK = createEvent("fractite_attack");
    public static final SoundEvent FRACTITE_CANNON = createEvent("fractite_cannon");
    public static final SoundEvent FRACTITE_HURT = createEvent("fractite_hurt");
    public static final SoundEvent FROST = createEvent("frost");
    public static final SoundEvent FROSTCLAW_CANNON = createEvent("frostclaw_cannon");
    public static final SoundEvent FROSTY = createEvent("frosty");
    public static final SoundEvent FROSTY_HURT = createEvent("frosty_hurt");
    public static final SoundEvent FROST_CANNON = createEvent("frost_cannon");
    public static final SoundEvent GALROID = createEvent("galroid");
    public static final SoundEvent GALROID_HURT = createEvent("galroid_hurt");
    public static final SoundEvent GHAST_CANNON = createEvent("ghast_cannon");
    public static final SoundEvent GLACIDE = createEvent("glacide");
    public static final SoundEvent GLACIDE_HURT = createEvent("glacide_hurt");
    public static final SoundEvent GOLEM = createEvent("golem");
    public static final SoundEvent GORGOSION = createEvent("gorgosion");
    public static final SoundEvent GORGOSION_HURT = createEvent("gorgosion_hurt");
    public static final SoundEvent GRIZZLE = createEvent("grizzle");
    public static final SoundEvent GRIZZLE_HURT = createEvent("grizzle_hurt");
    public static final SoundEvent GROWL = createEvent("growl");
    public static final SoundEvent GROWL_HURT = createEvent("growl_hurt");
    public static final SoundEvent HASTREUS = createEvent("hastreus");
    public static final SoundEvent HASTREUS_HURT = createEvent("hastreus_hurt");
    public static final SoundEvent HEAL = createEvent("heal");
    public static final SoundEvent HELIO = createEvent("helio");
    public static final SoundEvent HELIO_HURT = createEvent("helio_hurt");
    public static final SoundEvent HELL_SPIDER = createEvent("hell_spider");
    public static final SoundEvent HERBOMANCER = createEvent("herbomancer");
    public static final SoundEvent HERBOMANCER_HURT = createEvent("herbomancer_hurt");
    public static final SoundEvent HIGH_HIT = createEvent("high_hit");
    public static final SoundEvent HISS = createEvent("hiss");
    public static final SoundEvent HIVE_QUEEN = createEvent("hive_queen");
    public static final SoundEvent HIVE_QUEEN_HURT = createEvent("hive_queen_hurt");
    public static final SoundEvent HOVER_STINGER = createEvent("hover_stinger");
    public static final SoundEvent HOVER_STINGER_HURT = createEvent("hover_stinger_hurt");
    public static final SoundEvent ICEMAN = createEvent("iceman");
    public static final SoundEvent ICEMAN_HURT = createEvent("iceman_hurt");
    public static final SoundEvent INSECT = createEvent("insect");
    public static final SoundEvent JACKOMAN = createEvent("jackoman");
    public static final SoundEvent JUNGLE_SPIDER = createEvent("jungle_spider");
    public static final SoundEvent KAROS_INTRO = createEvent("karos_intro");
    public static final SoundEvent KAROS_LAUGH = createEvent("karos_laugh");
    public static final SoundEvent KAZROTIC = createEvent("kazrotic");
    public static final SoundEvent KAZROTIC_HURT = createEvent("kazrotic_hurt");
    public static final SoundEvent KING_OF_SCORCHERS = createEvent("king_of_scorchers");
    public static final SoundEvent KING_OF_SCORCHERS_HURT = createEvent("king_of_scorchers_hurt");
    public static final SoundEvent KOBBLIN = createEvent("kobblin");
    public static final SoundEvent LADY_LUNA = createEvent("lady_luna");
    public static final SoundEvent LADY_LUNA_HURT = createEvent("lady_luna_hurt");
    public static final SoundEvent LA_VEKOR = createEvent("la_vekor");
    public static final SoundEvent LHEIVA = createEvent("lheiva");
    public static final SoundEvent LHEIVA_HURT = createEvent("lheiva_hurt");
    public static final SoundEvent LIOPLEURODON = createEvent("liopleurodon");
    public static final SoundEvent LIOPLEURODON_HURT = createEvent("liopleurodon_hurt");
    public static final SoundEvent LIVESTOCK_MERCHANT = createEvent("livestock_merchant");
    public static final SoundEvent LIVESTOCK_MERCHANT_HURT = createEvent("livestock_merchant_hurt");
    public static final SoundEvent LORGA = createEvent("lorga");
    public static final SoundEvent LORGA_HURT = createEvent("lorga_hurt");
    public static final SoundEvent LORGAFLIGHT = createEvent("lorga_flight");
    public static final SoundEvent LORGAFLIGHT_HURT = createEvent("lorga_flight_hurt");
    public static final SoundEvent MADIVEL = createEvent("madivel");
    public static final SoundEvent MADIVEL_HURT = createEvent("madivel_hurt");
    public static final SoundEvent MAGE_FIRE = createEvent("mage_fire");
    public static final SoundEvent MANDRAGORA = createEvent("mandragora");
    public static final SoundEvent MEET_DOOM = createEvent("meet_doom");
    public static final SoundEvent MEGALITH = createEvent("megalith");
    public static final SoundEvent MEGALITH_HURT = createEvent("megalith_hurt");
    public static final SoundEvent MUCKY = createEvent("mucky");
    public static final SoundEvent NESRO = createEvent("nesro");
    public static final SoundEvent NESRO_HURT = createEvent("nesro_hurt");
    public static final SoundEvent NOBODY_CAN_DEFEAT = createEvent("nobody_can_defeat");
    public static final SoundEvent PARASECTA = createEvent("parasecta");
    public static final SoundEvent PARASECTA_HURT = createEvent("parasecta_hurt");
    public static final SoundEvent PHASER = createEvent("phaser");
    public static final SoundEvent QUADRO_DIE_BEFORE = createEvent("quadro_die_before");
    public static final SoundEvent QUADRO_ENOUGH = createEvent("quadro_enough");
    public static final SoundEvent QUADRO_INCOMING_PUNCH = createEvent("quadro_incoming_punch");
    public static final SoundEvent QUADRO_IS_NEXT = createEvent("quadro_is_next");
    public static final SoundEvent QUADRO_KILL_MINE = createEvent("quadro_kill_mine");
    public static final SoundEvent QUADRO_MY_KILL = createEvent("quadro_my_kill");
    public static final SoundEvent QUADRO_NO_DIE = createEvent("quadro_no_die");
    public static final SoundEvent QUADRO_SIT_DOWN = createEvent("quadro_sit_down");
    public static final SoundEvent QUADRO_TASTE_FIST = createEvent("quadro_taste_fist");
    public static final SoundEvent RAGLOK_AVENGE = createEvent("raglok_avenge");
    public static final SoundEvent RAGLOK_AWAKEN = createEvent("raglok_awaken");
    public static final SoundEvent RAGLOK_DARK = createEvent("raglok_dark");
    public static final SoundEvent RAGLOK_GUARDIAN = createEvent("raglok_guardian");
    public static final SoundEvent RAGLOK_NOTHING = createEvent("raglok_nothing");
    public static final SoundEvent RAGLOK_RAIN = createEvent("raglok_rain");
    public static final SoundEvent RAINBOUR = createEvent("rainbour");
    public static final SoundEvent RAINBOUR_HURT = createEvent("rainbour_hurt");
    public static final SoundEvent RAZORBACK = createEvent("razorback");
    public static final SoundEvent RAZORBACK_HURT = createEvent("razorback_hurt");
    public static final SoundEvent REFLECTOR = createEvent("reflector");
    public static final SoundEvent REYVOR = createEvent("reyvor");
    public static final SoundEvent REYVOR_HURT = createEvent("reyvor_hurt");
    public static final SoundEvent ROAMER = createEvent("roamer");
    public static final SoundEvent ROAMER_HURT = createEvent("roamer_hurt");
    public static final SoundEvent ROAR = createEvent("roar");
    public static final SoundEvent ROLLUM = createEvent("rollum");
    public static final SoundEvent ROLLUM_HURT = createEvent("rollum_hurt");
    public static final SoundEvent ROTATICK = createEvent("rotatick");
    public static final SoundEvent ROTATICK_HURT = createEvent("rotatick_hurt");
    public static final SoundEvent SAGUARO_WORM = createEvent("saguaro_worm");
    public static final SoundEvent SCORCHER = createEvent("scorcher");
    public static final SoundEvent SERENADE = createEvent("serenade");
    public static final SoundEvent SHADAHIER = createEvent("shadahier");
    public static final SoundEvent SHADAHIER_HURT = createEvent("shadahier_hurt");
    public static final SoundEvent SHADOW_SABER = createEvent("shadow_saber");
    public static final SoundEvent SHARK = createEvent("shark");
    public static final SoundEvent SHARK_HURT = createEvent("shark_hurt");
    public static final SoundEvent SOUND_OF_CAROLS = createEvent("sound_of_carols");
    public static final SoundEvent SOUND_OF_MUSIC = createEvent("sound_of_music");
    public static final SoundEvent SPARKLER = createEvent("sparkler");
    public static final SoundEvent STAFF = createEvent("staff");
    public static final SoundEvent STARLIGHT = createEvent("starlight");
    public static final SoundEvent STOP_AT_ONCE = createEvent("stop_at_once");
    public static final SoundEvent THE_EYE = createEvent("the_eye");
    public static final SoundEvent THE_EYE_HURT = createEvent("the_eye_hurt");
    public static final SoundEvent TOCAXIN = createEvent("tocaxin");
    public static final SoundEvent TOCAXIN_HURT = createEvent("tocaxin_hurt");
    public static final SoundEvent TRY_YOUR_BEST = createEvent("try_your_best");
    public static final SoundEvent VEREK = createEvent("verek");
    public static final SoundEvent VEREK_HURT = createEvent("verek_hurt");
    public static final SoundEvent VERMENOUS = createEvent("vermenous");
    public static final SoundEvent VERMENOUS_HURT = createEvent("vermenous_hurt");
    public static final SoundEvent VETHEA_BOW = createEvent("vethea_bow");
    public static final SoundEvent VHRAAK = createEvent("vhraak");
    public static final SoundEvent VHRAAK_HURT = createEvent("vhraak_hurt");
    public static final SoundEvent WHALE = createEvent("whale");
    public static final SoundEvent WHALE_HURT = createEvent("whale_hurt");
    public static final SoundEvent WILDFIRE = createEvent("wildfire");
    public static final SoundEvent WILDFIRE_HURT = createEvent("wildfire_hurt");
    public static final SoundEvent WRAITH = createEvent("wraith");
    public static final SoundEvent WRAITH_HURT = createEvent("wraith_hurt");
    public static final SoundEvent WRECK_INTRO = createEvent("wreck_intro");
    public static final SoundEvent WRECK_SPEED = createEvent("wreck_speed");
    public static final SoundEvent WRECK_STRENGTH = createEvent("wreck_strength");
    public static final SoundEvent YOU_CANT_KILL_ME = createEvent("you_cant_kill_me");
    public static final SoundEvent ZONE = createEvent("zone");
    public static final SoundEvent ZONE_HURT = createEvent("zone_hurt");
    public static final SoundEvent ZORAGON = createEvent("zoragon");
    public static final SoundEvent ZORAGON_HURT = createEvent("zoragon_hurt");

    public static final SoundEvent ICEIKA_MUSIC = createEvent("iceika_music");

    private static SoundEvent createEvent(String sound) {
        ResourceLocation soundLocation = new ResourceLocation(DivineRPG.MODID, sound);
        SoundEvent event = new SoundEvent(soundLocation).setRegistryName(soundLocation);
        SOUND_EVENTS.add(event);
        return event;
    }

    @SubscribeEvent
    public static void registerSounds(RegistryEvent.Register<SoundEvent> evt) {
        IForgeRegistry<SoundEvent> registry = evt.getRegistry();
        for (SoundEvent event : SOUND_EVENTS) {
            registry.register(event);
        }
    }
}