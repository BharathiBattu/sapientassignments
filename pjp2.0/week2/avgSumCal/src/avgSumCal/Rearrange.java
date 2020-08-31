package avgSumCal;

import java.util.Comparator;

public class Rearrange implements Comparator<InputRecord> {

	@Override
	public int compare(InputRecord t1, InputRecord t2) {

		if (t1.getCountry().equals(t2.getCountry())) {

				return t1.getGender().compareTo(t2.getGender());

		} else {
			return t1.getCountry().compareTo(t2.getCountry());
	}
}
}

