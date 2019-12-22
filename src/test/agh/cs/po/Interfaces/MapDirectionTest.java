package agh.cs.po.Interfaces;

import agh.cs.po.EnumClasses.MapDirection;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MapDirectionTest {

    @Test
    void next() {
        assertEquals(MapDirection.NORTH, MapDirection.WEST.next());
        assertEquals(MapDirection.WEST, MapDirection.SOUTH.next());
        assertEquals(MapDirection.EAST, MapDirection.NORTH.next());
        assertEquals(MapDirection.SOUTH, MapDirection.EAST.next());
    }

    @Test
    void previous() {
        assertEquals(MapDirection.WEST, MapDirection.NORTH.previous());
        assertEquals(MapDirection.SOUTH, MapDirection.WEST.previous());
        assertEquals(MapDirection.NORTH, MapDirection.EAST.previous());
        assertEquals(MapDirection.EAST, MapDirection.SOUTH.previous());
    }

}