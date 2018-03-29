import java.util.Arrays;

public class GpaSorting{
	public static void main(String[] args){
		//sorting custom object array
		Student[] studArr = new Student[5];
		
		studArr[0] = new Student(33, "Tina", 3.68);
		studArr[1] = new Student(85, "Louis", 3.85);
		studArr[2] = new Student(56, "Samil", 3.75);
		studArr[3] = new Student(19, "Samar", 3.75);
		studArr[4] = new Student(22, "Lorry", 3.76);
		
		Arrays.sort(studArr, new StudentComparator());
		System.out.println("Students list sorted :\n"+Arrays.toString(studArr));
	}
}