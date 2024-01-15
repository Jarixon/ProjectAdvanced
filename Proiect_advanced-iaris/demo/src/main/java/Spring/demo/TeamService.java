package Spring.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }


    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(Long id) {
        return teamRepository.findById(id);
    }

    public Team createTeam(AddTeamModel addTeamModel) {
        Team newTeam = new  Team(addTeamModel , addTeamModel.getLeague());
        return teamRepository.save(newTeam);
    }

    public Team updateTeam(Long id, Team updatedTeam) {
        // Perform any additional processing or validation if needed
        Optional<Team> optionalTeam = teamRepository.findById(id);

        if (optionalTeam.isPresent()) {
            Team newTeam = optionalTeam.get();
            // Update existingPerson properties with updatedPerson properties
            newTeam.setName(updatedTeam.getName());
            newTeam.setLeague(updatedTeam.getLeague());
            newTeam.setManager(updatedTeam.getManager());
            newTeam.setPlayers(updatedTeam.getPlayers());
            // Update other properties as needed
            return teamRepository.save(newTeam);
        } else {
            // Handle not found scenario
            return null;
        }
    }

    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }
}
