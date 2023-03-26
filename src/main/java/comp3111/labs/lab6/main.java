package comp3111.labs.lab6;

/*
 * note the bad coding style (deliberately written for debugging exercise) 
 */
public class main {
	public static void main(String[] args) {
		Animal animals[] = new Animal[10];
		/*for (Animal a : animals) {
			a = new Animal();
		}*/
		for (int i = 0; i < animals.length; i++){
			animals[i] = new Animal();
		}
		for (int iii = 0; iii < 10; iii++) {
			int ii = 0;
			/*
			* Bug: `for (; ii < 100 && animals[iii].isAlive() ; ii++)`
			* Problem: `animals[iii]` is null, and we access `null.isAlive()`
			* Fix: `for(Animal a : animals)` should be a normal for loop,
			* 		as it is currently editing copy of element only
			* */
			for (; ii < 100 && animals[iii].isAlive() ; ii++) {
				System.out.print(animals[iii].getWeight() + " ");
				animals[iii].eat();
				if (ii % 3 == 0)
					animals[iii].poo();
			}
		}
	}
}
