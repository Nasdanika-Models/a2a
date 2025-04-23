/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "Message",
 *   "type": "object",
 *   "properties": {
 *     "metadata": {
 *       "default": null,
 *       "anyOf": [
 *         {
 *           "additionalProperties": {},
 *           "type": "object"
 *         },
 *         {"type": "null"}
 *       ],
 *       "title": "Metadata"
 *     },
 *     "role": {
 *       "title": "Role",
 *       "type": "string",
 *       "enum": [
 *         "user",
 *         "agent"
 *       ]
 *     },
 *     "parts": {
 *       "title": "Parts",
 *       "type": "array",
 *       "items": {"$ref": "#/$defs/Part"}
 *     }
 *   },
 *   "required": [
 *     "role",
 *     "parts"
 *   ]
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
 *   <li>{@link org.nasdanika.models.a2a.Message#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.Message#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.Message#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getMessage()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {
	 *       "additionalProperties": {},
	 *       "type": "object"
	 *     },
	 *     {"type": "null"}
	 *   ],
	 *   "title": "Metadata"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(EObject)
	 * @see org.nasdanika.models.a2a.A2aPackage#getMessage_Metadata()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EObject getMetadata();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.Message#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(EObject value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "title": "Role",
	 *   "type": "string",
	 *   "enum": [
	 *     "user",
	 *     "agent"
	 *   ]
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getMessage_Role()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.Message#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.a2a.Part}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "title": "Parts",
	 *   "type": "array",
	 *   "items": {"$ref": "#/$defs/Part"}
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.nasdanika.models.a2a.A2aPackage#getMessage_Parts()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EList<Part> getParts();

} // Message
