/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.Message;
import org.nasdanika.models.a2a.TaskState;
import org.nasdanika.models.a2a.TaskStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskStatusImpl#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskStatusImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskStatusImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskStatusImpl extends MinimalEObjectImpl.Container implements TaskStatus {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final TaskState STATE_EDEFAULT = TaskState.SUBMITTED;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMESTAMP_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.TASK_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskState getState() {
		return (TaskState)eDynamicGet(A2aPackage.TASK_STATUS__STATE, A2aPackage.Literals.TASK_STATUS__STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(TaskState newState) {
		eDynamicSet(A2aPackage.TASK_STATUS__STATE, A2aPackage.Literals.TASK_STATUS__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message getMessage() {
		return (Message)eDynamicGet(A2aPackage.TASK_STATUS__MESSAGE, A2aPackage.Literals.TASK_STATUS__MESSAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMessage, A2aPackage.TASK_STATUS__MESSAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(Message newMessage) {
		eDynamicSet(A2aPackage.TASK_STATUS__MESSAGE, A2aPackage.Literals.TASK_STATUS__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimestamp() {
		return (String)eDynamicGet(A2aPackage.TASK_STATUS__TIMESTAMP, A2aPackage.Literals.TASK_STATUS__TIMESTAMP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(String newTimestamp) {
		eDynamicSet(A2aPackage.TASK_STATUS__TIMESTAMP, A2aPackage.Literals.TASK_STATUS__TIMESTAMP, newTimestamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.TASK_STATUS__MESSAGE:
				return basicSetMessage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A2aPackage.TASK_STATUS__STATE:
				return getState();
			case A2aPackage.TASK_STATUS__MESSAGE:
				return getMessage();
			case A2aPackage.TASK_STATUS__TIMESTAMP:
				return getTimestamp();
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
			case A2aPackage.TASK_STATUS__STATE:
				setState((TaskState)newValue);
				return;
			case A2aPackage.TASK_STATUS__MESSAGE:
				setMessage((Message)newValue);
				return;
			case A2aPackage.TASK_STATUS__TIMESTAMP:
				setTimestamp((String)newValue);
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
			case A2aPackage.TASK_STATUS__STATE:
				setState(STATE_EDEFAULT);
				return;
			case A2aPackage.TASK_STATUS__MESSAGE:
				setMessage((Message)null);
				return;
			case A2aPackage.TASK_STATUS__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case A2aPackage.TASK_STATUS__STATE:
				return getState() != STATE_EDEFAULT;
			case A2aPackage.TASK_STATUS__MESSAGE:
				return getMessage() != null;
			case A2aPackage.TASK_STATUS__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? getTimestamp() != null : !TIMESTAMP_EDEFAULT.equals(getTimestamp());
		}
		return super.eIsSet(featureID);
	}

} //TaskStatusImpl
