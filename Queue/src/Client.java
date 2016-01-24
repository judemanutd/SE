
public class Client {

	public static void main(String[] args) {

		/*****
		 * Queue Using arrayList
		 */
		System.out.println("ArrayList");

		QueueProcessArrayList queueList = new QueueProcessArrayList();
		queueList.add(5);
		queueList.add(6);
		queueList.add("Hello World");
		queueList.add(8);
		System.out.println(queueList.disp());
		System.out.println(queueList.remove());
		System.out.println(queueList.disp());

		System.out.println();
		System.out.println();
		System.out.println();

		/*****
		 * Queue Using arrays
		 */
		System.out.println("Arrays");
		QueueProcessArrays queueArray = new QueueProcessArrays(3);
		queueArray.disp();
		System.out.println(queueArray.add(5));
		System.out.println(queueArray.add(6));
		System.out.println(queueArray.add("test"));
		System.out.println(queueArray.add(8));
		queueArray.disp();

		System.out.println(queueArray.remove());
		System.out.println(queueArray.remove());
		System.out.println(queueArray.remove());
		System.out.println(queueArray.remove());
		queueArray.disp();
	}

}
