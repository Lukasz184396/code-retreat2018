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

    public State getNextState() {
        if(neighbourHood.numberOfNeighbours == 2 || neighbourHood.numberOfNeighbours == 3) {
            return new State(true);
        } else {
            return new State(false);
        }

    }
}
