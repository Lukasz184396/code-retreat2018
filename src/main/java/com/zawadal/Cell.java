package com.zawadal;

public class Cell {
    State state;
    NeighbourHood neighbourHood;

    public Cell(State state) {
        this.state = state;
    }

    public Cell(State state, NeighbourHood neighbourHood) {
        this.state = state;
        this.neighbourHood = neighbourHood;
    }

    public State getState() {
        return this.state;
    }
}
