package com.WowTodoConsoleApp;

import java.time.Duration;
import java.time.Period;

public class RaidTodo extends TodoBase{
    private RaidDifficulty difficulty;

    public RaidTodo(){
        super();
        setDifficulty(RaidDifficulty.Lfr);
    }

    public RaidDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(RaidDifficulty difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return super.toString()+" "+getDifficulty();
    }
}

