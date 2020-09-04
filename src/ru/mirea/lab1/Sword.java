package ru.mirea.lab1;

public class Sword {
    private String name;
    private int longOfSword;
    public Sword(String name, int longOfSword){
        this.name = name;
        this.longOfSword = longOfSword;
    }
    public Sword(String name){
        this.name = name;
        this.longOfSword = 20;
    }
    public Sword(int longOfSword){
        this.name = "Kinata";
        this.longOfSword = longOfSword;
    }
    public Sword(){
        this.name = "Kinata";
        this.longOfSword = 20;
    }
    public void setLong(int longOfSword) {
        this.longOfSword = longOfSword;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getLong() {
        return longOfSword;
    }
    public String toString(){
        return "--------------Sword-------------\nName of sword: " + this.name + "\nlong: "+this.longOfSword;
    }
}
