import java.util.ArrayList;

public class PlayerRepository {
    private static ArrayList<Player> playerArrayList = new ArrayList<>();

    public static void getData(){
        playerArrayList.add(new Player(1, "bùi tấn trường", Position.GK));
        playerArrayList.add(new Player(23, "trần mạnh nguyên", Position.GK));
        playerArrayList.add(new Player(12, "nguyễn văn hoàng", Position.GK));
        playerArrayList.add(new Player(13, "hồ tấn tài", Position.DF));
        playerArrayList.add(new Player(16, "nguyễn thành chung", Position.DF));
        playerArrayList.add(new Player(2, "đỗ duy mạnh", Position.DF));
        playerArrayList.add(new Player(7, "nguyễn phong hồng duy", Position.DF));
        playerArrayList.add(new Player(17, "vũ văn thanh", Position.DF));
        playerArrayList.add(new Player(5, "phạm xuân mạnh", Position.DF));
        playerArrayList.add(new Player(3, "quế ngọc hải", Position.DF));
        playerArrayList.add(new Player(4, "bùi tiến dũng", Position.DF));
        playerArrayList.add(new Player(21, "bùi hoàng việt anh", Position.DF));
        playerArrayList.add(new Player(19, "nguyễn quang hải", Position.MF));
        playerArrayList.add(new Player(15, "phạm đức huy", Position.MF));
        playerArrayList.add(new Player(6, "lương xuân trường", Position.MF));
        playerArrayList.add(new Player(20, "phan văn đức", Position.MF));
        playerArrayList.add(new Player(14, "nguyễn hoàng đức", Position.MF));
        playerArrayList.add(new Player(8, "lê văn xuân", Position.MF));
        playerArrayList.add(new Player(11, "nguyễn tuấn anh", Position.MF));
        playerArrayList.add(new Player(9, "nguyễn văn toàn", Position.FW));
        playerArrayList.add(new Player(22, "nguyễn tiến linh", Position.FW));
        playerArrayList.add(new Player(10, "nguyễn công phượng", Position.FW));
        playerArrayList.add(new Player(18, "hà đức chính", Position.FW));
    }

    public static ArrayList<Player> getAllPlayers(){
        return playerArrayList;
    }

    public  static  void print(){
        for (Player player: playerArrayList
             ) {
            System.out.println(player.toString());
        }
    }

    public static void getTeams(){

    }
}
