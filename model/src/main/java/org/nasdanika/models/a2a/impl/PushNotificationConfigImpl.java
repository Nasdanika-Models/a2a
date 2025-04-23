/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.AuthenticationInfo;
import org.nasdanika.models.a2a.PushNotificationConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push Notification Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.PushNotificationConfigImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.PushNotificationConfigImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.PushNotificationConfigImpl#getAuthentication <em>Authentication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PushNotificationConfigImpl extends MinimalEObjectImpl.Container implements PushNotificationConfig {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushNotificationConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.PUSH_NOTIFICATION_CONFIG;
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
	public String getUrl() {
		return (String)eDynamicGet(A2aPackage.PUSH_NOTIFICATION_CONFIG__URL, A2aPackage.Literals.PUSH_NOTIFICATION_CONFIG__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(A2aPackage.PUSH_NOTIFICATION_CONFIG__URL, A2aPackage.Literals.PUSH_NOTIFICATION_CONFIG__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToken() {
		return (String)eDynamicGet(A2aPackage.PUSH_NOTIFICATION_CONFIG__TOKEN, A2aPackage.Literals.PUSH_NOTIFICATION_CONFIG__TOKEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToken(String newToken) {
		eDynamicSet(A2aPackage.PUSH_NOTIFICATION_CONFIG__TOKEN, A2aPackage.Literals.PUSH_NOTIFICATION_CONFIG__TOKEN, newToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationInfo getAuthentication() {
		return (AuthenticationInfo)eDynamicGet(A2aPackage.PUSH_NOTIFICATION_CONFIG__AUTHENTICATION, A2aPackage.Literals.PUSH_NOTIFICATION_CONFIG__AUTHENTICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthentication(AuthenticationInfo newAuthentication, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAuthentication, A2aPackage.PUSH_NOTIFICATION_CONFIG__AUTHENTICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthentication(AuthenticationInfo newAuthentication) {
		eDynamicSet(A2aPackage.PUSH_NOTIFICATION_CONFIG__AUTHENTICATION, A2aPackage.Literals.PUSH_NOTIFICATION_CONFIG__AUTHENTICATION, newAuthentication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__AUTHENTICATION:
				return basicSetAuthentication(null, msgs);
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
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__URL:
				return getUrl();
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__TOKEN:
				return getToken();
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__AUTHENTICATION:
				return getAuthentication();
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
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__URL:
				setUrl((String)newValue);
				return;
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__TOKEN:
				setToken((String)newValue);
				return;
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__AUTHENTICATION:
				setAuthentication((AuthenticationInfo)newValue);
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
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__URL:
				setUrl(URL_EDEFAULT);
				return;
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__AUTHENTICATION:
				setAuthentication((AuthenticationInfo)null);
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
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__TOKEN:
				return TOKEN_EDEFAULT == null ? getToken() != null : !TOKEN_EDEFAULT.equals(getToken());
			case A2aPackage.PUSH_NOTIFICATION_CONFIG__AUTHENTICATION:
				return getAuthentication() != null;
		}
		return super.eIsSet(featureID);
	}

} //PushNotificationConfigImpl
