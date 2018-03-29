class Student{
	Integer studID;
	String studFName;
	Double GPA;

	public Student(Integer id, String fName, Double gpa){
		this.studFName = fName;
		this.studID = id;
		this.GPA = gpa;
	}
	
	public String getStudFName(){
		return studFName;
	}

	public void setStudFName(String studFName){
		this.studFName = studFName;
	}

	public Integer getStudID(){
		return studID;
	}
	
	public void setStudID(Integer studID){
		this.studID = studID;
	}

	public Double getGPA(){
		return GPA;
	}
	
	public void setGPA(Double GPA){
		this.GPA = GPA;
	}
	
	public String toString(){
		return studFName;
	}
}

 

