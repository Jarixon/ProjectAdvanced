package Spring.demo;

public class AddTeamModel {

    private String name;
    private int players;
    private String manager;

    private String league;


    public AddTeamModel() {
    }

    public AddTeamModel(String name, int players, String manager, String league) {
        this.name = name;
        this.players = players;
        this.manager = manager;
        this.league = league;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }
}
