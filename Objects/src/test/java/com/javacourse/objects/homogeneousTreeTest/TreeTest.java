package com.javacourse.objects.homogeneousTreeTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.javacourse.objects.homogeneousTree.Tree;

public class TreeTest {
	
	Tree<String> tree;
	
	@Before
	public void creatingStringTree() {
		
		tree = new Tree<>("7",
		new Tree<>("one", 
				new Tree<>("fourteen"),
				new Tree<>("31")
				),
		new Tree<>("14", 
				new Tree<>("bug"),
				new Tree<>("6", 
						new Tree<>("fix"),
						new Tree<>("17")
						)
				)
		);
		
	}

	@Test
	public void testIntegerTreeCreationAndOrdering() {
		
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(7, 19, 14, 12, 31, 23, 6, 8, 17));
		
		Tree<Integer> integerTree = new Tree<>(7,
				new Tree<>(19, 
						new Tree<>(12),
						new Tree<>(31)
						),
				new Tree<>(14, 
						new Tree<>(23),
						new Tree<>(6, 
								new Tree<>(8),
								new Tree<>(17)
								)
						)
				);
		assertEquals(expected, integerTree.order());
	}
	
	@Test
	public void testStringTreeCreationAndOrdering() {
		
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("7", "one", "14", "fourteen", "31", "bug", "6", "fix", "17"));
		
		assertEquals(expected, tree.order());		
	}
	
	@Test
	public void testSearchElement_existingElement() {
		
		assertTrue(tree.searchElement("bug"));
	}
	
	@Test
	public void testSearchElement_nonExistingElement() {
		
		assertFalse(tree.searchElement("total disaster"));
	}
	
	@Test
	public void testAddElement_nonExistingElement() {
		
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("element"));
		
		Tree<String> element = new Tree<String>("element");		
		tree.addElement(element);

		assertEquals(expected, tree.findLeft(tree).order());
	}
	
	@Test
	public void testAddElement_existingElement() {
		
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("fourteen"));
		
		Tree<String> element = new Tree<String>("fix");		
		tree.addElement(element);
		
		assertEquals(expected, tree.findLeft(tree).order());
	}
	
	@Test
	public void testFindLeft() {
		
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("fourteen"));
		
		assertEquals(expected, tree.findLeft(tree).order());
	}
	

}
