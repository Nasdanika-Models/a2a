/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Artifact Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "TaskArtifactUpdateEvent",
 *   "type": "object",
 *   "properties": {
 *     "artifact": {"$ref": "#/$defs/Artifact"},
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
 *     "id": {
 *       "title": "Id",
 *       "type": "string"
 *     }
 *   },
 *   "required": [
 *     "id",
 *     "artifact"
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
 *   <li>{@link org.nasdanika.models.a2a.TaskArtifactUpdateEvent#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskArtifactUpdateEvent#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.TaskArtifactUpdateEvent#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getTaskArtifactUpdateEvent()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface TaskArtifactUpdateEvent extends SendTaskStreamingResponseResult {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {"$ref": "#/$defs/Artifact"}
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference.
	 * @see #setArtifact(Artifact)
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskArtifactUpdateEvent_Artifact()
	 * @model containment="true" required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Artifact getArtifact();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskArtifactUpdateEvent#getArtifact <em>Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' containment reference.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(Artifact value);

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
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskArtifactUpdateEvent_Metadata()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EObject getMetadata();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskArtifactUpdateEvent#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(EObject value);

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
	 * @see org.nasdanika.models.a2a.A2aPackage#getTaskArtifactUpdateEvent_Id()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.TaskArtifactUpdateEvent#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // TaskArtifactUpdateEvent
