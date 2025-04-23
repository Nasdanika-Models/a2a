/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.UnsupportedOperationError;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unsupported Operation Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.UnsupportedOperationErrorImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.UnsupportedOperationErrorImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.UnsupportedOperationErrorImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnsupportedOperationErrorImpl extends MinimalEObjectImpl.Container implements UnsupportedOperationError {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CODE_EDEFAULT = Integer.valueOf(-32004);

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = "This operation is not supported";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsupportedOperationErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.UNSUPPORTED_OPERATION_ERROR;
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
		return (Integer)eDynamicGet(A2aPackage.UNSUPPORTED_OPERATION_ERROR__CODE, A2aPackage.Literals.UNSUPPORTED_OPERATION_ERROR__CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(Integer newCode) {
		eDynamicSet(A2aPackage.UNSUPPORTED_OPERATION_ERROR__CODE, A2aPackage.Literals.UNSUPPORTED_OPERATION_ERROR__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getData() {
		return (String)eDynamicGet(A2aPackage.UNSUPPORTED_OPERATION_ERROR__DATA, A2aPackage.Literals.UNSUPPORTED_OPERATION_ERROR__DATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(String newData) {
		eDynamicSet(A2aPackage.UNSUPPORTED_OPERATION_ERROR__DATA, A2aPackage.Literals.UNSUPPORTED_OPERATION_ERROR__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return (String)eDynamicGet(A2aPackage.UNSUPPORTED_OPERATION_ERROR__MESSAGE, A2aPackage.Literals.UNSUPPORTED_OPERATION_ERROR__MESSAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		eDynamicSet(A2aPackage.UNSUPPORTED_OPERATION_ERROR__MESSAGE, A2aPackage.Literals.UNSUPPORTED_OPERATION_ERROR__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR__CODE:
				return getCode();
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR__DATA:
				return getData();
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR__MESSAGE:
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
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR__CODE:
				setCode((Integer)newValue);
				return;
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR__DATA:
				setData((String)newValue);
				return;
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR__MESSAGE:
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
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR__DATA:
				setData(DATA_EDEFAULT);
				return;
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR__MESSAGE:
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
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR__DATA:
				return DATA_EDEFAULT == null ? getData() != null : !DATA_EDEFAULT.equals(getData());
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR__MESSAGE:
				return MESSAGE_EDEFAULT == null ? getMessage() != null : !MESSAGE_EDEFAULT.equals(getMessage());
		}
		return super.eIsSet(featureID);
	}

} //UnsupportedOperationErrorImpl
