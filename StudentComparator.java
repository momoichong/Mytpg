import java.util.Comparator;

class StudentComparator implements Comparator<Student>{
	
	public int compare(Student stud1, Student stud2){
		int nameComp = stud2.getGPA().compareTo(stud1.getGPA());
		nameComp = ((nameComp == 0) ? stud1.getStudFName().compareTo(stud2.getStudFName()) : nameComp);
		
		return ((nameComp == 0) ? stud1.getStudID().compareTo(stud2.getStudID()) : nameComp);
	}
}