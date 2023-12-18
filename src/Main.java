import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<City> cityList = new LinkedList<>();
        cityList.add(new City(1, "Bishkek"));
        cityList.add(new City(11, "Osh"));
        cityList.add(new City(4, "Kadamjai"));
        cityList.add(new City(5, "Naryn"));
        cityList.add(new City(7, "New York"));
        cityList.add(new City(5, "London"));
        TreeSet<City> treeSet = new TreeSet<>((city1, city2) -> Integer.compare(city2.getCode(), city1.getCode()));
        for (City city : cityList) {
            if (city.getCode() % 2 != 0)
                treeSet.add(city);
        }
        System.out.println(treeSet);
    }
}

