/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "additionalProperties": {},
 *   "title": "AuthenticationInfo",
 *   "type": "object",
 *   "properties": {
 *     "credentials": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Credentials"
 *     },
 *     "schemes": {
 *       "title": "Schemes",
 *       "type": "array",
 *       "items": {"type": "string"}
 *     }
 *   },
 *   "required": ["schemes"]
 * }
 * ```
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.a2a.AuthenticationInfo#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AuthenticationInfo#getSchemes <em>Schemes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getAuthenticationInfo()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface AuthenticationInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"type": "string"},
	 *     {"type": "null"}
	 *   ],
	 *   "title": "Credentials"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credentials</em>' attribute.
	 * @see #setCredentials(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAuthenticationInfo_Credentials()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getCredentials();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AuthenticationInfo#getCredentials <em>Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials</em>' attribute.
	 * @see #getCredentials()
	 * @generated
	 */
	void setCredentials(String value);

	/**
	 * Returns the value of the '<em><b>Schemes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "title": "Schemes",
	 *   "type": "array",
	 *   "items": {"type": "string"}
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schemes</em>' attribute list.
	 * @see org.nasdanika.models.a2a.A2aPackage#getAuthenticationInfo_Schemes()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EList<String> getSchemes();

} // AuthenticationInfo
