/**
 */
package org.nasdanika.models.a2a.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.AgentSkill;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentSkillImpl#getInputModes <em>Input Modes</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentSkillImpl#getOutputModes <em>Output Modes</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentSkillImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentSkillImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentSkillImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentSkillImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.AgentSkillImpl#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentSkillImpl extends MinimalEObjectImpl.Container implements AgentSkill {
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
	protected AgentSkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.AGENT_SKILL;
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
	public EList<String> getInputModes() {
		return (EList<String>)eDynamicGet(A2aPackage.AGENT_SKILL__INPUT_MODES, A2aPackage.Literals.AGENT_SKILL__INPUT_MODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getOutputModes() {
		return (EList<String>)eDynamicGet(A2aPackage.AGENT_SKILL__OUTPUT_MODES, A2aPackage.Literals.AGENT_SKILL__OUTPUT_MODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getExamples() {
		return (EList<String>)eDynamicGet(A2aPackage.AGENT_SKILL__EXAMPLES, A2aPackage.Literals.AGENT_SKILL__EXAMPLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(A2aPackage.AGENT_SKILL__NAME, A2aPackage.Literals.AGENT_SKILL__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(A2aPackage.AGENT_SKILL__NAME, A2aPackage.Literals.AGENT_SKILL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(A2aPackage.AGENT_SKILL__DESCRIPTION, A2aPackage.Literals.AGENT_SKILL__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(A2aPackage.AGENT_SKILL__DESCRIPTION, A2aPackage.Literals.AGENT_SKILL__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(A2aPackage.AGENT_SKILL__ID, A2aPackage.Literals.AGENT_SKILL__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(A2aPackage.AGENT_SKILL__ID, A2aPackage.Literals.AGENT_SKILL__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getTags() {
		return (EList<String>)eDynamicGet(A2aPackage.AGENT_SKILL__TAGS, A2aPackage.Literals.AGENT_SKILL__TAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A2aPackage.AGENT_SKILL__INPUT_MODES:
				return getInputModes();
			case A2aPackage.AGENT_SKILL__OUTPUT_MODES:
				return getOutputModes();
			case A2aPackage.AGENT_SKILL__EXAMPLES:
				return getExamples();
			case A2aPackage.AGENT_SKILL__NAME:
				return getName();
			case A2aPackage.AGENT_SKILL__DESCRIPTION:
				return getDescription();
			case A2aPackage.AGENT_SKILL__ID:
				return getId();
			case A2aPackage.AGENT_SKILL__TAGS:
				return getTags();
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
			case A2aPackage.AGENT_SKILL__INPUT_MODES:
				getInputModes().clear();
				getInputModes().addAll((Collection<? extends String>)newValue);
				return;
			case A2aPackage.AGENT_SKILL__OUTPUT_MODES:
				getOutputModes().clear();
				getOutputModes().addAll((Collection<? extends String>)newValue);
				return;
			case A2aPackage.AGENT_SKILL__EXAMPLES:
				getExamples().clear();
				getExamples().addAll((Collection<? extends String>)newValue);
				return;
			case A2aPackage.AGENT_SKILL__NAME:
				setName((String)newValue);
				return;
			case A2aPackage.AGENT_SKILL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case A2aPackage.AGENT_SKILL__ID:
				setId((String)newValue);
				return;
			case A2aPackage.AGENT_SKILL__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
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
			case A2aPackage.AGENT_SKILL__INPUT_MODES:
				getInputModes().clear();
				return;
			case A2aPackage.AGENT_SKILL__OUTPUT_MODES:
				getOutputModes().clear();
				return;
			case A2aPackage.AGENT_SKILL__EXAMPLES:
				getExamples().clear();
				return;
			case A2aPackage.AGENT_SKILL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case A2aPackage.AGENT_SKILL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case A2aPackage.AGENT_SKILL__ID:
				setId(ID_EDEFAULT);
				return;
			case A2aPackage.AGENT_SKILL__TAGS:
				getTags().clear();
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
			case A2aPackage.AGENT_SKILL__INPUT_MODES:
				return !getInputModes().isEmpty();
			case A2aPackage.AGENT_SKILL__OUTPUT_MODES:
				return !getOutputModes().isEmpty();
			case A2aPackage.AGENT_SKILL__EXAMPLES:
				return !getExamples().isEmpty();
			case A2aPackage.AGENT_SKILL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case A2aPackage.AGENT_SKILL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case A2aPackage.AGENT_SKILL__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case A2aPackage.AGENT_SKILL__TAGS:
				return !getTags().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentSkillImpl
