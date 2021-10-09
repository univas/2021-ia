package br.edu.univas.ga.base;

import java.util.List;

public interface Mutation {

	void executeMutation(List<? extends Individual> currentGeneration);

}