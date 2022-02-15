package com.javacourse.objects.heterogeneousTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class HeterogenousTree<E> {

	private E value;
	private HeterogenousTree<E> parent;
	private ArrayList<HeterogenousTree<E>> children;

	// Constructors
	@SafeVarargs
	public HeterogenousTree(E value, HeterogenousTree<E>... children) {
		this.value = value;
		this.children = new ArrayList<>();

		for (HeterogenousTree<E> child : children) {
			this.children.add(child);
			child.parent = this;
		}
	}

	// The method is traversing the tree using Breadth first search
	public ArrayList<E> order() {

		ArrayList<E> result = new ArrayList<>();
		Deque<HeterogenousTree<E>> childrenQueue = new ArrayDeque<>();

		childrenQueue.offer(this);

		while (!childrenQueue.isEmpty()) {

			HeterogenousTree<E> current = childrenQueue.poll();
			result.add(current.value);

			for (HeterogenousTree<E> child : current.children) {
				childrenQueue.offer(child);
			}
		}

		return result;
	}

	// The method adds to the tree a given element as a child to the given parent
	public void addElement(E parentKey, HeterogenousTree<E> element) {

		HeterogenousTree<E> search = find(this, parentKey);

		if (search == null) {
			throw new IllegalArgumentException();
		}

		search.children.add(element);
		element.parent = search;

	}

	// The method finds an element(given type) in the tree and returns it as a HeterogenousTree type
	private HeterogenousTree<E> find(HeterogenousTree<E> current, E parentKey) {

		if (current.value.equals(parentKey)) {
			return current;
		}

		for (HeterogenousTree<E> child : current.children) {
			HeterogenousTree<E> found = this.find(child, parentKey);
			if (found != null) {
				return found;
			}
		}
		return null;
	}
	
	// The method sorts the elements of an arraylist of ComputerElements
	public ArrayList<ComputerElement> sorting(ArrayList<ComputerElement> listOfObjects) {
		
		ComparatorForSorting elementComparator = new ComparatorForSorting();		
		listOfObjects.sort(elementComparator);
		return listOfObjects;
	}

}
