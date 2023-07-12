package fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzShould {

    @Test
    void return_unchanged_numbers() {
        //Arrange
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //Act
        HashMap<Integer, String> received = fizzbuzz.process(List.of(1, 2));

        //Assert
        HashMap<Integer, String> expected = new HashMap<>();
        expected.put(1, "1");
        expected.put(2, "2");
        assertEquals(expected, received);
    }

    @Test
    void return_larger_set_of_unchanged_numbers() {
        //Arrange
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //Act
        HashMap<Integer, String> received = fizzbuzz.process(List.of(1, 2, 4, 7));

        //Assert
        HashMap<Integer, String> expected = new HashMap<>();
        expected.put(1, "1");
        expected.put(2, "2");
        expected.put(4, "4");
        expected.put(7, "7");
        assertEquals(expected, received);
    }

    @Test
    void return_fizz_when_three_is_part_of_the_set_of_numbers() {
        //Arrange
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //Act
        HashMap<Integer, String> received = fizzbuzz.process(List.of(1, 2, 3, 4, 7));

        //Assert
        HashMap<Integer, String> expected = new HashMap<>();
        expected.put(1, "1");
        expected.put(2, "2");
        expected.put(3, "Fizz");
        expected.put(4, "4");
        expected.put(7, "7");
        assertEquals(expected, received);
    }

    @Test
    void return_fizz_when_multiples_of_three_are_part_of_the_set_of_numbers() {
        //Arrange
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //Act
        HashMap<Integer, String> received = fizzbuzz.process(List.of(1, 2, 3, 4, 7, 9, 12));

        //Assert
        HashMap<Integer, String> expected = new HashMap<>();
        expected.put(1, "1");
        expected.put(2, "2");
        expected.put(3, "Fizz");
        expected.put(4, "4");
        expected.put(7, "7");
        expected.put(9, "Fizz");
        expected.put(12, "Fizz");
        assertEquals(expected, received);
    }

    @Test
    void return_buzz_when_multiples_of_five_are_part_of_the_set_of_numbers() {
        //Arrange
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //Act
        HashMap<Integer, String> received = fizzbuzz.process(List.of(1, 2, 4, 5, 7, 10));

        //Assert
        HashMap<Integer, String> expected = new HashMap<>();
        expected.put(1, "1");
        expected.put(2, "2");
        expected.put(4, "4");
        expected.put(5, "Buzz");
        expected.put(7, "7");
        expected.put(10, "Buzz");
        assertEquals(expected, received);
    }

    @Test
    void return_fizzbuzz_when_multiples_of_three_and_five_are_part_of_the_set_of_numbers() {
        //Arrange
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //Act
        HashMap<Integer, String> received = fizzbuzz.process(List.of(15, 30, 45));

        //Assert
        HashMap<Integer, String> expected = new HashMap<>();
        expected.put(15, "FizzBuzz");
        expected.put(30, "FizzBuzz");
        expected.put(45, "FizzBuzz");
        assertEquals(expected, received);
    }

}
