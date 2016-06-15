package fr.obeo.dsl.tuto.mindstorms.design.services;

import java.util.ArrayList;
import java.util.List;

import fr.obeo.dsl.tuto.mindstorms.Flow;
import fr.obeo.dsl.tuto.mindstorms.If;
import fr.obeo.dsl.tuto.mindstorms.Instruction;

public class FlowServices {

	public List<Instruction> getOrderedInstructions(Flow flow) {
		List<Instruction> orderedInstructions=new ArrayList<Instruction>();
		Instruction instruction=flow.getFirst();
		while (instruction!=null && !orderedInstructions.contains(instruction)) {
			orderedInstructions.add(instruction);
			instruction=(Instruction)instruction.getNext();
		}
		return orderedInstructions;
	}

	
	public Instruction getLastInstruction(Flow flow) {
		List<Instruction> orderedInstructions=getOrderedInstructions(flow);
		if (orderedInstructions.isEmpty()) {
			return null;
		}
		else {
			return orderedInstructions.get(orderedInstructions.size()-1);
		}
	}

	public List<If> getAllElsifs(If ifInstruction) {
		List<If> elsifs=new ArrayList<If>();
		If elsif=ifInstruction.getElsif();
		while (elsif!=null) {
			elsifs.add(elsif);
			elsif=elsif.getElsif();
		}
		return elsifs;
	}



	public void linkInstruction(Flow flow, Instruction instruction) {
		Instruction lastInstruction=getLastInstruction(flow);
		if (lastInstruction==null) {
			flow.setFirst(instruction);
		}
		else {
			lastInstruction.setNext(instruction);
		}
	}


	public void linkInstructions(Instruction i1, Instruction i2) {
		Instruction after=null;
		if (i1 instanceof Flow && i2.eContainer()==i1) {
			// i1 is the flow containing i2
			after=((Flow)i1).getFirst();
			((Flow)i1).setFirst(i2);
		}
		else {
			// i1 and i2 belong to the same flow
			after=i1.getNext();
			i1.setNext(i2);
		}
		if (after!=null && i2.getNext()==null) {
			// the previous instruction after i1 becomes the next one of i2
			i2.setNext(after);
		}
	
	}

	
}
