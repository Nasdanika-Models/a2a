/**
 */
package org.nasdanika.models.a2a.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.AuthenticationInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.AuthenticationInfoImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AuthenticationInfoImpl#getSchemes <em>Schemes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationInfoImpl extends MinimalEObjectImpl.Container implements AuthenticationInfo {
	/**
	 * The default value of the '{@link #getCredentials() <em>Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDENTIALS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.AUTHENTICATION_INFO;
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
	public String getCredentials() {
		return (String)eDynamicGet(A2aPackage.AUTHENTICATION_INFO__CREDENTIALS, A2aPackage.Literals.AUTHENTICATION_INFO__CREDENTIALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredentials(String newCredentials) {
		eDynamicSet(A2aPackage.AUTHENTICATION_INFO__CREDENTIALS, A2aPackage.Literals.AUTHENTICATION_INFO__CREDENTIALS, newCredentials);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getSchemes() {
		return (EList<String>)eDynamicGet(A2aPackage.AUTHENTICATION_INFO__SCHEMES, A2aPackage.Literals.AUTHENTICATION_INFO__SCHEMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A2aPackage.AUTHENTICATION_INFO__CREDENTIALS:
				return getCredentials();
			case A2aPackage.AUTHENTICATION_INFO__SCHEMES:
				return getSchemes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case A2aPackage.AUTHENTICATION_INFO__CREDENTIALS:
				setCredentials((String)newValue);
				return;
			case A2aPackage.AUTHENTICATION_INFO__SCHEMES:
				getSchemes().clear();
				getSchemes().addAll((Collection<? extends String>)newValue);
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
			case A2aPackage.AUTHENTICATION_INFO__CREDENTIALS:
				setCredentials(CREDENTIALS_EDEFAULT);
				return;
			case A2aPackage.AUTHENTICATION_INFO__SCHEMES:
				getSchemes().clear();
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
			case A2aPackage.AUTHENTICATION_INFO__CREDENTIALS:
				return CREDENTIALS_EDEFAULT == null ? getCredentials() != null : !CREDENTIALS_EDEFAULT.equals(getCredentials());
			case A2aPackage.AUTHENTICATION_INFO__SCHEMES:
				return !getSchemes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuthenticationInfoImpl
