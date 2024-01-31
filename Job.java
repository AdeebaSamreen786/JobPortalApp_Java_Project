package JobPortalProject;

 class Job {
    private String title;
    private String company;
    private String location;
    private String description;

    //Constructors..
    public Job(String title, String company, String location, String description) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.description = description;
    }

    //getter methods

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;

    }

    public String getDescription() {
        return description;
    }
}



