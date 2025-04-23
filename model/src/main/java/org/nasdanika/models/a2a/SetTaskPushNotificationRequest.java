/**
 */
package org.nasdanika.models.a2a;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Task Push Notification Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "SetTaskPushNotificationRequest",
 *   "type": "object",
 *   "properties": {
 *     "method": {
 *       "default": "tasks/pushNotification/set",
 *       "const": "tasks/pushNotification/set",
 *       "title": "Method",
 *       "type": "string"
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
 *     "params": {"$ref": "#/$defs/TaskPushNotificationConfig"}
 *   },
 *   "required": [
 *     "method",
 *     "params"
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
 *   <li>{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getMethod <em>Method</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getJsonrpc <em>Jsonrpc</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getSetTaskPushNotificationRequest()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface SetTaskPushNotificationRequest extends A2ARequest {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The default value is <code>"tasks/pushNotification/set"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": "tasks/pushNotification/set",
	 *   "const": "tasks/pushNotification/set",
	 *   "title": "Method",
	 *   "type": "string"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getSetTaskPushNotificationRequest_Method()
	 * @model default="tasks/pushNotification/set" required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

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
	 * @see org.nasdanika.models.a2a.A2aPackage#getSetTaskPushNotificationRequest_Id()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getId <em>Id</em>}' attribute.
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
	 * @see org.nasdanika.models.a2a.A2aPackage#getSetTaskPushNotificationRequest_Jsonrpc()
	 * @model default="2.0"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getJsonrpc();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getJsonrpc <em>Jsonrpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsonrpc</em>' attribute.
	 * @see #getJsonrpc()
	 * @generated
	 */
	void setJsonrpc(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {"$ref": "#/$defs/TaskPushNotificationConfig"}
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Params</em>' containment reference.
	 * @see #setParams(TaskPushNotificationConfig)
	 * @see org.nasdanika.models.a2a.A2aPackage#getSetTaskPushNotificationRequest_Params()
	 * @model containment="true" required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	TaskPushNotificationConfig getParams();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(TaskPushNotificationConfig value);

} // SetTaskPushNotificationRequest
