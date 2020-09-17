package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriorityDown() {
        Comparator<Job> downCmpNamePriority = new JobDescByNameUp().thenComparing(new JobDescByPriorityUp());
        int rsl = downCmpNamePriority.compare(
                new Job("Task #1", 3),
                new Job("Task #2", 4)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityUp() {
        Comparator<Job> upCmpNamePriority = new JobDescByNameDown().thenComparing(new JobDescByPriorityDown());
        int rsl = upCmpNamePriority.compare(
                new Job("Task #3", 7),
                new Job("Task #4", 8)
        );
        assertThat(rsl, greaterThan(0));
    }
}
