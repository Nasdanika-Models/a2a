/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.Artifact;
import org.nasdanika.models.a2a.TaskArtifactUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Artifact Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskArtifactUpdateEventImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskArtifactUpdateEventImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskArtifactUpdateEventImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskArtifactUpdateEventImpl extends SendTaskStreamingResponseResultImpl implements TaskArtifactUpdateEvent {
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
	protected TaskArtifactUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.TASK_ARTIFACT_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact getArtifact() {
		return (Artifact)eDynamicGet(A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT, A2aPackage.Literals.TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifact(Artifact newArtifact, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newArtifact, A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifact(Artifact newArtifact) {
		eDynamicSet(A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT, A2aPackage.Literals.TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT, newArtifact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getMetadata() {
		return (EObject)eDynamicGet(A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__METADATA, A2aPackage.Literals.TASK_ARTIFACT_UPDATE_EVENT__METADATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(EObject newMetadata, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMetadata, A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__METADATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(EObject newMetadata) {
		eDynamicSet(A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__METADATA, A2aPackage.Literals.TASK_ARTIFACT_UPDATE_EVENT__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ID, A2aPackage.Literals.TASK_ARTIFACT_UPDATE_EVENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ID, A2aPackage.Literals.TASK_ARTIFACT_UPDATE_EVENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT:
				return basicSetArtifact(null, msgs);
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__METADATA:
				return basicSetMetadata(null, msgs);
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
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT:
				return getArtifact();
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__METADATA:
				return getMetadata();
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ID:
				return getId();
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
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT:
				setArtifact((Artifact)newValue);
				return;
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__METADATA:
				setMetadata((EObject)newValue);
				return;
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ID:
				setId((String)newValue);
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
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT:
				setArtifact((Artifact)null);
				return;
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__METADATA:
				setMetadata((EObject)null);
				return;
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ID:
				setId(ID_EDEFAULT);
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
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ARTIFACT:
				return getArtifact() != null;
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__METADATA:
				return getMetadata() != null;
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
		}
		return super.eIsSet(featureID);
	}

} //TaskArtifactUpdateEventImpl
