import java.util.*;
public class revDouLinkList
{
	
	public static Node head=null;
	public static Node tail=null;
	public static int size=0;

		public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		revDouLinkList r=new revDouLinkList();
		System.out.println("enter the number of data you will enter");
		int q=sc.nextInt();
		System.out.println("enter the values");
		for(int i=0;i<q;i++)
		{
			int value=sc.nextInt();
			r.add(value);
		}
		r.print(head);

		Node x=r.revDL();
		System.out.println("");
		r.print(x);
	}
public Node revDL()
	{
		Node current=head;
		Node temp=null;

		while(current!=null)
		{
			temp=current.prev;
			current.prev=current.next;
			current.next=temp;
			current=current.prev;
		}
		return temp.prev;
	}
	public void print(Node head)
	{
		Node current=head;
		while(current!=null)
		{
			System.out.println(""+current.data);

			current=current.next;
		}
	}

	public void add(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			tail=n;

		}
		else
		{
			head.prev=n;
			n.next=head;
			head=n;
		}

		size++;
	}


}
class Node
{
	int data;
	Node next;
	Node prev;

	public Node(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}