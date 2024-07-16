import java.util.ArrayList;
public class streamAPI1{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        //external iteraions:
        //using iterator, normal loop and enhance for loop

        //for internal iteration -> Stream API

        list.forEach(i->System.out.println(i));

    }
}