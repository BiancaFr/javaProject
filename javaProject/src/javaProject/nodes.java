package javaProject;

import java.util.ArrayList;

public class nodes {
	
	private ArrayList<String> wordsSequence;
	private String value;
	
	
	public nodes(String value) {
		 /**
		  * constructor
		  */
		this.wordsSequence = new ArrayList<>(0);
		this.value = value;
	}
	

	
	public String getwordSequence(int arrayIndex) throws IndexOutOfBoundsException {
		/**
		 * returns the word according to the given index
		 * handling exceptions if the index does not exist in the array list
		 */
		
		if (arrayIndex > this.getarraySize() -1 ) {
			throw new IndexOutOfBoundsException("This index is non-existent from the array list");
			}
			else {
				return wordsSequence.get(arrayIndex);
			}
		}
		
	
	public int getarraySize() {
		/**
		 * return the size of the array list
		 */
		return this.wordsSequence.size();
	}

	public String getvalue() {
		return value;
	}
	
	public void add (String laterWord) {
		/**
		 * add a new word in the array list
		 */
		
		wordsSequence.add(laterWord);
	}
	
	public ArrayList<String> getwordSequence(){
		/*
		 * return array list with the words
		 */
		return wordsSequence;
	}
}
//fazer função de saida/ arrumar a saida!