import java.util.ArrayList;
import java.util.Random;

public class PlayerRepository {
    private static ArrayList<Player> allPlayers = new ArrayList<>();
    private static ArrayList<Player> allGoalKeeper = new ArrayList<>();
    private static ArrayList<Player> allMidField = new ArrayList<>();
    private static ArrayList<Player> allForward = new ArrayList<>();
    private static ArrayList<Player> allDefender = new ArrayList<>();

    public static void getData() {
        allPlayers.add(new Player(1, "bùi tấn trường", Position.GK));
        allPlayers.add(new Player(23, "trần mạnh nguyên", Position.GK));
        allPlayers.add(new Player(12, "nguyễn văn hoàng", Position.GK));
        allPlayers.add(new Player(13, "hồ tấn tài", Position.DF));
        allPlayers.add(new Player(16, "nguyễn thành chung", Position.DF));
        allPlayers.add(new Player(2, "đỗ duy mạnh", Position.DF));
        allPlayers.add(new Player(7, "nguyễn phong hồng duy", Position.DF));
        allPlayers.add(new Player(17, "vũ văn thanh", Position.DF));
        allPlayers.add(new Player(5, "phạm xuân mạnh", Position.DF));
        allPlayers.add(new Player(3, "quế ngọc hải", Position.DF));
        allPlayers.add(new Player(4, "bùi tiến dũng", Position.DF));
        allPlayers.add(new Player(21, "bùi hoàng việt anh", Position.DF));
        allPlayers.add(new Player(19, "nguyễn quang hải", Position.MF));
        allPlayers.add(new Player(15, "phạm đức huy", Position.MF));
        allPlayers.add(new Player(6, "lương xuân trường", Position.MF));
        allPlayers.add(new Player(20, "phan văn đức", Position.MF));
        allPlayers.add(new Player(14, "nguyễn hoàng đức", Position.MF));
        allPlayers.add(new Player(8, "lê văn xuân", Position.MF));
        allPlayers.add(new Player(11, "nguyễn tuấn anh", Position.MF));
        allPlayers.add(new Player(9, "nguyễn văn toàn", Position.FW));
        allPlayers.add(new Player(22, "nguyễn tiến linh", Position.FW));
        allPlayers.add(new Player(10, "nguyễn công phượng", Position.FW));
        allPlayers.add(new Player(18, "hà đức chính", Position.FW));
    }

    public static ArrayList<Player> getAllPlayers() {
        return allPlayers;
    }

    public static void print() {
        for (Player player : allPlayers
        ) {
            System.out.println(player.toString());
        }
    }


    public static void getTeams(int DFsize, int MFsize, int FWsize) {
        ArrayList<Player> selectedTeam = new ArrayList<Player>();
        Random general = new Random();

        int defenderSize = 0;
        int midFieldSize = 0;
        int forwardSize = 0;

        int rdGoalKeeper = general.nextInt(allGoalKeeper.size());
        selectedTeam.add(allGoalKeeper.get(rdGoalKeeper));

        while (defenderSize < DFsize) {
            int rdDefender = general.nextInt(allDefender.size());
            if (!selectedTeam.contains(allDefender.get(rdDefender))) {
                selectedTeam.add(allDefender.get(rdDefender));
                defenderSize++;
            }
        }

        while (midFieldSize < MFsize) {
            int rdMidField = general.nextInt(allMidField.size());
            if (!selectedTeam.contains(allMidField.get(rdMidField))) {
                selectedTeam.add(allMidField.get(rdMidField));
                midFieldSize++;
            }
        }

        while (forwardSize < FWsize) {
            int rdForward = general.nextInt(allForward.size());
            if (!selectedTeam.contains(allForward.get(rdForward))) {
                selectedTeam.add(allForward.get(rdForward));
                forwardSize++;
            }
        }

        for (Player player : selectedTeam
        ) {
            System.out.println(player.toString());
        }
    }

    public static void classifyPlayerByPositions() {
        for (Player player : allPlayers
        ) {
            if (player.getPosition().equals(Position.GK)) {
                allGoalKeeper.add(player);
            } else if (player.getPosition().equals(Position.FW)) {
                allForward.add(player);
            } else if (player.getPosition().equals(Position.MF)) {
                allMidField.add(player);
            } else allDefender.add(player);

        }
    }
}
