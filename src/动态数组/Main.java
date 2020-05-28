package 动态数组;

public class Main{
    public static void main(String args[]){
        ArrayList <Person> person=new ArrayList<>();
        person.add(new Person(10,"Jack"));
        person.add(null);
        person.add(new Person(12,"Jame"));
        person.add(null);
        person.add(new Person(15,"Rose"));
        System.out.println(person.indexOf(null));
       // person.clear();
     //   person.remove(0);

        //提醒JVM垃圾回收
        System.gc();
    }
    static void test(){
        ArrayList <Person> person=new ArrayList<>();
        person.add(new Person(10,"Jack"));
        person.add(new Person(12,"Jame"));
        person.add(new Person(15,"Rose"));
        System.out.println(person);

        ArrayList <Integer> ints=new ArrayList<>();
        ints.add(10);
        ints.add(11);
        ints.add(12);
        System.out.println(ints);
        /// /        list.add(99);
//        list.add(88);
//        list.add(77);
//        list.add(66);
//        list.add(55);
//        //list.set(4,80);
//        System.out.println(list);
    }
}
//list.remove(0);
//
//       // list.showElements();
//        //list.clear();
//        System.out.println(list.contains(1));
//        System.out.println(list.indexOf(8));
//        System.out.println(list.size());