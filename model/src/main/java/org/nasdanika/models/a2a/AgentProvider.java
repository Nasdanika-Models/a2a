/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "AgentProvider",
 *   "type": "object",
 *   "properties": {
 *     "organization": {
 *       "title": "Organization",
 *       "type": "string"
 *     },
 *     "url": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Url"
 *     }
 *   },
 *   "required": ["organization"]
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
 *   <li>{@link org.nasdanika.models.a2a.AgentProvider#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentProvider#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getAgentProvider()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface AgentProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "title": "Organization",
	 *   "type": "string"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' attribute.
	 * @see #setOrganization(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentProvider_Organization()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getOrganization();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentProvider#getOrganization <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' attribute.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"type": "string"},
	 *     {"type": "null"}
	 *   ],
	 *   "title": "Url"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentProvider_Url()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentProvider#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // AgentProvider
