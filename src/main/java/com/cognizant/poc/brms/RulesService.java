package com.cognizant.poc.brms;

import java.util.List;

import org.kie.api.command.Command;

public interface RulesService {

	@SuppressWarnings("rawtypes")
	void runRules(List<? extends Command> facts);

}
