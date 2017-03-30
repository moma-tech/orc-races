package space.moma.spring.cloud.orc.races;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import space.moma.spring.cloud.orc.races.dao.Participant;

import java.util.ArrayList;
import java.util.List;

/**
 * Feign Client
 * Created by ivan on 17-3-29.
 **/
@FeignClient("participants")
public interface ParticipantsClient {
    @RequestMapping(method = RequestMethod.GET, value = "/races/{raceId}")
    List<Participant> getParticipants(@PathVariable("raceId") String raceId);
}

@Component
@EnableCircuitBreaker
class ParticipantsClientService {
    private ParticipantsClient participantsClient;

    @Autowired
    ParticipantsClientService(ParticipantsClient participantsClient) {
        this.participantsClient = participantsClient;
    }

    @HystrixCommand(fallbackMethod = "defaultParticipants")
    List<Participant> getParticipants(String raceId) {
        return participantsClient.getParticipants(raceId);
    }

    List<Participant> defaultParticipants(String raceId) {
        return new ArrayList<Participant>();
    }
}