import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    private static final int MAX_COURSE = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Student[] universityStudents = new Student[]{
                new Student(145, "Alexandr", "Maroz", "Vitalevich", "Minsk 4-56",
                        "375(44)7553437", Faculty.SPORT, 4, Group.EC,"07.09.1990"),
                new Student(25, "Dmitrii", "Semenkov", "Alexandrovich", "Minsk 2-36",
                        "375(33)7465823", Faculty.ECONOMY, 2, Group.SPT, "22.09.1992"),
                new Student(45, "Ekaterina", "Lykina", "Andreevna", "Minsk 1-6",
                        "375(29)1284496", Faculty.ECONOMY, 2, Group.SPT,"14.06.1994"),
                new Student(53, "Andrey", "Lazarev", "Vitalevich", "Minsk 4-46",
                        "375(44)7468245", Faculty.ENGINEER, 1, Group.PHIL,"01.01.1989"),
                new Student(15, "Pavel", "Popov", "Vladimirovich", "Minsk 2-26",
                        "375(44)9840584", Faculty.ENGINEER, 3, Group.PHIL,"09.10.1993"),
                new Student(33, "Alena", "Shybina", "Igorevna", "Minsk 6-156",
                        "375(33)2395891", Faculty.ECONOMY, 5, Group.EC,"08.07.1995"),
                new Student(78, "Semen", "Yvarov", "Nikolaevich", "Minsk 1-77",
                        "375(33)8473645", Faculty.PHILOSOPHY, 1, Group.PHIL, "09.10.1992"),
                new Student(122, "Kiril", "Byrkov", "Fedorovich", "Minsk 2-13",
                        "375(29)1748923", Faculty.PHILOSOPHY, 3, Group.SPT, "06.11.1992"),
                new Student(95, "Viktoria", "Ribakova", "Alexandrovna", "Minsk 6-511",
                        "375(29)1185632", Faculty.ENGINEER, 2, Group.ENG, "02.03.1996"),
                new Student(155, "Seva", "Tyrov", "Dmitrievich", "Minsk 4-223",
                        "375(44)7333447", Faculty.SPORT, 5, Group.ENG, "07.12.1997")
        };
     int task = taskMenu(read);
        switch (task)   {
            case 1:
                listStudents(universityStudents);
                break;
            case 2:
                listStudentsForEachCourseGroup(universityStudents);
                break;
            case 3:
                listStudentsBday(universityStudents);
                break;
            case 4:
                listStudentsGroup(universityStudents);
                break;
        }


    }

    public static void listStudents(Student[] universityStudents) throws IOException {
        System.out.println("1. List of students of the selected faculty: ");
        System.out.print("Choose one of this: SPORT, ECONOMY, ENGINEER, PHILOSOPHY: ");
        BufferedReader reads = new BufferedReader(new InputStreamReader(System.in));

            String faculty = reads.readLine();
            String result;
            switch (faculty) {
                case "SPORT":
                   result = "SPORT";
                     break;
                case "ECONOMY":
                   result = "ECONOMY";
                    break;
                case "ENGINEER":
                    result = "ENGINEER";
                   break;
                case "PHILOSOPHY":
                   result = "PHILOSOPHY";
                    break;
               default:
                   result = "Error";
                   System.out.println("Parameters entred incorectly");
                   break;

            }

                if (!result.equals("Error")) {
                    System.out.println("List students you needed: ");

                    for (Student universityStudent : universityStudents) {
                        if (universityStudent.equalsFaculty(faculty)) {
                            System.out.println(universityStudent);

                        }
                    }
                }

    }

    public static void listStudentsForEachCourseGroup(Student[] universityStudents)  {
        System.out.println("2. List of studens for each course and group: ");

        int countCourse = 0;
        int countOfPrint = 1;
        while (countCourse<MAX_COURSE) {

            System.out.println("\nList of students: " + countOfPrint + " course");
            countCourse++;
            countOfPrint++;
            for (Student universityStudent : universityStudents) {
                {
                    if (universityStudent.equalsCourse(countCourse))
                        System.out.println(universityStudent);
                }
            }
        }

        int count = 0;
        String[] nameGroup = {"SPORT","PHILOSOPHY","ECONOMY","ENGINEER"};
        int arrayCount = 0;
        while (count<4) {

            System.out.println("\nList of students: " + nameGroup[arrayCount] + " group");
            count++;

            for (Student universityStudent : universityStudents) {
                {
                    if (universityStudent.equalsFaculty(nameGroup[arrayCount]))
                        System.out.println(universityStudent);
                }
            }
            arrayCount++;
        }

    }

    public static void listStudentsBday(Student[] string) throws IOException{
            BufferedReader reads = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("3. List of students with certain birthday:  ");
        System.out.print("Enter year birthday you interested: ");
        String bDay = reads.readLine();
        for (Student student : string) {
            if (student.equalsBDay(bDay)) {
                System.out.println(student);
            }
        }
    }

    public static void listStudentsGroup(Student [] universityStudents) throws IOException {
        System.out.println("4. List of students group: ");
        BufferedReader reads = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter group(EC, SPT, PHIL, ENG): ");
        String group = reads.readLine();
        for (Student universityStudent : universityStudents) {
            if (universityStudent.equalsGroup(group)) {
                System.out.println(universityStudent);
            }
        }
    }

    public static int taskMenu (BufferedReader read) throws IOException{

        System.out.println("1. List of students of the selected faculty. ");
        System.out.println("2. List of studens for each course and group. ");
        System.out.println("3. List of students with certain birthday.  ");
        System.out.println("4. List of students group. ");
        System.out.print("What Do you need ? ( Enter number): ");
        int task = Integer.parseInt(read.readLine());
        while (task < 1 || task > 4) {
            System.out.print("Incorrect number of the task. Try again: ");
            task = Integer.parseInt(read.readLine());
        }
        return task;
    }
}







