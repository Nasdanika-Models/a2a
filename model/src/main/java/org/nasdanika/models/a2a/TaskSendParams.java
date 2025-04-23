/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Send Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "TaskSendParams",
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
 *     "historyLength": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "integer"},
 *         {"type": "null"}
 *       ],
 *       "title": "HistoryLength"
 *     },
 *     "id": {
 *       "title": "Id",
 *       "type": "string"
 *     },
 *     "sessionId": {
 *       "title": "Sessionid",
 *       "type": "string"
 *     },
 *     "message": {"$ref": "#/$defs/Message"},
 *     "pushNotification": {
 *       "default": null,
 *       "anyOf": [
 *         {"$ref": "#/$defs/PushNotificationConfig"},
 *         {"type": "null"}
 *       ]
 *     }
 *   },
 *   "required": [
 *     "id",
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
 *   <li>{@link org.nasdanika.models.a2a.TaskSendParams#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskSendParams#getHistoryLength <em>History Length</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskSendParams#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskSendParams#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskSendParams#getMessage <em>Message</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskSendParams#getPushNotification <em>Push Notification</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getTaskSendParams()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface TaskSendParams extends EObject {
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
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskSendParams_Metadata()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EObject getMetadata();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskSendParams#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(EObject value);

	/**
	 * Returns the value of the '<em><b>History Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"type": "integer"},
	 *     {"type": "null"}
	 *   ],
	 *   "title": "HistoryLength"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>History Length</em>' attribute.
	 * @see #setHistoryLength(Integer)
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskSendParams_HistoryLength()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Integer getHistoryLength();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskSendParams#getHistoryLength <em>History Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Length</em>' attribute.
	 * @see #getHistoryLength()
	 * @generated
	 */
	void setHistoryLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "title": "Id",
	 *   "type": "string"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskSendParams_Id()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskSendParams#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "title": "Sessionid",
	 *   "type": "string"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Id</em>' attribute.
	 * @see #setSessionId(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskSendParams_SessionId()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getSessionId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskSendParams#getSessionId <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Id</em>' attribute.
	 * @see #getSessionId()
	 * @generated
	 */
	void setSessionId(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {"$ref": "#/$defs/Message"}
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Message)
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskSendParams_Message()
	 * @model containment="true" required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskSendParams#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Push Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"$ref": "#/$defs/PushNotificationConfig"},
	 *     {"type": "null"}
	 *   ]
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Push Notification</em>' containment reference.
	 * @see #setPushNotification(PushNotificationConfig)
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskSendParams_PushNotification()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	PushNotificationConfig getPushNotification();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskSendParams#getPushNotification <em>Push Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Push Notification</em>' containment reference.
	 * @see #getPushNotification()
	 * @generated
	 */
	void setPushNotification(PushNotificationConfig value);

} // TaskSendParams
