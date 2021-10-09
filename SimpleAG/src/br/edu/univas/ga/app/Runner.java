package br.edu.univas.ga.app;

import br.edu.univas.ga.base.Crossover;
import br.edu.univas.ga.base.InitialPopulation;
import br.edu.univas.ga.base.Mutation;
import br.edu.univas.ga.base.Selection;
import br.edu.univas.ga.binary.BinaryCrossover;
import br.edu.univas.ga.binary.BinaryInitialPopulation;
import br.edu.univas.ga.binary.BinaryMutation;

public class Runner {

	public static void main(String[] args) {
		Selection selection = new RouletteWheelSelection();
		Crossover crossover = new BinaryCrossover();
		Mutation mutation = new BinaryMutation();
		InitialPopulation initialPopulation = new BinaryInitialPopulation();
		
		new AGFramework(selection, crossover, mutation, initialPopulation).execute();
	}
}