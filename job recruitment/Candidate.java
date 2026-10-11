public class Candidate
{
    String candidateId;
    String name;
    String email;
    String password;
    String phone;
    String qualification;
    String skills;
    String experience;

    Candidate(String candidateId, String name, String email,
              String password, String phone, String qualification,
              String skills, String experience)
    {
        this.candidateId = candidateId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.qualification = qualification;
        this.skills = skills;
        this.experience = experience;
    }

    void displayCandidate()
    {
        System.out.println("Candidate ID : " + candidateId);
        System.out.println("Name         : " + name);
        System.out.println("Email        : " + email);
        System.out.println("Phone        : " + phone);
        System.out.println("Qualification: " + qualification);
        System.out.println("Skills       : " + skills);
        System.out.println("Experience   : " + experience);
    }
}