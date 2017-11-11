package com.WowTodoConsoleApp;

import java.time.Duration;

public class MythicDungoenTodo extends TodoBase{
    private int mythicDifficulty;
    private int chests;
    private Duration time;

    public MythicDungoenTodo(){
        setChests(0);
        setMythicDifficulty(0);
        setTime(Duration.ofMinutes(10));
    }

    public int getMythicDifficulty() {
        return mythicDifficulty;
    }

    public void setMythicDifficulty(int mythicDifficulty) {
        this.mythicDifficulty = mythicDifficulty;
    }

    public int getChests() {
        return chests;
    }

    public void setChests(int chests) {
        this.chests = chests;
    }

    public Duration getTime() {
        return time;
    }

    public void setTime(Duration time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString()+" "+getMythicDifficulty()+" "+getChests()+" "+getTime();
    }
}
