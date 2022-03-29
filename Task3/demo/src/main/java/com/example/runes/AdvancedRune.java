package com.example.runes;

import org.springframework.stereotype.Service;

@Service
public class AdvancedRune implements RuneInterface {
    int powerLevel = 1;
    String element = "Magic";
    boolean doReactions = true;

    public AdvancedRune() {
    }

    public AdvancedRune(int powerLevel, String element, boolean doReactions) {
        this.powerLevel = powerLevel;
        this.element = element;
        this.doReactions = doReactions;
    }

    public void doReaction(RuneInterface otherRune) {
        if (doReactions && otherRune.getDoRections())
            powerLevel += otherRune.getPowerLevel();
    }
}
