package Stack;

public class DynamicStack {
	int capacity=2;
	int Stack[]=new int[capacity];
	int top=0;
	public void push(int data)
	{
			if (getsize()==capacity)
			{
				expand();
			}
			Stack[top]=data;
			top++;
	}
	private void expand()
	{
		int length=getsize();
		int newstack[]=new int[capacity*2];
		System.arraycopy(Stack, 0, newstack, 0, length);
		Stack=newstack;
		capacity=capacity*2;
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
			if (getsize()<=((capacity/2)/2))
				{
					shrink();
				}
			return data;
		}
	}
	private void shrink()
	{
		int length=getsize();
		capacity=capacity/2;
		int newstack[] =new int[capacity];
		System.arraycopy(Stack, 0, newstack, 0, length);
		Stack=newstack;
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
