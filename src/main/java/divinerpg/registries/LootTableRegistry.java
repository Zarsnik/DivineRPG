package divinerpg.registries;

import divinerpg.DivineRPG;
import com.google.common.collect.Sets;
import net.minecraft.util.ResourceLocation;

import java.util.*;

public class LootTableRegistry {

    private static final Set<ResourceLocation> LOOT_TABLES = Sets.newHashSet();
    private static final Set<ResourceLocation> READ_ONLY_LOOT_TABLES = Collections.unmodifiableSet(LOOT_TABLES);

    public static final ResourceLocation BANQUET_HALL_LOOT = registerTable("chests/arcana/banquet_hall_loot");
    public static final ResourceLocation UTILITY_HALLWAY_LOOT = registerTable("chests/arcana/utility_hallway_loot");

    public static final ResourceLocation ICEIKA_CHEST_DUNGEON = registerTable("chests/iceika/iceika_chest_dungeon");
    public static final ResourceLocation ICEIKA_CHEST_HUT = registerTable("chests/iceika/iceika_chest_hut");

    public static final ResourceLocation CRYPT_LOOT = registerTable("chests/vethea/crypt_loot");
    public static final ResourceLocation TEMPLE_LOOT_BOTTOM = registerTable("chests/vethea/temple_loot_bottom");
    public static final ResourceLocation TEMPLE_LOOT_MIDDLE = registerTable("chests/vethea/temple_loot_middle");
    public static final ResourceLocation TEMPLE_LOOT_TOP = registerTable("chests/vethea/temple_loot_top");
    public static final ResourceLocation QUADROTIC_POST_LOOT = registerTable("chests/vethea/quadrotic_post_loot");
    public static final ResourceLocation KAROS_MADHOUSE_LOOT = registerTable("chests/vethea/karos_madhouse_loot");
    public static final ResourceLocation RAGLOK_CHAMBER_LOOT = registerTable("chests/vethea/raglok_chamber_loot");
    public static final ResourceLocation WRECK_HALL_LOOT = registerTable("chests/vethea/wreck_hall_loot");

    public static final ResourceLocation ENTITIES_ARID_WARRIOR = registerTable("entities/vanilla/arid_warrior");
    public static final ResourceLocation ENTITIES_CAVECLOPS = registerTable("entities/vanilla/caveclops");
    public static final ResourceLocation ENTITIES_CAVE_CRAWLER = registerTable("entities/vanilla/cave_crawler");
    public static final ResourceLocation ENTITIES_CRAB = registerTable("entities/vanilla/crab");
    public static final ResourceLocation ENTITIES_CYCLOPS = registerTable("entities/vanilla/cyclops");
    public static final ResourceLocation ENTITIES_DESERT_CRAWLER = registerTable("entities/vanilla/desert_crawler");
    public static final ResourceLocation ENTITIES_ENTHRALLED_DRAMCRYX = registerTable("entities/vanilla/enthralled_dramcryx");
    public static final ResourceLocation ENTITIES_FROST = registerTable("entities/vanilla/frost");
    public static final ResourceLocation ENTITIES_GLACON = registerTable("entities/vanilla/glacon");
    public static final ResourceLocation ENTITIES_JUNGLE_BAT = registerTable("entities/vanilla/jungle_bat");
    public static final ResourceLocation ENTITIES_JUNGLE_DRAMCRYX = registerTable("entities/vanilla/jungle_dramcryx");
    public static final ResourceLocation ENTITIES_JUNGLE_SPIDER = registerTable("entities/vanilla/jungle_spider");
    public static final ResourceLocation ENTITIES_KING_CRAB = registerTable("entities/vanilla/king_crab");
    public static final ResourceLocation ENTITIES_KOBBLIN = registerTable("entities/vanilla/kobblin");
    public static final ResourceLocation ENTITIES_LIOPLEURODON = registerTable("entities/vanilla/liopleurodon");
    public static final ResourceLocation ENTITIES_MINER = registerTable("entities/vanilla/miner");
    public static final ResourceLocation ENTITIES_PUMPKIN_SPIDER = registerTable("entities/vanilla/pumpkin_spider");
    public static final ResourceLocation ENTITIES_RAINBOUR = registerTable("entities/vanilla/rainbour");
    public static final ResourceLocation ENTITIES_ROTATICK = registerTable("entities/vanilla/rotatick");
    public static final ResourceLocation ENTITIES_SAGUARO_WORM = registerTable("entities/vanilla/saguaro_worm");
    public static final ResourceLocation ENTITIES_SHARK = registerTable("entities/vanilla/shark");
    public static final ResourceLocation ENTITIES_THE_EYE = registerTable("entities/vanilla/the_eye");
    public static final ResourceLocation ENTITIES_THE_GRUE = registerTable("entities/vanilla/the_grue");
    public static final ResourceLocation ENTITIES_WHALE = registerTable("entities/vanilla/whale");

    public static final ResourceLocation ENTITIES_HELL_BAT = registerTable("entities/nether/hell_bat");
    public static final ResourceLocation ENTITIES_HELL_PIG = registerTable("entities/nether/hell_pig");
    public static final ResourceLocation ENTITIES_HELL_SPIDER = registerTable("entities/nether/hell_spider");
    public static final ResourceLocation ENTITIES_SCORCHER = registerTable("entities/nether/scorcher");
    public static final ResourceLocation ENTITIES_WILDFIRE = registerTable("entities/nether/wildfire");

    public static final ResourceLocation ENTITIES_ENDER_SPIDER = registerTable("entities/end/ender_spider");
    public static final ResourceLocation ENTITIES_ENDER_TRIPLETS = registerTable("entities/end/ender_triplets");
    public static final ResourceLocation ENTITIES_ENDER_WATCHER = registerTable("entities/end/ender_watcher");

    public static final ResourceLocation ENTITIES_BUNNY = registerTable("entities/eden/bunny");
    public static final ResourceLocation ENTITIES_EDEN_CADILLION = registerTable("entities/eden/eden_cadillion");
    public static final ResourceLocation ENTITIES_EDEN_TOMO = registerTable("entities/eden/eden_tomo");
    public static final ResourceLocation ENTITIES_GREENFEET = registerTable("entities/eden/greenfeet");
    public static final ResourceLocation ENTITIES_MADIVEL = registerTable("entities/eden/madivel");
    public static final ResourceLocation ENTITIES_SUN_ARCHER = registerTable("entities/eden/sun_archer");
    public static final ResourceLocation ENTITIES_WEAK_CORI = registerTable("entities/eden/weak_cori");

    public static final ResourceLocation ENTITIES_BEHEMOTH = registerTable("entities/wildwood/behemoth");
    public static final ResourceLocation ENTITIES_EPIPHITE = registerTable("entities/wildwood/epiphite");
    public static final ResourceLocation ENTITIES_MAGE = registerTable("entities/wildwood/mage");
    public static final ResourceLocation ENTITIES_MOON_WOLF = registerTable("entities/wildwood/moon_wolf");
    public static final ResourceLocation ENTITIES_TERMID = registerTable("entities/wildwood/termid");
    public static final ResourceLocation ENTITIES_VEREK = registerTable("entities/wildwood/verek");
    public static final ResourceLocation ENTITIES_WILDWOOD_CADILLION = registerTable("entities/wildwood/wildwood_cadillion");
    public static final ResourceLocation ENTITIES_WILDWOOD_GOLEM = registerTable("entities/wildwood/wildwood_golem");
    public static final ResourceLocation ENTITIES_WILDWOOD_TOMO = registerTable("entities/wildwood/wildwood_tomo");

    public static final ResourceLocation ENTITIES_APALACHIA_CADILLION = registerTable("entities/apalachia/apalachia_cadillion");
    public static final ResourceLocation ENTITIES_APALACHIA_GOLEM = registerTable("entities/apalachia/apalachia_golem");
    public static final ResourceLocation ENTITIES_APALACHIA_TOMO = registerTable("entities/apalachia/apalachia_tomo");
    public static final ResourceLocation ENTITIES_ENCHANTED_ARCHER = registerTable("entities/apalachia/enchanted_archer");
    public static final ResourceLocation ENTITIES_ENCHANTED_WARRIOR = registerTable("entities/apalachia/enchanted_warrior");
    public static final ResourceLocation ENTITIES_SPELLBINDER = registerTable("entities/apalachia/spellbinder");

    public static final ResourceLocation ENTITIES_ADVANCED_CORI = registerTable("entities/skythern/advanced_cori");
    public static final ResourceLocation ENTITIES_MEGALITH = registerTable("entities/skythern/megalith");
    public static final ResourceLocation ENTITIES_SAMEK = registerTable("entities/skythern/samek");
    public static final ResourceLocation ENTITIES_SKYTHERN_ARCHER = registerTable("entities/skythern/skythern_archer");
    public static final ResourceLocation ENTITIES_SKYTHERN_FIEND = registerTable("entities/skythern/skythern_fiend");
    public static final ResourceLocation ENTITIES_SKYTHERN_GOLEM = registerTable("entities/skythern/skythern_golem");

    public static final ResourceLocation ENTITIES_ANGRY_BUNNY = registerTable("entities/mortum/angry_bunny");
    public static final ResourceLocation ENTITIES_BASILISK = registerTable("entities/mortum/basilisk");
    public static final ResourceLocation ENTITIES_DEMON_OF_DARKNESS = registerTable("entities/mortum/demon_of_darkness");
    public static final ResourceLocation ENTITIES_MORTUM_CADILLION = registerTable("entities/mortum/mortum_cadillion");
    public static final ResourceLocation ENTITIES_MYSTIC = registerTable("entities/mortum/mystic");
    public static final ResourceLocation ENTITIES_SORCERER = registerTable("entities/mortum/sorcerer");
    public static final ResourceLocation ENTITIES_SOUL_SPIDER = registerTable("entities/mortum/soul_spider");
    public static final ResourceLocation ENTITIES_SOUL_STEALER = registerTable("entities/mortum/soul_stealer");
    public static final ResourceLocation ENTITIES_TWILIGHT_ARCHER = registerTable("entities/mortum/twilight_archer");

    public static final ResourceLocation ENTITIES_ALICANTO = registerTable("entities/iceika/alicanto");
    public static final ResourceLocation ENTITIES_FRACTITE = registerTable("entities/iceika/fractite");
    public static final ResourceLocation ENTITIES_FROST_ARCHER = registerTable("entities/iceika/frost_archer");
    public static final ResourceLocation ENTITIES_FROSTY = registerTable("entities/iceika/frosty");
    public static final ResourceLocation ENTITIES_GLACIDE = registerTable("entities/iceika/glacide");
    public static final ResourceLocation ENTITIES_HASTREUS = registerTable("entities/iceika/hastreus");
    public static final ResourceLocation ENTITIES_ROLLUM = registerTable("entities/iceika/rollum");

    public static final ResourceLocation ENTITIES_DEATHCRYX = registerTable("entities/arcana/deathcryx");
    public static final ResourceLocation ENTITIES_DEATH_HOUND = registerTable("entities/arcana/death_hound");
    public static final ResourceLocation ENTITIES_DUNGEON_CONSTRUCTOR = registerTable("entities/arcana/dungeon_constructor");
    public static final ResourceLocation ENTITIES_DUNGEON_DEMON = registerTable("entities/arcana/dungeon_demon");
    public static final ResourceLocation ENTITIES_DUNGEON_PRISONER = registerTable("entities/arcana/dungeon_prisoner");
    public static final ResourceLocation ENTITIES_LIVING_STATUE = registerTable("entities/arcana/living_statue");
    public static final ResourceLocation ENTITIES_RAZORBACK = registerTable("entities/arcana/razorback");
    public static final ResourceLocation ENTITIES_ROAMER = registerTable("entities/arcana/roamer");

    public static final ResourceLocation ENTITIES_ACID_HAG = registerTable("entities/vethea/acid_hag");
    public static final ResourceLocation ENTITIES_BIPHRON = registerTable("entities/vethea/biphron");
    public static final ResourceLocation ENTITIES_BOHEMITE = registerTable("entities/vethea/bohemite");
    public static final ResourceLocation ENTITIES_CYMESOID = registerTable("entities/vethea/cymesoid");
    public static final ResourceLocation ENTITIES_DISSIMENT = registerTable("entities/vethea/dissiment");
    public static final ResourceLocation ENTITIES_DREAMWRECKER = registerTable("entities/vethea/dreamwrecker");
    public static final ResourceLocation ENTITIES_DUO = registerTable("entities/vethea/duo");
    public static final ResourceLocation ENTITIES_ENT = registerTable("entities/vethea/ent");
    public static final ResourceLocation ENTITIES_FAKE_VHRAAK = registerTable("entities/vethea/fake_vhraak");
    public static final ResourceLocation ENTITIES_GALROID = registerTable("entities/vethea/galroid");
    public static final ResourceLocation ENTITIES_GORGOSION = registerTable("entities/vethea/gorgosion");
    public static final ResourceLocation ENTITIES_HELIO = registerTable("entities/vethea/helio");
    public static final ResourceLocation ENTITIES_HIVE_SOLDIER = registerTable("entities/vethea/hive_soldier");
    public static final ResourceLocation ENTITIES_HOVER_STINGER = registerTable("entities/vethea/hover_stinger");
    public static final ResourceLocation ENTITIES_KAZROTIC = registerTable("entities/vethea/kazrotic");
    public static final ResourceLocation ENTITIES_LHEIVA = registerTable("entities/vethea/lheiva");
    public static final ResourceLocation ENTITIES_LORGA = registerTable("entities/vethea/lorga");
    public static final ResourceLocation ENTITIES_LORGAFLIGHT = registerTable("entities/vethea/lorgaflight");
    public static final ResourceLocation ENTITIES_MANDRAGORA = registerTable("entities/vethea/mandragora");
    public static final ResourceLocation ENTITIES_SHADAHIER = registerTable("entities/vethea/shadahier");
    public static final ResourceLocation ENTITIES_TOCAXIN = registerTable("entities/vethea/tocaxin");
    public static final ResourceLocation ENTITIES_TWINS = registerTable("entities/vethea/twins");
    public static final ResourceLocation ENTITIES_VERMENOUS = registerTable("entities/vethea/vermenous");
    public static final ResourceLocation ENTITIES_VHRAAK = registerTable("entities/vethea/vhraak");
    public static final ResourceLocation ENTITIES_ZONE = registerTable("entities/vethea/zone");
    public static final ResourceLocation ENTITIES_ZORAGON = registerTable("entities/vethea/zoragon");

    public static final ResourceLocation ENTITIES_ANCIENT_ENTITY = registerTable("entities/boss/ancient_entity");
    public static final ResourceLocation ENTITIES_AYERACO_BLUE = registerTable("entities/boss/ayeraco_blue");
    public static final ResourceLocation ENTITIES_AYERACO_GREEN = registerTable("entities/boss/ayeraco_green");
    public static final ResourceLocation ENTITIES_AYERACO_PURPLE = registerTable("entities/boss/ayeraco_purple");
    public static final ResourceLocation ENTITIES_AYERACO_RED = registerTable("entities/boss/ayeraco_red");
    public static final ResourceLocation ENTITIES_AYERACO_YELLOW = registerTable("entities/boss/ayeraco_yellow");
    public static final ResourceLocation ENTITIES_DENSOS = registerTable("entities/boss/densos");
    public static final ResourceLocation ENTITIES_DRAMIX = registerTable("entities/boss/dramix");
    public static final ResourceLocation ENTITIES_ETERNAL_ARCHER = registerTable("entities/boss/eternal_archer");
    public static final ResourceLocation ENTITIES_EXPERIENCED_CORI = registerTable("entities/boss/experienced_cori");
    public static final ResourceLocation ENTITIES_HIVE_QUEEN = registerTable("entities/boss/hive_queen");
    public static final ResourceLocation ENTITIES_KAROS = registerTable("entities/boss/karos");
    public static final ResourceLocation ENTITIES_KAROT = registerTable("entities/boss/karot");
    public static final ResourceLocation ENTITIES_KING_OF_SCORCHERS = registerTable("entities/boss/king_of_scorchers");
    public static final ResourceLocation ENTITIES_LADY_LUNA = registerTable("entities/boss/lady_luna");
    public static final ResourceLocation ENTITIES_PARASECTA = registerTable("entities/boss/parasecta");
    public static final ResourceLocation ENTITIES_QUADRO = registerTable("entities/boss/quadro");
    public static final ResourceLocation ENTITIES_RAGLOK = registerTable("entities/boss/raglok");
    public static final ResourceLocation ENTITIES_REYVOR = registerTable("entities/boss/reyvor");
    public static final ResourceLocation ENTITIES_SOUL_FIEND = registerTable("entities/boss/soul_fiend");
    public static final ResourceLocation ENTITIES_SUNSTORM = registerTable("entities/boss/sunstorm");
    public static final ResourceLocation ENTITIES_TERMASECT = registerTable("entities/boss/termasect");
    public static final ResourceLocation ENTITIES_THE_WATCHER = registerTable("entities/boss/the_watcher");
    public static final ResourceLocation ENTITIES_TWILIGHT_DEMON = registerTable("entities/boss/twilight_demon");
    public static final ResourceLocation ENTITIES_VAMACHERON = registerTable("entities/boss/vamacheron");
    public static final ResourceLocation ENTITIES_WRECK = registerTable("entities/boss/wreck");
    
    //arcana
    public static final ResourceLocation CAPTAIN_MERIK = registerTable("entities/arcana/captain_merik");
    public static final ResourceLocation DATTICON = registerTable("entities/arcana/datticon");
    public static final ResourceLocation DEATHCRYX = registerTable("entities/arcana/deathcryx");
    public static final ResourceLocation DEATH_HOUND = registerTable("entities/arcana/death_hound");
    public static final ResourceLocation DUNGEON_CONSTRUCTOR = registerTable("entities/arcana/dungeon_constructor");
    public static final ResourceLocation DUNGEON_DEMON = registerTable("entities/arcana/dungeon_demon");
    public static final ResourceLocation DUNGEON_PRISONER = registerTable("entities/arcana/dungeon_prisoner");
    public static final ResourceLocation FYRACRYX = registerTable("entities/arcana/ryracryx");
    public static final ResourceLocation GOLEM_OF_REJUVENATION = registerTable("entities/arcana/golem_of_rejuvenation");
    public static final ResourceLocation KAZARI = registerTable("entities/arcana/kazari");
    public static final ResourceLocation LEORNA = registerTable("entities/arcana/leorna");
    public static final ResourceLocation LIVING_STATUE = registerTable("entities/arcana/living_statue");
    public static final ResourceLocation LORD_VATTICUS = registerTable("entities/arcana/lord_vatticus");
    public static final ResourceLocation PARATIKU = registerTable("entities/arcana/paratiku");
    public static final ResourceLocation RAZORBACK = registerTable("entities/arcana/razorback");
    public static final ResourceLocation ROAMER = registerTable("entities/arcana/roamer");
    public static final ResourceLocation SEIMER = registerTable("entities/arcana/seimer");
    public static final ResourceLocation WAR_GENERAL = registerTable("entities/arcana/war_general");
    public static final ResourceLocation WRAITH = registerTable("entities/arcana/wraith");
    public static final ResourceLocation ZELUS = registerTable("entities/arcana/zelus");

    private static ResourceLocation registerTable(String id) {
        return register(new ResourceLocation(DivineRPG.MODID, id));
    }

    private static ResourceLocation register(ResourceLocation id) {
        if (LOOT_TABLES.add(id)) {
            return id;
        } else {
            throw new IllegalArgumentException(id + " is already a registered built-in loot table");
        }
    }

    public static Set<ResourceLocation> all() {
        return READ_ONLY_LOOT_TABLES;
    }
}