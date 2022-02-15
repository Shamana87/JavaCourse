package com.javacourse.objects.heterogeneousTreeTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.javacourse.objects.heterogeneousTree.ComputerElement;
import com.javacourse.objects.heterogeneousTree.HeterogenousTree;
import com.javacourse.objects.heterogeneousTree.ProcessorImplementation;
import com.javacourse.objects.heterogeneousTree.RamImplementation;
import com.javacourse.objects.heterogeneousTree.RamType;
import com.javacourse.objects.heterogeneousTree.VideoAdapterImplementation;

public class HeterogeneousTreeTest {

	HeterogenousTree<ComputerElement> testingTree;
	RamImplementation furyDdr3;
	RamImplementation furyDdr4;
	RamImplementation furyDdr5;
	RamImplementation furyDdrRgb4;
	ProcessorImplementation processorElement;
	VideoAdapterImplementation videoAdapterElement;
	
	@Before
	public void creatingTree() {
		
		// Creating testing RAM elements
		furyDdr3 = new RamImplementation("123", "Kingston", "Fury Beast", RamType.DDR3); 
		furyDdr4 = new RamImplementation("33234", "Kingston", "Fury Beast", RamType.DDR4);
		furyDdr5 = new RamImplementation("12345", "Kingston", "Fury Beast", RamType.DDR5); 
		furyDdrRgb4 = new RamImplementation("12344", "Kingston", "Fury Beast RGB", RamType.DDR4);
		
		// Filling the tree with one type of elements - RAM
		testingTree = new HeterogenousTree<>(furyDdr3, 
				new HeterogenousTree<> (furyDdr4, 
						new HeterogenousTree<>(furyDdr5)
						),
				new HeterogenousTree<> (furyDdrRgb4)
			);
	}
	
	@Test
	public void testOrder() {
		
		ArrayList<ComputerElement> expected = new ArrayList<>(Arrays.asList(furyDdr3, furyDdr4, furyDdrRgb4, furyDdr5));
		
		assertEquals(expected, testingTree.order());
	}
	
	@Test
	public void testAddElement_addingProcessorElement() {
		
		processorElement = new ProcessorImplementation("41414", "Intel", "i7", 8);
		HeterogenousTree<ComputerElement> processor = new HeterogenousTree<>(processorElement);
		testingTree.addElement(furyDdr3, processor);
		
		ArrayList<ComputerElement> expected = new ArrayList<>(Arrays.asList(furyDdr3, furyDdr4, furyDdrRgb4, processorElement, furyDdr5));

		assertEquals(expected, testingTree.order());
		
	}
	
	@Test
	public void testAddElement_addingVideoAndProcessorElement() {
		
		processorElement = new ProcessorImplementation("41414", "Intel", "i7", 8);
		HeterogenousTree<ComputerElement> processor = new HeterogenousTree<>(processorElement);
		testingTree.addElement(furyDdr3, processor);
		
		videoAdapterElement = new VideoAdapterImplementation("768954", "AMD Radeon Sapphire", "RX 6600 XT", "8GB");
		HeterogenousTree<ComputerElement> videoAdapter = new HeterogenousTree<ComputerElement>(videoAdapterElement);
		testingTree.addElement(processorElement, videoAdapter);
		
		ArrayList<ComputerElement> expected = new ArrayList<>(Arrays.asList(furyDdr3, furyDdr4, furyDdrRgb4, processorElement, furyDdr5, videoAdapterElement));

		assertEquals(expected, testingTree.order());
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddElement_nonExistingParent() {
		
		processorElement = new ProcessorImplementation("41414", "Intel", "i7", 8);
		HeterogenousTree<ComputerElement> processor = new HeterogenousTree<>(processorElement);
		testingTree.addElement(processorElement, processor);		
		
	}
	
	@Test
	public void testSorting_sortingByModelAfterAddingTwoDifferentElements() {
	
		processorElement = new ProcessorImplementation("41414", "Intel", "i7", 8);
		HeterogenousTree<ComputerElement> processor = new HeterogenousTree<>(processorElement);
		testingTree.addElement(furyDdr3, processor);
		
		videoAdapterElement = new VideoAdapterImplementation("768954", "AMD Radeon Sapphire", "RX 6600 XT", "8GB");
		HeterogenousTree<ComputerElement> videoAdapter = new HeterogenousTree<ComputerElement>(videoAdapterElement);
		testingTree.addElement(processorElement, videoAdapter);
		
		List<ComputerElement> expected = new ArrayList<>(Arrays.asList(furyDdr3, furyDdr4, furyDdr5, furyDdrRgb4, videoAdapterElement, processorElement));
		
		assertEquals(expected, testingTree.sorting(testingTree.order()));
	}
	

}
