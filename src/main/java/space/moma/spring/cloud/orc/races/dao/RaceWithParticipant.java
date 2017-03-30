package space.moma.spring.cloud.orc.races.dao;

import java.util.List;

/**
 * Race Class with Participants
 * Created by ivan on 17-3-29.
 **/
public class RaceWithParticipant extends Race {

    private List<Participant> participants;

    public RaceWithParticipant(Race r, List<Participant> participants) {
        super(r.getId(), r.getName(), r.getState(), r.getCity());
        this.participants = participants;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
