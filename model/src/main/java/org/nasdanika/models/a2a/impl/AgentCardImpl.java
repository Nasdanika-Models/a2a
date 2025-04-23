/**
 */
package org.nasdanika.models.a2a.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.AgentAuthentication;
import org.nasdanika.models.a2a.AgentCapabilities;
import org.nasdanika.models.a2a.AgentCard;
import org.nasdanika.models.a2a.AgentProvider;
import org.nasdanika.models.a2a.AgentSkill;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCardImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCardImpl#getDocumentationUrl <em>Documentation Url</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCardImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCardImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCardImpl#getDefaultOutputModes <em>Default Output Modes</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCardImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCardImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCardImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCardImpl#getDefaultInputModes <em>Default Input Modes</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCardImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentCardImpl#getAuthentication <em>Authentication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentCardImpl extends MinimalEObjectImpl.Container implements AgentCard {
	/**
	 * The default value of the '{@link #getDocumentationUrl() <em>Documentation Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentationUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

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
	protected AgentCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.AGENT_CARD;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<AgentSkill> getSkills() {
		return (EList<AgentSkill>)eDynamicGet(A2aPackage.AGENT_CARD__SKILLS, A2aPackage.Literals.AGENT_CARD__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentationUrl() {
		return (String)eDynamicGet(A2aPackage.AGENT_CARD__DOCUMENTATION_URL, A2aPackage.Literals.AGENT_CARD__DOCUMENTATION_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentationUrl(String newDocumentationUrl) {
		eDynamicSet(A2aPackage.AGENT_CARD__DOCUMENTATION_URL, A2aPackage.Literals.AGENT_CARD__DOCUMENTATION_URL, newDocumentationUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentCapabilities getCapabilities() {
		return (AgentCapabilities)eDynamicGet(A2aPackage.AGENT_CARD__CAPABILITIES, A2aPackage.Literals.AGENT_CARD__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilities(AgentCapabilities newCapabilities, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCapabilities, A2aPackage.AGENT_CARD__CAPABILITIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapabilities(AgentCapabilities newCapabilities) {
		eDynamicSet(A2aPackage.AGENT_CARD__CAPABILITIES, A2aPackage.Literals.AGENT_CARD__CAPABILITIES, newCapabilities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentProvider getProvider() {
		return (AgentProvider)eDynamicGet(A2aPackage.AGENT_CARD__PROVIDER, A2aPackage.Literals.AGENT_CARD__PROVIDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(AgentProvider newProvider, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProvider, A2aPackage.AGENT_CARD__PROVIDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(AgentProvider newProvider) {
		eDynamicSet(A2aPackage.AGENT_CARD__PROVIDER, A2aPackage.Literals.AGENT_CARD__PROVIDER, newProvider);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getDefaultOutputModes() {
		return (EList<String>)eDynamicGet(A2aPackage.AGENT_CARD__DEFAULT_OUTPUT_MODES, A2aPackage.Literals.AGENT_CARD__DEFAULT_OUTPUT_MODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(A2aPackage.AGENT_CARD__NAME, A2aPackage.Literals.AGENT_CARD__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(A2aPackage.AGENT_CARD__NAME, A2aPackage.Literals.AGENT_CARD__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(A2aPackage.AGENT_CARD__DESCRIPTION, A2aPackage.Literals.AGENT_CARD__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(A2aPackage.AGENT_CARD__DESCRIPTION, A2aPackage.Literals.AGENT_CARD__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return (String)eDynamicGet(A2aPackage.AGENT_CARD__VERSION, A2aPackage.Literals.AGENT_CARD__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		eDynamicSet(A2aPackage.AGENT_CARD__VERSION, A2aPackage.Literals.AGENT_CARD__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getDefaultInputModes() {
		return (EList<String>)eDynamicGet(A2aPackage.AGENT_CARD__DEFAULT_INPUT_MODES, A2aPackage.Literals.AGENT_CARD__DEFAULT_INPUT_MODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(A2aPackage.AGENT_CARD__URL, A2aPackage.Literals.AGENT_CARD__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(A2aPackage.AGENT_CARD__URL, A2aPackage.Literals.AGENT_CARD__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentAuthentication getAuthentication() {
		return (AgentAuthentication)eDynamicGet(A2aPackage.AGENT_CARD__AUTHENTICATION, A2aPackage.Literals.AGENT_CARD__AUTHENTICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthentication(AgentAuthentication newAuthentication, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAuthentication, A2aPackage.AGENT_CARD__AUTHENTICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthentication(AgentAuthentication newAuthentication) {
		eDynamicSet(A2aPackage.AGENT_CARD__AUTHENTICATION, A2aPackage.Literals.AGENT_CARD__AUTHENTICATION, newAuthentication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.AGENT_CARD__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
			case A2aPackage.AGENT_CARD__CAPABILITIES:
				return basicSetCapabilities(null, msgs);
			case A2aPackage.AGENT_CARD__PROVIDER:
				return basicSetProvider(null, msgs);
			case A2aPackage.AGENT_CARD__AUTHENTICATION:
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
			case A2aPackage.AGENT_CARD__SKILLS:
				return getSkills();
			case A2aPackage.AGENT_CARD__DOCUMENTATION_URL:
				return getDocumentationUrl();
			case A2aPackage.AGENT_CARD__CAPABILITIES:
				return getCapabilities();
			case A2aPackage.AGENT_CARD__PROVIDER:
				return getProvider();
			case A2aPackage.AGENT_CARD__DEFAULT_OUTPUT_MODES:
				return getDefaultOutputModes();
			case A2aPackage.AGENT_CARD__NAME:
				return getName();
			case A2aPackage.AGENT_CARD__DESCRIPTION:
				return getDescription();
			case A2aPackage.AGENT_CARD__VERSION:
				return getVersion();
			case A2aPackage.AGENT_CARD__DEFAULT_INPUT_MODES:
				return getDefaultInputModes();
			case A2aPackage.AGENT_CARD__URL:
				return getUrl();
			case A2aPackage.AGENT_CARD__AUTHENTICATION:
				return getAuthentication();
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
			case A2aPackage.AGENT_CARD__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends AgentSkill>)newValue);
				return;
			case A2aPackage.AGENT_CARD__DOCUMENTATION_URL:
				setDocumentationUrl((String)newValue);
				return;
			case A2aPackage.AGENT_CARD__CAPABILITIES:
				setCapabilities((AgentCapabilities)newValue);
				return;
			case A2aPackage.AGENT_CARD__PROVIDER:
				setProvider((AgentProvider)newValue);
				return;
			case A2aPackage.AGENT_CARD__DEFAULT_OUTPUT_MODES:
				getDefaultOutputModes().clear();
				getDefaultOutputModes().addAll((Collection<? extends String>)newValue);
				return;
			case A2aPackage.AGENT_CARD__NAME:
				setName((String)newValue);
				return;
			case A2aPackage.AGENT_CARD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case A2aPackage.AGENT_CARD__VERSION:
				setVersion((String)newValue);
				return;
			case A2aPackage.AGENT_CARD__DEFAULT_INPUT_MODES:
				getDefaultInputModes().clear();
				getDefaultInputModes().addAll((Collection<? extends String>)newValue);
				return;
			case A2aPackage.AGENT_CARD__URL:
				setUrl((String)newValue);
				return;
			case A2aPackage.AGENT_CARD__AUTHENTICATION:
				setAuthentication((AgentAuthentication)newValue);
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
			case A2aPackage.AGENT_CARD__SKILLS:
				getSkills().clear();
				return;
			case A2aPackage.AGENT_CARD__DOCUMENTATION_URL:
				setDocumentationUrl(DOCUMENTATION_URL_EDEFAULT);
				return;
			case A2aPackage.AGENT_CARD__CAPABILITIES:
				setCapabilities((AgentCapabilities)null);
				return;
			case A2aPackage.AGENT_CARD__PROVIDER:
				setProvider((AgentProvider)null);
				return;
			case A2aPackage.AGENT_CARD__DEFAULT_OUTPUT_MODES:
				getDefaultOutputModes().clear();
				return;
			case A2aPackage.AGENT_CARD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case A2aPackage.AGENT_CARD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case A2aPackage.AGENT_CARD__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case A2aPackage.AGENT_CARD__DEFAULT_INPUT_MODES:
				getDefaultInputModes().clear();
				return;
			case A2aPackage.AGENT_CARD__URL:
				setUrl(URL_EDEFAULT);
				return;
			case A2aPackage.AGENT_CARD__AUTHENTICATION:
				setAuthentication((AgentAuthentication)null);
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
			case A2aPackage.AGENT_CARD__SKILLS:
				return !getSkills().isEmpty();
			case A2aPackage.AGENT_CARD__DOCUMENTATION_URL:
				return DOCUMENTATION_URL_EDEFAULT == null ? getDocumentationUrl() != null : !DOCUMENTATION_URL_EDEFAULT.equals(getDocumentationUrl());
			case A2aPackage.AGENT_CARD__CAPABILITIES:
				return getCapabilities() != null;
			case A2aPackage.AGENT_CARD__PROVIDER:
				return getProvider() != null;
			case A2aPackage.AGENT_CARD__DEFAULT_OUTPUT_MODES:
				return !getDefaultOutputModes().isEmpty();
			case A2aPackage.AGENT_CARD__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case A2aPackage.AGENT_CARD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case A2aPackage.AGENT_CARD__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case A2aPackage.AGENT_CARD__DEFAULT_INPUT_MODES:
				return !getDefaultInputModes().isEmpty();
			case A2aPackage.AGENT_CARD__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case A2aPackage.AGENT_CARD__AUTHENTICATION:
				return getAuthentication() != null;
		}
		return super.eIsSet(featureID);
	}

} //AgentCardImpl
