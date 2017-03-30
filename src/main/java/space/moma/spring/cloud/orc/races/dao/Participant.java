package space.moma.spring.cloud.orc.races.dao;

import java.util.List;

/**
 * Remote Participant
 * Created by ivan on 17-3-29.
 **/
public class Participant {

    private String firstName;
    private String lastName;
    private String homeState;
    private String shirtSize;
    private List<String> races;

    public Participant(String firstName, String lastName, String homeState, String shirtSize, List<String> races) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeState = homeState;
        this.shirtSize = shirtSize;
        this.races = races;
    }

    public Participant() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    public String getShirtSize() {
        return shirtSize;
    }

    public void setShirtSize(String shirtSize) {
        this.shirtSize = shirtSize;
    }

    public List<String> getRaces() {
        return races;
    }

    public void setRaces(List<String> races) {
        this.races = races;
    }
}
