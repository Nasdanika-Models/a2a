/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Not Found Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "MethodNotFoundError",
 *   "type": "object",
 *   "properties": {
 *     "code": {
 *       "default": -32601,
 *       "const": -32601,
 *       "examples": [-32601],
 *       "description": "Error code",
 *       "title": "Code",
 *       "type": "integer"
 *     },
 *     "data": {
 *       "default": null,
 *       "const": null,
 *       "title": "Data"
 *     },
 *     "message": {
 *       "default": "Method not found",
 *       "const": "Method not found",
 *       "examples": ["Method not found"],
 *       "description": "A short description of the error",
 *       "title": "Message",
 *       "type": "string"
 *     }
 *   },
 *   "required": [
 *     "code",
 *     "message",
 *     "data"
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
 *   <li>{@link org.nasdanika.models.a2a.MethodNotFoundError#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.MethodNotFoundError#getData <em>Data</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.MethodNotFoundError#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getMethodNotFoundError()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface MethodNotFoundError extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"-32601"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error code
	 * 
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": -32601,
	 *   "const": -32601,
	 *   "examples": [-32601],
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
	 * @see org.nasdanika.models.a2a.A2aPackage#getMethodNotFoundError_Code()
	 * @model default="-32601" required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Integer getCode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.MethodNotFoundError#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "const": null,
	 *   "title": "Data"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getMethodNotFoundError_Data()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.MethodNotFoundError#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * The default value is <code>"Method not found"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short description of the error
	 * 
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": "Method not found",
	 *   "const": "Method not found",
	 *   "examples": ["Method not found"],
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
	 * @see org.nasdanika.models.a2a.A2aPackage#getMethodNotFoundError_Message()
	 * @model default="Method not found" required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.MethodNotFoundError#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // MethodNotFoundError
