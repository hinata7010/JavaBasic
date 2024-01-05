package oop.comparabletest;

import java.util.Comparator;
class CompareScore implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.score == o2.score)
        {
            return Integer.compare(o1.id, o2.id);
        }
        else if(o2.score > o1.score)
        {
            return 1;
        }
        else {
            return -1;
        }
    }
}