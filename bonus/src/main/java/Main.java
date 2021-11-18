public class Main {
    public static void main(String[] args){
        PlayerRepository.getData();
        PlayerRepository.print();
        PlayerRepository.classifyPlayerByPositions();

        System.out.println("lựa chọn 11 cầu thủ");
        System.out.println("1GK - 4DF - 4MF - 2FW");
        PlayerRepository.getTeams(4, 4, 2);
        System.out.println("-----------------------------");
        System.out.println("1GK - 4DF - 3MF - 3FW");
        PlayerRepository.getTeams(4, 3, 3);
        System.out.println("-----------------------------");
        System.out.println("1GK - 3DF - 5MF - 2FW");
        PlayerRepository.getTeams(3, 5, 2);
    }
}
