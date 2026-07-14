package ArrayList_sort;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class School {

	public static void main(String[] args) {
		try (// TODO Auto-generated method 
		Scanner sc = new Scanner (System.in)) {
			ArrayList<Student> st = new ArrayList<>();
			st.add(new Student(420,"Manohar",360));
			st.add(new Student(220,"Hari",400));
			st.add(new Student(330,"John",260));
			st.add(new Student(480,"Ram",300));
			st.add(new Student(150,"Kumar",220));
			st.add(new Student(250,"Raj",310));
			boolean flag=true;
			while(flag) {
				System.out.println("Choose one Option :");
				System.out.println("\n1.id \n2.Name \n3.Marks \n4.Exit");
				int op=sc.nextInt();
				switch(op) {
				case 1->{
					System.out.println("Choose the order");
					System.out.println("\n1.Ascending Order \n2.Descending Order");
					int op1=sc.nextInt();
					switch(op1) {
					case 1->{
						Collections.sort(st,new IdComp());
						System.out.println(st);
					}
					case 2->{
						Collections.sort(st,new IdComp1());
						System.out.println(st);
					}
					}
				}
				case 2->{
					System.out.println("Choose the order");
					System.out.println("\n1.Ascnding Order \n2.Descending Order");
					int op1=sc.nextInt();
					switch(op1) {
					case 1->{
						Collections.sort(st,new NameComp());
						System.out.println(st);
					}
					case 2->{
						Collections.sort(st,new NameComp1());
						System.out.println(st);
					}
					}
				}
				case 3->{
					System.out.println("Choose the order");
					System.out.println("\n1.Ascnding Order \n2.Descending Order");
					int op1=sc.nextInt();
					switch(op1) {
					case 1->{
						Collections.sort(st,new MarksComp());
						System.out.println(st);
					}
					case 2->{
						Collections.sort(st,new MarksComp1());
						System.out.println(st);
					}
					}
				}
				case 4->{
					flag = false;
				}
				}
			}
		}
	}

}
