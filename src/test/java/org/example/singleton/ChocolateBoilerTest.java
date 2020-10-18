package org.example.singleton;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChocolateBoilerTest {

    @Test
    public void testThatTwoInstancesAreTheSame(){
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
        assertThat(chocolateBoiler == chocolateBoiler2).isTrue();
    }
}
