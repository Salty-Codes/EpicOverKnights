package com.saltycodes.overgearedepicknights.items;

public enum BladeMaterial {
    BRONZE("bronze"),
    COPPER("copper"),
    GOLD("gold"),
    IRON("iron"),
    SILVER("silver"),
    STEEL("steel"),
    STONE("stone"),
    TIN("tin");

    private final String name;

    BladeMaterial(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
