package Lab7;

import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
/*
@author Jere Perisic
@version November 6, 2023
Change from IFindDifference to IFoodPopularity, and changed method name to getFoodPopularity
 */
public interface IFoodPopularity {
    // This method will return the list of foods that are popular in majority of the countries in countries1 
    // and not popular in the majority of the countries in countries2
    public List<String> getFoodPopularity(TreeMap<String, TreeSet<String>> countryFoodSet, List<String>countries1, List<String>countries2);
}
