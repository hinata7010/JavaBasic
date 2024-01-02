package oop.interfacelearn;

public class Cat extends Animal{
    @Override
    void printSound() {
        System.out.println("고양이는 미야옹 미야옹");
    }

    @Override
    void displayInfo() {
        System.out.println("나는 동물입니다.");
    }
}
