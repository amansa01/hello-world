import java.util.*;

public class linkedList {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Scanner st = new Scanner(System.in);
		String str;

		boolean exit = true;
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		while (exit) {
			int input = in.nextInt();
			switch (input) {
			case 1:
				System.out.println("Insert a Element in the beginning :");
				str = st.nextLine();
				list.addFirst(str);
				show(list);
				break;

			case 2:
				System.out.println("Insert a Element in End :");
				str = st.nextLine();
				list.addLast(str);
				show(list);
				break;

			case 3:
				System.out.println("Insert at a position :");
				list.add(3, "INSERTED ELEMENT");
				show(list);
				break;
			case 4:
				System.out.println("Delete All Elements :");
				list.clear();
				show(list);

				break;

			case 5:
				System.out.println("Delete a Element in beginning :");

				list.removeFirst();
				show(list);
				break;

			case 6:
				System.out.println("Delete a Element in End :");
				list.removeLast();
				show(list);
				break;

			case 7:
				System.out.println("Delete a particular element :");
				list.remove("two");
				show(list);
				break;
			case 8:
				System.out.println("Sublist :");
				List<String> lst = list.subList(1, 4);
				System.out.println("Sublist contains : " + lst);

				break;
			case 9:
				System.out.println("Sorting");
				System.out.println("List Before Sorting :");
				show(list);
				Collections.sort(list);
				System.out.println("List After Sorting :");
				show(list);
				break;
			case 10:
				exit = false;
				System.out.println("Exiting From Program ");
				break;

			default:
				System.out.println("Wrong Input");
			}
		}
	}

	public static void show(LinkedList<String> list) {
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
