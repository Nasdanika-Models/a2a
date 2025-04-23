/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Status Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "TaskStatusUpdateEvent",
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
 *     "final": {
 *       "default": false,
 *       "title": "Final",
 *       "type": "boolean"
 *     },
 *     "id": {
 *       "title": "Id",
 *       "type": "string"
 *     },
 *     "status": {"$ref": "#/$defs/TaskStatus"}
 *   },
 *   "required": [
 *     "id",
 *     "status"
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
 *   <li>{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent#getFinal <em>Final</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getTaskStatusUpdateEvent()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface TaskStatusUpdateEvent extends SendTaskStreamingResponseResult {
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
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskStatusUpdateEvent_Metadata()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EObject getMetadata();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(EObject value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": false,
	 *   "title": "Final",
	 *   "type": "boolean"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(Boolean)
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskStatusUpdateEvent_Final()
	 * @model default="false"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Boolean getFinal();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent#getFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(Boolean value);

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
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskStatusUpdateEvent_Id()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {"$ref": "#/$defs/TaskStatus"}
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(TaskStatus)
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskStatusUpdateEvent_Status()
	 * @model containment="true" required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	TaskStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(TaskStatus value);

} // TaskStatusUpdateEvent
