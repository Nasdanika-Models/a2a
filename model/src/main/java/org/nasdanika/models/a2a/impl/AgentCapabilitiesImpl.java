/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.AgentCapabilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCapabilitiesImpl#getStreaming <em>Streaming</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCapabilitiesImpl#getPushNotifications <em>Push Notifications</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCapabilitiesImpl#getStateTransitionHistory <em>State Transition History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentCapabilitiesImpl extends MinimalEObjectImpl.Container implements AgentCapabilities {
	/**
	 * The default value of the '{@link #getStreaming() <em>Streaming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreaming()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STREAMING_EDEFAULT = Boolean.FALSE;

	/**
	 * The default value of the '{@link #getPushNotifications() <em>Push Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushNotifications()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PUSH_NOTIFICATIONS_EDEFAULT = Boolean.FALSE;

	/**
	 * The default value of the '{@link #getStateTransitionHistory() <em>State Transition History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTransitionHistory()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATE_TRANSITION_HISTORY_EDEFAULT = Boolean.FALSE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.AGENT_CAPABILITIES;
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
	public Boolean getStreaming() {
		return (Boolean)eDynamicGet(A2aPackage.AGENT_CAPABILITIES__STREAMING, A2aPackage.Literals.AGENT_CAPABILITIES__STREAMING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreaming(Boolean newStreaming) {
		eDynamicSet(A2aPackage.AGENT_CAPABILITIES__STREAMING, A2aPackage.Literals.AGENT_CAPABILITIES__STREAMING, newStreaming);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPushNotifications() {
		return (Boolean)eDynamicGet(A2aPackage.AGENT_CAPABILITIES__PUSH_NOTIFICATIONS, A2aPackage.Literals.AGENT_CAPABILITIES__PUSH_NOTIFICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPushNotifications(Boolean newPushNotifications) {
		eDynamicSet(A2aPackage.AGENT_CAPABILITIES__PUSH_NOTIFICATIONS, A2aPackage.Literals.AGENT_CAPABILITIES__PUSH_NOTIFICATIONS, newPushNotifications);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getStateTransitionHistory() {
		return (Boolean)eDynamicGet(A2aPackage.AGENT_CAPABILITIES__STATE_TRANSITION_HISTORY, A2aPackage.Literals.AGENT_CAPABILITIES__STATE_TRANSITION_HISTORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateTransitionHistory(Boolean newStateTransitionHistory) {
		eDynamicSet(A2aPackage.AGENT_CAPABILITIES__STATE_TRANSITION_HISTORY, A2aPackage.Literals.AGENT_CAPABILITIES__STATE_TRANSITION_HISTORY, newStateTransitionHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A2aPackage.AGENT_CAPABILITIES__STREAMING:
				return getStreaming();
			case A2aPackage.AGENT_CAPABILITIES__PUSH_NOTIFICATIONS:
				return getPushNotifications();
			case A2aPackage.AGENT_CAPABILITIES__STATE_TRANSITION_HISTORY:
				return getStateTransitionHistory();
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
			case A2aPackage.AGENT_CAPABILITIES__STREAMING:
				setStreaming((Boolean)newValue);
				return;
			case A2aPackage.AGENT_CAPABILITIES__PUSH_NOTIFICATIONS:
				setPushNotifications((Boolean)newValue);
				return;
			case A2aPackage.AGENT_CAPABILITIES__STATE_TRANSITION_HISTORY:
				setStateTransitionHistory((Boolean)newValue);
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
			case A2aPackage.AGENT_CAPABILITIES__STREAMING:
				setStreaming(STREAMING_EDEFAULT);
				return;
			case A2aPackage.AGENT_CAPABILITIES__PUSH_NOTIFICATIONS:
				setPushNotifications(PUSH_NOTIFICATIONS_EDEFAULT);
				return;
			case A2aPackage.AGENT_CAPABILITIES__STATE_TRANSITION_HISTORY:
				setStateTransitionHistory(STATE_TRANSITION_HISTORY_EDEFAULT);
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
			case A2aPackage.AGENT_CAPABILITIES__STREAMING:
				return STREAMING_EDEFAULT == null ? getStreaming() != null : !STREAMING_EDEFAULT.equals(getStreaming());
			case A2aPackage.AGENT_CAPABILITIES__PUSH_NOTIFICATIONS:
				return PUSH_NOTIFICATIONS_EDEFAULT == null ? getPushNotifications() != null : !PUSH_NOTIFICATIONS_EDEFAULT.equals(getPushNotifications());
			case A2aPackage.AGENT_CAPABILITIES__STATE_TRANSITION_HISTORY:
				return STATE_TRANSITION_HISTORY_EDEFAULT == null ? getStateTransitionHistory() != null : !STATE_TRANSITION_HISTORY_EDEFAULT.equals(getStateTransitionHistory());
		}
		return super.eIsSet(featureID);
	}

} //AgentCapabilitiesImpl
