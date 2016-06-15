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

import fr.obeo.dsl.tuto.mindstorms.Action;
import fr.obeo.dsl.tuto.mindstorms.Choregraphy;
import fr.obeo.dsl.tuto.mindstorms.Color;
import fr.obeo.dsl.tuto.mindstorms.ColorSensor;
import fr.obeo.dsl.tuto.mindstorms.Condition;
import fr.obeo.dsl.tuto.mindstorms.ConditionalFlow;
import fr.obeo.dsl.tuto.mindstorms.Delay;
import fr.obeo.dsl.tuto.mindstorms.Flow;
import fr.obeo.dsl.tuto.mindstorms.GoBackward;
import fr.obeo.dsl.tuto.mindstorms.GoForward;
import fr.obeo.dsl.tuto.mindstorms.GoTo;
import fr.obeo.dsl.tuto.mindstorms.Grab;
import fr.obeo.dsl.tuto.mindstorms.If;
import fr.obeo.dsl.tuto.mindstorms.Instruction;
import fr.obeo.dsl.tuto.mindstorms.MindstormsFactory;
import fr.obeo.dsl.tuto.mindstorms.MindstormsPackage;
import fr.obeo.dsl.tuto.mindstorms.OperatorKind;
import fr.obeo.dsl.tuto.mindstorms.Release;
import fr.obeo.dsl.tuto.mindstorms.ReturnToBase;
import fr.obeo.dsl.tuto.mindstorms.Reuse;
import fr.obeo.dsl.tuto.mindstorms.Rotate;
import fr.obeo.dsl.tuto.mindstorms.Sensor;
import fr.obeo.dsl.tuto.mindstorms.TouchSensor;
import fr.obeo.dsl.tuto.mindstorms.UltrasonicSensor;
import fr.obeo.dsl.tuto.mindstorms.While;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MindstormsPackageImpl extends EPackageImpl implements MindstormsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2016 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choregraphyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reuseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goForwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goBackwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnToBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ultrasonicSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MindstormsPackageImpl() {
		super(eNS_URI, MindstormsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MindstormsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MindstormsPackage init() {
		if (isInited) return (MindstormsPackage)EPackage.Registry.INSTANCE.getEPackage(MindstormsPackage.eNS_URI);

		// Obtain or create and register package
		MindstormsPackageImpl theMindstormsPackage = (MindstormsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MindstormsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MindstormsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMindstormsPackage.createPackageContents();

		// Initialize created meta-data
		theMindstormsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMindstormsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MindstormsPackage.eNS_URI, theMindstormsPackage);
		return theMindstormsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_Next() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_Previous() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_First() {
		return (EReference)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Instructions() {
		return (EReference)flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoregraphy() {
		return choregraphyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoregraphy_Name() {
		return (EAttribute)choregraphyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReuse() {
		return reuseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReuse_Choregraphy() {
		return (EReference)reuseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalFlow() {
		return conditionalFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalFlow_Condition() {
		return (EReference)conditionalFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Elsif() {
		return (EReference)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoForward() {
		return goForwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoForward_Cm() {
		return (EAttribute)goForwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoForward_Infinite() {
		return (EAttribute)goForwardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoBackward() {
		return goBackwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoBackward_Cm() {
		return (EAttribute)goBackwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoBackward_Infinite() {
		return (EAttribute)goBackwardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotate() {
		return rotateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotate_Degrees() {
		return (EAttribute)rotateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotate_Random() {
		return (EAttribute)rotateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoTo() {
		return goToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoTo_X() {
		return (EAttribute)goToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoTo_Y() {
		return (EAttribute)goToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnToBase() {
		return returnToBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrab() {
		return grabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelease() {
		return releaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelay() {
		return delayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_Ms() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchSensor() {
		return touchSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchSensor_IsPressed() {
		return (EAttribute)touchSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUltrasonicSensor() {
		return ultrasonicSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUltrasonicSensor_Operator() {
		return (EAttribute)ultrasonicSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUltrasonicSensor_Value() {
		return (EAttribute)ultrasonicSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorSensor() {
		return colorSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorSensor_Color() {
		return (EAttribute)colorSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatorKind() {
		return operatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindstormsFactory getMindstormsFactory() {
		return (MindstormsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		instructionEClass = createEClass(INSTRUCTION);
		createEReference(instructionEClass, INSTRUCTION__NEXT);
		createEReference(instructionEClass, INSTRUCTION__PREVIOUS);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__FIRST);
		createEReference(flowEClass, FLOW__INSTRUCTIONS);

		choregraphyEClass = createEClass(CHOREGRAPHY);
		createEAttribute(choregraphyEClass, CHOREGRAPHY__NAME);

		reuseEClass = createEClass(REUSE);
		createEReference(reuseEClass, REUSE__CHOREGRAPHY);

		actionEClass = createEClass(ACTION);

		conditionalFlowEClass = createEClass(CONDITIONAL_FLOW);
		createEReference(conditionalFlowEClass, CONDITIONAL_FLOW__CONDITION);

		sensorEClass = createEClass(SENSOR);

		conditionEClass = createEClass(CONDITION);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__ELSIF);

		whileEClass = createEClass(WHILE);

		goForwardEClass = createEClass(GO_FORWARD);
		createEAttribute(goForwardEClass, GO_FORWARD__CM);
		createEAttribute(goForwardEClass, GO_FORWARD__INFINITE);

		goBackwardEClass = createEClass(GO_BACKWARD);
		createEAttribute(goBackwardEClass, GO_BACKWARD__CM);
		createEAttribute(goBackwardEClass, GO_BACKWARD__INFINITE);

		rotateEClass = createEClass(ROTATE);
		createEAttribute(rotateEClass, ROTATE__DEGREES);
		createEAttribute(rotateEClass, ROTATE__RANDOM);

		goToEClass = createEClass(GO_TO);
		createEAttribute(goToEClass, GO_TO__X);
		createEAttribute(goToEClass, GO_TO__Y);

		returnToBaseEClass = createEClass(RETURN_TO_BASE);

		grabEClass = createEClass(GRAB);

		releaseEClass = createEClass(RELEASE);

		delayEClass = createEClass(DELAY);
		createEAttribute(delayEClass, DELAY__MS);

		touchSensorEClass = createEClass(TOUCH_SENSOR);
		createEAttribute(touchSensorEClass, TOUCH_SENSOR__IS_PRESSED);

		ultrasonicSensorEClass = createEClass(ULTRASONIC_SENSOR);
		createEAttribute(ultrasonicSensorEClass, ULTRASONIC_SENSOR__OPERATOR);
		createEAttribute(ultrasonicSensorEClass, ULTRASONIC_SENSOR__VALUE);

		colorSensorEClass = createEClass(COLOR_SENSOR);
		createEAttribute(colorSensorEClass, COLOR_SENSOR__COLOR);

		// Create enums
		colorEEnum = createEEnum(COLOR);
		operatorKindEEnum = createEEnum(OPERATOR_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		flowEClass.getESuperTypes().add(this.getInstruction());
		choregraphyEClass.getESuperTypes().add(this.getFlow());
		reuseEClass.getESuperTypes().add(this.getInstruction());
		actionEClass.getESuperTypes().add(this.getInstruction());
		conditionalFlowEClass.getESuperTypes().add(this.getFlow());
		sensorEClass.getESuperTypes().add(this.getCondition());
		ifEClass.getESuperTypes().add(this.getConditionalFlow());
		whileEClass.getESuperTypes().add(this.getConditionalFlow());
		goForwardEClass.getESuperTypes().add(this.getAction());
		goBackwardEClass.getESuperTypes().add(this.getAction());
		rotateEClass.getESuperTypes().add(this.getAction());
		goToEClass.getESuperTypes().add(this.getAction());
		returnToBaseEClass.getESuperTypes().add(this.getAction());
		grabEClass.getESuperTypes().add(this.getAction());
		releaseEClass.getESuperTypes().add(this.getAction());
		delayEClass.getESuperTypes().add(this.getAction());
		touchSensorEClass.getESuperTypes().add(this.getSensor());
		ultrasonicSensorEClass.getESuperTypes().add(this.getSensor());
		colorSensorEClass.getESuperTypes().add(this.getSensor());

		// Initialize classes, features, and operations; add parameters
		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstruction_Next(), this.getInstruction(), this.getInstruction_Previous(), "next", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstruction_Previous(), this.getInstruction(), this.getInstruction_Next(), "previous", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_First(), this.getInstruction(), null, "first", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choregraphyEClass, Choregraphy.class, "Choregraphy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoregraphy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Choregraphy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reuseEClass, Reuse.class, "Reuse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReuse_Choregraphy(), this.getChoregraphy(), null, "choregraphy", null, 0, 1, Reuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalFlowEClass, ConditionalFlow.class, "ConditionalFlow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalFlow_Condition(), this.getCondition(), null, "condition", null, 0, 1, ConditionalFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_Elsif(), this.getIf(), null, "elsif", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goForwardEClass, GoForward.class, "GoForward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoForward_Cm(), ecorePackage.getEInt(), "cm", null, 0, 1, GoForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoForward_Infinite(), ecorePackage.getEBoolean(), "infinite", null, 0, 1, GoForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goBackwardEClass, GoBackward.class, "GoBackward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoBackward_Cm(), ecorePackage.getEInt(), "cm", null, 0, 1, GoBackward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoBackward_Infinite(), ecorePackage.getEBoolean(), "infinite", null, 0, 1, GoBackward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotateEClass, Rotate.class, "Rotate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotate_Degrees(), ecorePackage.getEInt(), "degrees", null, 0, 1, Rotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotate_Random(), ecorePackage.getEBoolean(), "random", null, 0, 1, Rotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goToEClass, GoTo.class, "GoTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoTo_X(), ecorePackage.getEInt(), "x", null, 0, 1, GoTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoTo_Y(), ecorePackage.getEInt(), "y", null, 0, 1, GoTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnToBaseEClass, ReturnToBase.class, "ReturnToBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(grabEClass, Grab.class, "Grab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelay_Ms(), ecorePackage.getEInt(), "ms", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(touchSensorEClass, TouchSensor.class, "TouchSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTouchSensor_IsPressed(), ecorePackage.getEBoolean(), "isPressed", null, 0, 1, TouchSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ultrasonicSensorEClass, UltrasonicSensor.class, "UltrasonicSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUltrasonicSensor_Operator(), this.getOperatorKind(), "operator", null, 0, 1, UltrasonicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUltrasonicSensor_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, UltrasonicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorSensorEClass, ColorSensor.class, "ColorSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorSensor_Color(), this.getColor(), "color", "NONE", 0, 1, ColorSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.GREEN);
		addEEnumLiteral(colorEEnum, Color.BLUE);
		addEEnumLiteral(colorEEnum, Color.YELLOW);
		addEEnumLiteral(colorEEnum, Color.MAGENTA);
		addEEnumLiteral(colorEEnum, Color.ORANGE);
		addEEnumLiteral(colorEEnum, Color.WHITE);
		addEEnumLiteral(colorEEnum, Color.BLACK);
		addEEnumLiteral(colorEEnum, Color.PINK);
		addEEnumLiteral(colorEEnum, Color.GRAY);
		addEEnumLiteral(colorEEnum, Color.LIGHT_GRAY);
		addEEnumLiteral(colorEEnum, Color.DARK_GRAY);
		addEEnumLiteral(colorEEnum, Color.CYAN);
		addEEnumLiteral(colorEEnum, Color.BROWN);
		addEEnumLiteral(colorEEnum, Color.NONE);

		initEEnum(operatorKindEEnum, OperatorKind.class, "OperatorKind");
		addEEnumLiteral(operatorKindEEnum, OperatorKind.EQUAL);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.NOT_EQUAL);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.UPPER_OR_EQUAL);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.LOWER_OR_EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //MindstormsPackageImpl
