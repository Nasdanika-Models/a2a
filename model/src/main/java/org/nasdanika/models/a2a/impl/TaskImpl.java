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
import org.nasdanika.models.a2a.Message;
import org.nasdanika.models.a2a.Task;
import org.nasdanika.models.a2a.TaskStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskImpl#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskImpl#getHistory <em>History</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskImpl#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
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
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.TASK;
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
		return (EObject)eDynamicGet(A2aPackage.TASK__METADATA, A2aPackage.Literals.TASK__METADATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(EObject newMetadata, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMetadata, A2aPackage.TASK__METADATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(EObject newMetadata) {
		eDynamicSet(A2aPackage.TASK__METADATA, A2aPackage.Literals.TASK__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(A2aPackage.TASK__ID, A2aPackage.Literals.TASK__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(A2aPackage.TASK__ID, A2aPackage.Literals.TASK__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionId() {
		return (String)eDynamicGet(A2aPackage.TASK__SESSION_ID, A2aPackage.Literals.TASK__SESSION_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionId(String newSessionId) {
		eDynamicSet(A2aPackage.TASK__SESSION_ID, A2aPackage.Literals.TASK__SESSION_ID, newSessionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Message> getHistory() {
		return (EList<Message>)eDynamicGet(A2aPackage.TASK__HISTORY, A2aPackage.Literals.TASK__HISTORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskStatus getStatus() {
		return (TaskStatus)eDynamicGet(A2aPackage.TASK__STATUS, A2aPackage.Literals.TASK__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(TaskStatus newStatus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStatus, A2aPackage.TASK__STATUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(TaskStatus newStatus) {
		eDynamicSet(A2aPackage.TASK__STATUS, A2aPackage.Literals.TASK__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>)eDynamicGet(A2aPackage.TASK__ARTIFACTS, A2aPackage.Literals.TASK__ARTIFACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.TASK__METADATA:
				return basicSetMetadata(null, msgs);
			case A2aPackage.TASK__HISTORY:
				return ((InternalEList<?>)getHistory()).basicRemove(otherEnd, msgs);
			case A2aPackage.TASK__STATUS:
				return basicSetStatus(null, msgs);
			case A2aPackage.TASK__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
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
			case A2aPackage.TASK__METADATA:
				return getMetadata();
			case A2aPackage.TASK__ID:
				return getId();
			case A2aPackage.TASK__SESSION_ID:
				return getSessionId();
			case A2aPackage.TASK__HISTORY:
				return getHistory();
			case A2aPackage.TASK__STATUS:
				return getStatus();
			case A2aPackage.TASK__ARTIFACTS:
				return getArtifacts();
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
			case A2aPackage.TASK__METADATA:
				setMetadata((EObject)newValue);
				return;
			case A2aPackage.TASK__ID:
				setId((String)newValue);
				return;
			case A2aPackage.TASK__SESSION_ID:
				setSessionId((String)newValue);
				return;
			case A2aPackage.TASK__HISTORY:
				getHistory().clear();
				getHistory().addAll((Collection<? extends Message>)newValue);
				return;
			case A2aPackage.TASK__STATUS:
				setStatus((TaskStatus)newValue);
				return;
			case A2aPackage.TASK__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
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
			case A2aPackage.TASK__METADATA:
				setMetadata((EObject)null);
				return;
			case A2aPackage.TASK__ID:
				setId(ID_EDEFAULT);
				return;
			case A2aPackage.TASK__SESSION_ID:
				setSessionId(SESSION_ID_EDEFAULT);
				return;
			case A2aPackage.TASK__HISTORY:
				getHistory().clear();
				return;
			case A2aPackage.TASK__STATUS:
				setStatus((TaskStatus)null);
				return;
			case A2aPackage.TASK__ARTIFACTS:
				getArtifacts().clear();
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
			case A2aPackage.TASK__METADATA:
				return getMetadata() != null;
			case A2aPackage.TASK__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case A2aPackage.TASK__SESSION_ID:
				return SESSION_ID_EDEFAULT == null ? getSessionId() != null : !SESSION_ID_EDEFAULT.equals(getSessionId());
			case A2aPackage.TASK__HISTORY:
				return !getHistory().isEmpty();
			case A2aPackage.TASK__STATUS:
				return getStatus() != null;
			case A2aPackage.TASK__ARTIFACTS:
				return !getArtifacts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
