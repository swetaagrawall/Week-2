package inheritance.multilevel.educationalcoursehierarchy;

public class OnlineCourse extends Course{
    private String platform;
    private boolean isRecorded;
    public OnlineCourse(String courseName,int duration,String platform,boolean isRecorded){
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Platform : "+platform);
        System.out.println("Is recorded ? "+isRecorded);
    }
}
