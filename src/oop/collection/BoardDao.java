package oop.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    List<Board> board = new ArrayList<>();

    public List<Board> getBoard() {
        return board;
    }

    public int BoardSize()
    {
        return board.size();
    }
}
