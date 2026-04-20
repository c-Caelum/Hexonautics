package caelum.hexonautics.neoforge;

import net.neoforged.fml.common.Mod;

import caelum.hexonautics.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
