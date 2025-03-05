package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DataProvider {
    static Stream<Arguments> provideAdditionData(){
        return Stream.of(
                Arguments.of(5, 10, 15),
                Arguments.of(15, 10, 15),
                Arguments.of(25,10,35)
        );
    }
    static Stream<List<String>> provideArrayData() {
        return Stream.of(
                Arrays.asList("pp", "qq", "22", "p"),
                Arrays.asList("y", "n", "x")
        );
    }
}
