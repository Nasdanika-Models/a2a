/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.Message;
import org.nasdanika.models.a2a.PushNotificationConfig;
import org.nasdanika.models.a2a.TaskSendParams;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Send Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskSendParamsImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskSendParamsImpl#getHistoryLength <em>History Length</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskSendParamsImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskSendParamsImpl#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskSendParamsImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskSendParamsImpl#getPushNotification <em>Push Notification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskSendParamsImpl extends MinimalEObjectImpl.Container implements TaskSendParams {
	/**
	 * The default value of the '{@link #getHistoryLength() <em>History Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HISTORY_LENGTH_EDEFAULT = null;

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
	 * The default value of the '{@link #getSessionId() <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskSendParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.TASK_SEND_PARAMS;
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
	public EObject getMetadata() {
		return (EObject)eDynamicGet(A2aPackage.TASK_SEND_PARAMS__METADATA, A2aPackage.Literals.TASK_SEND_PARAMS__METADATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(EObject newMetadata, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMetadata, A2aPackage.TASK_SEND_PARAMS__METADATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(EObject newMetadata) {
		eDynamicSet(A2aPackage.TASK_SEND_PARAMS__METADATA, A2aPackage.Literals.TASK_SEND_PARAMS__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHistoryLength() {
		return (Integer)eDynamicGet(A2aPackage.TASK_SEND_PARAMS__HISTORY_LENGTH, A2aPackage.Literals.TASK_SEND_PARAMS__HISTORY_LENGTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistoryLength(Integer newHistoryLength) {
		eDynamicSet(A2aPackage.TASK_SEND_PARAMS__HISTORY_LENGTH, A2aPackage.Literals.TASK_SEND_PARAMS__HISTORY_LENGTH, newHistoryLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(A2aPackage.TASK_SEND_PARAMS__ID, A2aPackage.Literals.TASK_SEND_PARAMS__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(A2aPackage.TASK_SEND_PARAMS__ID, A2aPackage.Literals.TASK_SEND_PARAMS__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionId() {
		return (String)eDynamicGet(A2aPackage.TASK_SEND_PARAMS__SESSION_ID, A2aPackage.Literals.TASK_SEND_PARAMS__SESSION_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionId(String newSessionId) {
		eDynamicSet(A2aPackage.TASK_SEND_PARAMS__SESSION_ID, A2aPackage.Literals.TASK_SEND_PARAMS__SESSION_ID, newSessionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message getMessage() {
		return (Message)eDynamicGet(A2aPackage.TASK_SEND_PARAMS__MESSAGE, A2aPackage.Literals.TASK_SEND_PARAMS__MESSAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMessage, A2aPackage.TASK_SEND_PARAMS__MESSAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(Message newMessage) {
		eDynamicSet(A2aPackage.TASK_SEND_PARAMS__MESSAGE, A2aPackage.Literals.TASK_SEND_PARAMS__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PushNotificationConfig getPushNotification() {
		return (PushNotificationConfig)eDynamicGet(A2aPackage.TASK_SEND_PARAMS__PUSH_NOTIFICATION, A2aPackage.Literals.TASK_SEND_PARAMS__PUSH_NOTIFICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPushNotification(PushNotificationConfig newPushNotification, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPushNotification, A2aPackage.TASK_SEND_PARAMS__PUSH_NOTIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPushNotification(PushNotificationConfig newPushNotification) {
		eDynamicSet(A2aPackage.TASK_SEND_PARAMS__PUSH_NOTIFICATION, A2aPackage.Literals.TASK_SEND_PARAMS__PUSH_NOTIFICATION, newPushNotification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.TASK_SEND_PARAMS__METADATA:
				return basicSetMetadata(null, msgs);
			case A2aPackage.TASK_SEND_PARAMS__MESSAGE:
				return basicSetMessage(null, msgs);
			case A2aPackage.TASK_SEND_PARAMS__PUSH_NOTIFICATION:
				return basicSetPushNotification(null, msgs);
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
			case A2aPackage.TASK_SEND_PARAMS__METADATA:
				return getMetadata();
			case A2aPackage.TASK_SEND_PARAMS__HISTORY_LENGTH:
				return getHistoryLength();
			case A2aPackage.TASK_SEND_PARAMS__ID:
				return getId();
			case A2aPackage.TASK_SEND_PARAMS__SESSION_ID:
				return getSessionId();
			case A2aPackage.TASK_SEND_PARAMS__MESSAGE:
				return getMessage();
			case A2aPackage.TASK_SEND_PARAMS__PUSH_NOTIFICATION:
				return getPushNotification();
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
			case A2aPackage.TASK_SEND_PARAMS__METADATA:
				setMetadata((EObject)newValue);
				return;
			case A2aPackage.TASK_SEND_PARAMS__HISTORY_LENGTH:
				setHistoryLength((Integer)newValue);
				return;
			case A2aPackage.TASK_SEND_PARAMS__ID:
				setId((String)newValue);
				return;
			case A2aPackage.TASK_SEND_PARAMS__SESSION_ID:
				setSessionId((String)newValue);
				return;
			case A2aPackage.TASK_SEND_PARAMS__MESSAGE:
				setMessage((Message)newValue);
				return;
			case A2aPackage.TASK_SEND_PARAMS__PUSH_NOTIFICATION:
				setPushNotification((PushNotificationConfig)newValue);
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
			case A2aPackage.TASK_SEND_PARAMS__METADATA:
				setMetadata((EObject)null);
				return;
			case A2aPackage.TASK_SEND_PARAMS__HISTORY_LENGTH:
				setHistoryLength(HISTORY_LENGTH_EDEFAULT);
				return;
			case A2aPackage.TASK_SEND_PARAMS__ID:
				setId(ID_EDEFAULT);
				return;
			case A2aPackage.TASK_SEND_PARAMS__SESSION_ID:
				setSessionId(SESSION_ID_EDEFAULT);
				return;
			case A2aPackage.TASK_SEND_PARAMS__MESSAGE:
				setMessage((Message)null);
				return;
			case A2aPackage.TASK_SEND_PARAMS__PUSH_NOTIFICATION:
				setPushNotification((PushNotificationConfig)null);
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
			case A2aPackage.TASK_SEND_PARAMS__METADATA:
				return getMetadata() != null;
			case A2aPackage.TASK_SEND_PARAMS__HISTORY_LENGTH:
				return HISTORY_LENGTH_EDEFAULT == null ? getHistoryLength() != null : !HISTORY_LENGTH_EDEFAULT.equals(getHistoryLength());
			case A2aPackage.TASK_SEND_PARAMS__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case A2aPackage.TASK_SEND_PARAMS__SESSION_ID:
				return SESSION_ID_EDEFAULT == null ? getSessionId() != null : !SESSION_ID_EDEFAULT.equals(getSessionId());
			case A2aPackage.TASK_SEND_PARAMS__MESSAGE:
				return getMessage() != null;
			case A2aPackage.TASK_SEND_PARAMS__PUSH_NOTIFICATION:
				return getPushNotification() != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskSendParamsImpl
