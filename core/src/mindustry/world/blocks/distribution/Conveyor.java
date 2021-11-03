package mindustry.world.blocks.distribution;

import arc.func.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import arc.util.io.*;
import mindustry.annotations.Annotations.*;
import mindustry.content.*;
import mindustry.entities.units.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.input.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;

public class Conveyor extends Block implements Autotiler{
    private static final float itemSpace = 0.4f;
    private static final int capacity = 3;

    final Vec2 tr1 = new Vec2();
    final Vec2 tr2 = new Vec2();

    public @Load(value = "@-#1-#2", lengths = {7, 4}) TextureRegion[][] regions;

    public float speed = 0f;
    public float displayedSpeed = 0f;

    public @Nullable Block junctionReplacement, bridgeReplacement;

    public Conveyor(String name){
        super(name);
        rotate = true;
        update = true;
        group = BlockGroup.transportation;
        hasItems = true;
        itemCapacity = capacity;
        conveyorPlacement = true;

        ambientSound = Sounds.conveyor;
        ambientSoundVolume = 0.0022f;
        unloadable = false;
        noUpdateDisabled = false;
   
