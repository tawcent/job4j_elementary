package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To2To6Then6() {
        int left = 4;
        int right = 2;
        int third = 6;
        int result = Max.max(left, right, third);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To3To8To10Then2() {
        int left = 5;
        int right = 3;
        int third = 8;
        int four = 10;
        int result = Max.max(left, right, third, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}