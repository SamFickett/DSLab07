import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class lab7 {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = args[0];
		
		//Created by: Samuel Fickett
		TreeMap<String, TreeSet<String>> map = new TreeMap<String, TreeSet<String>>();
		myFileReader fileReader = new myFileReader();
		map = fileReader.readFileToTreeMap(filePath);
		
		//Created by: Ashley
		myFindCommon fC = new myFindCommon();
		List<String> list = new ArrayList<String>();
		fC.getCommonFood(map);
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i));
		}
		
		//Creatd by: Jere
		myFoodPopularity fP = new myFoodPopularity();
		List<String> list2 = new ArrayList<String>();
		fP.getFoodPopularity(map);
		for (int i = 0; i < list2.size(); ++i) {
			System.out.println(list2.get(i));
		}
		
		//Created by: Patrick
		mySimilarCountries sC = new mySimilarCountries();
		TreeMap<String, List<String>> map2 = new TreeMap<String, List<String>>();
		sC.getSimilarCountries(map);
		for (String str: map2.keySet()) {
			List<String> list3 = map2.get(str);
			for (int i = 0; i < list3.size(); ++i) {
				System.out.println(list3.get(i));
			}
		}
	}
}
