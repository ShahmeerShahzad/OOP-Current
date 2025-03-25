public class ClassRoom {
	private Student[] students = new Student[5];
	private String className;
	private String classCode;
	private Teacher teacher;
	private int studentCount;
	private static final int MAX_STUDENTS = 5;

	ClassRoom(String className, String classCode, Teacher teacher) {
		this.className = className;
		this.classCode = classCode;
		this.teacher = teacher;
		this.studentCount = 0;
	}

	public String getClassName() {
		return className;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	
	public void enroll(Student student) {
		if(studentCount < MAX_STUDENTS) {
			students[studentCount++] = student;
		}
		else {
			System.out.println("This class is at max capacity.");
		}
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
		
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Class Name: " + className + "\n");
		str.append("Class Code: " + classCode + "\n");
		str.append(teacher.toString());
		for (int i = 0; i < studentCount; i++) {
			str.append("Student " + (i + 1) + ": \n");
			str.append(students[i].toString());
		}
		return str.toString();
	}

	
}