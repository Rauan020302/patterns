package com.company.memento;

public class MementoApp {
    public static void main(String[] args) {
        Game g = new Game();
        g.set("LVL1",30);
        System.out.println(g);

        File file = new File();
        file.setSave(g.save());

        g.set("LVL2",50);
        System.out.println(g);

        g.load(file.getSave());
        System.out.println(g);

    }
}
class Game{
    private String level;
    private int ms;
    public void set(String level,int ms){
        this.level=level;
        this.ms=ms;
    }
    public void load(Save save){
        level = save.getLevel();
        ms = save.getMs();
    }
    public Save save() {
        return new Save(level,ms);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", ms=" + ms +
                '}';
    }
}
class Save{
    private final String level;
    private final int ms;

    public Save(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }
    public String getLevel() {
        return level;
    }
    public int getMs() {
        return ms;
    }
}
class File{
    Save save;

    public Save getSave() {
        return save;
    }
    public void setSave(Save save) {
        this.save = save;
    }
}
