/**
 */
package org.nasdanika.models.a2a.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.Artifact;
import org.nasdanika.models.a2a.Part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.ArtifactImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.ArtifactImpl#getLastChunk <em>Last Chunk</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.ArtifactImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.ArtifactImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.ArtifactImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.ArtifactImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.ArtifactImpl#getAppend <em>Append</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends MinimalEObjectImpl.Container implements Artifact {
	/**
	 * The default value of the '{@link #getLastChunk() <em>Last Chunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChunk()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LAST_CHUNK_EDEFAULT = null;

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
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INDEX_EDEFAULT = Integer.valueOf(0);

	/**
	 * The default value of the '{@link #getAppend() <em>Append</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppend()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean APPEND_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.ARTIFACT;
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
		return (EObject)eDynamicGet(A2aPackage.ARTIFACT__METADATA, A2aPackage.Literals.ARTIFACT__METADATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(EObject newMetadata, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMetadata, A2aPackage.ARTIFACT__METADATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(EObject newMetadata) {
		eDynamicSet(A2aPackage.ARTIFACT__METADATA, A2aPackage.Literals.ARTIFACT__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLastChunk() {
		return (Boolean)eDynamicGet(A2aPackage.ARTIFACT__LAST_CHUNK, A2aPackage.Literals.ARTIFACT__LAST_CHUNK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastChunk(Boolean newLastChunk) {
		eDynamicSet(A2aPackage.ARTIFACT__LAST_CHUNK, A2aPackage.Literals.ARTIFACT__LAST_CHUNK, newLastChunk);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(A2aPackage.ARTIFACT__NAME, A2aPackage.Literals.ARTIFACT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(A2aPackage.ARTIFACT__NAME, A2aPackage.Literals.ARTIFACT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Part> getParts() {
		return (EList<Part>)eDynamicGet(A2aPackage.ARTIFACT__PARTS, A2aPackage.Literals.ARTIFACT__PARTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(A2aPackage.ARTIFACT__DESCRIPTION, A2aPackage.Literals.ARTIFACT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(A2aPackage.ARTIFACT__DESCRIPTION, A2aPackage.Literals.ARTIFACT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIndex() {
		return (Integer)eDynamicGet(A2aPackage.ARTIFACT__INDEX, A2aPackage.Literals.ARTIFACT__INDEX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(Integer newIndex) {
		eDynamicSet(A2aPackage.ARTIFACT__INDEX, A2aPackage.Literals.ARTIFACT__INDEX, newIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAppend() {
		return (Boolean)eDynamicGet(A2aPackage.ARTIFACT__APPEND, A2aPackage.Literals.ARTIFACT__APPEND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppend(Boolean newAppend) {
		eDynamicSet(A2aPackage.ARTIFACT__APPEND, A2aPackage.Literals.ARTIFACT__APPEND, newAppend);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.ARTIFACT__METADATA:
				return basicSetMetadata(null, msgs);
			case A2aPackage.ARTIFACT__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
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
			case A2aPackage.ARTIFACT__METADATA:
				return getMetadata();
			case A2aPackage.ARTIFACT__LAST_CHUNK:
				return getLastChunk();
			case A2aPackage.ARTIFACT__NAME:
				return getName();
			case A2aPackage.ARTIFACT__PARTS:
				return getParts();
			case A2aPackage.ARTIFACT__DESCRIPTION:
				return getDescription();
			case A2aPackage.ARTIFACT__INDEX:
				return getIndex();
			case A2aPackage.ARTIFACT__APPEND:
				return getAppend();
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
			case A2aPackage.ARTIFACT__METADATA:
				setMetadata((EObject)newValue);
				return;
			case A2aPackage.ARTIFACT__LAST_CHUNK:
				setLastChunk((Boolean)newValue);
				return;
			case A2aPackage.ARTIFACT__NAME:
				setName((String)newValue);
				return;
			case A2aPackage.ARTIFACT__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Part>)newValue);
				return;
			case A2aPackage.ARTIFACT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case A2aPackage.ARTIFACT__INDEX:
				setIndex((Integer)newValue);
				return;
			case A2aPackage.ARTIFACT__APPEND:
				setAppend((Boolean)newValue);
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
			case A2aPackage.ARTIFACT__METADATA:
				setMetadata((EObject)null);
				return;
			case A2aPackage.ARTIFACT__LAST_CHUNK:
				setLastChunk(LAST_CHUNK_EDEFAULT);
				return;
			case A2aPackage.ARTIFACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case A2aPackage.ARTIFACT__PARTS:
				getParts().clear();
				return;
			case A2aPackage.ARTIFACT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case A2aPackage.ARTIFACT__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case A2aPackage.ARTIFACT__APPEND:
				setAppend(APPEND_EDEFAULT);
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
			case A2aPackage.ARTIFACT__METADATA:
				return getMetadata() != null;
			case A2aPackage.ARTIFACT__LAST_CHUNK:
				return LAST_CHUNK_EDEFAULT == null ? getLastChunk() != null : !LAST_CHUNK_EDEFAULT.equals(getLastChunk());
			case A2aPackage.ARTIFACT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case A2aPackage.ARTIFACT__PARTS:
				return !getParts().isEmpty();
			case A2aPackage.ARTIFACT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case A2aPackage.ARTIFACT__INDEX:
				return INDEX_EDEFAULT == null ? getIndex() != null : !INDEX_EDEFAULT.equals(getIndex());
			case A2aPackage.ARTIFACT__APPEND:
				return APPEND_EDEFAULT == null ? getAppend() != null : !APPEND_EDEFAULT.equals(getAppend());
		}
		return super.eIsSet(featureID);
	}

} //ArtifactImpl
