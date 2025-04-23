/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Push Notification Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "TaskPushNotificationConfig",
 *   "type": "object",
 *   "properties": {
 *     "id": {
 *       "title": "Id",
 *       "type": "string"
 *     },
 *     "pushNotificationConfig": {"$ref": "#/$defs/PushNotificationConfig"}
 *   },
 *   "required": [
 *     "id",
 *     "pushNotificationConfig"
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
 *   <li>{@link org.nasdanika.models.a2a.TaskPushNotificationConfig#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskPushNotificationConfig#getPushNotificationConfig <em>Push Notification Config</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getTaskPushNotificationConfig()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface TaskPushNotificationConfig extends EObject {
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
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskPushNotificationConfig_Id()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskPushNotificationConfig#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Push Notification Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {"$ref": "#/$defs/PushNotificationConfig"}
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Push Notification Config</em>' containment reference.
	 * @see #setPushNotificationConfig(PushNotificationConfig)
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskPushNotificationConfig_PushNotificationConfig()
	 * @model containment="true" required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	PushNotificationConfig getPushNotificationConfig();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskPushNotificationConfig#getPushNotificationConfig <em>Push Notification Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Push Notification Config</em>' containment reference.
	 * @see #getPushNotificationConfig()
	 * @generated
	 */
	void setPushNotificationConfig(PushNotificationConfig value);

} // TaskPushNotificationConfig
