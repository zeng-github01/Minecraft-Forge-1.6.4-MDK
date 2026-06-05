package com.example;

import cpw.mods.fml.common.asm.transformers.AccessTransformer;

import java.io.IOException;

public class ExampleAccessTransformer extends AccessTransformer {
    protected ExampleAccessTransformer() throws IOException {
        super("example_at.cfg");
    }
}
