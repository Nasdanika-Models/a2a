/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the content of a file, either as base64 encoded bytes or a URI.
 * 
 * Ensures that either 'bytes' or 'uri' is provided, but not both.
 * 
 * ## Specification
 * 
 * ```json
 * {
 *   "description": "Represents the content of a file, either as base64 encoded bytes or a URI.\n\nEnsures that either 'bytes' or 'uri' is provided, but not both.",
 *   "title": "FileContent",
 *   "type": "object",
 *   "properties": {
 *     "bytes": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Bytes"
 *     },
 *     "name": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Name"
 *     },
 *     "mimeType": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Mimetype"
 *     },
 *     "uri": {
 *       "default": null,
 *       "anyOf": [
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Uri"
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
 *   <li>{@link org.nasdanika.models.a2a.FileContent#getBytes <em>Bytes</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.FileContent#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.FileContent#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.FileContent#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getFileContent()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface FileContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Bytes</b></em>' attribute.
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
	 *   "title": "Bytes"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bytes</em>' attribute.
	 * @see #setBytes(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getFileContent_Bytes()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getBytes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.FileContent#getBytes <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes</em>' attribute.
	 * @see #getBytes()
	 * @generated
	 */
	void setBytes(String value);

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
	 * @see org.nasdanika.models.a2a.A2aPackage#getFileContent_Name()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.FileContent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
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
	 *   "title": "Mimetype"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getFileContent_MimeType()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.FileContent#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
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
	 *   "title": "Uri"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getFileContent_Uri()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.FileContent#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // FileContent
