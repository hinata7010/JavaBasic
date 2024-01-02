package oop.collection;

public class BoardMain {
    public static void main(String[] args) {
        BoardDao boardDao = new BoardDao();

        boardDao.getBoard().add(new Board(1, 2));
        boardDao.getBoard().add(new Board(2, 3));
        boardDao.getBoard().add(new Board(3, 4));

        for (int i = 0; i < boardDao.getBoard().size(); i++) {
            System.out.println(boardDao.getBoard().get(i).a + ", " + boardDao.getBoard().get(i).b);
        }
    }
}
