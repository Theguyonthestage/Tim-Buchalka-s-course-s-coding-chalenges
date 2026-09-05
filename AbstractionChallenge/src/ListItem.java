public abstract class ListItem  {
    ListItem previous;
    ListItem next;
    private Comparable <String> value;

    public ListItem moveToNext(){
        return next;
    }

    public ListItem moveToPrevious(){
        return previous;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public void setPrevious(ListItem previous) {
        this.previous = previous;
    }

    public void setValue(Comparable<String> value){
        this.value=value;
    }

    public String getValue() {
        return value.toString();
    }


    public int compareTo( ListItem toCompare){
        return value.compareTo(toCompare.getValue());

    }

    @Override
    public String toString() {
        return getValue();
    }
}
