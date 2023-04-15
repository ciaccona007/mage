package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheElk801
 */
public final class MarchOfTheMachine extends ExpansionSet {

    private static final List<String> unfinished = Arrays.asList("Assimilate Essence", "Blighted Burgeoning", "Bloated Processor", "Chrome Host Seedshark", "Compleated Huntmaster", "Converter Beast", "Corruption of Towashi", "Elesh Norn", "The Argent Etchings", "Elvish Vatkeeper", "Essence of Orthodoxy", "Eyes of Gitaxias", "Furnace Gremlin", "Gift of Compleation", "Glissa, Herald of Predation", "Glistening Dawn", "Ichor Drinker", "Infected Defector", "Injector Crocodile", "Marauding Dreadship", "Merciless Repurposing", "Norn's Inquisitor", "Phyrexian Awakening", "Progenitor Exarch", "Sculpted Perfection", "Searing Barb", "Sunder the Gateway", "Sunfall", "Tangled Skyline", "Tiller of Flesh", "Traumatic Revelation");

    private static final MarchOfTheMachine instance = new MarchOfTheMachine();

    public static MarchOfTheMachine getInstance() {
        return instance;
    }

    private MarchOfTheMachine() {
        super("March of the Machine", "MOM", ExpansionSet.buildDate(2023, 4, 21), SetType.EXPANSION);
        this.blockName = "March of the Machine";
        this.hasBoosters = false; // temporary

        cards.add(new SetCardInfo("Aerial Boost", 2, Rarity.COMMON, mage.cards.a.AerialBoost.class));
        cards.add(new SetCardInfo("Aetherblade Agent", 88, Rarity.COMMON, mage.cards.a.AetherbladeAgent.class));
        cards.add(new SetCardInfo("Aetherwing, Golden-Scale Flagship", 234, Rarity.UNCOMMON, mage.cards.a.AetherwingGoldenScaleFlagship.class));
        cards.add(new SetCardInfo("Akki Scrapchomper", 130, Rarity.COMMON, mage.cards.a.AkkiScrapchomper.class));
        cards.add(new SetCardInfo("Alabaster Host Intercessor", 3, Rarity.COMMON, mage.cards.a.AlabasterHostIntercessor.class));
        cards.add(new SetCardInfo("Alabaster Host Sanctifier", 4, Rarity.COMMON, mage.cards.a.AlabasterHostSanctifier.class));
        cards.add(new SetCardInfo("Ancient Imperiosaur", 174, Rarity.RARE, mage.cards.a.AncientImperiosaur.class));
        cards.add(new SetCardInfo("Angelic Intervention", 5, Rarity.COMMON, mage.cards.a.AngelicIntervention.class));
        cards.add(new SetCardInfo("Arachnoid Adaptation", 175, Rarity.COMMON, mage.cards.a.ArachnoidAdaptation.class));
        cards.add(new SetCardInfo("Archangel Elspeth", 6, Rarity.MYTHIC, mage.cards.a.ArchangelElspeth.class));
        cards.add(new SetCardInfo("Archpriest of Shadows", 89, Rarity.RARE, mage.cards.a.ArchpriestOfShadows.class));
        cards.add(new SetCardInfo("Artistic Refusal", 46, Rarity.UNCOMMON, mage.cards.a.ArtisticRefusal.class));
        cards.add(new SetCardInfo("Ashen Reaper", 232, Rarity.UNCOMMON, mage.cards.a.AshenReaper.class));
        cards.add(new SetCardInfo("Assimilate Essence", 47, Rarity.COMMON, mage.cards.a.AssimilateEssence.class));
        cards.add(new SetCardInfo("Astral Wingspan", 48, Rarity.UNCOMMON, mage.cards.a.AstralWingspan.class));
        cards.add(new SetCardInfo("Atraxa's Fall", 176, Rarity.COMMON, mage.cards.a.AtraxasFall.class));
        cards.add(new SetCardInfo("Attentive Skywarden", 7, Rarity.COMMON, mage.cards.a.AttentiveSkywarden.class));
        cards.add(new SetCardInfo("Awaken the Maelstrom", 230, Rarity.RARE, mage.cards.a.AwakenTheMaelstrom.class));
        cards.add(new SetCardInfo("Awakened Skyclave", 194, Rarity.UNCOMMON, mage.cards.a.AwakenedSkyclave.class));
        cards.add(new SetCardInfo("Baral and Kari Zev", 218, Rarity.RARE, mage.cards.b.BaralAndKariZev.class));
        cards.add(new SetCardInfo("Beamtown Beatstick", 131, Rarity.COMMON, mage.cards.b.BeamtownBeatstick.class));
        cards.add(new SetCardInfo("Belenon War Anthem", 20, Rarity.UNCOMMON, mage.cards.b.BelenonWarAnthem.class));
        cards.add(new SetCardInfo("Belligerent Regisaur", 191, Rarity.RARE, mage.cards.b.BelligerentRegisaur.class));
        cards.add(new SetCardInfo("Bladed Battle-Fan", 91, Rarity.COMMON, mage.cards.b.BladedBattleFan.class));
        cards.add(new SetCardInfo("Blighted Burgeoning", 177, Rarity.COMMON, mage.cards.b.BlightedBurgeoning.class));
        cards.add(new SetCardInfo("Bloated Processor", 93, Rarity.RARE, mage.cards.b.BloatedProcessor.class));
        cards.add(new SetCardInfo("Bloodfell Caves", 267, Rarity.COMMON, mage.cards.b.BloodfellCaves.class));
        cards.add(new SetCardInfo("Bloomwielder Dryads", 237, Rarity.UNCOMMON, mage.cards.b.BloomwielderDryads.class));
        cards.add(new SetCardInfo("Blossoming Sands", 268, Rarity.COMMON, mage.cards.b.BlossomingSands.class));
        cards.add(new SetCardInfo("Bola Slinger", 8, Rarity.COMMON, mage.cards.b.BolaSlinger.class));
        cards.add(new SetCardInfo("Bonded Herdbeast", 178, Rarity.COMMON, mage.cards.b.BondedHerdbeast.class));
        cards.add(new SetCardInfo("Boon-Bringer Valkyrie", 9, Rarity.RARE, mage.cards.b.BoonBringerValkyrie.class));
        cards.add(new SetCardInfo("Borborygmos and Fblthp", 219, Rarity.MYTHIC, mage.cards.b.BorborygmosAndFblthp.class));
        cards.add(new SetCardInfo("Burning Sun's Fury", 133, Rarity.COMMON, mage.cards.b.BurningSunsFury.class));
        cards.add(new SetCardInfo("Burnished Dunestomper", 43, Rarity.COMMON, mage.cards.b.BurnishedDunestomper.class));
        cards.add(new SetCardInfo("Captive Weird", 49, Rarity.UNCOMMON, mage.cards.c.CaptiveWeird.class));
        cards.add(new SetCardInfo("Chandra, Hope's Beacon", 134, Rarity.MYTHIC, mage.cards.c.ChandraHopesBeacon.class));
        cards.add(new SetCardInfo("Change the Equation", 50, Rarity.UNCOMMON, mage.cards.c.ChangeTheEquation.class));
        cards.add(new SetCardInfo("Chomping Kavu", 179, Rarity.COMMON, mage.cards.c.ChompingKavu.class));
        cards.add(new SetCardInfo("Chrome Host Hulk", 188, Rarity.UNCOMMON, mage.cards.c.ChromeHostHulk.class));
        cards.add(new SetCardInfo("Chrome Host Seedshark", 51, Rarity.RARE, mage.cards.c.ChromeHostSeedshark.class));
        cards.add(new SetCardInfo("City on Fire", 135, Rarity.RARE, mage.cards.c.CityOnFire.class));
        cards.add(new SetCardInfo("Collective Nightmare", 95, Rarity.UNCOMMON, mage.cards.c.CollectiveNightmare.class));
        cards.add(new SetCardInfo("Coming In Hot", 136, Rarity.COMMON, mage.cards.c.ComingInHot.class));
        cards.add(new SetCardInfo("Compleated Conjurer", 49, Rarity.UNCOMMON, mage.cards.c.CompleatedConjurer.class));
        cards.add(new SetCardInfo("Compleated Huntmaster", 96, Rarity.UNCOMMON, mage.cards.c.CompleatedHuntmaster.class));
        cards.add(new SetCardInfo("Consuming Aetherborn", 97, Rarity.COMMON, mage.cards.c.ConsumingAetherborn.class));
        cards.add(new SetCardInfo("Converter Beast", 180, Rarity.COMMON, mage.cards.c.ConverterBeast.class));
        cards.add(new SetCardInfo("Copper Host Crusher", 181, Rarity.UNCOMMON, mage.cards.c.CopperHostCrusher.class));
        cards.add(new SetCardInfo("Corrupted Conviction", 98, Rarity.COMMON, mage.cards.c.CorruptedConviction.class));
        cards.add(new SetCardInfo("Corruption of Towashi", 53, Rarity.UNCOMMON, mage.cards.c.CorruptionOfTowashi.class));
        cards.add(new SetCardInfo("Cosmic Hunger", 182, Rarity.COMMON, mage.cards.c.CosmicHunger.class));
        cards.add(new SetCardInfo("Cragsmasher Yeti", 333, Rarity.COMMON, mage.cards.c.CragsmasherYeti.class));
        cards.add(new SetCardInfo("Crystal Carapace", 183, Rarity.COMMON, mage.cards.c.CrystalCarapace.class));
        cards.add(new SetCardInfo("Cut Short", 10, Rarity.COMMON, mage.cards.c.CutShort.class));
        cards.add(new SetCardInfo("Deadly Derision", 99, Rarity.COMMON, mage.cards.d.DeadlyDerision.class));
        cards.add(new SetCardInfo("Deeproot Wayfinder", 184, Rarity.RARE, mage.cards.d.DeeprootWayfinder.class));
        cards.add(new SetCardInfo("Deluge of the Dead", 115, Rarity.MYTHIC, mage.cards.d.DelugeOfTheDead.class));
        cards.add(new SetCardInfo("Dismal Backwater", 269, Rarity.COMMON, mage.cards.d.DismalBackwater.class));
        cards.add(new SetCardInfo("Disturbing Conversion", 54, Rarity.COMMON, mage.cards.d.DisturbingConversion.class));
        cards.add(new SetCardInfo("Doomskar Warrior", 185, Rarity.RARE, mage.cards.d.DoomskarWarrior.class));
        cards.add(new SetCardInfo("Dreg Recycler", 100, Rarity.COMMON, mage.cards.d.DregRecycler.class));
        cards.add(new SetCardInfo("Dusk Legion Duelist", 11, Rarity.RARE, mage.cards.d.DuskLegionDuelist.class));
        cards.add(new SetCardInfo("Elesh Norn", 12, Rarity.MYTHIC, mage.cards.e.EleshNorn.class));
        cards.add(new SetCardInfo("Elspeth's Smite", 13, Rarity.UNCOMMON, mage.cards.e.ElspethsSmite.class));
        cards.add(new SetCardInfo("Elvish Vatkeeper", 223, Rarity.UNCOMMON, mage.cards.e.ElvishVatkeeper.class));
        cards.add(new SetCardInfo("Enduring Bondwarden", 14, Rarity.COMMON, mage.cards.e.EnduringBondwarden.class));
        cards.add(new SetCardInfo("Ephara's Dispersal", 55, Rarity.COMMON, mage.cards.e.EpharasDispersal.class));
        cards.add(new SetCardInfo("Ephara, Ever-Sheltering", 23, Rarity.RARE, mage.cards.e.EpharaEverSheltering.class));
        cards.add(new SetCardInfo("Errant and Giada", 224, Rarity.RARE, mage.cards.e.ErrantAndGiada.class));
        cards.add(new SetCardInfo("Essence of Orthodoxy", 323, Rarity.RARE, mage.cards.e.EssenceOfOrthodoxy.class));
        cards.add(new SetCardInfo("Etali, Primal Conqueror", 137, Rarity.RARE, mage.cards.e.EtaliPrimalConqueror.class));
        cards.add(new SetCardInfo("Etali, Primal Sickness", 137, Rarity.RARE, mage.cards.e.EtaliPrimalSickness.class));
        cards.add(new SetCardInfo("Etched Familiar", 101, Rarity.COMMON, mage.cards.e.EtchedFamiliar.class));
        cards.add(new SetCardInfo("Etched Host Doombringer", 102, Rarity.COMMON, mage.cards.e.EtchedHostDoombringer.class));
        cards.add(new SetCardInfo("Expedition Lookout", 56, Rarity.COMMON, mage.cards.e.ExpeditionLookout.class));
        cards.add(new SetCardInfo("Eyes of Gitaxias", 57, Rarity.COMMON, mage.cards.e.EyesOfGitaxias.class));
        cards.add(new SetCardInfo("Faerie Mastermind", 58, Rarity.RARE, mage.cards.f.FaerieMastermind.class));
        cards.add(new SetCardInfo("Failed Conversion", 103, Rarity.COMMON, mage.cards.f.FailedConversion.class));
        cards.add(new SetCardInfo("Fairgrounds Trumpeter", 335, Rarity.COMMON, mage.cards.f.FairgroundsTrumpeter.class));
        cards.add(new SetCardInfo("Fearless Skald", 138, Rarity.UNCOMMON, mage.cards.f.FearlessSkald.class));
        cards.add(new SetCardInfo("Fertilid's Favor", 186, Rarity.COMMON, mage.cards.f.FertilidsFavor.class));
        cards.add(new SetCardInfo("Final Flourish", 104, Rarity.COMMON, mage.cards.f.FinalFlourish.class));
        cards.add(new SetCardInfo("Flitting Guerrilla", 105, Rarity.COMMON, mage.cards.f.FlittingGuerrilla.class));
        cards.add(new SetCardInfo("Flywheel Racer", 259, Rarity.COMMON, mage.cards.f.FlywheelRacer.class));
        cards.add(new SetCardInfo("Forest", 281, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Furnace Gremlin", 139, Rarity.UNCOMMON, mage.cards.f.FurnaceGremlin.class));
        cards.add(new SetCardInfo("Furnace Host Charger", 140, Rarity.COMMON, mage.cards.f.FurnaceHostCharger.class));
        cards.add(new SetCardInfo("Furnace Reins", 141, Rarity.UNCOMMON, mage.cards.f.FurnaceReins.class));
        cards.add(new SetCardInfo("Furnace-Blessed Conqueror", 38, Rarity.UNCOMMON, mage.cards.f.FurnaceBlessedConqueror.class));
        cards.add(new SetCardInfo("Furtive Analyst", 59, Rarity.COMMON, mage.cards.f.FurtiveAnalyst.class));
        cards.add(new SetCardInfo("Gargantuan Slabhorn", 240, Rarity.UNCOMMON, mage.cards.g.GargantuanSlabhorn.class));
        cards.add(new SetCardInfo("Gift of Compleation", 106, Rarity.UNCOMMON, mage.cards.g.GiftOfCompleation.class));
        cards.add(new SetCardInfo("Gitaxian Mindstinger", 88, Rarity.COMMON, mage.cards.g.GitaxianMindstinger.class));
        cards.add(new SetCardInfo("Gitaxian Spellstalker", 151, Rarity.UNCOMMON, mage.cards.g.GitaxianSpellstalker.class));
        cards.add(new SetCardInfo("Glissa, Herald of Predation", 226, Rarity.RARE, mage.cards.g.GlissaHeraldOfPredation.class));
        cards.add(new SetCardInfo("Glistening Dawn", 187, Rarity.RARE, mage.cards.g.GlisteningDawn.class));
        cards.add(new SetCardInfo("Glistening Deluge", 107, Rarity.UNCOMMON, mage.cards.g.GlisteningDeluge.class));
        cards.add(new SetCardInfo("Glistening Goremonger", 157, Rarity.COMMON, mage.cards.g.GlisteningGoremonger.class));
        cards.add(new SetCardInfo("Gloomfang Mauler", 108, Rarity.COMMON, mage.cards.g.GloomfangMauler.class));
        cards.add(new SetCardInfo("Gnottvold Hermit", 188, Rarity.UNCOMMON, mage.cards.g.GnottvoldHermit.class));
        cards.add(new SetCardInfo("Golden-Scale Aeronaut", 15, Rarity.COMMON, mage.cards.g.GoldenScaleAeronaut.class));
        cards.add(new SetCardInfo("Grafted Butcher", 109, Rarity.RARE, mage.cards.g.GraftedButcher.class));
        cards.add(new SetCardInfo("Grandmother Ravi Sengir", 116, Rarity.UNCOMMON, mage.cards.g.GrandmotherRaviSengir.class));
        cards.add(new SetCardInfo("Guildpact Paragon", 1, Rarity.MYTHIC, mage.cards.g.GuildpactParagon.class));
        cards.add(new SetCardInfo("Halo Hopper", 260, Rarity.COMMON, mage.cards.h.HaloHopper.class));
        cards.add(new SetCardInfo("Halo-Charged Skaab", 60, Rarity.COMMON, mage.cards.h.HaloChargedSkaab.class));
        cards.add(new SetCardInfo("Hangar Scrounger", 142, Rarity.COMMON, mage.cards.h.HangarScrounger.class));
        cards.add(new SetCardInfo("Harried Artisan", 143, Rarity.UNCOMMON, mage.cards.h.HarriedArtisan.class));
        cards.add(new SetCardInfo("Heliod, the Radiant Dawn", 17, Rarity.RARE, mage.cards.h.HeliodTheRadiantDawn.class));
        cards.add(new SetCardInfo("Heliod, the Warped Eclipse", 17, Rarity.RARE, mage.cards.h.HeliodTheWarpedEclipse.class));
        cards.add(new SetCardInfo("Herbology Instructor", 189, Rarity.UNCOMMON, mage.cards.h.HerbologyInstructor.class));
        cards.add(new SetCardInfo("Hideous Fleshwheeler", 119, Rarity.UNCOMMON, mage.cards.h.HideousFleshwheeler.class));
        cards.add(new SetCardInfo("Holy Frazzle-Cannon", 238, Rarity.UNCOMMON, mage.cards.h.HolyFrazzleCannon.class));
        cards.add(new SetCardInfo("Ichor Drinker", 111, Rarity.COMMON, mage.cards.i.IchorDrinker.class));
        cards.add(new SetCardInfo("Ichor Shade", 112, Rarity.COMMON, mage.cards.i.IchorShade.class));
        cards.add(new SetCardInfo("Infected Defector", 18, Rarity.COMMON, mage.cards.i.InfectedDefector.class));
        cards.add(new SetCardInfo("Injector Crocodile", 329, Rarity.COMMON, mage.cards.i.InjectorCrocodile.class));
        cards.add(new SetCardInfo("Inspired Charge", 19, Rarity.COMMON, mage.cards.i.InspiredCharge.class));
        cards.add(new SetCardInfo("Interdisciplinary Mascot", 326, Rarity.RARE, mage.cards.i.InterdisciplinaryMascot.class));
        cards.add(new SetCardInfo("Into the Fire", 144, Rarity.RARE, mage.cards.i.IntoTheFire.class));
        cards.add(new SetCardInfo("Invasion of Alara", 230, Rarity.RARE, mage.cards.i.InvasionOfAlara.class));
        cards.add(new SetCardInfo("Invasion of Amonkhet", 231, Rarity.UNCOMMON, mage.cards.i.InvasionOfAmonkhet.class));
        cards.add(new SetCardInfo("Invasion of Azgol", 232, Rarity.UNCOMMON, mage.cards.i.InvasionOfAzgol.class));
        cards.add(new SetCardInfo("Invasion of Belenon", 20, Rarity.UNCOMMON, mage.cards.i.InvasionOfBelenon.class));
        cards.add(new SetCardInfo("Invasion of Dominaria", 21, Rarity.UNCOMMON, mage.cards.i.InvasionOfDominaria.class));
        cards.add(new SetCardInfo("Invasion of Eldraine", 113, Rarity.UNCOMMON, mage.cards.i.InvasionOfEldraine.class));
        cards.add(new SetCardInfo("Invasion of Ergamon", 233, Rarity.UNCOMMON, mage.cards.i.InvasionOfErgamon.class));
        cards.add(new SetCardInfo("Invasion of Fiora", 114, Rarity.RARE, mage.cards.i.InvasionOfFiora.class));
        cards.add(new SetCardInfo("Invasion of Innistrad", 115, Rarity.MYTHIC, mage.cards.i.InvasionOfInnistrad.class));
        cards.add(new SetCardInfo("Invasion of Ixalan", 191, Rarity.RARE, mage.cards.i.InvasionOfIxalan.class));
        cards.add(new SetCardInfo("Invasion of Kaladesh", 234, Rarity.UNCOMMON, mage.cards.i.InvasionOfKaladesh.class));
        cards.add(new SetCardInfo("Invasion of Kaldheim", 145, Rarity.RARE, mage.cards.i.InvasionOfKaldheim.class));
        cards.add(new SetCardInfo("Invasion of Kamigawa", 62, Rarity.UNCOMMON, mage.cards.i.InvasionOfKamigawa.class));
        cards.add(new SetCardInfo("Invasion of Karsus", 146, Rarity.RARE, mage.cards.i.InvasionOfKarsus.class));
        cards.add(new SetCardInfo("Invasion of Lorwyn", 236, Rarity.UNCOMMON, mage.cards.i.InvasionOfLorwyn.class));
        cards.add(new SetCardInfo("Invasion of Mercadia", 147, Rarity.UNCOMMON, mage.cards.i.InvasionOfMercadia.class));
        cards.add(new SetCardInfo("Invasion of Moag", 237, Rarity.UNCOMMON, mage.cards.i.InvasionOfMoag.class));
        cards.add(new SetCardInfo("Invasion of Muraganda", 192, Rarity.UNCOMMON, mage.cards.i.InvasionOfMuraganda.class));
        cards.add(new SetCardInfo("Invasion of New Capenna", 238, Rarity.UNCOMMON, mage.cards.i.InvasionOfNewCapenna.class));
        cards.add(new SetCardInfo("Invasion of Pyrulea", 240, Rarity.UNCOMMON, mage.cards.i.InvasionOfPyrulea.class));
        cards.add(new SetCardInfo("Invasion of Ravnica", 1, Rarity.MYTHIC, mage.cards.i.InvasionOfRavnica.class));
        cards.add(new SetCardInfo("Invasion of Shandalar", 193, Rarity.MYTHIC, mage.cards.i.InvasionOfShandalar.class));
        cards.add(new SetCardInfo("Invasion of Theros", 23, Rarity.RARE, mage.cards.i.InvasionOfTheros.class));
        cards.add(new SetCardInfo("Invasion of Tolvada", 241, Rarity.RARE, mage.cards.i.InvasionOfTolvada.class));
        cards.add(new SetCardInfo("Invasion of Ulgrotha", 116, Rarity.UNCOMMON, mage.cards.i.InvasionOfUlgrotha.class));
        cards.add(new SetCardInfo("Invasion of Vryn", 64, Rarity.UNCOMMON, mage.cards.i.InvasionOfVryn.class));
        cards.add(new SetCardInfo("Invasion of Xerex", 242, Rarity.UNCOMMON, mage.cards.i.InvasionOfXerex.class));
        cards.add(new SetCardInfo("Invasion of Zendikar", 194, Rarity.UNCOMMON, mage.cards.i.InvasionOfZendikar.class));
        cards.add(new SetCardInfo("Iridescent Blademaster", 195, Rarity.COMMON, mage.cards.i.IridescentBlademaster.class));
        cards.add(new SetCardInfo("Island", 278, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jin-Gitaxias", 65, Rarity.MYTHIC, mage.cards.j.JinGitaxias.class));
        cards.add(new SetCardInfo("Joyful Stormsculptor", 243, Rarity.UNCOMMON, mage.cards.j.JoyfulStormsculptor.class));
        cards.add(new SetCardInfo("Jungle Hollow", 270, Rarity.COMMON, mage.cards.j.JungleHollow.class));
        cards.add(new SetCardInfo("Kami of Whispered Hopes", 196, Rarity.UNCOMMON, mage.cards.k.KamiOfWhisperedHopes.class));
        cards.add(new SetCardInfo("Karsus Depthguard", 150, Rarity.COMMON, mage.cards.k.KarsusDepthguard.class));
        cards.add(new SetCardInfo("Khenra Spellspear", 151, Rarity.UNCOMMON, mage.cards.k.KhenraSpellspear.class));
        cards.add(new SetCardInfo("Kitesail", 261, Rarity.COMMON, mage.cards.k.Kitesail.class));
        cards.add(new SetCardInfo("Kithkin Billyrider", 24, Rarity.COMMON, mage.cards.k.KithkinBillyrider.class));
        cards.add(new SetCardInfo("Knight of the New Coalition", 25, Rarity.COMMON, mage.cards.k.KnightOfTheNewCoalition.class));
        cards.add(new SetCardInfo("Knight-Errant of Eos", 26, Rarity.RARE, mage.cards.k.KnightErrantOfEos.class));
        cards.add(new SetCardInfo("Kogla and Yidaro", 244, Rarity.RARE, mage.cards.k.KoglaAndYidaro.class));
        cards.add(new SetCardInfo("Kor Halberd", 27, Rarity.COMMON, mage.cards.k.KorHalberd.class));
        cards.add(new SetCardInfo("Kroxa and Kunoros", 245, Rarity.MYTHIC, mage.cards.k.KroxaAndKunoros.class));
        cards.add(new SetCardInfo("Kyren Flamewright", 147, Rarity.UNCOMMON, mage.cards.k.KyrenFlamewright.class));
        cards.add(new SetCardInfo("Lazotep Convert", 231, Rarity.UNCOMMON, mage.cards.l.LazotepConvert.class));
        cards.add(new SetCardInfo("Leyline Surge", 193, Rarity.MYTHIC, mage.cards.l.LeylineSurge.class));
        cards.add(new SetCardInfo("Lithomantic Barrage", 152, Rarity.UNCOMMON, mage.cards.l.LithomanticBarrage.class));
        cards.add(new SetCardInfo("Malady Invoker", 189, Rarity.UNCOMMON, mage.cards.m.MaladyInvoker.class));
        cards.add(new SetCardInfo("Marauding Dreadship", 153, Rarity.COMMON, mage.cards.m.MaraudingDreadship.class));
        cards.add(new SetCardInfo("Marchesa, Resolute Monarch", 114, Rarity.RARE, mage.cards.m.MarchesaResoluteMonarch.class));
        cards.add(new SetCardInfo("Marshal of Zhalfir", 246, Rarity.UNCOMMON, mage.cards.m.MarshalOfZhalfir.class));
        cards.add(new SetCardInfo("Meeting of Minds", 66, Rarity.COMMON, mage.cards.m.MeetingOfMinds.class));
        cards.add(new SetCardInfo("Merciless Repurposing", 117, Rarity.UNCOMMON, mage.cards.m.MercilessRepurposing.class));
        cards.add(new SetCardInfo("Mirran Banesplitter", 154, Rarity.COMMON, mage.cards.m.MirranBanesplitter.class));
        cards.add(new SetCardInfo("Mirrodin Avenged", 118, Rarity.COMMON, mage.cards.m.MirrodinAvenged.class));
        cards.add(new SetCardInfo("Mirror-Shield Hoplite", 247, Rarity.UNCOMMON, mage.cards.m.MirrorShieldHoplite.class));
        cards.add(new SetCardInfo("Moment of Truth", 67, Rarity.COMMON, mage.cards.m.MomentOfTruth.class));
        cards.add(new SetCardInfo("Monastery Mentor", 28, Rarity.MYTHIC, mage.cards.m.MonasteryMentor.class));
        cards.add(new SetCardInfo("Mountain", 280, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mutagen Connoisseur", 248, Rarity.UNCOMMON, mage.cards.m.MutagenConnoisseur.class));
        cards.add(new SetCardInfo("Nahiri's Warcrafting", 155, Rarity.RARE, mage.cards.n.NahirisWarcrafting.class));
        cards.add(new SetCardInfo("Negate", 68, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Nezumi Freewheeler", 119, Rarity.UNCOMMON, mage.cards.n.NezumiFreewheeler.class));
        cards.add(new SetCardInfo("Nezumi Informant", 120, Rarity.COMMON, mage.cards.n.NezumiInformant.class));
        cards.add(new SetCardInfo("Norn's Inquisitor", 29, Rarity.UNCOMMON, mage.cards.n.NornsInquisitor.class));
        cards.add(new SetCardInfo("Oculus Whelp", 69, Rarity.COMMON, mage.cards.o.OculusWhelp.class));
        cards.add(new SetCardInfo("Omen Hawker", 70, Rarity.UNCOMMON, mage.cards.o.OmenHawker.class));
        cards.add(new SetCardInfo("Omnath, Locus of All", 249, Rarity.RARE, mage.cards.o.OmnathLocusOfAll.class));
        cards.add(new SetCardInfo("Onakke Javelineer", 156, Rarity.COMMON, mage.cards.o.OnakkeJavelineer.class));
        cards.add(new SetCardInfo("Oracle of Tragedy", 71, Rarity.UNCOMMON, mage.cards.o.OracleOfTragedy.class));
        cards.add(new SetCardInfo("Order of the Alabaster Host", 72, Rarity.COMMON, mage.cards.o.OrderOfTheAlabasterHost.class));
        cards.add(new SetCardInfo("Order of the Mirror", 72, Rarity.COMMON, mage.cards.o.OrderOfTheMirror.class));
        cards.add(new SetCardInfo("Orthion, Hero of Lavabrink", 334, Rarity.RARE, mage.cards.o.OrthionHeroOfLavabrink.class));
        cards.add(new SetCardInfo("Overgrown Pest", 197, Rarity.COMMON, mage.cards.o.OvergrownPest.class));
        cards.add(new SetCardInfo("Overloaded Mage-Ring", 64, Rarity.UNCOMMON, mage.cards.o.OverloadedMageRing.class));
        cards.add(new SetCardInfo("Ozolith, the Shattered Spire", 198, Rarity.RARE, mage.cards.o.OzolithTheShatteredSpire.class));
        cards.add(new SetCardInfo("Phyrexian Archivist", 262, Rarity.COMMON, mage.cards.p.PhyrexianArchivist.class));
        cards.add(new SetCardInfo("Phyrexian Awakening", 30, Rarity.UNCOMMON, mage.cards.p.PhyrexianAwakening.class));
        cards.add(new SetCardInfo("Phyrexian Censor", 31, Rarity.UNCOMMON, mage.cards.p.PhyrexianCensor.class));
        cards.add(new SetCardInfo("Phyrexian Gargantua", 121, Rarity.UNCOMMON, mage.cards.p.PhyrexianGargantua.class));
        cards.add(new SetCardInfo("Phyrexian Pegasus", 324, Rarity.COMMON, mage.cards.p.PhyrexianPegasus.class));
        cards.add(new SetCardInfo("Phyrexian Skyflayer", 143, Rarity.UNCOMMON, mage.cards.p.PhyrexianSkyflayer.class));
        cards.add(new SetCardInfo("Pile On", 122, Rarity.RARE, mage.cards.p.PileOn.class));
        cards.add(new SetCardInfo("Placid Rottentail", 199, Rarity.COMMON, mage.cards.p.PlacidRottentail.class));
        cards.add(new SetCardInfo("Plains", 277, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plated Kilnbeast", 178, Rarity.COMMON, mage.cards.p.PlatedKilnbeast.class));
        cards.add(new SetCardInfo("Polukranos Reborn", 200, Rarity.RARE, mage.cards.p.PolukranosReborn.class));
        cards.add(new SetCardInfo("Polukranos, Engine of Ruin", 200, Rarity.RARE, mage.cards.p.PolukranosEngineOfRuin.class));
        cards.add(new SetCardInfo("Portent Tracker", 201, Rarity.COMMON, mage.cards.p.PortentTracker.class));
        cards.add(new SetCardInfo("Preening Champion", 73, Rarity.COMMON, mage.cards.p.PreeningChampion.class));
        cards.add(new SetCardInfo("Prickle Faeries", 113, Rarity.UNCOMMON, mage.cards.p.PrickleFaeries.class));
        cards.add(new SetCardInfo("Primordial Plasm", 192, Rarity.UNCOMMON, mage.cards.p.PrimordialPlasm.class));
        cards.add(new SetCardInfo("Progenitor Exarch", 32, Rarity.RARE, mage.cards.p.ProgenitorExarch.class));
        cards.add(new SetCardInfo("Protocol Knight", 74, Rarity.COMMON, mage.cards.p.ProtocolKnight.class));
        cards.add(new SetCardInfo("Pyre of the World Tree", 145, Rarity.RARE, mage.cards.p.PyreOfTheWorldTree.class));
        cards.add(new SetCardInfo("Pyretic Prankster", 157, Rarity.COMMON, mage.cards.p.PyreticPrankster.class));
        cards.add(new SetCardInfo("Ral's Reinforcements", 158, Rarity.COMMON, mage.cards.r.RalsReinforcements.class));
        cards.add(new SetCardInfo("Ramosian Greatsword", 159, Rarity.UNCOMMON, mage.cards.r.RamosianGreatsword.class));
        cards.add(new SetCardInfo("Rampaging Geoderm", 251, Rarity.UNCOMMON, mage.cards.r.RampagingGeoderm.class));
        cards.add(new SetCardInfo("Rampaging Raptor", 160, Rarity.RARE, mage.cards.r.RampagingRaptor.class));
        cards.add(new SetCardInfo("Rankle and Torbran", 252, Rarity.RARE, mage.cards.r.RankleAndTorbran.class));
        cards.add(new SetCardInfo("Ravenous Sailback", 202, Rarity.UNCOMMON, mage.cards.r.RavenousSailback.class));
        cards.add(new SetCardInfo("Realmbreaker's Grasp", 33, Rarity.COMMON, mage.cards.r.RealmbreakersGrasp.class));
        cards.add(new SetCardInfo("Redcap Heelslasher", 161, Rarity.COMMON, mage.cards.r.RedcapHeelslasher.class));
        cards.add(new SetCardInfo("Referee Squad", 327, Rarity.UNCOMMON, mage.cards.r.RefereeSquad.class));
        cards.add(new SetCardInfo("Refraction Elemental", 146, Rarity.RARE, mage.cards.r.RefractionElemental.class));
        cards.add(new SetCardInfo("Rona, Herald of Invasion", 75, Rarity.RARE, mage.cards.r.RonaHeraldOfInvasion.class));
        cards.add(new SetCardInfo("Rona, Tolarian Obliterator", 75, Rarity.RARE, mage.cards.r.RonaTolarianObliterator.class));
        cards.add(new SetCardInfo("Rooftop Saboteurs", 62, Rarity.UNCOMMON, mage.cards.r.RooftopSaboteurs.class));
        cards.add(new SetCardInfo("Rugged Highlands", 271, Rarity.COMMON, mage.cards.r.RuggedHighlands.class));
        cards.add(new SetCardInfo("Ruins Recluse", 336, Rarity.UNCOMMON, mage.cards.r.RuinsRecluse.class));
        cards.add(new SetCardInfo("Saiba Cryptomancer", 76, Rarity.COMMON, mage.cards.s.SaibaCryptomancer.class));
        cards.add(new SetCardInfo("Sandstalker Moloch", 203, Rarity.UNCOMMON, mage.cards.s.SandstalkerMoloch.class));
        cards.add(new SetCardInfo("Scorn-Blade Berserker", 124, Rarity.UNCOMMON, mage.cards.s.ScornBladeBerserker.class));
        cards.add(new SetCardInfo("Scoured Barrens", 272, Rarity.COMMON, mage.cards.s.ScouredBarrens.class));
        cards.add(new SetCardInfo("Scrappy Bruiser", 162, Rarity.UNCOMMON, mage.cards.s.ScrappyBruiser.class));
        cards.add(new SetCardInfo("Scrollshift", 34, Rarity.COMMON, mage.cards.s.Scrollshift.class));
        cards.add(new SetCardInfo("Sculpted Perfection", 253, Rarity.UNCOMMON, mage.cards.s.SculptedPerfection.class));
        cards.add(new SetCardInfo("Seal from Existence", 35, Rarity.UNCOMMON, mage.cards.s.SealFromExistence.class));
        cards.add(new SetCardInfo("Searing Barb", 163, Rarity.COMMON, mage.cards.s.SearingBarb.class));
        cards.add(new SetCardInfo("Seed of Hope", 204, Rarity.COMMON, mage.cards.s.SeedOfHope.class));
        cards.add(new SetCardInfo("Seedpod Caretaker", 325, Rarity.UNCOMMON, mage.cards.s.SeedpodCaretaker.class));
        cards.add(new SetCardInfo("Seer of Stolen Sight", 330, Rarity.UNCOMMON, mage.cards.s.SeerOfStolenSight.class));
        cards.add(new SetCardInfo("Seraph of New Capenna", 36, Rarity.UNCOMMON, mage.cards.s.SeraphOfNewCapenna.class));
        cards.add(new SetCardInfo("Seraph of New Phyrexia", 36, Rarity.UNCOMMON, mage.cards.s.SeraphOfNewPhyrexia.class));
        cards.add(new SetCardInfo("Serpent-Blade Assailant", 205, Rarity.COMMON, mage.cards.s.SerpentBladeAssailant.class));
        cards.add(new SetCardInfo("Serra Faithkeeper", 21, Rarity.UNCOMMON, mage.cards.s.SerraFaithkeeper.class));
        cards.add(new SetCardInfo("Shatter the Source", 164, Rarity.COMMON, mage.cards.s.ShatterTheSource.class));
        cards.add(new SetCardInfo("Sheoldred", 125, Rarity.MYTHIC, mage.cards.s.Sheoldred.class));
        cards.add(new SetCardInfo("Shivan Branch-Burner", 165, Rarity.UNCOMMON, mage.cards.s.ShivanBranchBurner.class));
        cards.add(new SetCardInfo("Sigiled Sentinel", 37, Rarity.COMMON, mage.cards.s.SigiledSentinel.class));
        cards.add(new SetCardInfo("Skittering Surveyor", 264, Rarity.COMMON, mage.cards.s.SkitteringSurveyor.class));
        cards.add(new SetCardInfo("Skyclave Aerialist", 78, Rarity.UNCOMMON, mage.cards.s.SkyclaveAerialist.class));
        cards.add(new SetCardInfo("Skyclave Invader", 78, Rarity.UNCOMMON, mage.cards.s.SkyclaveInvader.class));
        cards.add(new SetCardInfo("Stasis Field", 79, Rarity.COMMON, mage.cards.s.StasisField.class));
        cards.add(new SetCardInfo("Stoke the Flames", 166, Rarity.UNCOMMON, mage.cards.s.StokeTheFlames.class));
        cards.add(new SetCardInfo("Storm the Seedcore", 206, Rarity.UNCOMMON, mage.cards.s.StormTheSeedcore.class));
        cards.add(new SetCardInfo("Stormclaw Rager", 254, Rarity.UNCOMMON, mage.cards.s.StormclawRager.class));
        cards.add(new SetCardInfo("Streetwise Negotiator", 207, Rarity.UNCOMMON, mage.cards.s.StreetwiseNegotiator.class));
        cards.add(new SetCardInfo("Sun-Blessed Guardian", 38, Rarity.UNCOMMON, mage.cards.s.SunBlessedGuardian.class));
        cards.add(new SetCardInfo("Sunder the Gateway", 39, Rarity.COMMON, mage.cards.s.SunderTheGateway.class));
        cards.add(new SetCardInfo("Sunfall", 40, Rarity.RARE, mage.cards.s.Sunfall.class));
        cards.add(new SetCardInfo("Surge of Salvation", 41, Rarity.UNCOMMON, mage.cards.s.SurgeOfSalvation.class));
        cards.add(new SetCardInfo("Surrak and Goreclaw", 337, Rarity.RARE, mage.cards.s.SurrakAndGoreclaw.class));
        cards.add(new SetCardInfo("Swamp", 279, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swiftwater Cliffs", 273, Rarity.COMMON, mage.cards.s.SwiftwaterCliffs.class));
        cards.add(new SetCardInfo("Sword of Once and Future", 265, Rarity.MYTHIC, mage.cards.s.SwordOfOnceAndFuture.class));
        cards.add(new SetCardInfo("Swordsworn Cavalier", 42, Rarity.COMMON, mage.cards.s.SwordswornCavalier.class));
        cards.add(new SetCardInfo("Tangled Skyline", 209, Rarity.UNCOMMON, mage.cards.t.TangledSkyline.class));
        cards.add(new SetCardInfo("Tarkir Duneshaper", 43, Rarity.COMMON, mage.cards.t.TarkirDuneshaper.class));
        cards.add(new SetCardInfo("Temporal Cleansing", 80, Rarity.COMMON, mage.cards.t.TemporalCleansing.class));
        cards.add(new SetCardInfo("Tenured Oilcaster", 126, Rarity.COMMON, mage.cards.t.TenuredOilcaster.class));
        cards.add(new SetCardInfo("Terror of Towashi", 331, Rarity.RARE, mage.cards.t.TerrorOfTowashi.class));
        cards.add(new SetCardInfo("The Argent Etchings", 12, Rarity.MYTHIC, mage.cards.t.TheArgentEtchings.class));
        cards.add(new SetCardInfo("The Broken Sky", 241, Rarity.RARE, mage.cards.t.TheBrokenSky.class));
        cards.add(new SetCardInfo("The Grand Evolution", 213, Rarity.MYTHIC, mage.cards.t.TheGrandEvolution.class));
        cards.add(new SetCardInfo("The Great Synthesis", 65, Rarity.MYTHIC, mage.cards.t.TheGreatSynthesis.class));
        cards.add(new SetCardInfo("The Great Work", 169, Rarity.MYTHIC, mage.cards.t.TheGreatWork.class));
        cards.add(new SetCardInfo("The True Scriptures", 125, Rarity.MYTHIC, mage.cards.t.TheTrueScriptures.class));
        cards.add(new SetCardInfo("Thornwood Falls", 274, Rarity.COMMON, mage.cards.t.ThornwoodFalls.class));
        cards.add(new SetCardInfo("Thrashing Frontliner", 167, Rarity.COMMON, mage.cards.t.ThrashingFrontliner.class));
        cards.add(new SetCardInfo("Thunderhead Squadron", 81, Rarity.COMMON, mage.cards.t.ThunderheadSquadron.class));
        cards.add(new SetCardInfo("Tidal Terror", 82, Rarity.COMMON, mage.cards.t.TidalTerror.class));
        cards.add(new SetCardInfo("Tiller of Flesh", 44, Rarity.UNCOMMON, mage.cards.t.TillerOfFlesh.class));
        cards.add(new SetCardInfo("Timberland Ancient", 210, Rarity.COMMON, mage.cards.t.TimberlandAncient.class));
        cards.add(new SetCardInfo("Trailblazing Historian", 168, Rarity.COMMON, mage.cards.t.TrailblazingHistorian.class));
        cards.add(new SetCardInfo("Tranquil Cove", 275, Rarity.COMMON, mage.cards.t.TranquilCove.class));
        cards.add(new SetCardInfo("Transcendent Message", 83, Rarity.RARE, mage.cards.t.TranscendentMessage.class));
        cards.add(new SetCardInfo("Traumatic Revelation", 127, Rarity.COMMON, mage.cards.t.TraumaticRevelation.class));
        cards.add(new SetCardInfo("Tribute to the World Tree", 211, Rarity.RARE, mage.cards.t.TributeToTheWorldTree.class));
        cards.add(new SetCardInfo("Truga Cliffcharger", 233, Rarity.UNCOMMON, mage.cards.t.TrugaCliffcharger.class));
        cards.add(new SetCardInfo("Unseal the Necropolis", 128, Rarity.COMMON, mage.cards.u.UnsealTheNecropolis.class));
        cards.add(new SetCardInfo("Urabrask", 169, Rarity.MYTHIC, mage.cards.u.Urabrask.class));
        cards.add(new SetCardInfo("Urn of Godfire", 266, Rarity.COMMON, mage.cards.u.UrnOfGodfire.class));
        cards.add(new SetCardInfo("Vanquish the Weak", 129, Rarity.COMMON, mage.cards.v.VanquishTheWeak.class));
        cards.add(new SetCardInfo("Vengeant Earth", 212, Rarity.COMMON, mage.cards.v.VengeantEarth.class));
        cards.add(new SetCardInfo("Vertex Paladin", 242, Rarity.UNCOMMON, mage.cards.v.VertexPaladin.class));
        cards.add(new SetCardInfo("Volcanic Spite", 170, Rarity.COMMON, mage.cards.v.VolcanicSpite.class));
        cards.add(new SetCardInfo("Voldaren Thrillseeker", 171, Rarity.RARE, mage.cards.v.VoldarenThrillseeker.class));
        cards.add(new SetCardInfo("Vorinclex", 213, Rarity.MYTHIC, mage.cards.v.Vorinclex.class));
        cards.add(new SetCardInfo("War Historian", 214, Rarity.COMMON, mage.cards.w.WarHistorian.class));
        cards.add(new SetCardInfo("War-Trained Slasher", 172, Rarity.COMMON, mage.cards.w.WarTrainedSlasher.class));
        cards.add(new SetCardInfo("Wary Thespian", 215, Rarity.COMMON, mage.cards.w.WaryThespian.class));
        cards.add(new SetCardInfo("Wicked Slumber", 84, Rarity.UNCOMMON, mage.cards.w.WickedSlumber.class));
        cards.add(new SetCardInfo("Wildwood Escort", 216, Rarity.COMMON, mage.cards.w.WildwoodEscort.class));
        cards.add(new SetCardInfo("Wind-Scarred Crag", 276, Rarity.COMMON, mage.cards.w.WindScarredCrag.class));
        cards.add(new SetCardInfo("Winnowing Forces", 236, Rarity.UNCOMMON, mage.cards.w.WinnowingForces.class));
        cards.add(new SetCardInfo("Wrenn and Realmbreaker", 217, Rarity.MYTHIC, mage.cards.w.WrennAndRealmbreaker.class));
        cards.add(new SetCardInfo("Wrenn's Resolve", 173, Rarity.COMMON, mage.cards.w.WrennsResolve.class));
        cards.add(new SetCardInfo("Xerex Strobe-Knight", 85, Rarity.UNCOMMON, mage.cards.x.XerexStrobeKnight.class));
        cards.add(new SetCardInfo("Yargle and Multani", 256, Rarity.RARE, mage.cards.y.YargleAndMultani.class));
        cards.add(new SetCardInfo("Zephyr Singer", 86, Rarity.RARE, mage.cards.z.ZephyrSinger.class));
        cards.add(new SetCardInfo("Zephyr Winder", 328, Rarity.COMMON, mage.cards.z.ZephyrWinder.class));
        cards.add(new SetCardInfo("Zhalfirin Lancer", 45, Rarity.UNCOMMON, mage.cards.z.ZhalfirinLancer.class));
        cards.add(new SetCardInfo("Zhalfirin Shapecraft", 87, Rarity.COMMON, mage.cards.z.ZhalfirinShapecraft.class));
        cards.add(new SetCardInfo("Zimone and Dina", 257, Rarity.MYTHIC, mage.cards.z.ZimoneAndDina.class));

        cards.removeIf(setCardInfo -> unfinished.contains(setCardInfo.getName())); // remove when mechanic is implemented
    }

//    @Override
//    public BoosterCollator createCollator() {
//        return new MarchOfTheMachineCollator();
//    }
}
