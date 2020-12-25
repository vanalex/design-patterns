package org.example.state;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StateTest {

    @Test
    public void testChangeOfStates(){
        GunballMachine machine = new GunballMachine(State.HAS_QUARTER);
        assertThat(machine.getState()).isEqualTo(State.HAS_QUARTER);
        machine.changeState(State.NO_QUARTER);
        assertThat(machine.getState()).isEqualTo(State.NO_QUARTER);
    }
}
