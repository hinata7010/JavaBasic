package oop.day3.family;

public class FamilyMain {
    public static void main(String[] args) {
        SubSon objSon = new SubSon();

        objSon.printSon();
        objSon.printFather();
        objSon.setHouseAddress("인천");
        System.out.println("나의 집은 " + objSon.getHouseAddress());
        objSon.setJob("프로그래머");
        System.out.println("나의 아버지의 직업은 " + objSon.getJob());
        objSon.printGrandFather();
    }
}
