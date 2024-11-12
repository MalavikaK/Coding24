class Node{                 //defining node class with data and next pointer
    int data;               //data of the node
    Node next;              //pointer to the next node
    Node(int data){         //constructor to initialize data
        this.data = data;   //initially data will be equal to the data passed
        this.next = null;   //initially next will be null - even if it is not passed, constructer creates next as null because it is a reference type in java where as int is primitive type
    }
}

class LinkedList{           //defining linked list class
    Node head;              //head of the linked list
    LinkedList(){           //constructor to initialize head
        this.head = null;   //initially head will be null - even if it is not passed, constructer creates head as null
    }   


public void addNode(int data){          //method to add node at the end of the linked list
    Node newNode = new Node(data);      //creating new node
    if(head==null){                     //if linked list is empty
        head = newNode;                 //head will point to new node
    }
    else{
        Node current = head;            //else traverse to the end of the linked list
        while(current.next!=null){      //till the end of the linked list
            current=current.next;       //move to the next node
        }
        current.next = newNode;        //add new node at the end of the linked list
    } 
}

public void display(){                          //method to display the linked list
    Node current = head;                        //start from the head
    while(current!=null){                       //till the end of the linked list
        System.out.print(current.data + " -> ");//print the data of the current node
        current = current.next;                 //move to the next node
    }
    System.out.println("null");               //print null at the end of the linked list
}

public static void main(String[] args){         //main method
    LinkedList output = new LinkedList();       //creating object of the linked list
    output.addNode(10);                    //adding nodes to the linked list
    output.addNode(20);
    output.addNode(30);
    output.addNode(40);
    output.addNode(50);
    output.display();                           //display the linked list

 }
}
