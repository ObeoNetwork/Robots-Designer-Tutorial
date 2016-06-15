/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package fr.obeo.dsl.tuto.mindstorms.design.services;

import org.eclipse.emf.ecore.EObject;

import fr.obeo.dsl.tuto.mindstorms.Choregraphy;
import fr.obeo.dsl.tuto.mindstorms.Color;
import fr.obeo.dsl.tuto.mindstorms.ColorSensor;
import fr.obeo.dsl.tuto.mindstorms.Condition;
import fr.obeo.dsl.tuto.mindstorms.ConditionalFlow;
import fr.obeo.dsl.tuto.mindstorms.Delay;
import fr.obeo.dsl.tuto.mindstorms.GoBackward;
import fr.obeo.dsl.tuto.mindstorms.GoForward;
import fr.obeo.dsl.tuto.mindstorms.GoTo;
import fr.obeo.dsl.tuto.mindstorms.If;
import fr.obeo.dsl.tuto.mindstorms.Instruction;
import fr.obeo.dsl.tuto.mindstorms.Reuse;
import fr.obeo.dsl.tuto.mindstorms.Rotate;
import fr.obeo.dsl.tuto.mindstorms.TouchSensor;
import fr.obeo.dsl.tuto.mindstorms.UltrasonicSensor;
import fr.obeo.dsl.tuto.mindstorms.While;

public class LabelServices {

	public String computeLabel(Instruction instruction) {
		return "";
	}

	public String computeLabel(While object) {
		String label = "While :";
		Condition condition = object.getCondition();
		String conditionLabel = computeLabel(condition);
		if (conditionLabel.isEmpty()) {
			label += " <insert condition>";
		} else {
			label += conditionLabel;
		}
		return label;
	}

	public String computeLabel(If object) {
		String label = "";

		boolean isElsif= object.eContainer() instanceof If && ((If)object.eContainer()).getElsif()==object;		
		if (isElsif) {
			label = "Else " + label;
		}
			
		Condition condition = object.getCondition();
		String conditionLabel = computeLabel(condition);
		if (conditionLabel.isEmpty()) {
			if (isElsif && object.getElsif()==null) {
				// last else
				label = "Else :";
			}
			else if (isElsif && object.getElsif()!=null) {
				// intermediaite else
				label = "Else If : <insert condition>";
			}
			else {
				label = "If : <insert condition>";
			}
		}
		else if (!conditionLabel.isEmpty()) {
			label = "If : "+conditionLabel;
			if (isElsif) {
				label="Else : " + label;
			}
		}
		return label;
	}

	public String computeLabel(Delay delay) {
		return "" + delay.getMs() + " ms";
	}

	public String computeLabel(GoTo block) {
		return block.getX() + " ; " + block.getY();
	}

	public String computeLabel(Rotate block) {
		if (block.isRandom()) {
			return "?";
		}
		int degrees = block.getDegrees();
		return "" + Math.abs(degrees) + "°";
	}

	public String computeLabel(GoForward block) {
		if (block.isInfinite()) {
			return "\u221e";
		}
		return "" + block.getCm() + " cm";
	}

	public String computeLabel(GoBackward block) {
		if (block.isInfinite()) {
			return "\u221e";
		}
		return "-" + block.getCm() + " cm";
	}

	public String computeLabel(UltrasonicSensor sensor) {
		String label = "Distance ";
		switch (sensor.getOperator()) {
		case EQUAL:
			label += "==";
			break;
		case LOWER_OR_EQUAL:
			label += "<=";
			break;
		case UPPER_OR_EQUAL:
			label += ">=";
			break;
		case NOT_EQUAL:
			label += "!=";
			break;
		default:
			label += "";
			break;
		}

		label += " " + Math.round(sensor.getValue()) + " cm";

		return label;
	}

	public String computeLabel(ColorSensor sensor) {
		String label = "Color is ";
		Color color = sensor.getColor();
		if (color != null) {
			label += color.getLiteral().toLowerCase();
		}
		return label;
	}

	public String computeLabel(TouchSensor sensor) {
		return "touch sensor is pressed";
	}

	public String computeLabel(Choregraphy object) {
		return object.getName();
	}

	private String computeLabel(Condition condition) {
		String label = "";
		if (condition instanceof ColorSensor) {
			label += computeLabel((ColorSensor) condition);
		} else if (condition instanceof UltrasonicSensor) {
			label += computeLabel((UltrasonicSensor) condition);
		} else if (condition instanceof TouchSensor) {
			label += computeLabel((TouchSensor) condition);
		}
		return label;
	}

	public String computeLabel(Reuse instruction) {
		String label = "Reuse";
		Choregraphy proc = instruction.getChoregraphy();
		if (proc!=null) {
			label+=" "+computeLabel(proc);
		}
		return label;
	}

	public String getEditLabel(EObject object) {
		String editLabel = "";
		if (object instanceof Delay) {
			editLabel += ((Delay) object).getMs();
		} else if (object instanceof GoForward) {
			editLabel += ((GoForward) object).getCm();
		} else if (object instanceof GoBackward) {
			editLabel += ((GoBackward) object).getCm();
		} else if (object instanceof GoTo) {
			editLabel += computeLabel((GoTo) object);
		} else if (object instanceof Rotate) {
			editLabel += ((Rotate) object).getDegrees();
		} else if (object instanceof Reuse) {
			editLabel += computeLabel((Reuse) object);
		} else if (object instanceof Choregraphy) {
			editLabel += computeLabel((Choregraphy) object);
		} else if (object instanceof ConditionalFlow) {
			editLabel += computeLabel(((ConditionalFlow) object).getCondition());
		}
		return editLabel;
	}
}
