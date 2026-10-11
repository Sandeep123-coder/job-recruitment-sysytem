import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    static Candidate[] candidates = new Candidate[100];
    static int candidateCount = 0;

    static Recruiter[] recruiters = new Recruiter[100];
    static int recruiterCount = 0;

    static Job[] jobs = new Job[100];
    static int jobCount = 0;

    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("\n===== JOB RECRUITMENT PORTAL =====");
            System.out.println("1. Candidate Registration");
            System.out.println("2. Recruiter Registration");
            System.out.println("3. Login");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    candidateRegistration();
                    break;

                case 2:
                    recruiterRegistration();
                    break;

                case 3:
                    login();
                    break;

                case 4:
                    System.out.println("Thank you for using Job Recruitment Portal");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    // Candidate Registration
    static void candidateRegistration()
    {
        System.out.println("\n===== CANDIDATE REGISTRATION =====");

        sc.nextLine();

        System.out.print("Enter Name          : ");
        String name = sc.nextLine();

        System.out.print("Enter Email         : ");
        String email = sc.nextLine();

        System.out.print("Enter Password      : ");
        String password = sc.nextLine();

        System.out.print("Enter Phone         : ");
        String phone = sc.nextLine();

        System.out.print("Enter Qualification : ");
        String qualification = sc.nextLine();

        System.out.print("Enter Skills        : ");
        String skills = sc.nextLine();

        System.out.print("Enter Experience    : ");
        String experience = sc.nextLine();

        String candidateId = "C" + (101 + candidateCount);

        Candidate c = new Candidate(
            candidateId,
            name,
            email,
            password,
            phone,
            qualification,
            skills,
            experience
        );

        candidates[candidateCount] = c;
        candidateCount++;

        System.out.println("\nRegistration Successful!");
        System.out.println("Candidate ID : " + candidateId);
    }

    // Recruiter Registration
    static void recruiterRegistration()
    {
        System.out.println("\n===== RECRUITER REGISTRATION =====");

        sc.nextLine();

        System.out.print("Enter Name         : ");
        String name = sc.nextLine();

        System.out.print("Enter Email        : ");
        String email = sc.nextLine();

        System.out.print("Enter Password     : ");
        String password = sc.nextLine();

        System.out.print("Enter Company Name : ");
        String companyName = sc.nextLine();

        System.out.print("Enter Company Type : ");
        String companyType = sc.nextLine();

        String recruiterId = "R" + (501 + recruiterCount);

        Recruiter r = new Recruiter(
            recruiterId,
            name,
            email,
            password,
            companyName,
            companyType
        );

        recruiters[recruiterCount] = r;
        recruiterCount++;

        System.out.println("\nRegistration Successful!");
        System.out.println("Recruiter ID : " + recruiterId);
    }

    // Login
    static void login()
    {
        System.out.println("\n===== LOGIN =====");

        sc.nextLine();

        System.out.print("Enter ID       : ");
        String id = sc.nextLine();

        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        // Candidate Login
        for(int i = 0; i < candidateCount; i++)
        {
            if(candidates[i].candidateId.equalsIgnoreCase(id) &&
               candidates[i].password.equals(password))
            {
                System.out.println("\nCandidate Login Successful!");
                System.out.println("Welcome " + candidates[i].name);

                candidateDashboard(candidates[i]);

                return;
            }
        }

        // Recruiter Login
        for(int i = 0; i < recruiterCount; i++)
        {
            if(recruiters[i].recruiterId.equalsIgnoreCase(id) &&
               recruiters[i].password.equals(password))
            {
                System.out.println("\nRecruiter Login Successful!");
                System.out.println("Welcome " + recruiters[i].name);

                recruiterDashboard(recruiters[i]);

                return;
            }
        }

        System.out.println("\nInvalid ID or Password");
    }

    // Candidate Dashboard
    static void candidateDashboard(Candidate candidate)
    {
        while(true)
        {
            System.out.println("\n===== CANDIDATE DASHBOARD =====");
            System.out.println("1. View Profile");
            System.out.println("2. Update Profile");
            System.out.println("3. Search Jobs");
            System.out.println("4. View Job Details");
            System.out.println("5. Apply for Job");
            System.out.println("6. My Applications");
            System.out.println("7. Application Status");
            System.out.println("8. Logout");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("\n===== MY PROFILE =====");
                    candidate.displayCandidate();
                    break;

                case 2:
                    updateCandidateProfile(candidate);
                    break;

                case 3:
                    System.out.println("Search Jobs");
                    break;

                case 4:
                    System.out.println("View Job Details");
                    break;

                case 5:
                    System.out.println("Apply for Job");
                    break;

                case 6:
                    System.out.println("My Applications");
                    break;

                case 7:
                    System.out.println("Application Status");
                    break;

                case 8:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    // Candidate Update Profile
    static void updateCandidateProfile(Candidate candidate)
    {
        System.out.println("\n===== UPDATE PROFILE =====");

        sc.nextLine();

        System.out.print("Enter New Name          : ");
        candidate.name = sc.nextLine();

        System.out.print("Enter New Email         : ");
        candidate.email = sc.nextLine();

        System.out.print("Enter New Phone         : ");
        candidate.phone = sc.nextLine();

        System.out.print("Enter New Qualification : ");
        candidate.qualification = sc.nextLine();

        System.out.print("Enter New Skills        : ");
        candidate.skills = sc.nextLine();

        System.out.print("Enter New Experience    : ");
        candidate.experience = sc.nextLine();

        System.out.println("\nProfile Updated Successfully!");
    }

    // Recruiter Dashboard
    static void recruiterDashboard(Recruiter recruiter)
    {
        while(true)
        {
            System.out.println("\n===== RECRUITER DASHBOARD =====");
            System.out.println("1. View Profile");
            System.out.println("2. Update Profile");
            System.out.println("3. Post New Job");
            System.out.println("4. View My Jobs");
            System.out.println("5. View Applications");
            System.out.println("6. Shortlist Candidate");
            System.out.println("7. Reject Candidate");
            System.out.println("8. Logout");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("\n===== MY PROFILE =====");
                    recruiter.displayRecruiter();
                    break;

                case 2:
                    updateRecruiterProfile(recruiter);
                    break;

                case 3:
                    postJob(recruiter);
                    break;

                case 4:
                    viewMyJobs(recruiter);
                    break;

                case 5:
                    System.out.println("View Applications");
                    break;

                case 6:
                    System.out.println("Shortlist Candidate");
                    break;

                case 7:
                    System.out.println("Reject Candidate");
                    break;

                case 8:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    // Recruiter Update Profile
    static void updateRecruiterProfile(Recruiter recruiter)
    {
        System.out.println("\n===== UPDATE PROFILE =====");

        sc.nextLine();

        System.out.print("Enter New Name         : ");
        recruiter.name = sc.nextLine();

        System.out.print("Enter New Email        : ");
        recruiter.email = sc.nextLine();

        System.out.print("Enter New Company Name : ");
        recruiter.companyName = sc.nextLine();

        System.out.print("Enter New Company Type : ");
        recruiter.companyType = sc.nextLine();

        System.out.println("\nProfile Updated Successfully!");
    }

    // Post Job
    static void postJob(Recruiter recruiter)
    {
        System.out.println("\n===== POST NEW JOB =====");

        sc.nextLine();

        System.out.print("Enter Job Title   : ");
        String jobTitle = sc.nextLine();

        System.out.print("Enter Location     : ");
        String location = sc.nextLine();

        System.out.print("Enter Salary (LPA) : ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Experience   : ");
        String experience = sc.nextLine();

        System.out.print("Enter Skills       : ");
        String skills = sc.nextLine();

        System.out.print("Enter Description  : ");
        String description = sc.nextLine();

        String jobId = "J" + (1001 + jobCount);

        Job j = new Job(
            jobId,
            jobTitle,
            recruiter.companyName,
            location,
            salary,
            experience,
            skills,
            description
        );

        jobs[jobCount] = j;
        jobCount++;

        System.out.println("\nJob Posted Successfully!");
        System.out.println("Job ID : " + jobId);
    }

    // View My Jobs
    static void viewMyJobs(Recruiter recruiter)
    {
        System.out.println("\n===== MY JOBS =====");

        boolean found = false;

        for(int i = 0; i < jobCount; i++)
        {
            if(jobs[i].companyName.equalsIgnoreCase(recruiter.companyName))
            {
                jobs[i].displayJob();
                System.out.println("-----------------------------");
                found = true;
            }
        }

        if(!found)
        {
            System.out.println("No jobs posted yet.");
        }
    }
}