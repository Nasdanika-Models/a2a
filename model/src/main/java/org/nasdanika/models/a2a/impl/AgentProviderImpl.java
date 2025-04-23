/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.AgentProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentProviderImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentProviderImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentProviderImpl extends MinimalEObjectImpl.Container implements AgentProvider {
	/**
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.AGENT_PROVIDER;
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
	public String getOrganization() {
		return (String)eDynamicGet(A2aPackage.AGENT_PROVIDER__ORGANIZATION, A2aPackage.Literals.AGENT_PROVIDER__ORGANIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganization(String newOrganization) {
		eDynamicSet(A2aPackage.AGENT_PROVIDER__ORGANIZATION, A2aPackage.Literals.AGENT_PROVIDER__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(A2aPackage.AGENT_PROVIDER__URL, A2aPackage.Literals.AGENT_PROVIDER__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(A2aPackage.AGENT_PROVIDER__URL, A2aPackage.Literals.AGENT_PROVIDER__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A2aPackage.AGENT_PROVIDER__ORGANIZATION:
				return getOrganization();
			case A2aPackage.AGENT_PROVIDER__URL:
				return getUrl();
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
			case A2aPackage.AGENT_PROVIDER__ORGANIZATION:
				setOrganization((String)newValue);
				return;
			case A2aPackage.AGENT_PROVIDER__URL:
				setUrl((String)newValue);
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
			case A2aPackage.AGENT_PROVIDER__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case A2aPackage.AGENT_PROVIDER__URL:
				setUrl(URL_EDEFAULT);
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
			case A2aPackage.AGENT_PROVIDER__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? getOrganization() != null : !ORGANIZATION_EDEFAULT.equals(getOrganization());
			case A2aPackage.AGENT_PROVIDER__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
		}
		return super.eIsSet(featureID);
	}

} //AgentProviderImpl
