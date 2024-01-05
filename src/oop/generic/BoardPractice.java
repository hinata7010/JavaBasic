package oop.generic;

import java.util.ArrayList;
import java.util.List;

public class BoardPractice {
    public static void main(String[] args) {
        Board board1 = new Board(1, "1", "11", "구민석", "2012-12-20");
        Board board2 = new Board(2, "2", "22", "팔민석", "2012-12-20");
        Board board3 = new Board(3, "3", "33", "칠민석", "2012-12-20");
        Board board4 = new Board(4, "4", "44", "육민석", "2012-12-20");

        List<Board> boardList = new ArrayList<>();
        boardList.add(board1);
        boardList.add(board2);
        boardList.add(board3);
        boardList.add(board4);
        boardList.forEach(board -> System.out.println(board.getBcontent()));
        //printList(boardList);
    }

    static <T extends Comparable<?>> void printList(List<T> list)
    {
        list.forEach(System.out::println);
    }
}
