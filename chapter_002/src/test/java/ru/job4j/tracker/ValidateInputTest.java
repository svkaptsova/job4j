package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        String[] arr = {"one", "1"};
        ValidateInput input = new ValidateStubInput(arr);
        input.askInt("Choise");
        assertThat(mem.toString(), is(String.format("Please enter validate data again.%n")));
        System.setOut(out);
    }

    @Test
    public void whenWrongInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        String[] arr = {"7", "seven", "3"};
        ValidateInput input = new ValidateStubInput(arr);
        input.askInt("Choise", 5);
        assertThat(mem.toString(), is(String.format("Please select key from menu.%nPlease enter validate data again.%n")));
        System.setOut(out);
    }
}
