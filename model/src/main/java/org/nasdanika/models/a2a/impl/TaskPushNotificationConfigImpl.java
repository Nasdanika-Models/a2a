/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.PushNotificationConfig;
import org.nasdanika.models.a2a.TaskPushNotificationConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Push Notification Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskPushNotificationConfigImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskPushNotificationConfigImpl#getPushNotificationConfig <em>Push Notification Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskPushNotificationConfigImpl extends MinimalEObjectImpl.Container implements TaskPushNotificationConfig {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskPushNotificationConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.TASK_PUSH_NOTIFICATION_CONFIG;
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
	public String getId() {
		return (String)eDynamicGet(A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__ID, A2aPackage.Literals.TASK_PUSH_NOTIFICATION_CONFIG__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__ID, A2aPackage.Literals.TASK_PUSH_NOTIFICATION_CONFIG__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PushNotificationConfig getPushNotificationConfig() {
		return (PushNotificationConfig)eDynamicGet(A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG, A2aPackage.Literals.TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPushNotificationConfig(PushNotificationConfig newPushNotificationConfig, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPushNotificationConfig, A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPushNotificationConfig(PushNotificationConfig newPushNotificationConfig) {
		eDynamicSet(A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG, A2aPackage.Literals.TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG, newPushNotificationConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG:
				return basicSetPushNotificationConfig(null, msgs);
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
			case A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__ID:
				return getId();
			case A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG:
				return getPushNotificationConfig();
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
			case A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__ID:
				setId((String)newValue);
				return;
			case A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG:
				setPushNotificationConfig((PushNotificationConfig)newValue);
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
			case A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__ID:
				setId(ID_EDEFAULT);
				return;
			case A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG:
				setPushNotificationConfig((PushNotificationConfig)null);
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
			case A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG__PUSH_NOTIFICATION_CONFIG:
				return getPushNotificationConfig() != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskPushNotificationConfigImpl
