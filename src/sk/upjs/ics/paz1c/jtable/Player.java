package sk.upjs.ics.paz1c.jtable;

public class Player {
    private Long id;

    private String name;

    private int jerseyNumber;

    private String team;

    public Player() {
        // empty constructor
    }

    public Player(Long id, String name, int jerseyNumber, String team) {
        this.id = id;
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", jerseyNumber=").append(jerseyNumber);
        sb.append(", team='").append(team).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
