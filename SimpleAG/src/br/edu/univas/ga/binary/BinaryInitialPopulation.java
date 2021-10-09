package br.edu.univas.ga.binary;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.ga.base.AGParameters;
import br.edu.univas.ga.base.Individual;
import br.edu.univas.ga.base.InitialPopulation;

public class BinaryInitialPopulation implements InitialPopulation {

	@Override
	public List<Individual> createInitialPopulation() {
		List<Individual> currentGeneration = new ArrayList<>();
		for (int i = 0; i < AGParameters.POPULATION_SIZE; i++) {
			currentGeneration.add(BinaryIndividual.createRandon());
		}
		return currentGeneration;
	}
}
