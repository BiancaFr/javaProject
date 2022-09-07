package javaProject;

import java.io.IOException;

import javax.swing.JOptionPane;

public class managerProgram {


	public void startProgram() throws IOException {
		/*
		 * start the program
		 */

		this.setInput();
		this.outputFile();

	}
	
	private String getchosenPath() {
		/*
		 * choosing the path 
		 * 
		 */
		String path = JOptionPane.showInputDialog("Input file PATH: ");
		return path;
	}
	private void setInput() throws IOException {
		//criar obj da classe de input do arquivo(felipe) e adicionar o caminho no contrutor metodo abaixo
		//this.nodes = //objeto criado em cma.metodo getque retorna a lista com os nós com base no arquivo de entrada
	}

	private void outputFile() throws IOException {
		String path = System.getProperty("user.dir") + "\\";
		//chamar o metodo de escrever os nós(recebe dois parametros um da lista d enós e o segundo do path) de acordo com o path da classe de outpput do arquivo (classe que gerencia a saida)

	}

	
}
