package com.example.spells;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.example.runes.BasicRune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SummoningCircle {
    @Autowired
    private BasicRune mainRune = new BasicRune();
    private String entity = "Nothing";

    public SummoningCircle() {
    }

    public SummoningCircle(BasicRune mainRune, String entity) {
        this.mainRune = mainRune;
        this.entity = entity;
    }

    public String summonEntitiy() {
        if (mainRune.getDoRections())
            return entity;
        return "Summon failed";
    }

    @PostConstruct
    private void init() {
        System.out.println("Summoning Circle is created");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Summoning Circle is destroyed");
    }
}
