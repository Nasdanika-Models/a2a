/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.FileContent;
import org.nasdanika.models.a2a.FilePart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.impl.FilePartImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.FilePartImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.impl.FilePartImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilePartImpl extends PartImpl implements FilePart {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "file";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilePartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A2aPackage.Literals.FILE_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getMetadata() {
		return (EObject)eDynamicGet(A2aPackage.FILE_PART__METADATA, A2aPackage.Literals.FILE_PART__METADATA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(EObject newMetadata, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMetadata, A2aPackage.FILE_PART__METADATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(EObject newMetadata) {
		eDynamicSet(A2aPackage.FILE_PART__METADATA, A2aPackage.Literals.FILE_PART__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileContent getFile() {
		return (FileContent)eDynamicGet(A2aPackage.FILE_PART__FILE, A2aPackage.Literals.FILE_PART__FILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(FileContent newFile, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newFile, A2aPackage.FILE_PART__FILE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFile(FileContent newFile) {
		eDynamicSet(A2aPackage.FILE_PART__FILE, A2aPackage.Literals.FILE_PART__FILE, newFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(A2aPackage.FILE_PART__TYPE, A2aPackage.Literals.FILE_PART__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(A2aPackage.FILE_PART__TYPE, A2aPackage.Literals.FILE_PART__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A2aPackage.FILE_PART__METADATA:
				return basicSetMetadata(null, msgs);
			case A2aPackage.FILE_PART__FILE:
				return basicSetFile(null, msgs);
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
			case A2aPackage.FILE_PART__METADATA:
				return getMetadata();
			case A2aPackage.FILE_PART__FILE:
				return getFile();
			case A2aPackage.FILE_PART__TYPE:
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
			case A2aPackage.FILE_PART__METADATA:
				setMetadata((EObject)newValue);
				return;
			case A2aPackage.FILE_PART__FILE:
				setFile((FileContent)newValue);
				return;
			case A2aPackage.FILE_PART__TYPE:
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
			case A2aPackage.FILE_PART__METADATA:
				setMetadata((EObject)null);
				return;
			case A2aPackage.FILE_PART__FILE:
				setFile((FileContent)null);
				return;
			case A2aPackage.FILE_PART__TYPE:
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
			case A2aPackage.FILE_PART__METADATA:
				return getMetadata() != null;
			case A2aPackage.FILE_PART__FILE:
				return getFile() != null;
			case A2aPackage.FILE_PART__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
		}
		return super.eIsSet(featureID);
	}

} //FilePartImpl
