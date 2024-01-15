package oop.thread;

import java.awt.*;

public class BeepPrintEx {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                e.getMessage();
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("뽀삐뽀삐뽀삐뽀삐뽀삐뽀");
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                e.getMessage();
            }
        }
    }
}
