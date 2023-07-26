import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.concurrent.SubmissionPublisher;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {

    @ParameterizedTest
    @CsvSource({
            " '', '0:0:N'",
            " 'R', '0:0:E'",
            " 'RR', '0:0:S'",
            " 'RRR', '0:0:W'",
            " 'RRRR', '0:0:N'",
            " 'RRRRR', '0:0:E'",
            " 'L', '0:0:W'",
            " 'LL', '0:0:S'",
            " 'LLL', '0:0:E'",
            " 'LLLL', '0:0:N'",
            " 'LLLLL', '0:0:W'",
            " 'LRR', '0:0:E'",
            " 'M', '0:1:N'",
            " 'RMM', '2:0:E'",
            " 'MMRRM', '0:1:S'",
            " 'RRM', '0:9:S'",
            " 'LM', '9:0:W'",
    })
    void be_at_position_when_commands_received(String input, String output) {
        MarsRover marsRover = new MarsRover();

        String currentPosition = marsRover.execute(input);

        assertEquals(output, currentPosition);
    }
}
