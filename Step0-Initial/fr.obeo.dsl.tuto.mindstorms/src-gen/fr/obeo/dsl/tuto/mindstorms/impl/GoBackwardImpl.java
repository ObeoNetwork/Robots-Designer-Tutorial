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

import fr.obeo.dsl.tuto.mindstorms.GoBackward;
import fr.obeo.dsl.tuto.mindstorms.MindstormsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Go Backward</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.tuto.mindstorms.impl.GoBackwardImpl#getCm <em>Cm</em>}</li>
 *   <li>{@link fr.obeo.dsl.tuto.mindstorms.impl.GoBackwardImpl#isInfinite <em>Infinite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoBackwardImpl extends ActionImpl implements GoBackward {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2016 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getCm() <em>Cm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCm()
	 * @generated
	 * @ordered
	 */
	protected static final int CM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCm() <em>Cm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCm()
	 * @generated
	 * @ordered
	 */
	protected int cm = CM_EDEFAULT;

	/**
	 * The default value of the '{@link #isInfinite() <em>Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfinite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFINITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInfinite() <em>Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfinite()
	 * @generated
	 * @ordered
	 */
	protected boolean infinite = INFINITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoBackwardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MindstormsPackage.Literals.GO_BACKWARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCm() {
		return cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCm(int newCm) {
		int oldCm = cm;
		cm = newCm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindstormsPackage.GO_BACKWARD__CM, oldCm, cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInfinite() {
		return infinite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfinite(boolean newInfinite) {
		boolean oldInfinite = infinite;
		infinite = newInfinite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindstormsPackage.GO_BACKWARD__INFINITE, oldInfinite, infinite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MindstormsPackage.GO_BACKWARD__CM:
				return getCm();
			case MindstormsPackage.GO_BACKWARD__INFINITE:
				return isInfinite();
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
			case MindstormsPackage.GO_BACKWARD__CM:
				setCm((Integer)newValue);
				return;
			case MindstormsPackage.GO_BACKWARD__INFINITE:
				setInfinite((Boolean)newValue);
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
			case MindstormsPackage.GO_BACKWARD__CM:
				setCm(CM_EDEFAULT);
				return;
			case MindstormsPackage.GO_BACKWARD__INFINITE:
				setInfinite(INFINITE_EDEFAULT);
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
			case MindstormsPackage.GO_BACKWARD__CM:
				return cm != CM_EDEFAULT;
			case MindstormsPackage.GO_BACKWARD__INFINITE:
				return infinite != INFINITE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cm: ");
		result.append(cm);
		result.append(", infinite: ");
		result.append(infinite);
		result.append(')');
		return result.toString();
	}

} //GoBackwardImpl
