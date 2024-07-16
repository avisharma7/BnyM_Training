import java.util.ArrayList;

 public class streamAPI1{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //external iteraions:
        //using iterator, normal loop and enhance for loop

        //for internal iteration -> Stream API

        list.forEach(i->System.out.println(i));

    }
}