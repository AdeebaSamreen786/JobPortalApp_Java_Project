package JobPortalProject;

import java.util.ArrayList;
import java.util.List;

 class JobPortal {
    private List<Job>jobs;
    //COSTRUCTOR
    public JobPortal() {
        this.jobs = new ArrayList<>();
    }

        //methods
        public void addJob(Job job){
            jobs.add(job);
        }

        public void displayJobs(){
            System.out.println("Availab Jobs:");

            for(Job job:jobs){
                System.out.println("Title:" +job.getTitle() +  "Company:" +job.getCompany() +  "Location:"  +job.getLocation()  +  "Description:"  +job.getDescription());
            }
        }

}
