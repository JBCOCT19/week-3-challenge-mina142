import java.util.ArrayList;

public class Education {
    private String educationType;
    private String major;
    private String uniName;
    private String gradYear;



    public Education(){}
    public Education(String educationType, String major, String uniName, String gradYear){

        this.educationType = educationType;
        this.major = major;
        this.uniName = uniName;
        this.gradYear = gradYear;
    }
    public String getEducationType() {
        return educationType;
    }

    public void setEducationType(String educationType) {
        this.educationType = educationType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

    public void educationTextDisplay(ArrayList education){

        for(Object o :education) {

            System.out.println("Education:");
            System.out.println(getEducationType());
            System.out.println(getMajor());
            System.out.println(getUniName());
            System.out.println(getGradYear() + "\n");

        }
        }
        }


