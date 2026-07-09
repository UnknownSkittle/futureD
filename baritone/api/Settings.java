/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ain
 *  aow
 *  aox
 *  bib
 *  bjb
 *  fq
 *  hh
 */
package baritone.api;

import baritone.api.Settings$Setting;
import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public final class Settings {
    public final Settings$Setting<Boolean> allowBreak = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> allowSprint = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> allowPlace = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> allowInventory = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Double> blockPlacementPenalty = new Settings$Setting(this, 20.0, null);
    public final Settings$Setting<Double> blockBreakAdditionalPenalty = new Settings$Setting(this, 2.0, null);
    public final Settings$Setting<Double> jumpPenalty = new Settings$Setting(this, 2.0, null);
    public final Settings$Setting<Double> walkOnWaterOnePenalty = new Settings$Setting(this, 3.0, null);
    public final Settings$Setting<Boolean> allowWaterBucketFall = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> assumeWalkOnWater = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> assumeWalkOnLava = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> assumeStep = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> assumeSafeWalk = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> allowJumpAt256 = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> allowParkourAscend = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> allowDiagonalDescend = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> allowDiagonalAscend = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> allowDownward = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<List<ain>> acceptableThrowawayItems = new Settings$Setting(this, new ArrayList<ain>(Arrays.asList(ain.a((aow)aox.d), ain.a((aow)aox.e), ain.a((aow)aox.aV), ain.a((aow)aox.b))), null);
    public final Settings$Setting<List<aow>> blocksToAvoid = new Settings$Setting(this, new ArrayList(), null);
    public final Settings$Setting<List<aow>> blocksToAvoidBreaking = new Settings$Setting(this, new ArrayList<aow>(Arrays.asList(aox.ai, aox.al, aox.am, aox.ae, aox.cg, aox.an, aox.ax)), null);
    public final Settings$Setting<List<aow>> buildIgnoreBlocks = new Settings$Setting(this, new ArrayList<aow>(Arrays.asList(new aow[0])), null);
    public final Settings$Setting<Boolean> buildIgnoreExisting = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> avoidUpdatingFallingBlocks = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> allowVines = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> allowWalkOnBottomSlab = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> allowParkour = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> allowParkourPlace = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> considerPotionEffects = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> sprintAscends = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> overshootTraverse = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> pauseMiningForFallingBlocks = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Integer> rightClickSpeed = new Settings$Setting(this, 4, null);
    public final Settings$Setting<Float> blockReachDistance = new Settings$Setting(this, Float.valueOf(4.5f), null);
    public final Settings$Setting<Double> randomLooking = new Settings$Setting(this, 0.01, null);
    public final Settings$Setting<Double> costHeuristic = new Settings$Setting(this, 3.563, null);
    public final Settings$Setting<Integer> pathingMaxChunkBorderFetch = new Settings$Setting(this, 50, null);
    public final Settings$Setting<Double> backtrackCostFavoringCoefficient = new Settings$Setting(this, 0.5, null);
    public final Settings$Setting<Boolean> avoidance = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Double> mobSpawnerAvoidanceCoefficient = new Settings$Setting(this, 2.0, null);
    public final Settings$Setting<Integer> mobSpawnerAvoidanceRadius = new Settings$Setting(this, 16, null);
    public final Settings$Setting<Double> mobAvoidanceCoefficient = new Settings$Setting(this, 1.5, null);
    public final Settings$Setting<Integer> mobAvoidanceRadius = new Settings$Setting(this, 8, null);
    public final Settings$Setting<Boolean> rightClickContainerOnArrival = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> enterPortal = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> minimumImprovementRepropagation = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> cutoffAtLoadBoundary = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Double> maxCostIncrease = new Settings$Setting(this, 10.0, null);
    public final Settings$Setting<Integer> costVerificationLookahead = new Settings$Setting(this, 5, null);
    public final Settings$Setting<Double> pathCutoffFactor = new Settings$Setting(this, 0.9, null);
    public final Settings$Setting<Integer> pathCutoffMinimumLength = new Settings$Setting(this, 30, null);
    public final Settings$Setting<Integer> planningTickLookahead = new Settings$Setting(this, 150, null);
    public final Settings$Setting<Integer> pathingMapDefaultSize = new Settings$Setting(this, 1024, null);
    public final Settings$Setting<Float> pathingMapLoadFactor = new Settings$Setting(this, Float.valueOf(0.75f), null);
    public final Settings$Setting<Integer> maxFallHeightNoWater = new Settings$Setting(this, 3, null);
    public final Settings$Setting<Integer> maxFallHeightBucket = new Settings$Setting(this, 20, null);
    public final Settings$Setting<Boolean> allowOvershootDiagonalDescend = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> simplifyUnloadedYCoord = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Integer> movementTimeoutTicks = new Settings$Setting(this, 100, null);
    public final Settings$Setting<Long> primaryTimeoutMS = new Settings$Setting(this, 500L, null);
    public final Settings$Setting<Long> failureTimeoutMS = new Settings$Setting(this, 2000L, null);
    public final Settings$Setting<Long> planAheadPrimaryTimeoutMS = new Settings$Setting(this, 4000L, null);
    public final Settings$Setting<Long> planAheadFailureTimeoutMS = new Settings$Setting(this, 5000L, null);
    public final Settings$Setting<Boolean> slowPath = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Long> slowPathTimeDelayMS = new Settings$Setting(this, 100L, null);
    public final Settings$Setting<Long> slowPathTimeoutMS = new Settings$Setting(this, 40000L, null);
    public final Settings$Setting<Boolean> chunkCaching = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> pruneRegionsFromRAM = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> containerMemory = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> backfill = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> chatDebug = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> chatControl = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> chatControlAnyway = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> renderPath = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> renderPathAsLine = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> renderGoal = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> renderSelectionBoxes = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> renderGoalIgnoreDepth = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> renderGoalXZBeacon = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> renderSelectionBoxesIgnoreDepth = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> renderPathIgnoreDepth = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Float> pathRenderLineWidthPixels = new Settings$Setting(this, Float.valueOf(5.0f), null);
    public final Settings$Setting<Float> goalRenderLineWidthPixels = new Settings$Setting(this, Float.valueOf(3.0f), null);
    public final Settings$Setting<Boolean> fadePath = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> freeLook = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> antiCheatCompatibility = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> pathThroughCachedOnly = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> sprintInWater = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> blacklistClosestOnFailure = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> renderCachedChunks = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Float> cachedChunksOpacity = new Settings$Setting(this, Float.valueOf(0.5f), null);
    public final Settings$Setting<Boolean> prefixControl = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<String> prefix = new Settings$Setting(this, "#", null);
    public final Settings$Setting<Boolean> shortBaritonePrefix = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> echoCommands = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> censorCoordinates = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> censorRanCommands = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> preferSilkTouch = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> walkWhileBreaking = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> splicePath = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Integer> maxPathHistoryLength = new Settings$Setting(this, 300, null);
    public final Settings$Setting<Integer> pathHistoryCutoffAmount = new Settings$Setting(this, 50, null);
    public final Settings$Setting<Integer> mineGoalUpdateInterval = new Settings$Setting(this, 5, null);
    public final Settings$Setting<Integer> maxCachedWorldScanCount = new Settings$Setting(this, 10, null);
    public final Settings$Setting<Boolean> exploreForBlocks = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Integer> worldExploringChunkOffset = new Settings$Setting(this, 0, null);
    public final Settings$Setting<Integer> exploreChunkSetMinimumSize = new Settings$Setting(this, 10, null);
    public final Settings$Setting<Integer> exploreMaintainY = new Settings$Setting(this, 64, null);
    public final Settings$Setting<Boolean> replantCrops = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> replantNetherWart = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> extendCacheOnThreshold = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> buildInLayers = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> layerOrder = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<fq> buildRepeat = new Settings$Setting(this, new fq(0, 0, 0), null);
    public final Settings$Setting<Integer> buildRepeatCount = new Settings$Setting(this, -1, null);
    public final Settings$Setting<Boolean> breakFromAbove = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> goalBreakFromAbove = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> mapArtMode = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> okIfWater = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Integer> incorrectSize = new Settings$Setting(this, 100, null);
    public final Settings$Setting<Double> breakCorrectBlockPenaltyMultiplier = new Settings$Setting(this, 10.0, null);
    public final Settings$Setting<Boolean> schematicOrientationX = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> schematicOrientationY = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> schematicOrientationZ = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<String> schematicFallbackExtension = new Settings$Setting(this, "schematic", null);
    public final Settings$Setting<Integer> builderTickScanRadius = new Settings$Setting(this, 5, null);
    public final Settings$Setting<Boolean> mineScanDroppedItems = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Long> mineDropLoiterDurationMSThanksLouca = new Settings$Setting(this, 250L, null);
    public final Settings$Setting<Boolean> distanceTrim = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> cancelOnGoalInvalidation = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Integer> axisHeight = new Settings$Setting(this, 120, null);
    public final Settings$Setting<Boolean> disconnectOnArrival = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> legitMine = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Integer> legitMineYLevel = new Settings$Setting(this, 11, null);
    public final Settings$Setting<Boolean> legitMineIncludeDiagonals = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Boolean> forceInternalMining = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> internalMiningAirException = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Double> followOffsetDistance = new Settings$Setting(this, 0.0, null);
    public final Settings$Setting<Float> followOffsetDirection = new Settings$Setting(this, Float.valueOf(0.0f), null);
    public final Settings$Setting<Integer> followRadius = new Settings$Setting(this, 3, null);
    public final Settings$Setting<Boolean> disableCompletionCheck = new Settings$Setting(this, Boolean.FALSE, null);
    public final Settings$Setting<Long> cachedChunksExpirySeconds = new Settings$Setting(this, -1L, null);
    public final Settings$Setting<Consumer<hh>> logger = new Settings$Setting(this, arg_0 -> ((bjb)bib.z().q.d()).a(arg_0), null);
    public final Settings$Setting<Double> yLevelBoxSize = new Settings$Setting(this, 15.0, null);
    public final Settings$Setting<Color> colorCurrentPath = new Settings$Setting(this, Color.RED, null);
    public final Settings$Setting<Color> colorNextPath = new Settings$Setting(this, Color.MAGENTA, null);
    public final Settings$Setting<Color> colorBlocksToBreak = new Settings$Setting(this, Color.RED, null);
    public final Settings$Setting<Color> colorBlocksToPlace = new Settings$Setting(this, Color.GREEN, null);
    public final Settings$Setting<Color> colorBlocksToWalkInto = new Settings$Setting(this, Color.MAGENTA, null);
    public final Settings$Setting<Color> colorBestPathSoFar = new Settings$Setting(this, Color.BLUE, null);
    public final Settings$Setting<Color> colorMostRecentConsidered = new Settings$Setting(this, Color.CYAN, null);
    public final Settings$Setting<Color> colorGoalBox = new Settings$Setting(this, Color.GREEN, null);
    public final Settings$Setting<Color> colorInvertedGoalBox = new Settings$Setting(this, Color.RED, null);
    public final Settings$Setting<Color> colorSelection = new Settings$Setting(this, Color.CYAN, null);
    public final Settings$Setting<Color> colorSelectionPos1 = new Settings$Setting(this, Color.BLACK, null);
    public final Settings$Setting<Color> colorSelectionPos2 = new Settings$Setting(this, Color.ORANGE, null);
    public final Settings$Setting<Float> selectionOpacity = new Settings$Setting(this, Float.valueOf(0.5f), null);
    public final Settings$Setting<Float> selectionLineWidth = new Settings$Setting(this, Float.valueOf(2.0f), null);
    public final Settings$Setting<Boolean> renderSelection = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> renderSelectionIgnoreDepth = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> renderSelectionCorners = new Settings$Setting(this, Boolean.TRUE, null);
    public final Settings$Setting<Boolean> desktopNotifications = new Settings$Setting(this, Boolean.FALSE, null);
    public final Map<String, Settings$Setting<?>> byLowerName;
    public final List<Settings$Setting<?>> allSettings;
    public final Map<Settings$Setting<?>, Type> settingTypes;

    Settings() {
        Field[] fieldArray = this.getClass().getFields();
        HashMap<String, Settings$Setting> hashMap = new HashMap<String, Settings$Setting>();
        ArrayList<Settings$Setting> arrayList = new ArrayList<Settings$Setting>();
        HashMap<Settings$Setting, Type> hashMap2 = new HashMap<Settings$Setting, Type>();
        try {
            for (Field field : fieldArray) {
                if (!field.getType().equals(Settings$Setting.class)) continue;
                Settings$Setting settings$Setting = (Settings$Setting)field.get(this);
                String string = field.getName();
                Settings$Setting.access$102(settings$Setting, string);
                string = string.toLowerCase();
                if (hashMap.containsKey(string)) {
                    throw new IllegalStateException("Duplicate setting name");
                }
                hashMap.put(string, settings$Setting);
                arrayList.add(settings$Setting);
                hashMap2.put(settings$Setting, ((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0]);
            }
        } catch (IllegalAccessException illegalAccessException) {
            throw new IllegalStateException(illegalAccessException);
        }
        this.byLowerName = Collections.unmodifiableMap(hashMap);
        this.allSettings = Collections.unmodifiableList(arrayList);
        this.settingTypes = Collections.unmodifiableMap(hashMap2);
    }

    public final <T> List<Settings$Setting<T>> getAllValuesByType(Class<T> clazz) {
        ArrayList<Settings$Setting<T>> arrayList = new ArrayList<Settings$Setting<T>>();
        for (Settings$Setting<?> settings$Setting : this.allSettings) {
            if (!settings$Setting.getValueClass().equals(clazz)) continue;
            arrayList.add(settings$Setting);
        }
        return arrayList;
    }
}

