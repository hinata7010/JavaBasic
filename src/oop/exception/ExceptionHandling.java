package oop.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        FileInput();
    }

    public static void FileInput()
    {
        try
        {
            FileInputStream fis = new FileInputStream("data.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("해당 파일이 존재하지 않습니다. 확인해주세요");
        }
    }
}
