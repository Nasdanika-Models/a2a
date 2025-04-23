/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.JSONRPCError;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSONRPC Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.JSONRPCErrorImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.JSONRPCErrorImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.JSONRPCErrorImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JSONRPCErrorImpl extends MinimalEObjectImpl.Container implements JSONRPCError {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JSONRPCErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.JSONRPC_ERROR;
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
	public Integer getCode() {
		return (Integer)eDynamicGet(A2aPackage.JSONRPC_ERROR__CODE, A2aPackage.Literals.JSONRPC_ERROR__CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(Integer newCode) {
		eDynamicSet(A2aPackage.JSONRPC_ERROR__CODE, A2aPackage.Literals.JSONRPC_ERROR__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getData() {
		return (EObject)eDynamicGet(A2aPackage.JSONRPC_ERROR__DATA, A2aPackage.Literals.JSONRPC_ERROR__DATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(EObject newData, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newData, A2aPackage.JSONRPC_ERROR__DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(EObject newData) {
		eDynamicSet(A2aPackage.JSONRPC_ERROR__DATA, A2aPackage.Literals.JSONRPC_ERROR__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return (String)eDynamicGet(A2aPackage.JSONRPC_ERROR__MESSAGE, A2aPackage.Literals.JSONRPC_ERROR__MESSAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		eDynamicSet(A2aPackage.JSONRPC_ERROR__MESSAGE, A2aPackage.Literals.JSONRPC_ERROR__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.JSONRPC_ERROR__DATA:
				return basicSetData(null, msgs);
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
			case A2aPackage.JSONRPC_ERROR__CODE:
				return getCode();
			case A2aPackage.JSONRPC_ERROR__DATA:
				return getData();
			case A2aPackage.JSONRPC_ERROR__MESSAGE:
				return getMessage();
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
			case A2aPackage.JSONRPC_ERROR__CODE:
				setCode((Integer)newValue);
				return;
			case A2aPackage.JSONRPC_ERROR__DATA:
				setData((EObject)newValue);
				return;
			case A2aPackage.JSONRPC_ERROR__MESSAGE:
				setMessage((String)newValue);
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
			case A2aPackage.JSONRPC_ERROR__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case A2aPackage.JSONRPC_ERROR__DATA:
				setData((EObject)null);
				return;
			case A2aPackage.JSONRPC_ERROR__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
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
			case A2aPackage.JSONRPC_ERROR__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case A2aPackage.JSONRPC_ERROR__DATA:
				return getData() != null;
			case A2aPackage.JSONRPC_ERROR__MESSAGE:
				return MESSAGE_EDEFAULT == null ? getMessage() != null : !MESSAGE_EDEFAULT.equals(getMessage());
		}
		return super.eIsSet(featureID);
	}

} //JSONRPCErrorImpl
