/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.JSONRPCMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSONRPC Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.JSONRPCMessageImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.JSONRPCMessageImpl#getJsonrpc <em>Jsonrpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JSONRPCMessageImpl extends MinimalEObjectImpl.Container implements JSONRPCMessage {
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
	protected JSONRPCMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.JSONRPC_MESSAGE;
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
	public String getId() {
		return (String)eDynamicGet(A2aPackage.JSONRPC_MESSAGE__ID, A2aPackage.Literals.JSONRPC_MESSAGE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(A2aPackage.JSONRPC_MESSAGE__ID, A2aPackage.Literals.JSONRPC_MESSAGE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJsonrpc() {
		return (String)eDynamicGet(A2aPackage.JSONRPC_MESSAGE__JSONRPC, A2aPackage.Literals.JSONRPC_MESSAGE__JSONRPC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJsonrpc(String newJsonrpc) {
		eDynamicSet(A2aPackage.JSONRPC_MESSAGE__JSONRPC, A2aPackage.Literals.JSONRPC_MESSAGE__JSONRPC, newJsonrpc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A2aPackage.JSONRPC_MESSAGE__ID:
				return getId();
			case A2aPackage.JSONRPC_MESSAGE__JSONRPC:
				return getJsonrpc();
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
			case A2aPackage.JSONRPC_MESSAGE__ID:
				setId((String)newValue);
				return;
			case A2aPackage.JSONRPC_MESSAGE__JSONRPC:
				setJsonrpc((String)newValue);
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
			case A2aPackage.JSONRPC_MESSAGE__ID:
				setId(ID_EDEFAULT);
				return;
			case A2aPackage.JSONRPC_MESSAGE__JSONRPC:
				setJsonrpc(JSONRPC_EDEFAULT);
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
			case A2aPackage.JSONRPC_MESSAGE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case A2aPackage.JSONRPC_MESSAGE__JSONRPC:
				return JSONRPC_EDEFAULT == null ? getJsonrpc() != null : !JSONRPC_EDEFAULT.equals(getJsonrpc());
		}
		return super.eIsSet(featureID);
	}

} //JSONRPCMessageImpl
