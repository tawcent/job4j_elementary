package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class X2Test {

    @Test
    void whenA20B0C0X2Then80() {
        int a = 20;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 80;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA25B2C0X2Then104() {
        int a = 25;
        int b = 2;
        int c = 0;
        int x = 2;
        int expected = 104;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA4B5C2X2Then28() {
        int a = 4;
        int b = 5;
        int c = 2;
        int x = 2;
        int expected = 28;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void whenA2B9C15X2Then41() {
        int a = 2;
        int b = 9;
        int c = 15;
        int x = 2;
        int expected = 41;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }
}