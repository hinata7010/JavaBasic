package oop.compareable;

public class Member implements Comparable<Member>{
       public String name;
       public Integer age;

       public Member(String name, Integer age){
           this.name = name;
           this.age = age;
       }
      /* public int hashCode(){
           return
           //return name.hashCode() + age;
       }*/

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    /*public boolean equals(Object o){
           if(o instanceof Member m){
               return m.name.equals(name) && (m.age == age);
           }else {
           }
       }*/






    public int compareTo(Member o) {
        if(age<o.age) return 1;
        else if(age == o.age) return 0;
        else return -1;

    }


}
