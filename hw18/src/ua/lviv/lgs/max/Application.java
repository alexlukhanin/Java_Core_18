package ua.lviv.lgs.max;

public class Application {

	public static void main(String[] args) {
		
		OwnMap< String, Integer> ownMap = new OwnMap<>();
		ownMap.showMap();
		
		ownMap.addObjectToMap("test1", 15);
		ownMap.addObjectToMap("test2", -5);
		ownMap.addObjectToMap("test3", 12);
		ownMap.addObjectToMap("test4", 199);
		ownMap.addObjectToMap("test5", 19);
		ownMap.addObjectToMap("test6", -11);
		ownMap.showMap();
		
		ownMap.removeObjectByKey("test3");
		ownMap.showMap();
		
		ownMap.removeObjectByValue(-5);
		ownMap.showMap();
		
		ownMap.showKeySet();
		ownMap.showValueList();
		
		
		
		
		
		
	}

}
