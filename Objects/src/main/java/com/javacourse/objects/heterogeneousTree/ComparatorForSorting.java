package com.javacourse.objects.heterogeneousTree;

import java.util.Comparator;

public class ComparatorForSorting implements Comparator<ComputerElement> {

	@Override
	public int compare(ComputerElement o1, ComputerElement o2) {
		return o1.getModel().compareTo(o2.getModel());
	}
}
