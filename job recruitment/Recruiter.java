public class Recruiter
{
    String recruiterId;
    String name;
    String email;
    String password;
    String companyName;
    String companyType;

    Recruiter(String recruiterId, String name, String email,
              String password, String companyName, String companyType)
    {
        this.recruiterId = recruiterId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.companyName = companyName;
        this.companyType = companyType;
    }

    void displayRecruiter()
    {
        System.out.println("Recruiter ID : " + recruiterId);
        System.out.println("Name         : " + name);
        System.out.println("Email        : " + email);
        System.out.println("Company      : " + companyName);
        System.out.println("Company Type : " + companyType);
    }
}