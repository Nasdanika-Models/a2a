/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "Artifact",
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
 *     "lastChunk": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "boolean"},
 *         {"type": "null"}
 *       ],
 *       "title": "LastChunk"
 *     },
 *     "name": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Name"
 *     },
 *     "parts": {
 *       "title": "Parts",
 *       "type": "array",
 *       "items": {"$ref": "#/$defs/Part"}
 *     },
 *     "description": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Description"
 *     },
 *     "index": {
 *       "default": 0,
 *       "type": "integer",
 *       "title": "Index"
 *     },
 *     "append": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "boolean"},
 *         {"type": "null"}
 *       ],
 *       "title": "Append"
 *     }
 *   },
 *   "required": ["parts"]
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
 *   <li>{@link org.nasdanika.models.a2a.Artifact#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.Artifact#getLastChunk <em>Last Chunk</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.Artifact#getParts <em>Parts</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.Artifact#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.Artifact#getIndex <em>Index</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.Artifact#getAppend <em>Append</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getArtifact()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface Artifact extends EObject {
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
	 * @see org.nasdanika.models.a2a.A2aPackage#getArtifact_Metadata()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EObject getMetadata();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.Artifact#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(EObject value);

	/**
	 * Returns the value of the '<em><b>Last Chunk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"type": "boolean"},
	 *     {"type": "null"}
	 *   ],
	 *   "title": "LastChunk"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Chunk</em>' attribute.
	 * @see #setLastChunk(Boolean)
	 * @see org.nasdanika.models.a2a.A2aPackage#getArtifact_LastChunk()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Boolean getLastChunk();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.Artifact#getLastChunk <em>Last Chunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Chunk</em>' attribute.
	 * @see #getLastChunk()
	 * @generated
	 */
	void setLastChunk(Boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
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
	 *   "title": "Name"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getArtifact_Name()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.Artifact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.a2a.Part}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "title": "Parts",
	 *   "type": "array",
	 *   "items": {"$ref": "#/$defs/Part"}
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.nasdanika.models.a2a.A2aPackage#getArtifact_Parts()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	EList<Part> getParts();

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
	 * @see org.nasdanika.models.a2a.A2aPackage#getArtifact_Description()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.Artifact#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": 0,
	 *   "type": "integer",
	 *   "title": "Index"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(Integer)
	 * @see org.nasdanika.models.a2a.A2aPackage#getArtifact_Index()
	 * @model default="0"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Integer getIndex();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.Artifact#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Integer value);

	/**
	 * Returns the value of the '<em><b>Append</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"type": "boolean"},
	 *     {"type": "null"}
	 *   ],
	 *   "title": "Append"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Append</em>' attribute.
	 * @see #setAppend(Boolean)
	 * @see org.nasdanika.models.a2a.A2aPackage#getArtifact_Append()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	Boolean getAppend();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.Artifact#getAppend <em>Append</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append</em>' attribute.
	 * @see #getAppend()
	 * @generated
	 */
	void setAppend(Boolean value);

} // Artifact
