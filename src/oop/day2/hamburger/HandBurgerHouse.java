package oop.day2.hamburger;

public class HandBurgerHouse {
    public static void main(String[] args) {
        /*Hamburger allHam = new Hamburger(1, 1, 1, 1 ,1);//모든 재료가 있는 햄버거
        Hamburger noBaconHam = new Hamburger(1, 1, 1, 1);//빵과 패티와 치즈와 토마토가 있는 햄버거
        Hamburger chessHam = new Hamburger(1, 1, 1);//빵과 패티와 치즈 햄버거
        */
        //2. JAVABean 패턴을 이용하여 햄버거 만들기
        HamburgerBean hamburgerBean = new HamburgerBean();
        //빵과 패티 치즈만 있는 햄버거 만들어주세요 ~~ 근데 치즈는 한장 더주세요
        hamburgerBean.setBun(1);
        hamburgerBean.setPatty(1);
        hamburgerBean.setCheese(2);

        // 빵 패티 토마토

        hamburgerBean.setBun(1);
        hamburgerBean.setPatty(2);
        hamburgerBean.setTomato(2);

        HamburgerBuilder hamuburgerBuilder = new HamburgerBuilder.Builder(2,2).tomato(2).cheese(2).build();

    }
}
