package space.moma.spring.cloud.orc.races;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import space.moma.spring.cloud.orc.races.dao.Participant;

import java.util.List;

/**
 * Feign Client
 * Created by ivan on 17-3-29.
 **/
@FeignClient("participants")
@Component
public interface ParticipantsClient {
    @RequestMapping(method = RequestMethod.GET, value = "/races/{raceId}")
    List<Participant> getparticipants(@PathVariable("raceId") String raceId);
}