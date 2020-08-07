package net.tslat.aoa3.client.render.entities.projectiles;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.client.render.entities.projectiles.arrows.HollyArrowRenderer;
import net.tslat.aoa3.client.render.entities.projectiles.arrows.PopShotRenderer;
import net.tslat.aoa3.client.render.entities.projectiles.arrows.SpectralHollyArrowRenderer;
import net.tslat.aoa3.client.render.entities.projectiles.arrows.TippedHollyArrowRenderer;
import net.tslat.aoa3.client.render.entities.projectiles.blasters.*;
import net.tslat.aoa3.client.render.entities.projectiles.bullets.*;
import net.tslat.aoa3.client.render.entities.projectiles.cannonshots.*;
import net.tslat.aoa3.client.render.entities.projectiles.misc.*;
import net.tslat.aoa3.client.render.entities.projectiles.mob.*;
import net.tslat.aoa3.client.render.entities.projectiles.staff.*;
import net.tslat.aoa3.client.render.entities.projectiles.thrown.*;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.entity.projectiles.arrow.EntityHollyArrow;
import net.tslat.aoa3.entity.projectiles.arrow.EntityPopShot;
import net.tslat.aoa3.entity.projectiles.arrow.EntitySpectralHollyArrow;
import net.tslat.aoa3.entity.projectiles.arrow.EntityTippedHollyArrow;
import net.tslat.aoa3.entity.projectiles.blaster.*;
import net.tslat.aoa3.entity.projectiles.cannon.*;
import net.tslat.aoa3.entity.projectiles.gun.*;
import net.tslat.aoa3.entity.projectiles.misc.*;
import net.tslat.aoa3.entity.projectiles.mob.*;
import net.tslat.aoa3.entity.projectiles.staff.*;
import net.tslat.aoa3.entity.projectiles.thrown.*;
import net.tslat.aoa3.library.Enums;

@SideOnly(Side.CLIENT)
public class ProjectileRenders {

	@SubscribeEvent
	public void registerEntityRenders(final ModelRegistryEvent ev) {
		RenderingRegistry.registerEntityRenderingHandler(EntityAnemiaBomb.class, renderManager -> new AnemiaBombRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityArcwormShot.class, renderManager -> new ArcwormShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/mobs/shyrelands/arcworm.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityAquaball.class, renderManager -> new AquaballRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityAquaticShot.class, renderManager -> new AquaticShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityAtomizerBounce.class, renderManager -> new AtomizerBounceRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityAtomizerShot.class, renderManager -> new AtomizerShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityBalloonBomb.class, renderManager -> new BalloonBombRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/balloon_bomb.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityBaronessShot.class, renderManager -> new BaronessShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityBaronShot.class, renderManager -> new BaronShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityBeamerShot.class, renderManager -> new BeamerShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityBloodball.class, renderManager -> new BloodballRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityBloodDrainer.class, renderManager -> new BloodDrainerRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlueBullet.class, renderManager -> new ColouredTexturedProjectileRenderer(renderManager, Enums.RGBIntegers.BLUE, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/limonite_bullet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlueGuardianShot.class, renderManager -> new BlueGuardianShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoneBullet.class, renderManager -> new BoneBulletRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/limonite_bullet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityBonePellet.class, renderManager -> new BonePelletRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/bone_pellet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityBozoBall.class, renderManager -> new BozoBallRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityBubbleShot.class, renderManager -> new BubbleShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/misc/bubble_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityBulletShot.class, renderManager -> new BulletShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/limonite_bullet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityCannonball.class, renderManager -> new CannonballRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityCarrotBall.class, renderManager -> new CarrotBallRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/carrot_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityCelestialFall.class, renderManager -> new CelestialFallRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityChakram.class, renderManager -> new ChakramRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/thrown/chakram.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityCherryShot.class, renderManager -> new CherryShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityChilliShot.class, renderManager -> new ChilliShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/chilli_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityClownBall.class, renderManager -> new ClownBallRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityClownShot.class, renderManager -> new ClownShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityConfettiCluster.class, renderManager -> new ConfettiClusterRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityConfettiShot.class, renderManager -> new ConfettiShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityConstructShot.class, renderManager -> new ConstructShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityConstructTerrorShot.class, renderManager -> new ConstructTerrorShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/mobshots/construct_terror_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityCorallusShot.class, renderManager -> new CorallusShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/mobshots/corallus_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityCottonCandorShot.class, renderManager -> new CottonCandorShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityCraexxeusNuke.class, renderManager -> new CraexxeusNukeRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityCraexxeusShot.class, renderManager -> new CraexxeusShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityCreepBomb.class, renderManager -> new CreepBombRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityCreeperShot.class, renderManager -> new CreeperShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityCreepTube.class, renderManager -> new CreepTubeRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityCyanShot.class, renderManager -> new CyanShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityDeathRay.class, renderManager -> new DeathRayRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerShot.class, renderManager -> new DestroyerShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityDestructionShot.class, renderManager -> new DestructionShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/misc/destruction_ball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityDischargeShot.class, renderManager -> new DischargeShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/discharge_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityDischargeSlug.class, renderManager -> new DischargeSlugRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityDoomShot.class, renderManager -> new DoomShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnergyShot.class, renderManager -> new EnergyShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityEradicatorShot.class, renderManager -> new EradicatorShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityErebonSticklerShot.class, renderManager -> new ErebonSticklerShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityErebonSticklerStuck.class, renderManager -> new ErebonSticklerStuckRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityFireBullet.class, renderManager -> new FireBulletRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/limonite_bullet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityFireflyShot.class, renderManager -> new FireflyShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityFirestormFall.class, renderManager -> new FirestormFallRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityFloroRPG.class, renderManager -> new FloroRPGRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/thrown/grenade.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityFlowerBall.class, renderManager -> new FlowerBallRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityFlowerShot.class, renderManager -> new FlowerShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityFragmentShot.class, renderManager -> new FragmentShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/fragment_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityFungalBall.class, renderManager -> new FungalBallRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityGhoulBall.class, renderManager -> new GhoulBallRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityGhoulShot.class, renderManager -> new GhoulShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldenCannonball.class, renderManager -> new GoldenCannonballRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldShot.class, renderManager -> new GoldShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityGooBall.class, renderManager -> new GooBallRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/thrown/goo_ball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrawShot.class, renderManager -> new GrawShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityMiniGreenBall.class, renderManager -> new GreenBallRenderer(renderManager, 1f, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/green_ball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntitySuperGreenBall.class, renderManager -> new GreenBallRenderer(renderManager, 2f, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/green_ball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityUltraGreenBall.class, renderManager -> new GreenBallRenderer(renderManager, 3f, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/green_ball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityGigaGreenBall.class, renderManager -> new GreenBallRenderer(renderManager, 5f, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/green_ball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityGreenBullet.class, renderManager -> new ColouredTexturedProjectileRenderer(renderManager, Enums.RGBIntegers.GREEN, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/limonite_bullet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityGreenGuardianShot.class, renderManager -> new GreenGuardianShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, renderManager -> new GrenadeRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/thrown/grenade.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHagShot.class, renderManager -> new HagShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityHaunterShot.class, renderManager -> new HaunterShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeavyBlueCannonball.class, renderManager -> new HeavyBlueCannonballRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeavyBoneCannonball.class, renderManager -> new HeavyBoneBallRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeavyCannonball.class, renderManager -> new HeavyCannonballRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeavyCannonballRed.class, renderManager -> new CannonballHeavyRedRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeavyGrenade.class, renderManager -> new GrenadeRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/thrown/grenade.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeavyRedBullet.class, renderManager -> new ColouredTexturedProjectileRenderer(renderManager, Enums.RGBIntegers.RED, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/limonite_bullet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeavyShadowball.class, renderManager -> new HeavyShadowBallRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeavyShowerShot.class, renderManager -> new ShowerShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeavyTriDischargeShot.class, renderManager -> new HeavyTriDischargeShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/discharge_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeavyWitherBall.class, renderManager -> new HeavyWitherBallRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHellBubbleShot.class, renderManager -> new HellBubbleShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/misc/red_bubble_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHellfire.class, renderManager -> new HellfireRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/thrown/hellfire.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHellfireProjectile.class, renderManager -> new HellfireProjectileRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityHiveBall.class, renderManager -> new HiveBallRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHollyArrow.class, renderManager -> new HollyArrowRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/arrows/holly_arrow.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHollyArrowShot.class, renderManager -> new HollyArrowShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/arrows/holly_arrow.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityHotShot.class, renderManager -> new HotShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/hot_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceShot.class, renderManager -> new IceShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityIllusionShot.class, renderManager -> new IllusionShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/illusion_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityIonShot.class, renderManager -> new IonShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityIroMinerShot.class, renderManager -> new IroMinerShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityLaserShot.class, renderManager -> new LaserShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/laser_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityLelyetianShot.class, renderManager -> new LelyetianShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityLightBlasterShot.class, renderManager -> new LightBlasterShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityLightIronShot.class, renderManager -> new LightIronShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/metal_slug.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityLightSpark.class, renderManager -> new LightSparkRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityLimoniteBullet.class, renderManager -> new LimoniteBulletRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/limonite_bullet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityLunarFall.class, renderManager -> new LunarFallRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/misc/star_fall.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityLunarHollyArrowShot.class, renderManager -> new HollyArrowShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/arrows/holly_arrow.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityLunaShot.class, renderManager -> new LunaShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/luna_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityLuxonSticklerShot.class, renderManager -> new LuxonSticklerShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityLuxonSticklerStuck.class, renderManager -> new LuxonSticklerStuckRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityLyonicShot.class, renderManager -> new LyonicShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityMagicBall.class, renderManager -> new MagicBallRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityMagickeShot.class, renderManager -> new MagickeShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityMechFall.class, renderManager -> new MechFallRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityMechShot.class, renderManager -> new MechShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityMetalSlug.class, renderManager -> new MetalSlugRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/metal_slug.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityMeteorFall.class, renderManager -> new MeteorFallRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityMindBlasterShot.class, renderManager -> new MindBlasterShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityModuloShot.class, renderManager -> new ModuloShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/laser_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityMoonDestroyerShot.class, renderManager -> new MoonDestroyerShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityMoonlightFall.class, renderManager -> new MoonlightFallRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityMoonMaker.class, renderManager -> new MoonMakerRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/metal_slug.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityMoonShiner.class, renderManager -> new MoonShinerRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityMoonShot.class, renderManager -> new MoonShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityMultiplyingGrenade.class, renderManager -> new MultiplyingGrenadeRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/thrown/grenade.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityNethengeicWitherShot.class, renderManager -> new NethengeicWitherShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/mobshots/nethengeic_skull.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityNightmareFall.class, renderManager -> new NightmareFallRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityNoxiousShot.class, renderManager -> new NoxiousShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityOdious.class, renderManager -> new OdiousRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityOmnilightShot.class, renderManager -> new OmnilightShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityOrangeCannonball.class, renderManager -> new OrangeCannonballRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityOrbocron.class, renderManager -> new OrbocronRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityParalyzerShot.class, renderManager -> new ParalyzerShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityPartyPopper.class, renderManager -> new PartyPopperRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/party_popper_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityPenumbraShot.class, renderManager -> new PenumbraShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhantomShot.class, renderManager -> new PhantomShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityPlutonSticklerShot.class, renderManager -> new PlutonSticklerShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityPlutonSticklerStuck.class, renderManager -> new PlutonSticklerStuckRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityPoisonPlunger.class, renderManager -> new PoisonPlungerShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityPoisonShot.class, renderManager -> new PoisonShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityPolymorphShot.class, renderManager -> new PolymorphShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityPolytomShot.class, renderManager -> new PolytomShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityPopShot.class, renderManager -> new PopShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/arrows/pop_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityPowerRay.class, renderManager -> new PowerRayRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityPowerShot.class, renderManager -> new PowerShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityPrimordialShot.class, renderManager -> new PrimordialShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityProton.class, renderManager -> new ProtonRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/proton_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityRainbowShot.class, renderManager -> new RainbowShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityRedBullet.class, renderManager -> new ColouredTexturedProjectileRenderer(renderManager, Enums.RGBIntegers.RED, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/limonite_bullet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityRedGuardianShot.class, renderManager -> new RedGuardianShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityReeferShot.class, renderManager -> new ReeferShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityRevolutionShot.class, renderManager -> new RevolutionShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityRockFragment.class, renderManager -> new RockFragmentRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/rock_fragment.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityRockFragmentFungal.class, renderManager -> new RockFragmentFungalRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/rock_fragment.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityRosidianShot.class, renderManager -> new RosidianShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityRPG.class, renderManager -> new RPGRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/thrown/grenade.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityRunicBomb.class, renderManager -> new RunicBombRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/thrown/runic_bomb.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityRunicGuardianShot.class, renderManager -> new RunicGuardianShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityRunicGuardianShotHeavy.class, renderManager -> new RunicGuardianShotHeavyRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityRunicGuardianShotLight.class, renderManager -> new RunicGuardianShotLightRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntitySeaocron.class, renderManager -> new SeaocronRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntitySeedDart.class, renderManager -> new SeedDartRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/seed_dart.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntitySelyanSticklerShot.class, renderManager -> new SelyanSticklerShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntitySelyanSticklerStuck.class, renderManager -> new SelyanSticklerStuckRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityShadowlordShot.class, renderManager -> new ShadowlordShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityShoeShot.class, renderManager -> new ShoeShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/shoe_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityShowerShot.class, renderManager -> new ShowerShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityShroomBullet.class, renderManager -> new ShroomBulletRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/limonite_bullet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityShyreBeam.class, renderManager -> new ShyreBeamRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityShyreShot.class, renderManager -> new ShyreShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkulloShot.class, renderManager -> new SkulloShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/skullo_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkyShot.class, renderManager -> new SkyShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/mobshots/sky_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntitySliceStar.class, renderManager -> new SliceStarRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/thrown/slice_star.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntitySmileBlaster.class, renderManager -> new SmileBlasterShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/smiley_cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntitySmileyCannonball.class, renderManager -> new SmileyCannonballRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/smiley_cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntitySniperSlug.class, renderManager -> new SniperSlugRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntitySoulDrainer.class, renderManager -> new SoulDrainerRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntitySoulSpark.class, renderManager -> new SoulSparkRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntitySoulStorm.class, renderManager -> new SoulStormRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntitySpectralHollyArrow.class, renderManager -> new SpectralHollyArrowRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/arrows/spectral_holly_arrow.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntitySpectralShot.class, renderManager -> new SpectralShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntitySpiritualShot.class, renderManager -> new SpiritualShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityStickyCoolBomb.class, renderManager -> new StickyCoolBombRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityStickyRedBomb.class, renderManager -> new StickyRedBombRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntitySunsetBullet.class, renderManager -> new SunsetBulletRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/limonite_bullet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntitySunShot.class, renderManager -> new SunShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntitySwarmShot.class, renderManager -> new SwarmShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityTangleFall.class, renderManager -> new TangleFallRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityTidalWave.class, TidalWaveRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityTippedHollyArrow.class, renderManager -> new TippedHollyArrowRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/arrows/tipped_holly_arrow.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityToxicBullet.class, renderManager -> new ToxicBulletRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/limonite_bullet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityToxicShot.class, renderManager -> new ToxicShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityTriDischargeShot.class, renderManager -> new TriDischargeShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/discharge_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityUltimatumShot.class, renderManager -> new UltimatumShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityValkyrieShot.class, renderManager -> new ValkyrieShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityVineWizardShot.class, renderManager -> new VineWizardShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityVolarShot.class, renderManager -> new VolarShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/mobshots/volar_shot.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityVortexBlaster.class, renderManager -> new VortexBlasterRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityVoxCannon.class, renderManager -> new VoxCannonShotRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/cannonball.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityVoxxulonMeteor.class, renderManager -> new VoxxulonMeteorRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityVulkram.class, renderManager -> new VulkramRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/thrown/vulkram.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityWartDart.class, renderManager -> new WartDartRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/wart_dart.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityWaterBalloonBomb.class, renderManager -> new WaterBalloonBombRenderer(renderManager, new ResourceLocation("aoa3", "textures/entities/projectiles/cannonshots/balloon_bomb.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityWaterShot.class, renderManager -> new WaterShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityWeightedShowerShot.class, renderManager -> new ShowerShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityWhiteBall.class, renderManager -> new WhiteBallRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityWinderShot.class, renderManager -> new WinderShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityWitherBall.class, renderManager -> new WitherBallRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityWitherShot.class, renderManager -> new WitherShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityWrathShot.class, renderManager -> new WrathShotRenderer(renderManager, null));
		RenderingRegistry.registerEntityRenderingHandler(EntityYellowBullet.class, renderManager -> new ColouredTexturedProjectileRenderer(renderManager, Enums.RGBIntegers.YELLOW, new ResourceLocation("aoa3", "textures/entities/projectiles/bullets/limonite_bullet.png")));
		RenderingRegistry.registerEntityRenderingHandler(EntityYellowGuardianShot.class, renderManager -> new YellowGuardianShotRenderer(renderManager, null));
	}

	public static void postInit() {
		Minecraft.getMinecraft().getItemColors().registerItemColorHandler((stack, tintIndex) -> tintIndex == 0 ? PotionUtils.getColor(stack) : -1, ItemRegister.TIPPED_HOLLY_ARROW);
	}
}