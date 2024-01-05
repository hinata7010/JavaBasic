package oop.compareable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareCoordinate {
    public static void main(String[] args) {
        List<Coordinate> list = new ArrayList<>();
        list.add(new Coordinate(1, 2));
        list.add(new Coordinate(1, 1));
        list.add(new Coordinate(1, 3));

        System.out.println("정렬 전");
        list.stream().forEach(number -> System.out.println(number));
        Collections.sort(list);
        System.out.println("정렬 후");
        list.stream().forEach(number -> System.out.println(number));

    }

    static class Coordinate implements Comparable<Coordinate> {
        int x, y;

        @Override
        public String toString() {
            return "Coordinate{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Coordinate o) {
            return COMPARATOR.compare(this, o);
        }

        private static final Comparator<Coordinate> COMPARATOR =
                Comparator.comparing((Coordinate coordinate) -> coordinate.x)
                        .thenComparing(coordinate -> coordinate.y);
    }
}
