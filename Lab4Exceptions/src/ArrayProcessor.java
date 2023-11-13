
public class ArrayProcessor {
	int getArrayLength(Object [] a) {
		try {
			int count = 0;
			while(true) {
				Object t = a[count];
				count++;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("This code sucks");
			return 0;
		}
	}
}
