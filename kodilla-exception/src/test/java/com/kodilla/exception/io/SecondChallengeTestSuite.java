package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SecondChallengeTestSuite {
    @Test
    void testProbablyWillThrowException() {
        //given
        SecondChallenge second = new SecondChallenge();
        //when & then
        assertAll(
                () -> assertThrows (Exception.class, () ->
                        second.probablyIWillThrowException(2.0, 2.0)),
                () -> assertThrows (Exception.class, () ->
                        second.probablyIWillThrowException(0.5, 1.0)),
                () -> assertThrows (Exception.class, () ->
                        second.probablyIWillThrowException(2.2, 1.5)),
                () -> assertDoesNotThrow(() -> second.probablyIWillThrowException(1.5, 2.0))
        );
    }
}
