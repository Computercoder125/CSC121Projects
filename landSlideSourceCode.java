import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class landSlideSourceCode
{
    public static void main(String[] args)
    {
        File file = new File("landSlides2.csv");

        String [] tokens;

        int countforQ1 = 0, countforQ2 = 0;

        String word = "";

        HashMap <String, Integer> numofcommonCauses = new HashMap<>();

        HashMap<String, Integer> numofEvents = new HashMap<>();

        String line;



        try
        {
            BufferedReader br = new BufferedReader(new FileReader(file));

            BufferedWriter bw = new BufferedWriter(new FileWriter("listInOrder.txt"));

            br.readLine(); //reading first line

            //iterating through each row in the file
            while((line = br.readLine()) != null)
            {
                tokens = line.split(",");

                //number of landslides occuring globally
                countforQ1++;

                //number of landslides occurring in the U.S.

                if(tokens[4].equals("United States"))
                {
                    countforQ2++;

                    //Question 4 of Assignment (how many events occurred in each state)

                    if(numofEvents.get(tokens[5]) == null)
                    {
                        numofEvents.put(tokens[5], 1);
                    }

                    else
                    {
                        numofEvents.put(tokens[5], numofEvents.get(tokens[5]) + 1);
                    }
                }

                //Question 3 of the Assignment (finding most common cause)

                if (numofcommonCauses.get(tokens[3]) != null)
                {
                    numofcommonCauses.put(tokens[3], numofcommonCauses.get(tokens[3]) + 1);
                }
                else
                {
                    numofcommonCauses.put(tokens[3], 1);
                }

                int max = 0;

                for(String i : numofcommonCauses.keySet())
                {
                    if(numofcommonCauses.get(i) > max)
                    {
                        max = numofcommonCauses.get(i);
                        word = i;
                    }
                }
            }
            br.close();

            //Answers to Each Question

            System.out.println("Global number of landslides: " + countforQ1);

            System.out.println("Number of landslides occuring in the US: " + countforQ2);

            System.out.println("the most common cause of landslides is: " + word);

            for(String i : numofEvents.keySet())
            {
                System.out.println("For the state " + i + ", number of landslides = " + numofEvents.get(i));
            }

            ArrayList<String> statesInUS = new ArrayList<>();
            ArrayList<Integer> numOfLandslides = new ArrayList<>();

            for(String i : numofEvents.keySet())
            {
                statesInUS.add(i);
                numOfLandslides.add(numofEvents.get(i));
            }

            //sorting the list of states and their frequencies from least to greatest

            for(int i = 0; i < numOfLandslides.size(); i++)
            {
                for(int j = i + 1; j < numOfLandslides.size(); j++)
                {
                    if(numOfLandslides.get(i) > numOfLandslides.get(j))
                    {
                        int temp = numOfLandslides.get(i);
                        numOfLandslides.set(i, numOfLandslides.get(j));
                        numOfLandslides.set(j, temp);

                        String nameTemp = statesInUS.get(i);
                        statesInUS.set(i, statesInUS.get(j));
                        statesInUS.set(j, nameTemp);
                    }
                }
                bw.write(statesInUS.get(i) + "    " + numOfLandslides.get(i));
                bw.newLine();
            }
            bw.close();
        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }

    }
}
