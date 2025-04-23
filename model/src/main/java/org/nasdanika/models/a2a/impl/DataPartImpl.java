/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.DataPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.DataPartImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.DataPartImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.DataPartImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPartImpl extends PartImpl implements DataPart {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "data";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.DATA_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getMetadata() {
		return (EObject)eDynamicGet(A2aPackage.DATA_PART__METADATA, A2aPackage.Literals.DATA_PART__METADATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(EObject newMetadata, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMetadata, A2aPackage.DATA_PART__METADATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(EObject newMetadata) {
		eDynamicSet(A2aPackage.DATA_PART__METADATA, A2aPackage.Literals.DATA_PART__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getData() {
		return (EObject)eDynamicGet(A2aPackage.DATA_PART__DATA, A2aPackage.Literals.DATA_PART__DATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(EObject newData, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newData, A2aPackage.DATA_PART__DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(EObject newData) {
		eDynamicSet(A2aPackage.DATA_PART__DATA, A2aPackage.Literals.DATA_PART__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(A2aPackage.DATA_PART__TYPE, A2aPackage.Literals.DATA_PART__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(A2aPackage.DATA_PART__TYPE, A2aPackage.Literals.DATA_PART__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.DATA_PART__METADATA:
				return basicSetMetadata(null, msgs);
			case A2aPackage.DATA_PART__DATA:
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
			case A2aPackage.DATA_PART__METADATA:
				return getMetadata();
			case A2aPackage.DATA_PART__DATA:
				return getData();
			case A2aPackage.DATA_PART__TYPE:
				return getType();
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
			case A2aPackage.DATA_PART__METADATA:
				setMetadata((EObject)newValue);
				return;
			case A2aPackage.DATA_PART__DATA:
				setData((EObject)newValue);
				return;
			case A2aPackage.DATA_PART__TYPE:
				setType((String)newValue);
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
			case A2aPackage.DATA_PART__METADATA:
				setMetadata((EObject)null);
				return;
			case A2aPackage.DATA_PART__DATA:
				setData((EObject)null);
				return;
			case A2aPackage.DATA_PART__TYPE:
				setType(TYPE_EDEFAULT);
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
			case A2aPackage.DATA_PART__METADATA:
				return getMetadata() != null;
			case A2aPackage.DATA_PART__DATA:
				return getData() != null;
			case A2aPackage.DATA_PART__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
		}
		return super.eIsSet(featureID);
	}

} //DataPartImpl
