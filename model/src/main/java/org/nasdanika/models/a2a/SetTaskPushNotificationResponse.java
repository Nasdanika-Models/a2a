/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Task Push Notification Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "SetTaskPushNotificationResponse",
 *   "type": "object",
 *   "properties": {
 *     "result": {
 *       "default": null,
 *       "anyOf": [
 *         {"$ref": "#/$defs/TaskPushNotificationConfig"},
 *         {"type": "null"}
 *       ]
 *     },
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
 *     },
 *     "error": {
 *       "default": null,
 *       "anyOf": [
 *         {"$ref": "#/$defs/JSONRPCError"},
 *         {"type": "null"}
 *       ]
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
 *   <li>{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getResult <em>Result</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getJsonrpc <em>Jsonrpc</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getSetTaskPushNotificationResponse()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface SetTaskPushNotificationResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"$ref": "#/$defs/TaskPushNotificationConfig"},
	 *     {"type": "null"}
	 *   ]
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(TaskPushNotificationConfig)
	 * @see org.nasdanika.models.a2a.A2aPackage#getSetTaskPushNotificationResponse_Result()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	TaskPushNotificationConfig getResult();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(TaskPushNotificationConfig value);

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
	 * @see org.nasdanika.models.a2a.A2aPackage#getSetTaskPushNotificationResponse_Id()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getId <em>Id</em>}' attribute.
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
	 * @see org.nasdanika.models.a2a.A2aPackage#getSetTaskPushNotificationResponse_Jsonrpc()
	 * @model default="2.0"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getJsonrpc();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getJsonrpc <em>Jsonrpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsonrpc</em>' attribute.
	 * @see #getJsonrpc()
	 * @generated
	 */
	void setJsonrpc(String value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"$ref": "#/$defs/JSONRPCError"},
	 *     {"type": "null"}
	 *   ]
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' containment reference.
	 * @see #setError(JSONRPCError)
	 * @see org.nasdanika.models.a2a.A2aPackage#getSetTaskPushNotificationResponse_Error()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	JSONRPCError getError();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse#getError <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' containment reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(JSONRPCError value);

} // SetTaskPushNotificationResponse
