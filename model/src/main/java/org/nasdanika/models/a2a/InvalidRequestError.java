/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invalid Request Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "InvalidRequestError",
 *   "type": "object",
 *   "properties": {
 *     "code": {
 *       "default": -32600,
 *       "const": -32600,
 *       "examples": [-32600],
 *       "description": "Error code",
 *       "title": "Code",
 *       "type": "integer"
 *     },
 *     "data": {
 *       "default": null,
 *       "anyOf": [
 *         {
 *           "additionalProperties": {},
 *           "type": "object"
 *         },
 *         {"type": "null"}
 *       ],
 *       "title": "Data"
 *     },
 *     "message": {
 *       "default": "Request payload validation error",
 *       "const": "Request payload validation error",
 *       "examples": ["Request payload validation error"],
 *       "description": "A short description of the error",
 *       "title": "Message",
 *       "type": "string"
 *     }
 *   },
 *   "required": [
 *     "code",
 *     "message"
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
 *   <li>{@link org.nasdanika.models.a2a.InvalidRequestError#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.InvalidRequestError#getData <em>Data</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.InvalidRequestError#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getInvalidRequestError()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface InvalidRequestError extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"-32600"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error code
	 * 
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": -32600,
	 *   "const": -32600,
	 *   "examples": [-32600],
	 *   "description": "Error code",
	 *   "title": "Code",
	 *   "type": "integer"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Integer)
	 * @see org.nasdanika.models.a2a.A2aPackage#getInvalidRequestError_Code()
	 * @model default="-32600" required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Integer getCode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.InvalidRequestError#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
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
	 *   "title": "Data"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(EObject)
	 * @see org.nasdanika.models.a2a.A2aPackage#getInvalidRequestError_Data()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EObject getData();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.InvalidRequestError#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(EObject value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * The default value is <code>"Request payload validation error"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description of the error
	 * 
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": "Request payload validation error",
	 *   "const": "Request payload validation error",
	 *   "examples": ["Request payload validation error"],
	 *   "description": "A short description of the error",
	 *   "title": "Message",
	 *   "type": "string"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getInvalidRequestError_Message()
	 * @model default="Request payload validation error" required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.InvalidRequestError#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // InvalidRequestError
