package com.javacourse.objects.homogeneousTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tree<E> {

	private E value;
	private Tree<E> parent;
	private Tree<E> leftChild;
	private Tree<E> rightChild;

	private static final Logger logger = LoggerFactory.getLogger(Tree.class);

	// Constructors
	public Tree(E value) {
		this.value = value;
	}

	public Tree(E value, Tree<E> leftChild, Tree<E> rightChild) {
		this.value = value;
		this.leftChild = leftChild;
		this.leftChild.parent = this;
		this.rightChild = rightChild;
		this.rightChild.parent = this;
	}

	// The method is traversing the tree using Breadth first search
	public ArrayList<E> order() {

		ArrayList<E> result = new ArrayList<>();
		Deque<Tree<E>> childrenQueue = new ArrayDeque<>();

		childrenQueue.offer(this);

		while (!childrenQueue.isEmpty()) {

			Tree<E> current = childrenQueue.poll();
			result.add(current.value);

			if (current.leftChild != null) {
				childrenQueue.offer(current.leftChild);
			}

			if (current.rightChild != null) {
				childrenQueue.offer(current.rightChild);
			}
		}

		return result;
	}

	// The method searches if an element already exists in the Tree
	public boolean searchElement(E value) {

		ArrayList<E> listOfElements = this.order();

		for (E element : listOfElements) {
			if (element.equals(value)) {
				return true;
			}
		}

		return false;
	}

	// The method adds an element to the tree as a child to the left most leaf if it
	// doesn't already exist
	public void addElement(Tree<E> element) {

		if (!searchElement(element.value)) {

			Tree<E> found = findLeft(this);
			found.leftChild = new Tree<>(element.value);
			element.parent = found;

		} else {
			logger.error("The element {} already exists in the tree", element.value);
		}

	}

	// The method finds the left most leaf of the tree
	public Tree<E> findLeft(Tree<E> tree) {

		while (tree.leftChild != null) {
			Tree<E> found = findLeft(tree.leftChild);
			return found;
		}

		return tree;
	}

	// The method prints all the elements of a tree using a BFS ordering
	public void printing(Tree<E> tree) {

		logger.info("{}", tree.order().toString());

	}

}
