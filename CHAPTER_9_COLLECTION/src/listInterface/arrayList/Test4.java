package listInterface.arrayList;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(50);
        al.add(80);
        al.add("deepak");
        al.add(90);
        al.add(20);
    //    al.remove(2);

        al.removeAll(al);
        System.out.println(al);

    }
}
