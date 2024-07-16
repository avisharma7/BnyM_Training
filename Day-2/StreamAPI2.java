//fitlering Collection using stream
//filter the prices of laptop greater than  30000
import java.util.*;
import java.util.stream.Collectors;
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamAPI2 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",88000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        //stream logic
        List <Float> productPriceList2 = productsList.stream()
                .filter(p->p.price > 30000) //filtering data
                .map(p->p.price) //fetching data
                .collect(Collectors.toList()); //collecting as list

        System.out.println(productPriceList2);

        //finding the name of the laptop whose price is 30000
        // Using Stream API to filter and map the product names with price 30000
        List<String> productNamesWithPrice30000 = productsList.stream()
                .filter(product -> product.price == 30000)
                .map(product -> product.name)
                .collect(Collectors.toList());

        // Print the list of product names with price 30000
        System.out.println(productNamesWithPrice30000);  // Output: [Dell Laptop]


    }
}
