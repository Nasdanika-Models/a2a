/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.FileContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.FileContentImpl#getBytes <em>Bytes</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.FileContentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.FileContentImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.FileContentImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileContentImpl extends MinimalEObjectImpl.Container implements FileContent {
	/**
	 * The default value of the '{@link #getBytes() <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytes()
	 * @generated
	 * @ordered
	 */
	protected static final String BYTES_EDEFAULT = null;

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
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.FILE_CONTENT;
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
	public String getBytes() {
		return (String)eDynamicGet(A2aPackage.FILE_CONTENT__BYTES, A2aPackage.Literals.FILE_CONTENT__BYTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBytes(String newBytes) {
		eDynamicSet(A2aPackage.FILE_CONTENT__BYTES, A2aPackage.Literals.FILE_CONTENT__BYTES, newBytes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(A2aPackage.FILE_CONTENT__NAME, A2aPackage.Literals.FILE_CONTENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(A2aPackage.FILE_CONTENT__NAME, A2aPackage.Literals.FILE_CONTENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMimeType() {
		return (String)eDynamicGet(A2aPackage.FILE_CONTENT__MIME_TYPE, A2aPackage.Literals.FILE_CONTENT__MIME_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeType(String newMimeType) {
		eDynamicSet(A2aPackage.FILE_CONTENT__MIME_TYPE, A2aPackage.Literals.FILE_CONTENT__MIME_TYPE, newMimeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUri() {
		return (String)eDynamicGet(A2aPackage.FILE_CONTENT__URI, A2aPackage.Literals.FILE_CONTENT__URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUri(String newUri) {
		eDynamicSet(A2aPackage.FILE_CONTENT__URI, A2aPackage.Literals.FILE_CONTENT__URI, newUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A2aPackage.FILE_CONTENT__BYTES:
				return getBytes();
			case A2aPackage.FILE_CONTENT__NAME:
				return getName();
			case A2aPackage.FILE_CONTENT__MIME_TYPE:
				return getMimeType();
			case A2aPackage.FILE_CONTENT__URI:
				return getUri();
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
			case A2aPackage.FILE_CONTENT__BYTES:
				setBytes((String)newValue);
				return;
			case A2aPackage.FILE_CONTENT__NAME:
				setName((String)newValue);
				return;
			case A2aPackage.FILE_CONTENT__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case A2aPackage.FILE_CONTENT__URI:
				setUri((String)newValue);
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
			case A2aPackage.FILE_CONTENT__BYTES:
				setBytes(BYTES_EDEFAULT);
				return;
			case A2aPackage.FILE_CONTENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case A2aPackage.FILE_CONTENT__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case A2aPackage.FILE_CONTENT__URI:
				setUri(URI_EDEFAULT);
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
			case A2aPackage.FILE_CONTENT__BYTES:
				return BYTES_EDEFAULT == null ? getBytes() != null : !BYTES_EDEFAULT.equals(getBytes());
			case A2aPackage.FILE_CONTENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case A2aPackage.FILE_CONTENT__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? getMimeType() != null : !MIME_TYPE_EDEFAULT.equals(getMimeType());
			case A2aPackage.FILE_CONTENT__URI:
				return URI_EDEFAULT == null ? getUri() != null : !URI_EDEFAULT.equals(getUri());
		}
		return super.eIsSet(featureID);
	}

} //FileContentImpl
