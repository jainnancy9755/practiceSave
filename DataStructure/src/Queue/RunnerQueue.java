package Queue;

public class RunnerQueue {

	public static void main(String[] args) {
		Queue qq=new Queue();
		qq.enqueue(7);
		qq.enqueue(34);
		qq.enqueue(6);
		qq.show();
		qq.enqueue(24);
		qq.enqueue(15);
		qq.show();
		System.out.println(qq.dequeue());
		qq.show();
		qq.enqueue(99);
		qq.show();
		qq.enqueue(88);
		qq.show();
	}

}
