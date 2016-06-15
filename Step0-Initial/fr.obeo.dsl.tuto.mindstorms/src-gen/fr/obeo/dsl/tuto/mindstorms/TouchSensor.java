/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package fr.obeo.dsl.tuto.mindstorms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touch Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.tuto.mindstorms.TouchSensor#isIsPressed <em>Is Pressed</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getTouchSensor()
 * @model
 * @generated
 */
public interface TouchSensor extends Sensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2016 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Is Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Pressed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pressed</em>' attribute.
	 * @see #setIsPressed(boolean)
	 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getTouchSensor_IsPressed()
	 * @model
	 * @generated
	 */
	boolean isIsPressed();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.tuto.mindstorms.TouchSensor#isIsPressed <em>Is Pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Pressed</em>' attribute.
	 * @see #isIsPressed()
	 * @generated
	 */
	void setIsPressed(boolean value);

} // TouchSensor
