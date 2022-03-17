import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CoffeeShop {

    private String name;
    private MenuItem[] menuAsArray;
    private ArrayList<MenuItem> menu;
    private Queue<String> orders;
    private String[] ordersAsArray;

    public static void main(String[] args) {
    }

    public CoffeeShop(String name, MenuItem[] menu, String[] orders) {
        this.name = name;
        this.menuAsArray = menu;
        this.ordersAsArray = orders;
        this.menu = new ArrayList<MenuItem>();
        this.orders = new LinkedList<String>();

        for (MenuItem item : menu) {
            this.menu.add(item);
        }

        if (orders != null) {

            for (String order : orders) {
                this.orders.add(order);
            }
        }
    }

    private void initializeApplication() {
        System.out.println("Initializing The Coffe Shop");
        this.menu = new ArrayList<MenuItem>();
        for (int x = 0; x <= 10; x++) {
            String itemType = "drink";
            if (x > 5) {
                itemType = "food";
            }
            MenuItem newMenuItem = new MenuItem("Item " + x, itemType, 0.05 + x);
            menu.add(newMenuItem);
        }
        orders = new LinkedList<String>();
        System.out.println(addOrder("Item 1"));
        System.out.println(addOrder("Item 2"));

    }

    // 7 methods
    public String addOrder(String itemName) {
        if (this.menu.stream().anyMatch(item -> item.getItem().equals(itemName))) {
            this.orders.add(itemName);
        } else {
            return "This item is currently unavailable!";
        }
        return "Order added!";
    }

    public String fulfillOrder() {
        if (orders == null || orders.size() == 0) {
            return "All orders have been fulfilled!";
        }
        String item = orders.poll();
        return "The " + item + " is ready!";
    }

    public String[] listOrders() {
        String[] arr = new String[orders.size()];
        return orders.toArray(arr);
    }

    public double dueAmount() {
        BigDecimal totalAmount = new BigDecimal(0);
        for (String order : orders) {
            Optional<MenuItem> menuItem = menu.stream().filter(item -> item.getItem().equals(order)).findFirst();
            totalAmount = totalAmount.add(BigDecimal.valueOf(menuItem.get().getPrice()));
        }
        return totalAmount.doubleValue();
    }

    public String cheapestItem() {
        return menu.stream().min(Comparator.comparing(MenuItem::getPrice)).get().getItem();
    }

    public String[] drinksOnly() {
        return menu.stream().filter(item -> item.getType().equals("drink")).map(item -> item.getItem())
                .toArray(String[]::new);
    }

    public String[] foodOnly() {
        return menu.stream().filter(item -> item.getType().equals("food")).map(item -> item.getItem())
                .toArray(String[]::new);
    }

}

class MenuItem {
    private String item;
    private String type;
    private double price;

    public MenuItem(String item, String type, double price) {
        this.item = item;
        this.type = type;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
/*
 * 
 * https://edabit.com/challenge/k3pg4uMgKcDA95sqb
 * 
 * Write a class called CoffeeShop, which has three instance variables:
 * 
 * name : a string (basically, of the shop)
 * menu : an array of items (of type MenuItem), with each item containing the
 * item (name of the item), type (whether a food or a drink) and price.
 * orders : an empty array
 * and seven methods:
 * 
 * addOrder: adds the name of the item to the end of the orders array if it
 * exists on the menu. Otherwise, return "This item is currently unavailable!"
 * fulfillOrder: if the orders array is not empty, return
 * "The {item} is ready!". If the orders array is empty, return
 * "All orders have been fulfilled!"
 * listOrders: returns the list of orders taken, otherwise, an empty array.
 * dueAmount: returns the total amount due for the orders taken.
 * cheapestItem: returns the name of the cheapest item on the menu.
 * drinksOnly: returns only the item names of type drink from the menu.
 * foodOnly: returns only the item names of type food from the menu.
 * IMPORTANT: Orders are fulfilled in a FIFO (first-in, first-out) order.
 * 
 * Examples
 * tcs.addOrder("hot cocoa") ➞ "This item is currently unavailable!"
 * // Tesha's coffee shop does not sell hot cocoa
 * tcs.addOrder("iced tea") ➞ "This item is currently unavailable!"
 * // specifying the variant of "iced tea" will help the process
 * 
 * tcs.addOrder("cinnamon roll") ➞ "Order added!"
 * tcs.addOrder("iced coffee") ➞ "Order added!"
 * tcs.listOrders ➞ ["cinnamon roll", "iced coffee"]
 * // the list of all the items in the current order
 * 
 * tcs.dueAmount() ➞ 2.17
 * 
 * tcs.fulfillOrder() ➞ "The cinnamon roll is ready!"
 * tcs.fulfillOrder() ➞ "The iced coffee is ready!"
 * tcs.fulfillOrder() ➞ "All orders have been fulfilled!";
 * // all orders have been presumably served
 * 
 * tcs.listOrders() ➞ []
 * // an empty array is returned if all orders have been exhausted
 * 
 * tcs.dueAmount() ➞ 0.0
 * // no new orders taken, expect a zero payable
 * 
 * tcs.cheapestItem() ➞ "lemonade"
 * tcs.drinksOnly() ➞ ["orange juice", "lemonade", "cranberry juice",
 * "pineapple juice", "lemon iced tea", "vanilla chai latte", "hot chocolate",
 * "iced coffee"]
 * tcs.foodOnly() ➞ ["tuna sandwich", "ham and cheese sandwich",
 * "bacon and egg", "steak", "hamburger", "cinnamon roll"]
 * Notes
 * Round off due amount up to two decimal places.
 * 
 */