package inheritance.multilevel.educationalcoursehierarchy;

public class PaidOnlineCourse extends OnlineCourse{
    private int fee;
    private int discount;
    public PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,int fee,int discount){
        super(courseName, duration, platform, isRecorded);
        this.fee=fee;
        this.discount=discount;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Total fee : "+fee);
        System.out.println("Discount : "+discount+"%");
    }
}
