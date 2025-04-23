/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "AgentSkill",
 *   "type": "object",
 *   "properties": {
 *     "inputModes": {
 *       "default": null,
 *       "anyOf": [
 *         {
 *           "type": "array",
 *           "items": {"type": "string"}
 *         },
 *         {"type": "null"}
 *       ],
 *       "title": "Inputmodes"
 *     },
 *     "outputModes": {
 *       "default": null,
 *       "anyOf": [
 *         {
 *           "type": "array",
 *           "items": {"type": "string"}
 *         },
 *         {"type": "null"}
 *       ],
 *       "title": "Outputmodes"
 *     },
 *     "examples": {
 *       "default": null,
 *       "anyOf": [
 *         {
 *           "type": "array",
 *           "items": {"type": "string"}
 *         },
 *         {"type": "null"}
 *       ],
 *       "title": "Examples"
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
 *     "id": {
 *       "title": "Id",
 *       "type": "string"
 *     },
 *     "tags": {
 *       "default": null,
 *       "anyOf": [
 *         {
 *           "type": "array",
 *           "items": {"type": "string"}
 *         },
 *         {"type": "null"}
 *       ],
 *       "title": "Tags"
 *     }
 *   },
 *   "required": [
 *     "id",
 *     "name"
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
 *   <li>{@link org.nasdanika.models.a2a.AgentSkill#getInputModes <em>Input Modes</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentSkill#getOutputModes <em>Output Modes</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentSkill#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentSkill#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentSkill#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentSkill#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.AgentSkill#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getAgentSkill()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface AgentSkill extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
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
	 *       "type": "array",
	 *       "items": {"type": "string"}
	 *     },
	 *     {"type": "null"}
	 *   ],
	 *   "title": "Inputmodes"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Modes</em>' attribute list.
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentSkill_InputModes()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EList<String> getInputModes();

	/**
	 * Returns the value of the '<em><b>Output Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
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
	 *       "type": "array",
	 *       "items": {"type": "string"}
	 *     },
	 *     {"type": "null"}
	 *   ],
	 *   "title": "Outputmodes"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Modes</em>' attribute list.
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentSkill_OutputModes()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EList<String> getOutputModes();

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
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
	 *       "type": "array",
	 *       "items": {"type": "string"}
	 *     },
	 *     {"type": "null"}
	 *   ],
	 *   "title": "Examples"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Examples</em>' attribute list.
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentSkill_Examples()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EList<String> getExamples();

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
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentSkill_Name()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentSkill#getName <em>Name</em>}' attribute.
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
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentSkill_Description()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentSkill#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentSkill_Id()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.AgentSkill#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
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
	 *       "type": "array",
	 *       "items": {"type": "string"}
	 *     },
	 *     {"type": "null"}
	 *   ],
	 *   "title": "Tags"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see org.nasdanika.models.a2a.A2aPackage#getAgentSkill_Tags()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EList<String> getTags();

} // AgentSkill
