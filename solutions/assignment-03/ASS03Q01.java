import java.util.Scanner;

class Storedata {
  protected int top;
  protected int bottom;
  protected int arr[]=new int[10];
  Storedata() {
    this.top=0;
	  this.bottom=0;
  }
  protected void insert(int a) {
    arr[top]=a;
	  top++;
  }
  protected void delete() {
    int k=arr[top];
	  top--;
	  System.out.println("The value deleted is "+k);
  }
}

//Stack handler
class Stack extends Storedata {
  Stack() {
    super();
  }
  protected void insert() {
    System.out.println("Enter the value to insert :");
    Scanner in=new Scanner(System.in);
	  int k=in.nextInt();
	  arr[top]=k;
	  top++;
  }
  protected void delete() {
    top--;
	  int k=arr[top];
    System.out.println("The value deleted is "+k);
  }
}

//Queue Handler
class Queue extends Storedata {
  Queue() {
    super();
  }
  protected void insert() {
    System.out.println("Enter the value to insert :");
    Scanner in=new Scanner(System.in);
    int k=in.nextInt();
    arr[top]=k;
    top++;
  }
  protected void delete() {
    int k=arr[bottom];
    System.out.println("The value deleted is "+k);
  }
}

class Main {
  public static void main(String[] args) {
    Stack st=new Stack();
	  Queue qu=new Queue();
	  st.insert();
	  st.insert();
	  st.insert();
	  st.insert();
	  st.delete();
	  st.delete();
	  qu.insert();
	  qu.insert();
	  qu.insert();
	  qu.insert();
	  qu.delete();
	  qu.delete();
  }
}
