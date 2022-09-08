/** 
 * start the program;
 * instantiate the control object;
 * and handle exceptions.
 * @author bianca
 */
package javaProject;

import javax.swing.JOptionPane;

public class digraphStart {

	public static void main(String[] args) {

		try {
			/**
			 * starting and finishing the program by dialog boxes with JOptionPane
			 */
			managerProgram program = new managerProgram();
			JOptionPane.showMessageDialog(null, "Welcome to Digraph Program");
			program.startProgram();
			JOptionPane.showMessageDialog(null, "The Digraph Program is finished ");

		} catch (Exception e) {
			/**
			 * handling exceptions
			 */
			System.out.println("ERRO");
		}

	}

}

