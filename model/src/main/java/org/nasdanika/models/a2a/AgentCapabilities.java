/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "AgentCapabilities",
 *   "type": "object",
 *   "properties": {
 *     "streaming": {
 *       "default": false,
 *       "title": "Streaming",
 *       "type": "boolean"
 *     },
 *     "pushNotifications": {
 *       "default": false,
 *       "title": "PushNotifications",
 *       "type": "boolean"
 *     },
 *     "stateTransitionHistory": {
 *       "default": false,
 *       "title": "Statetransitionhistory",
 *       "type": "boolean"
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
 *   <li>{@link org.nasdanika.models.a2a.AgentCapabilities#getStreaming <em>Streaming</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentCapabilities#getPushNotifications <em>Push Notifications</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentCapabilities#getStateTransitionHistory <em>State Transition History</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCapabilities()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface AgentCapabilities extends EObject {
	/**
	 * Returns the value of the '<em><b>Streaming</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": false,
	 *   "title": "Streaming",
	 *   "type": "boolean"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Streaming</em>' attribute.
	 * @see #setStreaming(Boolean)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCapabilities_Streaming()
	 * @model default="false"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Boolean getStreaming();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentCapabilities#getStreaming <em>Streaming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Streaming</em>' attribute.
	 * @see #getStreaming()
	 * @generated
	 */
	void setStreaming(Boolean value);

	/**
	 * Returns the value of the '<em><b>Push Notifications</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": false,
	 *   "title": "PushNotifications",
	 *   "type": "boolean"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Push Notifications</em>' attribute.
	 * @see #setPushNotifications(Boolean)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCapabilities_PushNotifications()
	 * @model default="false"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Boolean getPushNotifications();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentCapabilities#getPushNotifications <em>Push Notifications</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Push Notifications</em>' attribute.
	 * @see #getPushNotifications()
	 * @generated
	 */
	void setPushNotifications(Boolean value);

	/**
	 * Returns the value of the '<em><b>State Transition History</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": false,
	 *   "title": "Statetransitionhistory",
	 *   "type": "boolean"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Transition History</em>' attribute.
	 * @see #setStateTransitionHistory(Boolean)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCapabilities_StateTransitionHistory()
	 * @model default="false"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Boolean getStateTransitionHistory();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentCapabilities#getStateTransitionHistory <em>State Transition History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Transition History</em>' attribute.
	 * @see #getStateTransitionHistory()
	 * @generated
	 */
	void setStateTransitionHistory(Boolean value);

} // AgentCapabilities
