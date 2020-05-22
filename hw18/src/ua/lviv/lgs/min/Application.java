/**
 * 
 */
package ua.lviv.lgs.min;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alexl
 *
 */
public class Application {

	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {

		list.add((Integer) 15);
		// list.add((String)("some line of text")); /// not compiling in this way, we
		// need to use method (addToList) with generic

		addToList(list);

		addToListMod(list, "some line of text");
		addToListMod(list, 25);

		System.out.println(list);

	}

	/*
	 * It's possible. Generics are used during the compilation, then the compiler deletes all information about generics,
	 *  putting down necessary casts
	 *   */
	
	public static <T> void addToList(List<T> list) {
		list.add((T) (Integer) 10);
		list.add((T) "String text1");
	}
	
	/* this method has second argument of type Object for putting different types to it, I hope it's not very bad idea... ? */
	public static <T> void addToListMod(List<T> list, Object obj) {
		list.add((T) obj);

	}

}
