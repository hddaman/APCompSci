public class StepTracker{
    int steps;
    int days;
    double average;
    int active;
    public StepTracker(int a){
        active = a;
        steps = 0;
        days = 0;
        average = 0.0;
    }
    public void addDailySteps(int num){
        steps = steps+num;
        days++;
    }
    public double averageSteps(){
        average = steps/days;
        return average;
    }
    public int activeDays(){
        int sum = 0;
        if(steps>=active){
            sum++;
        }
        return sum;
    }
}