package practiced;

import java.util.Scanner;

/**
 * @author laiba.mumtaz
 *
 */

public class practiced {
	public class vehicle{
		String y;
	}

	public static void main(String[] args) {

		//Scanner s = new Scanner(System.in);
		practiced x = new practiced();
		practiced.vehicle obj= x.new vehicle();
		
//		Main myObj = new Main();
//		myObj.fullThrottle();
//		myObj.speed(200);
		obj.y="Saad";
		System.out.println(obj.y);
	}
}

