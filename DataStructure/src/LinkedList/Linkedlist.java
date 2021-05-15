package LinkedList;

public class Linkedlist 
{
	Node head;
	public void insert(int data)
	{
		Node node =new Node();
		node.data=data;
		node.next=null;
		if (head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while (n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	public void show()
	{
		Node n=head;
		System.out.print("Elements:"+" ");
		while (n.next!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.print(n.data);
		System.out.println();
	}
	public void insertAtStart(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	public void insertAtBetween(int index,int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if (index==0)
		{
			insertAtStart(data);
		}
		else 
		{
			Node n =head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
		
	}
	public void delete(int index)
	{
		Node n=head;
		Node n1;
		if (index==0)
		{
			head=n.next;
			n=null;
		}
		else
		{
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println(n1.data);
			n1=null;
		}
	}

}
