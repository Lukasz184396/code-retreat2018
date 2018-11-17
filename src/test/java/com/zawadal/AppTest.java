package com.zawadal;



import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void ifCellIsAliveAndHasTwoNeighboursShouldBeAlive() {
        Cell cell = new Cell(new State(true), new NeighbourHood(2));
        Assert.assertEquals(new State(true), cell.getNextState());
    }

    @Test
    public void ifCellIsAliveAndHasThreeNeighboursShouldBeAlive() {
        Cell cell = new Cell(new State(true), new NeighbourHood(3));
        Assert.assertEquals(new State(true), cell.getNextState());
    }

    @Test
    public void ifCellIsAliveAndHasMoreThanThreeNeighboursShouldBeDead() {
        Cell cell = new Cell(new State(true), new NeighbourHood(4));
        Assert.assertEquals(new State(false), cell.getNextState());
    }
    @Test
    public void ifCellIsDeadAndHasMoreThanThreeNeighboursShouldBeDead() {
        Cell cell = new Cell(new State(false), new NeighbourHood(4));
        Assert.assertEquals(new State(false), cell.getNextState());
    }
    @Test
    public void ifCellIsDeadAndHasMoreThreeNeighboursShouldBeAlive() {
        Cell cell = new Cell(new State(false), new NeighbourHood(3));
        Assert.assertEquals(new State(true), cell.getNextState());
    }






}
