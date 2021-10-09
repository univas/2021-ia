package br.edu.univas.ga.app;

import java.util.List;

import br.edu.univas.ga.base.Individual;
import br.edu.univas.ga.base.Selection;

public class TournmentSelection implements Selection {

	private List<? extends Individual> currentGeneration;

	public void prepareSelection(List<? extends Individual> currentGeneration) {
		this.currentGeneration = currentGeneration;
	}

	public Individual chooseParent() {

		int point = rand.nextInt(currentGeneration.size());// indivíduo sorteado
		Individual individual1 = currentGeneration.get(point);

		point = rand.nextInt(currentGeneration.size());// indivíduo sorteado
		Individual individual2 = currentGeneration.get(point);

		return individual1.getFitness() > individual2.getFitness() ? individual1 : individual2;
	}
}