import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

//        LinkedList<String> placeToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElement(placesToVisit);
        System.out.println(placesToVisit);

//        removeElement(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElement(placesToVisit);

//        printItinerary3(placesToVisit);

        testIterator(placesToVisit);
    }

    private static void addMoreElement(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack methods
        list.push("Alice Springs");
    }

    private static void removeElement(LinkedList<String> list) {

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();  // removes first element
        System.out.println(s1 + " was removed");

        System.out.println(list);
        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");

        System.out.println(list);
        String s3 = list.removeLast();  // removes last element
        System.out.println(s3 + " was removed");
        // Queue/Deque poll methods
        String p1 = list.poll();    // removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst();    // removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast();    // removes last element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // remove first element
        System.out.println(p1 + " was removed");
    }

    private static void gettingElement(LinkedList<String> list) {

        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));
        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());
        // Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());

    }

    public static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {

        var iterator = list.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
