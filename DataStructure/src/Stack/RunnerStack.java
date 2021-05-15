package Stack;

public class RunnerStack {

	public static void main(String[] args) {
		DynamicStack ds=new DynamicStack();
		ds.push(3);
		ds.push(88);
		ds.show();
		ds.push(99);
		ds.show();
		ds.push(90);
		ds.show();
		ds.push(97);
		ds.show();
		ds.push(9);
		ds.show();
		System.out.println("----------------------------------------");
		ds.pop();
		ds.show();
		ds.pop();
		ds.show();
		ds.pop();
		ds.show();
		ds.pop();
		ds.show();
	}

}
