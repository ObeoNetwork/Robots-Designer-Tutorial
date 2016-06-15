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
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.tuto.mindstorms.If#getElsif <em>Elsif</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getIf()
 * @model
 * @generated
 */
public interface If extends ConditionalFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2016 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Elsif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elsif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elsif</em>' containment reference.
	 * @see #setElsif(If)
	 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getIf_Elsif()
	 * @model containment="true"
	 * @generated
	 */
	If getElsif();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.tuto.mindstorms.If#getElsif <em>Elsif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elsif</em>' containment reference.
	 * @see #getElsif()
	 * @generated
	 */
	void setElsif(If value);

} // If
