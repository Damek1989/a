import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AddTeam {
    public List<Player> getChelsea() throws IOException
    {
        Stream<String> lines = Files.lines(Paths.get("Chelsea.txt"));
        List<String> dataList = new ArrayList<>();
        lines.forEach(x -> dataList.add(x));
        List<Player> playerList = new ArrayList<>();
        for (String s : dataList) {
            String[] split = s.split(",");
            int number = Integer.valueOf(split[0]);
            String name = split[1];
            String pos = split[2];
            String leg = split[3];
            playerList.add(new Player(name, number, pos, leg));
        }
        return playerList;
    }
}
