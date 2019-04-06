  public class BooleanInJava {

        public static void main(String[] args) {
		
		boolean passedDoor = true;
		boolean missedDoor = false;
		boolean passedAllDoors = false;
		int doorCount = 0;
		
		if(missedDoor) {
			System.out.println("We passed the first door!");
			doorCount = doorCount + 1;
		}
		
		if(passedDoor) {
			System.out.println("We passed the second door!");
			doorCount = doorCount + 1;
		}
		
		if(passedDoor) {
			System.out.println("We passed the third door!");
			doorCount = doorCount + 1;
		}
		
		if(doorCount == 3) {
			passedAllDoors = true;
		}
		
		if(passedAllDoors) {
			System.out.println("Congratualions you won the program!");
		}
		
	}

    }
