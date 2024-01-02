package oop.day2.hamburger;

public class HamburgerBuilder {

    private final int bun;
    private final int patty;

    //선택적 매개변수

    private int cheese;
    private int tomato;
    private int bacon;

    public HamburgerBuilder(Builder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.tomato = builder.tomato;
        this.bacon = builder.bacon;
    }

    public static class Builder {

        private final int bun;
        private final int patty;

        //선택적 매개변수

        private int cheese;
        private int tomato;
        private int bacon;

        public Builder(int bun, int patty) {
            this.bun = bun;
            this.patty = patty;
        }


        public Builder tomato(int val) {
            tomato = val;
            return this;
        }

        public Builder cheese(int val) {
            cheese = val;
            return this;
        }

        public Builder bacon(int val) {
            bacon = val;
            return this;
        }

        public HamburgerBuilder build() {
            return new HamburgerBuilder(this);
        }
    }

    public void showOrder() {
        System.out.println("빵 : " + bun + ", 패티 : " + patty + ", 치즈 : " + cheese + ", 토마토 : " + tomato + ", 베이컨 : " + bacon);
    }
}
