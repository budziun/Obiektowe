import java.util.ArrayList;
import java.util.List;
class Athlete implements Cloneable {
    public String name;
    public List<Integer> lapTimes;

    public Athlete(String name, List<Integer> lapTimes) {
        this.name = name;
        this.lapTimes = new ArrayList<>(lapTimes);
    }
    public void setLapTime(int index, int time) {
        if (index >= 0 && index < lapTimes.size()) {
            lapTimes.set(index, time);
        }
    }
    @Override
    public Athlete clone() {
        try {
            Athlete clonedAthlete = (Athlete) super.clone();
            clonedAthlete.lapTimes = new ArrayList<>(this.lapTimes);
            return clonedAthlete;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}