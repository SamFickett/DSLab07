package Lab7;
import java.util.*;
/*
 * @author Jere Perisic
 * @version November 6, 2023
 * myFoodPopularity class method getFoodPopularity, takes treemap as an input with country's name as key.
 */
public class myFoodPopularity implements IFoodPopularity {
    @Override
    public List<String> getFoodPopularity(TreeMap<String, TreeSet<String>> countryFoodSet, List<String> countries1, List<String> countries2) {
        List<String> result = new ArrayList<>();

        if (countries1.isEmpty() || countries2.isEmpty()) {
            return result;
        }

        int popularMajority1 = countries1.size() / 2 + 1;
        int popularMajority2 = countries2.size() / 2 + 1;

        TreeSet<String> uniqueFoods = new TreeSet<>();

        for (Set<String> foodSet : countryFoodSet.values()) {
            uniqueFoods.addAll(foodSet);
        }



        return result;
    }
}
