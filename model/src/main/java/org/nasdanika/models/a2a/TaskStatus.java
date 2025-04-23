/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "TaskStatus",
 *   "type": "object",
 *   "properties": {
 *     "state": {"$ref": "#/$defs/TaskState"},
 *     "message": {
 *       "default": null,
 *       "anyOf": [
 *         {"$ref": "#/$defs/Message"},
 *         {"type": "null"}
 *       ]
 *     },
 *     "timestamp": {
 *       "format": "date-time",
 *       "title": "Timestamp",
 *       "type": "string"
 *     }
 *   },
 *   "required": ["state"]
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
 *   <li>{@link org.nasdanika.models.a2a.TaskStatus#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskStatus#getMessage <em>Message</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskStatus#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getTaskStatus()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface TaskStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.a2a.TaskState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {"$ref": "#/$defs/TaskState"}
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.nasdanika.models.a2a.TaskState
	 * @see #setState(TaskState)
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskStatus_State()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	TaskState getState();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskStatus#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.nasdanika.models.a2a.TaskState
	 * @see #getState()
	 * @generated
	 */
	void setState(TaskState value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"$ref": "#/$defs/Message"},
	 *     {"type": "null"}
	 *   ]
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Message)
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskStatus_Message()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskStatus#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "format": "date-time",
	 *   "title": "Timestamp",
	 *   "type": "string"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskStatus_Timestamp()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getTimestamp();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskStatus#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(String value);

} // TaskStatus
