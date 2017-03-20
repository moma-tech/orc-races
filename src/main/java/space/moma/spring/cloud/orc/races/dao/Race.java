package space.moma.spring.cloud.orc.races.dao;

/**
 * POJO 4 Race
 * Created by ivan on 17-3-20.
 **/
public class Race {
    private String id;
    private String name;
    private String state;
    private String city;

    public Race(String id, String name, String state, String city) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
