package space.moma.spring.cloud.orc.races;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.moma.spring.cloud.orc.races.dao.Race;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ivan
 * @version 17-3-20
 */
@SpringBootApplication
@RestController
public class OrcRacesApplication implements CommandLineRunner {
    private static List<Race> races = new ArrayList<Race>();

    public static void main(String[] args) {
        SpringApplication.run(OrcRacesApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        races.add(new Race("123", "Spartan Beast", "MA", "Boston"));
        races.add(new Race("456", "Tough Mudder RI", "RI", "Providence"));
    }

    @RequestMapping("/")
    public List<Race> getRaces() {
        return races;
    }
}
