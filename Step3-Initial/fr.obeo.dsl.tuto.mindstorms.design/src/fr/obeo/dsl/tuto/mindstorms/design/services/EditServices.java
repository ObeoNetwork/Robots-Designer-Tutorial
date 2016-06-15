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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.ui.PlatformUI;

import fr.obeo.dsl.tuto.mindstorms.Choregraphy;
import fr.obeo.dsl.tuto.mindstorms.Color;
import fr.obeo.dsl.tuto.mindstorms.ColorSensor;
import fr.obeo.dsl.tuto.mindstorms.ConditionalFlow;
import fr.obeo.dsl.tuto.mindstorms.Delay;
import fr.obeo.dsl.tuto.mindstorms.Flow;
import fr.obeo.dsl.tuto.mindstorms.GoBackward;
import fr.obeo.dsl.tuto.mindstorms.GoForward;
import fr.obeo.dsl.tuto.mindstorms.GoTo;
import fr.obeo.dsl.tuto.mindstorms.MindstormsFactory;
import fr.obeo.dsl.tuto.mindstorms.OperatorKind;
import fr.obeo.dsl.tuto.mindstorms.Reuse;
import fr.obeo.dsl.tuto.mindstorms.Rotate;
import fr.obeo.dsl.tuto.mindstorms.TouchSensor;
import fr.obeo.dsl.tuto.mindstorms.UltrasonicSensor;

public class EditServices {

	public void editElement(EObject object, String value) {
		// Do nothing
	}


	public void editElement(GoForward travel, String value) {
		String valueOf = String.valueOf(value);
		try {
			int parseInt = Integer.parseInt(valueOf);
			travel.setCm(Math.abs(parseInt));
		} catch (NumberFormatException e) {
			// Do nothing
		}
		if ("infinite".equalsIgnoreCase(valueOf)) {
			travel.setInfinite(true);
		} else if ("*".equalsIgnoreCase(valueOf)) {
			travel.setInfinite(true);
		} else {
			travel.setInfinite(false);
		}
	}

	public void editElement(Choregraphy choregraphy, String value) {
		choregraphy.setName(value);
	}

	public void editElement(GoBackward travel, String value) {
		String valueOf = String.valueOf(value);
		try {
			int parseInt = Integer.parseInt(valueOf);
			travel.setCm(Math.abs(parseInt));
		} catch (NumberFormatException e) {
			// Do nothing
		}
		if ("infinite".equalsIgnoreCase(valueOf)) {
			travel.setInfinite(true);
		} else if ("*".equalsIgnoreCase(valueOf)) {
			travel.setInfinite(true);
		} else {
			travel.setInfinite(false);
		}
	}

	public void editElement(Rotate rotate, String value) {
		String valueOf = String.valueOf(value);
		try {
			int parseInt = Integer.parseInt(valueOf);
			if (parseInt < 360 && parseInt > -360) {
				if(rotate.getDegrees() < 0){
					parseInt *= -1;
				}
				rotate.setDegrees(parseInt);
				rotate.setRandom(false);
				return;
			}
		} catch (NumberFormatException e) {
			// Do nothing
		}
		if ("random".equalsIgnoreCase(valueOf)) {
			rotate.setRandom(true);
		} else if ("*".equalsIgnoreCase(valueOf)) {
			rotate.setRandom(true);
		} else if ("?".equalsIgnoreCase(valueOf)) {
			rotate.setRandom(true);
		}else {
			rotate.setRandom(false);
		}
	}

	public void editElement(GoTo gt, String value) {
		String valueOf = String.valueOf(value);
		if (valueOf == null) {
			return;
		}
		String[] strings = valueOf.split(";");
		try {
			for (int i = 0; i < strings.length; i++) {
				String string = strings[i];
				string=string.trim();
				int parseInt = Integer.parseInt(string);
				if (i == 0) {
					gt.setX(parseInt);
				} else if (i == 1) {
					gt.setY(parseInt);
				}

			}
		} catch (NumberFormatException e) {
			// Do nothing
		}
	}

	public void editElement(Delay delay, String value) {
		String valueOf = String.valueOf(value);
		try {
			int parseInt = Integer.parseInt(valueOf);
			delay.setMs(parseInt);
		} catch (NumberFormatException e) {
			// Do nothing
		}
	}

	public void editElement(ColorSensor sensor, String value) {
		String colorPart = "";
		String[] valueParts = value.split("\\s");
		if (valueParts.length > 0) {
			colorPart = valueParts[valueParts.length - 1];
		} else {
			colorPart = value;
		}
		for (Color color : Color.VALUES) {
			if (color.getLiteral().equalsIgnoreCase(colorPart)) {
				sensor.setColor(color);
				break;
			}
		}
	}


	public void editElement(ConditionalFlow flow, String value) {
		if (value != null && !value.isEmpty()) {
			setCondition(flow, value.trim());
		}
	}

	private void setCondition(ConditionalFlow flow, String condition) {
		if (condition == null && flow.getCondition() != null) {
			EcoreUtil.delete(flow.getCondition());
		}
		if (condition.startsWith("Color is") || condition.startsWith("color is")) {
			condition = condition.trim();
			String newColor = condition.substring(8, condition.length()).trim();
			setColorSensorCondition(flow, newColor);
		} else if (condition.startsWith("Distance") || condition.startsWith("distance")) {
			condition = condition.trim();
			String newValue = condition.substring(8, condition.length()).trim();
			setUltrasonicSensorCondition(flow, newValue);
		} else if (condition.startsWith("is press") || condition.startsWith("Is press") || condition.startsWith("press")
				|| condition.startsWith("Press") || condition.startsWith("is touch") || condition.startsWith("Is touch")
				|| condition.startsWith("touch") || condition.startsWith("Touch")) {
			condition = condition.trim();
			setTouchSensorCondition(flow);
		} else {
			String trimmedCondition = condition.trim();
			boolean setSuccessful = setColorSensorCondition(flow, trimmedCondition);
			if (!setSuccessful) {
				setSuccessful = setUltrasonicSensorCondition(flow, trimmedCondition);
			}
		}
	}

	public boolean setUltrasonicSensorCondition(ConditionalFlow container, String newValue) {
		OperatorKind newOperator = null;
		if (newValue.startsWith(">=")) {
			newOperator = OperatorKind.UPPER_OR_EQUAL;
		} else if (newValue.startsWith("<=")) {
			newOperator = OperatorKind.LOWER_OR_EQUAL;
		} else if (newValue.startsWith("==")) {
			newOperator = OperatorKind.EQUAL;
		} else if (newValue.startsWith("!=")) {
			newOperator = OperatorKind.NOT_EQUAL;
		} else if (newValue.startsWith("<")) {
			newOperator = OperatorKind.LOWER_OR_EQUAL;
		} else if (newValue.startsWith(">")) {
			newOperator = OperatorKind.UPPER_OR_EQUAL;
		}

		if (newOperator != null) {
			String nextPart = newValue.substring(2, newValue.length()).trim();
			String[] parts = nextPart.split("\\s");
			String newDistance = "";
			if (parts.length > 0) {
				newDistance = parts[0];
			} else {
				newDistance = nextPart;
			}
			try {
				int parseInt = Integer.parseInt(newDistance);
				UltrasonicSensor sensor = MindstormsFactory.eINSTANCE.createUltrasonicSensor();
				sensor.setOperator(newOperator);
				sensor.setValue(parseInt);
				container.setCondition(sensor);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return false;
	}

	public boolean setColorSensorCondition(ConditionalFlow container, String newColor) {
		for (Color color : Color.VALUES) {
			if (color.getLiteral().equalsIgnoreCase(newColor)) {
				ColorSensor sensor = MindstormsFactory.eINSTANCE.createColorSensor();
				sensor.setColor(color);
				container.setCondition(sensor);
				return true;
			}
		}
		return false;
	}

	public void editElement(Reuse instruction, String value) {
		EObject element = instruction.getChoregraphy();
		if (element instanceof Choregraphy) {
			editElement((Choregraphy) element, value);
		} 
	}

	
	public boolean setTouchSensorCondition(ConditionalFlow container) {
		TouchSensor sensor = MindstormsFactory.eINSTANCE.createTouchSensor();
		sensor.setIsPressed(true);
		container.setCondition(sensor);
		return true;
	}

	public boolean isColor(ColorSensor sensor, Color color) {
		return color == sensor.getColor();
	}

	public void editDistance(Flow container) {
		IInputValidator validator = new IInputValidator() {

			@Override
			public String isValid(String newText) {
				String errorMessage = null;
				String pattern = "[Dd]ist[ance]*(\\s)*[=<>!]+(\\s)*(\\d)*";
				if (!newText.matches(pattern)) {
					errorMessage = "Invalid distance, it should looks like : Distance < 50";
				}
				return errorMessage;
			}
		};
		InputDialog dialog = new InputDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Condition",
				"Enter a distance in cm. A valid distance looks like : Distance == 50. The operators <, >, <=, >= or ==, != are supported.",
				"Distance < 50", validator);
		dialog.open();
		String distance = dialog.getValue();
		editElement(container, container.eClass().getName() + ":" + distance);
	}

}
