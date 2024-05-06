package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void sumAllNum() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void startMoreFin() {
        int start = 5;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void startAndFinAllNum() {
        int start = 2;
        int finish = 12;
        int result = Counter.sum(start, finish);
        int expected = 77;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThirty() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartNumMinusFromEvenNum() {
        int start = -1;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

}