package oop.stream.section3.optional;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class OnlineClassMain {
    public static void main(String[] args) {
        List<OnlineClass> classList = new ArrayList<>();
        classList.add(new OnlineClass(1, "java basic programming", false));
        classList.add(new OnlineClass(2, "java advanced programming", false));
        classList.add(new OnlineClass(3, "java work programming", true));
        classList.add(new OnlineClass(4, "database programming", true));

        OnlineClass javabasic = new OnlineClass(1, "java basic programming", true);

        Duration studyDuration =javabasic.getProgress().getStudyDuration();
        Progress progress = javabasic.getProgress();
        if(progress != null) {
            System.out.println("studyDuration = " + studyDuration);
        }
    }
}
