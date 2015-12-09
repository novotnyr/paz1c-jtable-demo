package sk.upjs.ics.paz1c.jtable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HockeyPlayersDao {
    private List<Player> players = new LinkedList<>();

    public HockeyPlayersDao() {
        players.add(new Player(3L, "Marián Hossa", 81, "Chicago Blackhawks"));
        players.add(new Player(6L, "Marián Gáborík", 12, "LA Kings"));
        players.add(new Player(11L, "Zdeno Chára", 33, "Boston Bruins"));
        players.add(new Player(12L, "Ľubomír Višňovský", 11, "NY Islanders"));
    }

    /**
     * Return all players that are available;
     */
    public List<Player> list() {
        return Collections.unmodifiableList(this.players);
    }
}
