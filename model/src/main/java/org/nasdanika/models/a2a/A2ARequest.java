/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A2A Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "oneOf": [
 *     {"$ref": "#/$defs/SendTaskRequest"},
 *     {"$ref": "#/$defs/GetTaskRequest"},
 *     {"$ref": "#/$defs/CancelTaskRequest"},
 *     {"$ref": "#/$defs/SetTaskPushNotificationRequest"},
 *     {"$ref": "#/$defs/GetTaskPushNotificationRequest"},
 *     {"$ref": "#/$defs/TaskResubscriptionRequest"}
 *   ],
 *   "title": "A2ARequest"
 * }
 * ```
 * 
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getA2ARequest()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface A2ARequest extends EObject {
} // A2ARequest
