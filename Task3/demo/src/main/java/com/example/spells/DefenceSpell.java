package com.example.spells;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.example.runes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefenceSpell {
    @Autowired
    private AdvancedRune mainRune;

    public DefenceSpell() {
    }

    public int doProtection(BasicRune otherRune) {
        mainRune.doReaction(otherRune);
        return mainRune.getPowerLevel();
    }

    @PostConstruct
    private void init() {
        System.out.println("Defence Spell is created");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Defence Spell is destroyed");
    }
}
