public class Time {
    public int hours;
    public int minutes;
    public Time addT(Time otherT){
        Time newT = new Time();
        newT.hours= (hours+ otherT.hours)%24;
        if(otherT.minutes + minutes > 59){
            newT.hours++;
        }
        newT.minutes = (minutes+ otherT.minutes)%60;
        return newT;
    }
    public void print(){
        if(minutes <10 )
            System.out.println(hours + ":"+minutes);
        System.out.println(hours + ":"+minutes);
    }
}
