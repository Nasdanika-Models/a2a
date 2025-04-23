/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.TaskStatus;
import org.nasdanika.models.a2a.TaskStatusUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Status Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskStatusUpdateEventImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskStatusUpdateEventImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskStatusUpdateEventImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskStatusUpdateEventImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskStatusUpdateEventImpl extends SendTaskStreamingResponseResultImpl implements TaskStatusUpdateEvent {
	/**
	 * The default value of the '{@link #getFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FINAL_EDEFAULT = Boolean.FALSE;

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
	protected TaskStatusUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.TASK_STATUS_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getMetadata() {
		return (EObject)eDynamicGet(A2aPackage.TASK_STATUS_UPDATE_EVENT__METADATA, A2aPackage.Literals.TASK_STATUS_UPDATE_EVENT__METADATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(EObject newMetadata, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMetadata, A2aPackage.TASK_STATUS_UPDATE_EVENT__METADATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(EObject newMetadata) {
		eDynamicSet(A2aPackage.TASK_STATUS_UPDATE_EVENT__METADATA, A2aPackage.Literals.TASK_STATUS_UPDATE_EVENT__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFinal() {
		return (Boolean)eDynamicGet(A2aPackage.TASK_STATUS_UPDATE_EVENT__FINAL, A2aPackage.Literals.TASK_STATUS_UPDATE_EVENT__FINAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinal(Boolean newFinal) {
		eDynamicSet(A2aPackage.TASK_STATUS_UPDATE_EVENT__FINAL, A2aPackage.Literals.TASK_STATUS_UPDATE_EVENT__FINAL, newFinal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(A2aPackage.TASK_STATUS_UPDATE_EVENT__ID, A2aPackage.Literals.TASK_STATUS_UPDATE_EVENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(A2aPackage.TASK_STATUS_UPDATE_EVENT__ID, A2aPackage.Literals.TASK_STATUS_UPDATE_EVENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskStatus getStatus() {
		return (TaskStatus)eDynamicGet(A2aPackage.TASK_STATUS_UPDATE_EVENT__STATUS, A2aPackage.Literals.TASK_STATUS_UPDATE_EVENT__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(TaskStatus newStatus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStatus, A2aPackage.TASK_STATUS_UPDATE_EVENT__STATUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(TaskStatus newStatus) {
		eDynamicSet(A2aPackage.TASK_STATUS_UPDATE_EVENT__STATUS, A2aPackage.Literals.TASK_STATUS_UPDATE_EVENT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__METADATA:
				return basicSetMetadata(null, msgs);
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__STATUS:
				return basicSetStatus(null, msgs);
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
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__METADATA:
				return getMetadata();
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__FINAL:
				return getFinal();
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__ID:
				return getId();
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__STATUS:
				return getStatus();
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
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__METADATA:
				setMetadata((EObject)newValue);
				return;
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__FINAL:
				setFinal((Boolean)newValue);
				return;
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__ID:
				setId((String)newValue);
				return;
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__STATUS:
				setStatus((TaskStatus)newValue);
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
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__METADATA:
				setMetadata((EObject)null);
				return;
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__ID:
				setId(ID_EDEFAULT);
				return;
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__STATUS:
				setStatus((TaskStatus)null);
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
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__METADATA:
				return getMetadata() != null;
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__FINAL:
				return FINAL_EDEFAULT == null ? getFinal() != null : !FINAL_EDEFAULT.equals(getFinal());
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case A2aPackage.TASK_STATUS_UPDATE_EVENT__STATUS:
				return getStatus() != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskStatusUpdateEventImpl
