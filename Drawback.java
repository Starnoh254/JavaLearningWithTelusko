class Student {
    String name;
    int admissionNo;
    int marks;

    @Override
    public String toString(){
        return "Name: " + name + ", Admission No: " + admissionNo + ", Marks: " + marks;
    }

    
}

public class Drawback {
    public static void main(String a[]){
        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 5;
        // nums[2] = 9;
        // nums[3] = 1;

        // for(int i = 0; i < nums.length; i++){
        //     System.out.println(nums[i]);
        // }

        // for(int n : nums){
        //     System.out.println(n);
        // }

        Student s1 = new Student();
        s1.name = "Starnoh";
        s1.admissionNo = 12835;
        s1.marks = 400;


        Student s2 = new Student();
        s2.name = "John";
        s2.admissionNo = 12482;
        s2.marks = 409;


        Student s3 = new Student();
        s3.name = "Bob";
        s3.admissionNo = 12834;
        s3.marks = 430;


        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        for(Student student : students){
            System.out.println(student);
        }

        // for(int i = 0 ; i < students.length; i++) {
        //     System.out.println(students[i]);
        // }

    }
}
