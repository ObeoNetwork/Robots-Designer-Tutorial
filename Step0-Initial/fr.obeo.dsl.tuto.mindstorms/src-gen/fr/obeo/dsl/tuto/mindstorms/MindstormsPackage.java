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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsFactory
 * @model kind="package"
 * @generated
 */
public interface MindstormsPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2016 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mindstorms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/dsl/mindstorms/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mindstorms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MindstormsPackage eINSTANCE = fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.InstructionImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__PREVIOUS = 1;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.FlowImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__PREVIOUS = INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FIRST = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ChoregraphyImpl <em>Choregraphy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.ChoregraphyImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getChoregraphy()
	 * @generated
	 */
	int CHOREGRAPHY = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREGRAPHY__NEXT = FLOW__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREGRAPHY__PREVIOUS = FLOW__PREVIOUS;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREGRAPHY__FIRST = FLOW__FIRST;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREGRAPHY__INSTRUCTIONS = FLOW__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREGRAPHY__NAME = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choregraphy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREGRAPHY_FEATURE_COUNT = FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Choregraphy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREGRAPHY_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ReuseImpl <em>Reuse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.ReuseImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getReuse()
	 * @generated
	 */
	int REUSE = 3;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE__PREVIOUS = INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Choregraphy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE__CHOREGRAPHY = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.ActionImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NEXT = INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PREVIOUS = INSTRUCTION__PREVIOUS;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ConditionalFlowImpl <em>Conditional Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.ConditionalFlowImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getConditionalFlow()
	 * @generated
	 */
	int CONDITIONAL_FLOW = 5;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FLOW__NEXT = FLOW__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FLOW__PREVIOUS = FLOW__PREVIOUS;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FLOW__FIRST = FLOW__FIRST;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FLOW__INSTRUCTIONS = FLOW__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FLOW__CONDITION = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conditional Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.ConditionImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.SensorImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 6;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.IfImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getIf()
	 * @generated
	 */
	int IF = 8;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NEXT = CONDITIONAL_FLOW__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__PREVIOUS = CONDITIONAL_FLOW__PREVIOUS;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__FIRST = CONDITIONAL_FLOW__FIRST;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__INSTRUCTIONS = CONDITIONAL_FLOW__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = CONDITIONAL_FLOW__CONDITION;

	/**
	 * The feature id for the '<em><b>Elsif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSIF = CONDITIONAL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONDITIONAL_FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = CONDITIONAL_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.WhileImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 9;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__NEXT = CONDITIONAL_FLOW__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__PREVIOUS = CONDITIONAL_FLOW__PREVIOUS;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__FIRST = CONDITIONAL_FLOW__FIRST;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__INSTRUCTIONS = CONDITIONAL_FLOW__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = CONDITIONAL_FLOW__CONDITION;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = CONDITIONAL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_OPERATION_COUNT = CONDITIONAL_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.GoForwardImpl <em>Go Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.GoForwardImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getGoForward()
	 * @generated
	 */
	int GO_FORWARD = 10;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__NEXT = ACTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__PREVIOUS = ACTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Cm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CM = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__INFINITE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.GoBackwardImpl <em>Go Backward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.GoBackwardImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getGoBackward()
	 * @generated
	 */
	int GO_BACKWARD = 11;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__NEXT = ACTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__PREVIOUS = ACTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Cm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__CM = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__INFINITE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.RotateImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 12;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__NEXT = ACTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__PREVIOUS = ACTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__DEGREES = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Random</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__RANDOM = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.GoToImpl <em>Go To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.GoToImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getGoTo()
	 * @generated
	 */
	int GO_TO = 13;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__NEXT = ACTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__PREVIOUS = ACTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__X = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__Y = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ReturnToBaseImpl <em>Return To Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.ReturnToBaseImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getReturnToBase()
	 * @generated
	 */
	int RETURN_TO_BASE = 14;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE__NEXT = ACTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE__PREVIOUS = ACTION__PREVIOUS;

	/**
	 * The number of structural features of the '<em>Return To Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return To Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.GrabImpl <em>Grab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.GrabImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getGrab()
	 * @generated
	 */
	int GRAB = 15;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB__NEXT = ACTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB__PREVIOUS = ACTION__PREVIOUS;

	/**
	 * The number of structural features of the '<em>Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.ReleaseImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 16;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NEXT = ACTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__PREVIOUS = ACTION__PREVIOUS;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.DelayImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 17;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__NEXT = ACTION__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__PREVIOUS = ACTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__MS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.TouchSensorImpl <em>Touch Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.TouchSensorImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getTouchSensor()
	 * @generated
	 */
	int TOUCH_SENSOR = 18;

	/**
	 * The feature id for the '<em><b>Is Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__IS_PRESSED = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Touch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Touch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.UltrasonicSensorImpl <em>Ultrasonic Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.UltrasonicSensorImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getUltrasonicSensor()
	 * @generated
	 */
	int ULTRASONIC_SENSOR = 19;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__OPERATOR = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__VALUE = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ultrasonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ultrasonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ColorSensorImpl <em>Color Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.ColorSensorImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getColorSensor()
	 * @generated
	 */
	int COLOR_SENSOR = 20;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__COLOR = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Color Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.Color
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 21;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.OperatorKind <em>Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.OperatorKind
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getOperatorKind()
	 * @generated
	 */
	int OPERATOR_KIND = 22;


	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.tuto.mindstorms.Instruction#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Instruction#getNext()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Next();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.tuto.mindstorms.Instruction#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Instruction#getPrevious()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Previous();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.tuto.mindstorms.Flow#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Flow#getFirst()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_First();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.tuto.mindstorms.Flow#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Flow#getInstructions()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Instructions();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Choregraphy <em>Choregraphy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choregraphy</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Choregraphy
	 * @generated
	 */
	EClass getChoregraphy();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.Choregraphy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Choregraphy#getName()
	 * @see #getChoregraphy()
	 * @generated
	 */
	EAttribute getChoregraphy_Name();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Reuse <em>Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reuse</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Reuse
	 * @generated
	 */
	EClass getReuse();

	/**
	 * Returns the meta object for the reference '{@link fr.obeo.dsl.tuto.mindstorms.Reuse#getChoregraphy <em>Choregraphy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Choregraphy</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Reuse#getChoregraphy()
	 * @see #getReuse()
	 * @generated
	 */
	EReference getReuse_Choregraphy();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.ConditionalFlow <em>Conditional Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Flow</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.ConditionalFlow
	 * @generated
	 */
	EClass getConditionalFlow();

	/**
	 * Returns the meta object for the containment reference '{@link fr.obeo.dsl.tuto.mindstorms.ConditionalFlow#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.ConditionalFlow#getCondition()
	 * @see #getConditionalFlow()
	 * @generated
	 */
	EReference getConditionalFlow_Condition();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link fr.obeo.dsl.tuto.mindstorms.If#getElsif <em>Elsif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elsif</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.If#getElsif()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Elsif();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.GoForward <em>Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go Forward</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.GoForward
	 * @generated
	 */
	EClass getGoForward();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.GoForward#getCm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cm</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.GoForward#getCm()
	 * @see #getGoForward()
	 * @generated
	 */
	EAttribute getGoForward_Cm();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.GoForward#isInfinite <em>Infinite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infinite</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.GoForward#isInfinite()
	 * @see #getGoForward()
	 * @generated
	 */
	EAttribute getGoForward_Infinite();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.GoBackward <em>Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go Backward</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.GoBackward
	 * @generated
	 */
	EClass getGoBackward();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.GoBackward#getCm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cm</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.GoBackward#getCm()
	 * @see #getGoBackward()
	 * @generated
	 */
	EAttribute getGoBackward_Cm();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.GoBackward#isInfinite <em>Infinite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infinite</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.GoBackward#isInfinite()
	 * @see #getGoBackward()
	 * @generated
	 */
	EAttribute getGoBackward_Infinite();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.Rotate#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degrees</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Rotate#getDegrees()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_Degrees();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.Rotate#isRandom <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Rotate#isRandom()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_Random();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.GoTo <em>Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.GoTo
	 * @generated
	 */
	EClass getGoTo();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.GoTo#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.GoTo#getX()
	 * @see #getGoTo()
	 * @generated
	 */
	EAttribute getGoTo_X();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.GoTo#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.GoTo#getY()
	 * @see #getGoTo()
	 * @generated
	 */
	EAttribute getGoTo_Y();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.ReturnToBase <em>Return To Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return To Base</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.ReturnToBase
	 * @generated
	 */
	EClass getReturnToBase();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Grab <em>Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grab</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Grab
	 * @generated
	 */
	EClass getGrab();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.Delay#getMs <em>Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ms</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Delay#getMs()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Ms();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.TouchSensor <em>Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Sensor</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.TouchSensor
	 * @generated
	 */
	EClass getTouchSensor();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.TouchSensor#isIsPressed <em>Is Pressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Pressed</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.TouchSensor#isIsPressed()
	 * @see #getTouchSensor()
	 * @generated
	 */
	EAttribute getTouchSensor_IsPressed();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.UltrasonicSensor <em>Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ultrasonic Sensor</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.UltrasonicSensor
	 * @generated
	 */
	EClass getUltrasonicSensor();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.UltrasonicSensor#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.UltrasonicSensor#getOperator()
	 * @see #getUltrasonicSensor()
	 * @generated
	 */
	EAttribute getUltrasonicSensor_Operator();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.UltrasonicSensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.UltrasonicSensor#getValue()
	 * @see #getUltrasonicSensor()
	 * @generated
	 */
	EAttribute getUltrasonicSensor_Value();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.ColorSensor <em>Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Sensor</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.ColorSensor
	 * @generated
	 */
	EClass getColorSensor();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.ColorSensor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.ColorSensor#getColor()
	 * @see #getColorSensor()
	 * @generated
	 */
	EAttribute getColorSensor_Color();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.tuto.mindstorms.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link fr.obeo.dsl.tuto.mindstorms.OperatorKind <em>Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Kind</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.OperatorKind
	 * @generated
	 */
	EEnum getOperatorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MindstormsFactory getMindstormsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.InstructionImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__NEXT = eINSTANCE.getInstruction_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__PREVIOUS = eINSTANCE.getInstruction_Previous();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.FlowImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FIRST = eINSTANCE.getFlow_First();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__INSTRUCTIONS = eINSTANCE.getFlow_Instructions();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ChoregraphyImpl <em>Choregraphy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.ChoregraphyImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getChoregraphy()
		 * @generated
		 */
		EClass CHOREGRAPHY = eINSTANCE.getChoregraphy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREGRAPHY__NAME = eINSTANCE.getChoregraphy_Name();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ReuseImpl <em>Reuse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.ReuseImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getReuse()
		 * @generated
		 */
		EClass REUSE = eINSTANCE.getReuse();

		/**
		 * The meta object literal for the '<em><b>Choregraphy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REUSE__CHOREGRAPHY = eINSTANCE.getReuse_Choregraphy();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.ActionImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ConditionalFlowImpl <em>Conditional Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.ConditionalFlowImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getConditionalFlow()
		 * @generated
		 */
		EClass CONDITIONAL_FLOW = eINSTANCE.getConditionalFlow();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_FLOW__CONDITION = eINSTANCE.getConditionalFlow_Condition();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.SensorImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.ConditionImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.IfImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Elsif</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSIF = eINSTANCE.getIf_Elsif();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.WhileImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.GoForwardImpl <em>Go Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.GoForwardImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getGoForward()
		 * @generated
		 */
		EClass GO_FORWARD = eINSTANCE.getGoForward();

		/**
		 * The meta object literal for the '<em><b>Cm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_FORWARD__CM = eINSTANCE.getGoForward_Cm();

		/**
		 * The meta object literal for the '<em><b>Infinite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_FORWARD__INFINITE = eINSTANCE.getGoForward_Infinite();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.GoBackwardImpl <em>Go Backward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.GoBackwardImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getGoBackward()
		 * @generated
		 */
		EClass GO_BACKWARD = eINSTANCE.getGoBackward();

		/**
		 * The meta object literal for the '<em><b>Cm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_BACKWARD__CM = eINSTANCE.getGoBackward_Cm();

		/**
		 * The meta object literal for the '<em><b>Infinite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_BACKWARD__INFINITE = eINSTANCE.getGoBackward_Infinite();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.RotateImpl <em>Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.RotateImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

		/**
		 * The meta object literal for the '<em><b>Degrees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__DEGREES = eINSTANCE.getRotate_Degrees();

		/**
		 * The meta object literal for the '<em><b>Random</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__RANDOM = eINSTANCE.getRotate_Random();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.GoToImpl <em>Go To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.GoToImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getGoTo()
		 * @generated
		 */
		EClass GO_TO = eINSTANCE.getGoTo();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_TO__X = eINSTANCE.getGoTo_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_TO__Y = eINSTANCE.getGoTo_Y();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ReturnToBaseImpl <em>Return To Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.ReturnToBaseImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getReturnToBase()
		 * @generated
		 */
		EClass RETURN_TO_BASE = eINSTANCE.getReturnToBase();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.GrabImpl <em>Grab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.GrabImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getGrab()
		 * @generated
		 */
		EClass GRAB = eINSTANCE.getGrab();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.ReleaseImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.DelayImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Ms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__MS = eINSTANCE.getDelay_Ms();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.TouchSensorImpl <em>Touch Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.TouchSensorImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getTouchSensor()
		 * @generated
		 */
		EClass TOUCH_SENSOR = eINSTANCE.getTouchSensor();

		/**
		 * The meta object literal for the '<em><b>Is Pressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_SENSOR__IS_PRESSED = eINSTANCE.getTouchSensor_IsPressed();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.UltrasonicSensorImpl <em>Ultrasonic Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.UltrasonicSensorImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getUltrasonicSensor()
		 * @generated
		 */
		EClass ULTRASONIC_SENSOR = eINSTANCE.getUltrasonicSensor();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ULTRASONIC_SENSOR__OPERATOR = eINSTANCE.getUltrasonicSensor_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ULTRASONIC_SENSOR__VALUE = eINSTANCE.getUltrasonicSensor_Value();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ColorSensorImpl <em>Color Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.ColorSensorImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getColorSensor()
		 * @generated
		 */
		EClass COLOR_SENSOR = eINSTANCE.getColorSensor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_SENSOR__COLOR = eINSTANCE.getColorSensor_Color();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.Color
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.OperatorKind <em>Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.OperatorKind
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getOperatorKind()
		 * @generated
		 */
		EEnum OPERATOR_KIND = eINSTANCE.getOperatorKind();

	}

} //MindstormsPackage
