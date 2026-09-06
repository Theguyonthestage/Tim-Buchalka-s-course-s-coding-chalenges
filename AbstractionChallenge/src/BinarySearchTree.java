public class BinarySearchTree {
    private ListItem root;

    public ListItem getRoot() {
        return root;
    }

    public void setRoot(ListItem root) {
        this.root = root;
    }

    public void addItem(ListItem itemToAdd){
        if (root==null){
            root=itemToAdd;
            return;
        }
        ListItem current = root;
        while (true){
            if (itemToAdd.compareTo(current) == 0 ){
                return;
            }
            if (itemToAdd.compareTo(current)<0){
                if (current.moveToPrevious()==null){
                    current.setPrevious(itemToAdd);
                    return;
                } else {
                    current = current.moveToPrevious();
                }
            }
            else if (itemToAdd.compareTo(current)>0){
                if (current.moveToNext()==null){
                    current.setNext(itemToAdd);
                    return;
                } else {
                    current=current.moveToNext();
                }
            }
        }



    }
}
