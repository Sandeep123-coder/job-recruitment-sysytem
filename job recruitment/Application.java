public class Application
{
    String applicationId;
    Candidate candidate;
    Job job;
    String status;

    Application(String applicationId, Candidate candidate, Job job)
    {
        this.applicationId = applicationId;
        this.candidate = candidate;
        this.job = job;
        this.status = "APPLIED";
    }

    void displayApplication()
    {
        System.out.println("Application ID : " + applicationId);
        System.out.println("Candidate      : " + candidate.name);
        System.out.println("Job            : " + job.jobTitle);
        System.out.println("Company        : " + job.companyName);
        System.out.println("Status         : " + status);
    }
}