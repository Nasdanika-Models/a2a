/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.GetTaskResponse;
import org.nasdanika.models.a2a.JSONRPCError;
import org.nasdanika.models.a2a.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Task Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.GetTaskResponseImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.GetTaskResponseImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.GetTaskResponseImpl#getJsonrpc <em>Jsonrpc</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.GetTaskResponseImpl#getError <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetTaskResponseImpl extends MinimalEObjectImpl.Container implements GetTaskResponse {
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
	 * The default value of the '{@link #getJsonrpc() <em>Jsonrpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonrpc()
	 * @generated
	 * @ordered
	 */
	protected static final String JSONRPC_EDEFAULT = "2.0";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetTaskResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.GET_TASK_RESPONSE;
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
	public Task getResult() {
		return (Task)eDynamicGet(A2aPackage.GET_TASK_RESPONSE__RESULT, A2aPackage.Literals.GET_TASK_RESPONSE__RESULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(Task newResult, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResult, A2aPackage.GET_TASK_RESPONSE__RESULT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResult(Task newResult) {
		eDynamicSet(A2aPackage.GET_TASK_RESPONSE__RESULT, A2aPackage.Literals.GET_TASK_RESPONSE__RESULT, newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(A2aPackage.GET_TASK_RESPONSE__ID, A2aPackage.Literals.GET_TASK_RESPONSE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(A2aPackage.GET_TASK_RESPONSE__ID, A2aPackage.Literals.GET_TASK_RESPONSE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJsonrpc() {
		return (String)eDynamicGet(A2aPackage.GET_TASK_RESPONSE__JSONRPC, A2aPackage.Literals.GET_TASK_RESPONSE__JSONRPC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJsonrpc(String newJsonrpc) {
		eDynamicSet(A2aPackage.GET_TASK_RESPONSE__JSONRPC, A2aPackage.Literals.GET_TASK_RESPONSE__JSONRPC, newJsonrpc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSONRPCError getError() {
		return (JSONRPCError)eDynamicGet(A2aPackage.GET_TASK_RESPONSE__ERROR, A2aPackage.Literals.GET_TASK_RESPONSE__ERROR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetError(JSONRPCError newError, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newError, A2aPackage.GET_TASK_RESPONSE__ERROR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setError(JSONRPCError newError) {
		eDynamicSet(A2aPackage.GET_TASK_RESPONSE__ERROR, A2aPackage.Literals.GET_TASK_RESPONSE__ERROR, newError);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.GET_TASK_RESPONSE__RESULT:
				return basicSetResult(null, msgs);
			case A2aPackage.GET_TASK_RESPONSE__ERROR:
				return basicSetError(null, msgs);
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
			case A2aPackage.GET_TASK_RESPONSE__RESULT:
				return getResult();
			case A2aPackage.GET_TASK_RESPONSE__ID:
				return getId();
			case A2aPackage.GET_TASK_RESPONSE__JSONRPC:
				return getJsonrpc();
			case A2aPackage.GET_TASK_RESPONSE__ERROR:
				return getError();
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
			case A2aPackage.GET_TASK_RESPONSE__RESULT:
				setResult((Task)newValue);
				return;
			case A2aPackage.GET_TASK_RESPONSE__ID:
				setId((String)newValue);
				return;
			case A2aPackage.GET_TASK_RESPONSE__JSONRPC:
				setJsonrpc((String)newValue);
				return;
			case A2aPackage.GET_TASK_RESPONSE__ERROR:
				setError((JSONRPCError)newValue);
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
			case A2aPackage.GET_TASK_RESPONSE__RESULT:
				setResult((Task)null);
				return;
			case A2aPackage.GET_TASK_RESPONSE__ID:
				setId(ID_EDEFAULT);
				return;
			case A2aPackage.GET_TASK_RESPONSE__JSONRPC:
				setJsonrpc(JSONRPC_EDEFAULT);
				return;
			case A2aPackage.GET_TASK_RESPONSE__ERROR:
				setError((JSONRPCError)null);
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
			case A2aPackage.GET_TASK_RESPONSE__RESULT:
				return getResult() != null;
			case A2aPackage.GET_TASK_RESPONSE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case A2aPackage.GET_TASK_RESPONSE__JSONRPC:
				return JSONRPC_EDEFAULT == null ? getJsonrpc() != null : !JSONRPC_EDEFAULT.equals(getJsonrpc());
			case A2aPackage.GET_TASK_RESPONSE__ERROR:
				return getError() != null;
		}
		return super.eIsSet(featureID);
	}

} //GetTaskResponseImpl
