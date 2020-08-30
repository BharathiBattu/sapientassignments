package procFeeCal;

import java.util.Comparator;

public class Rearrange implements Comparator<TranList> {

	@Override
	public int compare(TranList t1, TranList t2) {

		if (t1.getClientId().equals(t2.getClientId())) {

			if (t1.getTransactionType().equals(t2.getTransactionType())) {

				if (t1.getTransactionDate().equals(t2.getTransactionDate())) {

					return t1.getPriorityFlag().compareTo(t2.getPriorityFlag());

				} else {
					return t1.getTransactionDate().compareTo(t2.getTransactionDate());
				}
			} else {
				return t1.getTransactionType().compareTo(t2.getTransactionType());
			}
		}
		return t1.getClientId().compareTo(t2.getClientId());
	}

}

