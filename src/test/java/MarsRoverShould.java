import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
            "RRR, 0:0:W",
    })
    void rotate_right(String commands, String expectedPosition){
        MarsRover marsRover = new MarsRover();

        String currentPosition = marsRover.execute(commands);

        assertEquals(expectedPosition, currentPosition);
    }
    @ParameterizedTest
    @CsvSource({
            "M, 0:1:N",
            "MM, 0:2:N",
            "MMM, 0:3:N",
            "MMMRRM, 0:2:S",
            "MMMMMMMMMM, 0:0:N",
            "LLM, 0:9:S"
    })
    void move_YAxis(String commands, String expectedPosition){
        MarsRover marsRover = new MarsRover();

        String currentPosition = marsRover.execute(commands);

        assertEquals(expectedPosition, currentPosition);
    }
    @ParameterizedTest
    @CsvSource({
            "RM, 1:0:E",
            "RMM, 2:0:E",
            "RMMMMMMMMMM, 0:0:E",
            "RMMMLLM, 2:0:W",
            "LM, 9:0:W",
    })
    void move_XAxis(String commands, String expectedPosition){
        MarsRover marsRover = new MarsRover();

        String currentPosition = marsRover.execute(commands);

        assertEquals(expectedPosition, currentPosition);
    }
}
