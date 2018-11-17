package com.zawadal;

public class Cell {
    private State state;
    private NeighbourHood neighbourHood;

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
        if(neighbourHood.getNumberOfNeighbours() == 2 || neighbourHood.getNumberOfNeighbours() == 3) {
            return new State(true);
        } else if (neighbourHood.getNumberOfNeighbours() == 4){
            return new State(false);
        } else {
            return new State(false);
        }

    }

    public void setState(State state) {
        this.state = state;
    }

    public NeighbourHood getNeighbourHood() {
        return neighbourHood;
    }

    public void setNeighbourHood(NeighbourHood neighbourHood) {
        this.neighbourHood = neighbourHood;
    }
}
