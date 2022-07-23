package CodeWithError;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static class Ball {
    }

    private static class Board {
        private List balls;


        public Board() {
            //нужно удалить List, т.к он у нас был обьявлени выше

            balls = new ArrayList<>();
            balls.add(new Ball());
            balls.add(new Ball());
            balls.add(new Ball());
        }

        public int count() {
            return balls.size();
        }
    }

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.count());
    }
}

