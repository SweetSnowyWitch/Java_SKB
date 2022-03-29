package com.example.spells;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.example.runes.BasicRune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttackSpell {
    private BasicRune mainRune;

    public AttackSpell() {
    }

    @Autowired
    public void setMainRune(BasicRune mainRune) {
        this.mainRune = mainRune;
    }

    public int doDamage() {
        return mainRune.getPowerLevel();
    }

    @PostConstruct
    private void init() {
        System.out.println("Attack Spell is created");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Attack Spell is destroyed");
    }
}
