package lvl2lesson1;

public class Cat implements Game{
    private final String name;
    private final int lengthMax;
    private final int heightMax;
    private boolean sesur = true;

    public Cat (String name, int lengthMax, int heightMax) {
        this.name = name;
        this.lengthMax = lengthMax;
        this.heightMax = heightMax;
    }
    public void setSesur(boolean sesur) {
        this.sesur = sesur;
    }
    public void run () {
        System.out.println(name + " Может пробежать " + lengthMax + " км");
    }
    public void jump () {
        System.out.println(name + " Может прыгнуть на " + heightMax + " м");
    }
    public String getName() {
        return name;
    }
    public int getLengthMax () {
        return lengthMax;
    }
    public int getHeightMax () {
        return heightMax;
    }
    public boolean getSesur() {
        return sesur;
    }
}
