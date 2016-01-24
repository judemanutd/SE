public class QueueProcessArrays {

	private Object[] arr;
	int front = 0;
	int rear = -1;

	public QueueProcessArrays(int size) {
		arr = new Object[size];
	}

	public String add(Object pushedElement) {
		if (rear < arr.length - 1) {
			arr[++rear] = pushedElement;
			return "Success";
		} else {
			return "Overflow";
		}
	}

	public Object remove() {
		if (front > rear) {
			return "Underflow";
		} else {
			return arr[front++];
		}
	}

	public void disp() {
		System.out.print("Queue:");
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

}
