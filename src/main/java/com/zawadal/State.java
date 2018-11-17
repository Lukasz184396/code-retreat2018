package com.zawadal;

import java.util.Objects;

public class State {
    private boolean state;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state1 = (State) o;
        return state == state1.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(state);
    }

    public State(boolean state) {
        this.state = state;
    }
}
