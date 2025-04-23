/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.TaskQueryParams;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Query Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskQueryParamsImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskQueryParamsImpl#getHistoryLength <em>History Length</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.TaskQueryParamsImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskQueryParamsImpl extends MinimalEObjectImpl.Container implements TaskQueryParams {
	/**
	 * The default value of the '{@link #getHistoryLength() <em>History Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HISTORY_LENGTH_EDEFAULT = null;

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
	protected TaskQueryParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.TASK_QUERY_PARAMS;
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
		return (EObject)eDynamicGet(A2aPackage.TASK_QUERY_PARAMS__METADATA, A2aPackage.Literals.TASK_QUERY_PARAMS__METADATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(EObject newMetadata, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMetadata, A2aPackage.TASK_QUERY_PARAMS__METADATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(EObject newMetadata) {
		eDynamicSet(A2aPackage.TASK_QUERY_PARAMS__METADATA, A2aPackage.Literals.TASK_QUERY_PARAMS__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHistoryLength() {
		return (Integer)eDynamicGet(A2aPackage.TASK_QUERY_PARAMS__HISTORY_LENGTH, A2aPackage.Literals.TASK_QUERY_PARAMS__HISTORY_LENGTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistoryLength(Integer newHistoryLength) {
		eDynamicSet(A2aPackage.TASK_QUERY_PARAMS__HISTORY_LENGTH, A2aPackage.Literals.TASK_QUERY_PARAMS__HISTORY_LENGTH, newHistoryLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(A2aPackage.TASK_QUERY_PARAMS__ID, A2aPackage.Literals.TASK_QUERY_PARAMS__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(A2aPackage.TASK_QUERY_PARAMS__ID, A2aPackage.Literals.TASK_QUERY_PARAMS__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.TASK_QUERY_PARAMS__METADATA:
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
			case A2aPackage.TASK_QUERY_PARAMS__METADATA:
				return getMetadata();
			case A2aPackage.TASK_QUERY_PARAMS__HISTORY_LENGTH:
				return getHistoryLength();
			case A2aPackage.TASK_QUERY_PARAMS__ID:
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
			case A2aPackage.TASK_QUERY_PARAMS__METADATA:
				setMetadata((EObject)newValue);
				return;
			case A2aPackage.TASK_QUERY_PARAMS__HISTORY_LENGTH:
				setHistoryLength((Integer)newValue);
				return;
			case A2aPackage.TASK_QUERY_PARAMS__ID:
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
			case A2aPackage.TASK_QUERY_PARAMS__METADATA:
				setMetadata((EObject)null);
				return;
			case A2aPackage.TASK_QUERY_PARAMS__HISTORY_LENGTH:
				setHistoryLength(HISTORY_LENGTH_EDEFAULT);
				return;
			case A2aPackage.TASK_QUERY_PARAMS__ID:
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
			case A2aPackage.TASK_QUERY_PARAMS__METADATA:
				return getMetadata() != null;
			case A2aPackage.TASK_QUERY_PARAMS__HISTORY_LENGTH:
				return HISTORY_LENGTH_EDEFAULT == null ? getHistoryLength() != null : !HISTORY_LENGTH_EDEFAULT.equals(getHistoryLength());
			case A2aPackage.TASK_QUERY_PARAMS__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
		}
		return super.eIsSet(featureID);
	}

} //TaskQueryParamsImpl
