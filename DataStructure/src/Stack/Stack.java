package Stack;

public class Stack {
	int Stack[]=new int[5];
	int top=0;
	public void push(int data)
	{
		if (top==5)
		{
			System.out.println("stack is full");
		}
		else
		{
			Stack[top]=data;
			top++;
		}
	}
	public int getsize()
	{
		return top;
	}
	public boolean IsEmpty()
	{
		return top<=0;
	}
	public int pop()
	{
		if (IsEmpty())
		{
			System.out.println("stack is empty");
			return 0;
		}
		else
		{
			int data;
			top--;
			data=Stack[top];
			Stack[top]=0;
			return data;
		}
	}
	public void show()
	{
		System.out.print("Stack:" +" ");
		for (int i :Stack)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public int peak()
	{
		return Stack[top-1];
	}

}
