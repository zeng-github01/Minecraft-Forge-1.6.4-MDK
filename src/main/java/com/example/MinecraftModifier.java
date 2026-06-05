package com.example;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

public class MinecraftModifier implements IFMLLoadingPlugin {
    @Override
    public String[] getASMTransformerClass() {
        return new String[]{
                "com.example.ExampleAccessTransformer"
        };
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> map) {

    }
}
