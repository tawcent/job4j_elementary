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
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void startMoreFin() {
        int start = 5;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void startAndFinAllNum() {
        int start = 2;
        int finish = 12;
        int result = Counter.sum(start, finish);
        int expected = 77;
        assertThat(expected).isEqualTo(result);
    }

}