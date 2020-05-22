package ua.lviv.lgs.max;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class OwnMap<K, V> {

	private Map<K, V> map = new HashMap<>();

	/**
	 * @param map
	 */
	public OwnMap() {
		super();

	}

	public Map<K, V> getMap() {
		return map;
	}

	public void setMap(Map<K, V> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "OwnMap [map=" + map + "]";
	}

	public void showMap() {
		if (map.size() != 0) {
			System.out.print("The Map: ");
			System.out.println(map.toString());
		} else {
			System.out.println("The map is empty");
		}

	}

	public void addObjectToMap(K k, V v) {
		MyEntry<K, V> myEntry = new MyEntry<>(k, v);
		map.put(myEntry.getK(), myEntry.getV());
	}

	public void removeObjectByKey(K k) {

		Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<K, V> entry = (Map.Entry<K, V>) iterator.next();
			if (entry.getKey().equals(k)) {
				iterator.remove();
			}

		}

	}
	
	public void removeObjectByValue(V v) {

		Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<K, V> entry = (Map.Entry<K, V>) iterator.next();
			if (entry.getValue().equals(v)) {
				iterator.remove();
			}

		}

	}
	
	public void showKeySet() {
		if (map.size() != 0) {
			System.out.print("Key Set: ");
			System.out.println(map.keySet().toString());
		} else {
			System.out.println("The map is empty");
		}

	}
	
	public void showValueList() {
		if (map.size() != 0) {
			System.out.print("Value list: ");
			System.out.println(map.values().toString());
		} else {
			System.out.println("The map is empty");
		}

	}

}
