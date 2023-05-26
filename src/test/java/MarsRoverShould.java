import org.junit.jupiter.api.Test;

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
    @Test
    void be_at_position_0_0_W_when_single_L_received(){
        MarsRover marsRover = new MarsRover();

        String currentPosition = marsRover.execute("L");

        String expectedPosition = "0:0:W";
        assertEquals(expectedPosition, currentPosition);
    }
}
