import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MoreList {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};

        // This method transformed an array of String to a list of String
        List<String> list = List.of(items);
        System.out.println(list);

        // explore the kind of object we get back from this static factory method
        System.out.println(list.getClass().getName());
        // list.add("yogurt");      // This is an error because it is immutable list

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        // Can create a small list in one statement as following code
        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        // This is the method to add everything in nextList to my first list
        groceries.addAll(nextList);
        System.out.println(groceries);

        // retrieve the third element in the arrayList
        System.out.println("Third item = " + groceries.get(2));

        // method to find the element
        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));

        // method to remove the element
        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        // method to remove all element that we need
        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        // method to remove all items in the list, which isn't one of the items passed in the argument
        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        // method all element
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        // method to add all
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        // sort method
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        // This is the method for passed an Array as argument
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
