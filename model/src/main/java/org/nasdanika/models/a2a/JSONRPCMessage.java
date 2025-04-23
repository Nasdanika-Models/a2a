/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSONRPC Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "JSONRPCMessage",
 *   "type": "object",
 *   "properties": {
 *     "id": {
 *       "anyOf": [
 *         {"type": "integer"},
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Id"
 *     },
 *     "jsonrpc": {
 *       "default": "2.0",
 *       "const": "2.0",
 *       "title": "Jsonrpc",
 *       "type": "string"
 *     }
 *   }
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
 *   <li>{@link org.nasdanika.models.a2a.JSONRPCMessage#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.JSONRPCMessage#getJsonrpc <em>Jsonrpc</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getJSONRPCMessage()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface JSONRPCMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "anyOf": [
	 *     {"type": "integer"},
	 *     {"type": "string"},
	 *     {"type": "null"}
	 *   ],
	 *   "title": "Id"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getJSONRPCMessage_Id()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.JSONRPCMessage#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Jsonrpc</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": "2.0",
	 *   "const": "2.0",
	 *   "title": "Jsonrpc",
	 *   "type": "string"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jsonrpc</em>' attribute.
	 * @see #setJsonrpc(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getJSONRPCMessage_Jsonrpc()
	 * @model default="2.0"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getJsonrpc();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.JSONRPCMessage#getJsonrpc <em>Jsonrpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsonrpc</em>' attribute.
	 * @see #getJsonrpc()
	 * @generated
	 */
	void setJsonrpc(String value);

} // JSONRPCMessage
