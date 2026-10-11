public class Job
{
    String jobId;
    String jobTitle;
    String companyName;
    String location;
    double salary;
    String experience;
    String skills;
    String description;

    Job(String jobId, String jobTitle, String companyName,
        String location, double salary, String experience,
        String skills, String description)
    {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.location = location;
        this.salary = salary;
        this.experience = experience;
        this.skills = skills;
        this.description = description;
    }

    void displayJob()
    {
        System.out.println("Job ID       : " + jobId);
        System.out.println("Job Title    : " + jobTitle);
        System.out.println("Company      : " + companyName);
        System.out.println("Location     : " + location);
        System.out.println("Salary       : " + salary + " LPA");
        System.out.println("Experience   : " + experience);
        System.out.println("Skills       : " + skills);
        System.out.println("Description  : " + description);
    }
}