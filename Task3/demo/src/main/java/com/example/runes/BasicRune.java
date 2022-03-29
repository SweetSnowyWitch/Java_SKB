package com.example.runes;

import org.springframework.stereotype.Service;

@Service
public class BasicRune implements RuneInterface {
    private int powerLevel = 0;
    private String element = "Magic";
    private boolean doReactions = false;

    public BasicRune() {
    }

    public BasicRune(int powerLevel, String element, boolean doReactions) {
        this.powerLevel = powerLevel;
        this.element = element;
        this.doReactions = doReactions;
    }

    public void doReaction(RuneInterface otherRune) {
        if (doReactions && otherRune.getDoRections())
            powerLevel += otherRune.getPowerLevel();
    }
}
