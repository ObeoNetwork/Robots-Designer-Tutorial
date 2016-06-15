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
package fr.obeo.dsl.tuto.mindstorms.impl;

import fr.obeo.dsl.tuto.mindstorms.Choregraphy;
import fr.obeo.dsl.tuto.mindstorms.MindstormsPackage;
import fr.obeo.dsl.tuto.mindstorms.Reuse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reuse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.tuto.mindstorms.impl.ReuseImpl#getChoregraphy <em>Choregraphy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReuseImpl extends InstructionImpl implements Reuse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2016 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getChoregraphy() <em>Choregraphy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoregraphy()
	 * @generated
	 * @ordered
	 */
	protected Choregraphy choregraphy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReuseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MindstormsPackage.Literals.REUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choregraphy getChoregraphy() {
		if (choregraphy != null && choregraphy.eIsProxy()) {
			InternalEObject oldChoregraphy = (InternalEObject)choregraphy;
			choregraphy = (Choregraphy)eResolveProxy(oldChoregraphy);
			if (choregraphy != oldChoregraphy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MindstormsPackage.REUSE__CHOREGRAPHY, oldChoregraphy, choregraphy));
			}
		}
		return choregraphy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choregraphy basicGetChoregraphy() {
		return choregraphy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoregraphy(Choregraphy newChoregraphy) {
		Choregraphy oldChoregraphy = choregraphy;
		choregraphy = newChoregraphy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindstormsPackage.REUSE__CHOREGRAPHY, oldChoregraphy, choregraphy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MindstormsPackage.REUSE__CHOREGRAPHY:
				if (resolve) return getChoregraphy();
				return basicGetChoregraphy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MindstormsPackage.REUSE__CHOREGRAPHY:
				setChoregraphy((Choregraphy)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MindstormsPackage.REUSE__CHOREGRAPHY:
				setChoregraphy((Choregraphy)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MindstormsPackage.REUSE__CHOREGRAPHY:
				return choregraphy != null;
		}
		return super.eIsSet(featureID);
	}

} //ReuseImpl
