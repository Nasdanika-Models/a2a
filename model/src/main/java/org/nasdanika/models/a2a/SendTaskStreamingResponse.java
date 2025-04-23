/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Task Streaming Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ## Specification
 * 
 * ```json
 * {
 *   "title": "SendTaskStreamingResponse",
 *   "type": "object",
 *   "properties": {
 *     "result": {
 *       "default": null,
 *       "anyOf": [
 *         {"$ref": "#/$defs/TaskStatusUpdateEvent"},
 *         {"$ref": "#/$defs/TaskArtifactUpdateEvent"},
 *         {"type": "null"}
 *       ]
 *     },
 *     "id": {
 *       "anyOf": [
 *         {"type": "integer"},
 *         {"type": "string"},
 *         {"type": "null"}
 *       ],
 *       "title": "Id"
 *     },
 *     "jsonrpc": {
 *       "default": "2.0",
 *       "const": "2.0",
 *       "title": "Jsonrpc",
 *       "type": "string"
 *     },
 *     "error": {
 *       "default": null,
 *       "anyOf": [
 *         {"$ref": "#/$defs/JSONRPCError"},
 *         {"type": "null"}
 *       ]
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
 *   <li>{@link org.nasdanika.models.a2a.SendTaskStreamingResponse#getResult <em>Result</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.SendTaskStreamingResponse#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.SendTaskStreamingResponse#getJsonrpc <em>Jsonrpc</em>}</li>
 *   <li>{@link org.nasdanika.models.a2a.SendTaskStreamingResponse#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.a2a.A2aPackage#getSendTaskStreamingResponse()
 * @model annotation="urn:org.nasdanika generated='true'"
 * @generated
 */
public interface SendTaskStreamingResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"$ref": "#/$defs/TaskStatusUpdateEvent"},
	 *     {"$ref": "#/$defs/TaskArtifactUpdateEvent"},
	 *     {"type": "null"}
	 *   ]
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(SendTaskStreamingResponseResult)
	 * @see org.nasdanika.models.a2a.A2aPackage#getSendTaskStreamingResponse_Result()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	SendTaskStreamingResponseResult getResult();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.SendTaskStreamingResponse#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(SendTaskStreamingResponseResult value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "anyOf": [
	 *     {"type": "integer"},
	 *     {"type": "string"},
	 *     {"type": "null"}
	 *   ],
	 *   "title": "Id"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getSendTaskStreamingResponse_Id()
	 * @model annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.SendTaskStreamingResponse#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Jsonrpc</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": "2.0",
	 *   "const": "2.0",
	 *   "title": "Jsonrpc",
	 *   "type": "string"
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jsonrpc</em>' attribute.
	 * @see #setJsonrpc(String)
	 * @see org.nasdanika.models.a2a.A2aPackage#getSendTaskStreamingResponse_Jsonrpc()
	 * @model default="2.0"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	String getJsonrpc();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.SendTaskStreamingResponse#getJsonrpc <em>Jsonrpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsonrpc</em>' attribute.
	 * @see #getJsonrpc()
	 * @generated
	 */
	void setJsonrpc(String value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ## Specification
	 * 
	 * ```json
	 * {
	 *   "default": null,
	 *   "anyOf": [
	 *     {"$ref": "#/$defs/JSONRPCError"},
	 *     {"type": "null"}
	 *   ]
	 * }
	 * ```
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' containment reference.
	 * @see #setError(JSONRPCError)
	 * @see org.nasdanika.models.a2a.A2aPackage#getSendTaskStreamingResponse_Error()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika generated='true'"
	 * @generated
	 */
	JSONRPCError getError();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.a2a.SendTaskStreamingResponse#getError <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' containment reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(JSONRPCError value);

} // SendTaskStreamingResponse
