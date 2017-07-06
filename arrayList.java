import java.util.*;

public class arrayList {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Scanner st = new Scanner(System.in);

		boolean exit = true;
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");

		while (exit) {
			int input = in.nextInt();
			switch (input) {
			case 1:
				System.out.println("Insert a Element :");
				String str = st.nextLine();
				list.add(str);
				show(list);
				break;
			case 2:
				System.out.println("Insert at a position");
				list.add(3, "INSERTED ELEMENT");
				show(list);
				break;
			case 3:
				System.out.println("Delete All Elements");
				list.clear();
				show(list);

				break;
			case 4:
				System.out.println("Delete a particular element");
				Object obj = list.remove(1);
				show(list);
				break;
			case 5:
				System.out.println("Replace a particular element");
				list.set(1, "REPLACED ELEMENT");
				show(list);
				break;
			case 6:
				System.out.println("Sorting");
				System.out.println("List Before Sorting");
				show(list);
				Collections.sort(list);
				System.out.println("List After Sorting");
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

	public static void show(ArrayList<String> list) {
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
