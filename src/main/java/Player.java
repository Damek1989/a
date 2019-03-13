public class Player {
    private String name;
    private int number;
    private String position;
    private String leg;

    public Player(String name, int number, String position, String leg) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public String getLeg() {
        return leg;
    }

}
