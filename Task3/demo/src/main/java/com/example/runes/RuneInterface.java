package com.example.runes;

public interface RuneInterface {
    int powerLevel = 0;
    String element = "None";
    boolean doReactions = false;

    default boolean getDoRections() {
        return doReactions;
    }

    default String getElement() {
        return element;
    }

    default int getPowerLevel() {
        return powerLevel;
    }
}
