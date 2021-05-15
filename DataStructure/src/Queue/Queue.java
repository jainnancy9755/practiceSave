package Queue;

public class Queue 
{
	int Queue[]=new int[5];
	int size;
	int front;
	int rear;
	public int getsize()
	{
		return size;
	}
	public boolean isempty()
	{
		return getsize()==0;
	}
	public boolean isfull()
	{
		return getsize()==5;
	}
	public void enqueue(int data)
	{
		if (!isfull())
		{
			Queue[rear]=data;
			rear=(rear+1)%5;
			size=size+1;
		}
		else
		{
			System.out.println("queue is full");
		}
	}
	public int dequeue()
	{
		int data=0;
		if(!isempty())
		{
			data=Queue[front];
			front=(front+1)%5;
			size=size-1;
		}
		else
		{
			System.out.println("queue is empty");
		}
		return data;
	}
	public void show()
	{
		//System.out.println("size "+size);
		
		for(int i=0;i<size;i++)
		{
			//System.out.print(i);
			System.out.print(Queue[(front+i)%5] +" ");
		}
		System.out.println();
	}
	
}
