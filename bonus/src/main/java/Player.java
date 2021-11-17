public class Player {
    private int number;
    private String fullName;
    private Position position;

    public Player(int number, String fullname, Position position) {
        this.number = number;
        this.fullName = fullname;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public String getFullName() {
        return fullName;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "số áo: " + number +
                ", tên cầu thủ: " + fullName + '\'' +
                ", vị trí: " + position.getValue();
    }
}
