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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.tuto.mindstorms.Instruction#getNext <em>Next</em>}</li>
 *   <li>{@link fr.obeo.dsl.tuto.mindstorms.Instruction#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getInstruction()
 * @model abstract="true"
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2016 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.tuto.mindstorms.Instruction#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Instruction)
	 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getInstruction_Next()
	 * @see fr.obeo.dsl.tuto.mindstorms.Instruction#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	Instruction getNext();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.tuto.mindstorms.Instruction#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Instruction value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.tuto.mindstorms.Instruction#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Instruction)
	 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getInstruction_Previous()
	 * @see fr.obeo.dsl.tuto.mindstorms.Instruction#getNext
	 * @model opposite="next"
	 * @generated
	 */
	Instruction getPrevious();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.tuto.mindstorms.Instruction#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Instruction value);

} // Instruction
