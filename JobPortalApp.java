package JobPortalProject;

import java.util.Scanner;

public class JobPortalApp {
    public static void main(String[] args) {
        JobPortal jobPortal = new JobPortal();

        Scanner scanner = new Scanner(System.in);

        //adding jobs
        jobPortal.addJob(new Job("Java Developer\n","Capgemini\n","Pune\n","Design, build, and maintain efficient, reusable, and reliable java code.\n"));

        jobPortal.addJob(new Job("Data Analyst\n","Cognizant\n","Pune\n","Analyzing and interpreting complex data sets.\n"));

        jobPortal.addJob(new Job("Python Full Stack Developer\n","Qloron Pvt Ltd\n","Hydrabad\n","Develop and maintain server-side logic.\n"));

        jobPortal.addJob(new Job("SQL Developer\n","Whistle mind Technologies\n","Chandigarh\n","Creating and managing databases and also analysing data.\n"));

        jobPortal.addJob(new Job("Web Developer\n","Zycus\n","Mumbai\n","Planning and developing software solutions and web applications, supporting and maintaining digital products.\n"));

        jobPortal.addJob(new Job("DevOps Engineer\n","Tech Mahindra\n","Chennai\n",".Investigate and resolve Technical issues.\n"));

        jobPortal.addJob(new Job("Network Administrator\n","IT Solutions and Services\n","Delhi\n","Ensure the stable operation of the computer networks.\n"));

        jobPortal.addJob(new Job("IT Manager\n","Wipro\n","Kolkata\n","Responsible for maintaining all systems on-site and remotely.\n"));

        jobPortal.addJob(new Job("Application Developer\n","Accenture\n","Bhopal\n","Understanding client needs, designing prototypes, writing code, and maintaining technical documentation.\n"));

        jobPortal.addJob(new Job("UX Designer & UI Developer\n","IBM\n","Kochi\n","Conduct design sprints to create journey maps and storyboards.\n"));




        while (true){
            System.out.println("Job Portal menue:\n");
            System.out.println("1.Display available jobs\n");
            System.out.println("2.Exit\n");

            System.out.println("Enter your Choice:");
            int choice=scanner.nextInt();
            //for new line
            scanner.nextLine();

            switch (choice){
                case 1:
                    jobPortal.displayJobs();
                    break;

                case 2:
                    System.out.println("Exit the Job Portal ..Have a Great DayEver!!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! please ReEnter the correct chioice..");
            }

        }
    }
}
