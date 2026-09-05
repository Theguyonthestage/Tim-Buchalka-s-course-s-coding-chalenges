public class LinkedList {
    private ListItem head;

    public ListItem getHead() {
        return head;
    }

    public void setHead(ListItem head) {
        this.head = head;
    }

    public void addItem(ListItem itemToAdd) {
        ListItem previous = null;
        if (head == null) {
            head = itemToAdd;
            return;
        }
        ListItem current = head;
        while (itemToAdd.compareTo(current) > 0 && current.moveToNext() != null) {
            previous = current;
            current = current.moveToNext();

        }
        if (itemToAdd.compareTo(current) == 0) {
            return;
        }
        if (itemToAdd.compareTo(current) < 0 && previous == null) {

            itemToAdd.setNext(head);
            setHead(itemToAdd);
        } else if (itemToAdd.compareTo(current) < 0 && previous != null) {
            previous.setNext(itemToAdd);
            itemToAdd.setNext(current);
        } else if (itemToAdd.compareTo(current) > 0 && current.moveToNext() == null) {
            current.setNext(itemToAdd);
        }
    }

    public void removeItem(ListItem itemToRemove) {
        ListItem previous = null;
        if (head == itemToRemove) {
            head = head.moveToNext();


        } else {
            ListItem current = head;
            while (itemToRemove.compareTo(current) != 0 && current.moveToNext() != null) {
                previous = current;
                current = current.moveToNext();
            }
            if (itemToRemove.compareTo(current) == 0) {
                previous.setNext(current.moveToNext());
            }
        }
    }

    public void printAll() {
        ListItem current = head;
        while (current != null) {
            System.out.println(current.toString());
            current = current.moveToNext();

        }
    }
}
