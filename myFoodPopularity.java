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
        // If any list is empty return result, which is an empty list
        if (countries1.isEmpty() || countries2.isEmpty()) {
            return result;
        }

        int popularMajority1 = countries1.size() / 2 + 1;
        int popularMajority2 = countries2.size() / 2 + 1;

        TreeSet<String> uniqueFoods = new TreeSet<>();

        for (Set<String> foodSet : countryFoodSet.values()) {
            uniqueFoods.addAll(foodSet);
        }

        for (String food : uniqueFoods) {
            int countCountries1 = 0;
            int countCountries2 = 0;
            // For each loop to check each string in List countries1
            // If food is found in specified county, increment counter
            for (String country : countries1) {
                if (countryFoodSet.containsKey(country) && countryFoodSet.get(country).contains(food)) {
                    countCountries1++;
                }
            }
            // For each loop to check each string in List countries2
            // If food is found in specified country, increment counter
            for (String country : countries2) {
                if (countryFoodSet.containsKey(country) && countryFoodSet.get(country).contains(food)) {
                    countCountries2++;
                }
            }
            // Add foods to result List, if count in countries 1 is larger than popular majority 1, and count in countries 2
            // is striclty less than popular majority 2
            if (countCountries1 >= popularMajority1 && countCountries2 < popularMajority2) {
                result.add(food);
            }
        }

        return result;
    }
}
