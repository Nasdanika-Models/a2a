/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.SetTaskPushNotificationRequest;
import org.nasdanika.models.a2a.TaskPushNotificationConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Task Push Notification Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.SetTaskPushNotificationRequestImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.SetTaskPushNotificationRequestImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.SetTaskPushNotificationRequestImpl#getJsonrpc <em>Jsonrpc</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.SetTaskPushNotificationRequestImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetTaskPushNotificationRequestImpl extends A2ARequestImpl implements SetTaskPushNotificationRequest {
	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = "tasks/pushNotification/set";

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getJsonrpc() <em>Jsonrpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonrpc()
	 * @generated
	 * @ordered
	 */
	protected static final String JSONRPC_EDEFAULT = "2.0";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTaskPushNotificationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.SET_TASK_PUSH_NOTIFICATION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethod() {
		return (String)eDynamicGet(A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD, A2aPackage.Literals.SET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(String newMethod) {
		eDynamicSet(A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD, A2aPackage.Literals.SET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__ID, A2aPackage.Literals.SET_TASK_PUSH_NOTIFICATION_REQUEST__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__ID, A2aPackage.Literals.SET_TASK_PUSH_NOTIFICATION_REQUEST__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJsonrpc() {
		return (String)eDynamicGet(A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC, A2aPackage.Literals.SET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJsonrpc(String newJsonrpc) {
		eDynamicSet(A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC, A2aPackage.Literals.SET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC, newJsonrpc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskPushNotificationConfig getParams() {
		return (TaskPushNotificationConfig)eDynamicGet(A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS, A2aPackage.Literals.SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams(TaskPushNotificationConfig newParams, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newParams, A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParams(TaskPushNotificationConfig newParams) {
		eDynamicSet(A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS, A2aPackage.Literals.SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS, newParams);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS:
				return basicSetParams(null, msgs);
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
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD:
				return getMethod();
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__ID:
				return getId();
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC:
				return getJsonrpc();
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS:
				return getParams();
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
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD:
				setMethod((String)newValue);
				return;
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__ID:
				setId((String)newValue);
				return;
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC:
				setJsonrpc((String)newValue);
				return;
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS:
				setParams((TaskPushNotificationConfig)newValue);
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
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__ID:
				setId(ID_EDEFAULT);
				return;
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC:
				setJsonrpc(JSONRPC_EDEFAULT);
				return;
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS:
				setParams((TaskPushNotificationConfig)null);
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
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__METHOD:
				return METHOD_EDEFAULT == null ? getMethod() != null : !METHOD_EDEFAULT.equals(getMethod());
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__JSONRPC:
				return JSONRPC_EDEFAULT == null ? getJsonrpc() != null : !JSONRPC_EDEFAULT.equals(getJsonrpc());
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST__PARAMS:
				return getParams() != null;
		}
		return super.eIsSet(featureID);
	}

} //SetTaskPushNotificationRequestImpl
