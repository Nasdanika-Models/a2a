/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push Notification Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "PushNotificationConfig",
 *   "type": "object",
 *   "properties": {
 *     "url": {
 *       "title": "Url",
 *       "type": "string"
 *     },
 *     "token": {
 *       "anyOf": [
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Token"
 *     },
 *     "authentication": {
 *       "default": null,
 *       "anyOf": [
 *         {"$ref": "#/$defs/AuthenticationInfo"},
 *         {"type": "null"}
 *       ]
 *     }
 *   },
 *   "required": ["url"]
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
 *   <li>{@link org.nasdanika.models.a2a.PushNotificationConfig#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.PushNotificationConfig#getToken <em>Token</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.PushNotificationConfig#getAuthentication <em>Authentication</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getPushNotificationConfig()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface PushNotificationConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "title": "Url",
	 *   "type": "string"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getPushNotificationConfig_Url()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.PushNotificationConfig#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "anyOf": [
	 *     {"type": "string"},
	 *     {"type": "null"}
	 *   ],
	 *   "title": "Token"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getPushNotificationConfig_Token()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.PushNotificationConfig#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"$ref": "#/$defs/AuthenticationInfo"},
	 *     {"type": "null"}
	 *   ]
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(AuthenticationInfo)
	 * @see org.nasdanika.models.a2a.A2aPackage#getPushNotificationConfig_Authentication()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	AuthenticationInfo getAuthentication();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.PushNotificationConfig#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(AuthenticationInfo value);

} // PushNotificationConfig
