import java.util.ArrayList;
public class StepTracker
{
 private int mS, tS;
 private int tD, aD;
 public StepTracker(int goal){
minSteps = goal;
 tS = 0;
 tD = 0;
 aD = 0;
 }
 public void addDailySteps(int steps){
  tS+=steps;
  tD++;
  if ( steps>= mS)
aD++;
 }
 public int activeDays(){
  return aD;
 }
 public double averageSteps()
 if(tD==0)
 return 0.0;
else
 return (double)tS/tD;
 /* to be implemented here */
} 
