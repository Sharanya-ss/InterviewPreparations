package practice;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AverageMarksinAnAraray {
	public static void main(String[] args) {
		String[] s= {"1-english:45","2-english:35","3-hindi:50"};
		  Map<String, ArrayList<Integer>> map=new TreeMap<>();
		  for(int i=0;i<s.length;i++) {
			  String[] sarr=s[i].split(":");
			  String kString=sarr[0].substring(sarr[0].indexOf("-")+1);
			  int val=Integer.valueOf(sarr[1]);
			  if(map.containsKey(kString)) {
				  ArrayList<Integer> list=map.get(kString);
				  list.add(val);
				  map.put(kString,list);
			  }else {
				  ArrayList<Integer> list=new ArrayList<>();
				  list.add(val);
				  map.put(kString,list);  
			  }
		  }
		  
		  //step one
		 Map<String,Double> MapAverage= map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,e->e.getValue().stream().collect(Collectors.averagingDouble(Integer::valueOf))));
	     //System.out.println(MapAverage);
		 //step two
		 map.forEach((k,v)->{
			 Double avg=v.stream().mapToInt(Integer::valueOf).average().getAsDouble();
			 System.out.println(k+"="+avg);
		 });
	}
}
