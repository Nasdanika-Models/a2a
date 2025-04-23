/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "AgentCard",
 *   "type": "object",
 *   "properties": {
 *     "skills": {
 *       "title": "Skills",
 *       "type": "array",
 *       "items": {"$ref": "#/$defs/AgentSkill"}
 *     },
 *     "documentationUrl": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Documentationurl"
 *     },
 *     "capabilities": {"$ref": "#/$defs/AgentCapabilities"},
 *     "provider": {
 *       "default": null,
 *       "anyOf": [
 *         {"$ref": "#/$defs/AgentProvider"},
 *         {"type": "null"}
 *       ]
 *     },
 *     "defaultOutputModes": {
 *       "default": ["text"],
 *       "title": "Defaultoutputmodes",
 *       "type": "array",
 *       "items": {"type": "string"}
 *     },
 *     "name": {
 *       "title": "Name",
 *       "type": "string"
 *     },
 *     "description": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Description"
 *     },
 *     "version": {
 *       "title": "Version",
 *       "type": "string"
 *     },
 *     "defaultInputModes": {
 *       "default": ["text"],
 *       "title": "Defaultinputmodes",
 *       "type": "array",
 *       "items": {"type": "string"}
 *     },
 *     "url": {
 *       "title": "Url",
 *       "type": "string"
 *     },
 *     "authentication": {
 *       "default": null,
 *       "anyOf": [
 *         {"$ref": "#/$defs/AgentAuthentication"},
 *         {"type": "null"}
 *       ]
 *     }
 *   },
 *   "required": [
 *     "name",
 *     "url",
 *     "version",
 *     "capabilities",
 *     "skills"
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
 *   <li>{@link org.nasdanika.models.a2a.AgentCard#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentCard#getDocumentationUrl <em>Documentation Url</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentCard#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentCard#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentCard#getDefaultOutputModes <em>Default Output Modes</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentCard#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentCard#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentCard#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentCard#getDefaultInputModes <em>Default Input Modes</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentCard#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentCard#getAuthentication <em>Authentication</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCard()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface AgentCard extends EObject {
	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.a2a.AgentSkill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "title": "Skills",
	 *   "type": "array",
	 *   "items": {"$ref": "#/$defs/AgentSkill"}
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCard_Skills()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EList<AgentSkill> getSkills();

	/**
	 * Returns the value of the '<em><b>Documentation Url</b></em>' attribute.
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
	 *   "title": "Documentationurl"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation Url</em>' attribute.
	 * @see #setDocumentationUrl(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCard_DocumentationUrl()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getDocumentationUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentCard#getDocumentationUrl <em>Documentation Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation Url</em>' attribute.
	 * @see #getDocumentationUrl()
	 * @generated
	 */
	void setDocumentationUrl(String value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {"$ref": "#/$defs/AgentCapabilities"}
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference.
	 * @see #setCapabilities(AgentCapabilities)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCard_Capabilities()
	 * @model containment="true" required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	AgentCapabilities getCapabilities();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentCard#getCapabilities <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' containment reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(AgentCapabilities value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"$ref": "#/$defs/AgentProvider"},
	 *     {"type": "null"}
	 *   ]
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(AgentProvider)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCard_Provider()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	AgentProvider getProvider();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentCard#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(AgentProvider value);

	/**
	 * Returns the value of the '<em><b>Default Output Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": ["text"],
	 *   "title": "Defaultoutputmodes",
	 *   "type": "array",
	 *   "items": {"type": "string"}
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Output Modes</em>' attribute list.
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCard_DefaultOutputModes()
	 * @model default="[\"text\"]"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EList<String> getDefaultOutputModes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "title": "Name",
	 *   "type": "string"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCard_Name()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentCard#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
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
	 *   "title": "Description"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCard_Description()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentCard#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "title": "Version",
	 *   "type": "string"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCard_Version()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentCard#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Default Input Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": ["text"],
	 *   "title": "Defaultinputmodes",
	 *   "type": "array",
	 *   "items": {"type": "string"}
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Input Modes</em>' attribute list.
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCard_DefaultInputModes()
	 * @model default="[\"text\"]"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EList<String> getDefaultInputModes();

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
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCard_Url()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentCard#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

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
	 *     {"$ref": "#/$defs/AgentAuthentication"},
	 *     {"type": "null"}
	 *   ]
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(AgentAuthentication)
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentCard_Authentication()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	AgentAuthentication getAuthentication();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentCard#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(AgentAuthentication value);

} // AgentCard
