package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        throw new IllegalStateException(
                String.format("Could not way by diagonal from %s to %s", source, dest)
        );
 //       if (!isDiagonal(source, dest)) {
 //          throw new IllegalStateException(
 //                 String.format("Could not way by diagonal from %s to %s", source, dest)
 //       );
 //       }
 //      int size = 8;
 //      Cell[] steps = new Cell[size];
 //      int deltaX = 1;
 //      int deltaY = 1;
 //      for (int index = 0; index < size; index++) {
 //          int x = source.x + deltaX;
 //          int y = source.y + deltaY;
 //          steps[index] = Cell.findBy(x,y);
 //          x++;
 //          y++;
 //      }
 //      return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        //TODO check diagonal
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
