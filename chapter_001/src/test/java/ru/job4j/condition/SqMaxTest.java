package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenSqMax1To2To3To4Then4() {
        //test pass
        int result = SqMax.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenSqMax1To2To5To4Then5() {
        int result = SqMax.max(1, 2, 5, 4);
        assertThat(result, is(5));
    }
    @Test
    public void whenSqMax1To6To3To4Then6() {
        int result = SqMax.max(1, 6, 3, 4);
        assertThat(result, is(6));
    }
    @Test
    public void whenSqMax7To2To3To4Then7() {
        //test pass
        int result = SqMax.max(7, 2, 3, 4);
        assertThat(result, is(7));
    }

}
