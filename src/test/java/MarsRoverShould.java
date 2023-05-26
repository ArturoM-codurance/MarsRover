import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.concurrent.SubmissionPublisher;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {

    @Test
    void be_at_position_0_0_N_when_no_commands_received(){
        MarsRover marsRover = new MarsRover();

        String currentPosition = marsRover.execute("");

        String expectedPosition = "0:0:N";
        assertEquals(expectedPosition, currentPosition);
    }
    @ParameterizedTest
    @CsvSource({
            "L, 0:0:W",
            "LL, 0:0:S",
            "LLL, 0:0:E",
            "LLLL, 0:0:N"
    })
    void rotate_left(String commands, String expectedPosition){
        MarsRover marsRover = new MarsRover();

        String currentPosition = marsRover.execute(commands);

        assertEquals(expectedPosition, currentPosition);
    }
    @ParameterizedTest
    @CsvSource({
            "R, 0:0:E",
            "RR, 0:0:S",
    })
    void rotate_right(String commands, String expectedPosition){
        MarsRover marsRover = new MarsRover();

        String currentPosition = marsRover.execute(commands);

        assertEquals(expectedPosition, currentPosition);
    }
}
