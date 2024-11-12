class Node{
    int data;
    Node next;
}

class LinkedListSearch{
    Node head;

    LinkedListSearch(){
        this.head = null;
    }

    public boolean searchElement(int value){
        Node current = head;

        while(current != null){
            if(current.data == value){
                return true;
            }
            else{
                current = current.next;
            }
        }
        return false;
        
    }    

    public static void main(String[] args){
        LinkedListSearch list = new LinkedListSearch();
        int value = 30;
        if(list.searchElement(value)){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
            
    }


}
