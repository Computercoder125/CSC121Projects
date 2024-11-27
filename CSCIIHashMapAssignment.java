import java.util.ArrayList;
import java.util.HashMap;

public class CSCIIHashMapAssignment
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(45);

        numList.add(56);

        numList.add(15);

        numList.add(6);

        numList.add(45);

        numList.add(34);

        System.out.println(getStats(numList));
    }
    public static HashMap<String, Double> getStats(ArrayList<Integer> list)
    {
            //getting maximum

        double max = list.get(0);

        for(int i = 1; i < list.size(); i++)
        {
            if (list.get(i) > max)
                max = list.get(i);
        }

        //getting minimum


        double min = list.get(0);


        for(int i = 1; i < list.size(); i++)
        {
            if (list.get(i) < min)
                min = list.get(i);
        }


        //getting sum

        double sum = 0;

        for(int i : list)
        {
            sum += i;
        }

        //getting average

        double average = (sum) / (list.size());

        HashMap<String, Double> stats = new HashMap <>();

        //storing values into HashMap

        stats.put("Min", min);
        stats.put("Maximum", max);
        stats.put("Sum", sum);
        stats.put("Average", average);

        return stats;
    }

}

