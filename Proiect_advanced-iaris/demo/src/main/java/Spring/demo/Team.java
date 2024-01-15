package Spring.demo;


import javax.persistence.*;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int players;

    private String manager;

    enum League{
        Liga1,
        Liga2,
        Liga3,
        Liga4
    }


    @Enumerated(EnumType.STRING)
    private League league;

//    Pana aici modifici tu




    public Team(String name, int players, String manager, League league) {
        this.name = name;
        this.players = players;
        this.manager = manager;
        this.league = league;
    }

    public Team(AddTeamModel addTeamModel , String league){
        this.name = addTeamModel.getName();
        this.players = addTeamModel.getPlayers();
        this.manager = addTeamModel.getManager();
        this.league = transformLeage(league);
    }



    private League transformLeage(String league){

        switch(league) {
            case "Liga1":
                return League.Liga1;
            case "Liga2":
                return League.Liga2;
            case "Liga3":
                return League.Liga3;
            case "Liga4":
                return League.Liga4;

            default:
               return League.Liga1;
        }

    }

    public Team() {
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

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}
