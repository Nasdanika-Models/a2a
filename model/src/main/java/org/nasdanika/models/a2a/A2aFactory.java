/**
 */
package org.nasdanika.models.a2a;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.a2a.A2aPackage
 * @generated
 */
public interface A2aFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	A2aFactory eINSTANCE = org.nasdanika.models.a2a.impl.A2aFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Unsupported Operation Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsupported Operation Error</em>'.
	 * @generated
	 */
	UnsupportedOperationError createUnsupportedOperationError();

	/**
	 * Returns a new object of class '<em>JSONRPC Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSONRPC Request</em>'.
	 * @generated
	 */
	JSONRPCRequest createJSONRPCRequest();

	/**
	 * Returns a new object of class '<em>Task Status Update Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Status Update Event</em>'.
	 * @generated
	 */
	TaskStatusUpdateEvent createTaskStatusUpdateEvent();

	/**
	 * Returns a new object of class '<em>Authentication Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Info</em>'.
	 * @generated
	 */
	AuthenticationInfo createAuthenticationInfo();

	/**
	 * Returns a new object of class '<em>Send Task Streaming Response Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Task Streaming Response Result</em>'.
	 * @generated
	 */
	SendTaskStreamingResponseResult createSendTaskStreamingResponseResult();

	/**
	 * Returns a new object of class '<em>Send Task Streaming Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Task Streaming Response</em>'.
	 * @generated
	 */
	SendTaskStreamingResponse createSendTaskStreamingResponse();

	/**
	 * Returns a new object of class '<em>Task Push Notification Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Push Notification Config</em>'.
	 * @generated
	 */
	TaskPushNotificationConfig createTaskPushNotificationConfig();

	/**
	 * Returns a new object of class '<em>Agent Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Card</em>'.
	 * @generated
	 */
	AgentCard createAgentCard();

	/**
	 * Returns a new object of class '<em>Agent Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Capabilities</em>'.
	 * @generated
	 */
	AgentCapabilities createAgentCapabilities();

	/**
	 * Returns a new object of class '<em>Send Task Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Task Request</em>'.
	 * @generated
	 */
	SendTaskRequest createSendTaskRequest();

	/**
	 * Returns a new object of class '<em>JSON Parse Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSON Parse Error</em>'.
	 * @generated
	 */
	JSONParseError createJSONParseError();

	/**
	 * Returns a new object of class '<em>Data Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Part</em>'.
	 * @generated
	 */
	DataPart createDataPart();

	/**
	 * Returns a new object of class '<em>Invalid Request Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Request Error</em>'.
	 * @generated
	 */
	InvalidRequestError createInvalidRequestError();

	/**
	 * Returns a new object of class '<em>A2A Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A2A Request</em>'.
	 * @generated
	 */
	A2ARequest createA2ARequest();

	/**
	 * Returns a new object of class '<em>Task Not Found Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Not Found Error</em>'.
	 * @generated
	 */
	TaskNotFoundError createTaskNotFoundError();

	/**
	 * Returns a new object of class '<em>JSONRPC Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSONRPC Response</em>'.
	 * @generated
	 */
	JSONRPCResponse createJSONRPCResponse();

	/**
	 * Returns a new object of class '<em>File Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Part</em>'.
	 * @generated
	 */
	FilePart createFilePart();

	/**
	 * Returns a new object of class '<em>Task Query Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Query Params</em>'.
	 * @generated
	 */
	TaskQueryParams createTaskQueryParams();

	/**
	 * Returns a new object of class '<em>Push Notification Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Notification Config</em>'.
	 * @generated
	 */
	PushNotificationConfig createPushNotificationConfig();

	/**
	 * Returns a new object of class '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part</em>'.
	 * @generated
	 */
	Part createPart();

	/**
	 * Returns a new object of class '<em>Internal Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Error</em>'.
	 * @generated
	 */
	InternalError createInternalError();

	/**
	 * Returns a new object of class '<em>Agent Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Authentication</em>'.
	 * @generated
	 */
	AgentAuthentication createAgentAuthentication();

	/**
	 * Returns a new object of class '<em>Push Notification Not Supported Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Notification Not Supported Error</em>'.
	 * @generated
	 */
	PushNotificationNotSupportedError createPushNotificationNotSupportedError();

	/**
	 * Returns a new object of class '<em>Get Task Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Task Request</em>'.
	 * @generated
	 */
	GetTaskRequest createGetTaskRequest();

	/**
	 * Returns a new object of class '<em>Agent Skill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Skill</em>'.
	 * @generated
	 */
	AgentSkill createAgentSkill();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Send Task Streaming Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Task Streaming Request</em>'.
	 * @generated
	 */
	SendTaskStreamingRequest createSendTaskStreamingRequest();

	/**
	 * Returns a new object of class '<em>Get Task Push Notification Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Task Push Notification Request</em>'.
	 * @generated
	 */
	GetTaskPushNotificationRequest createGetTaskPushNotificationRequest();

	/**
	 * Returns a new object of class '<em>JSONRPC Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSONRPC Error</em>'.
	 * @generated
	 */
	JSONRPCError createJSONRPCError();

	/**
	 * Returns a new object of class '<em>Invalid Params Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Params Error</em>'.
	 * @generated
	 */
	InvalidParamsError createInvalidParamsError();

	/**
	 * Returns a new object of class '<em>Cancel Task Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cancel Task Response</em>'.
	 * @generated
	 */
	CancelTaskResponse createCancelTaskResponse();

	/**
	 * Returns a new object of class '<em>Send Task Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Task Response</em>'.
	 * @generated
	 */
	SendTaskResponse createSendTaskResponse();

	/**
	 * Returns a new object of class '<em>Set Task Push Notification Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Task Push Notification Request</em>'.
	 * @generated
	 */
	SetTaskPushNotificationRequest createSetTaskPushNotificationRequest();

	/**
	 * Returns a new object of class '<em>Text Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Part</em>'.
	 * @generated
	 */
	TextPart createTextPart();

	/**
	 * Returns a new object of class '<em>Get Task Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Task Response</em>'.
	 * @generated
	 */
	GetTaskResponse createGetTaskResponse();

	/**
	 * Returns a new object of class '<em>Task Send Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Send Params</em>'.
	 * @generated
	 */
	TaskSendParams createTaskSendParams();

	/**
	 * Returns a new object of class '<em>Task Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Status</em>'.
	 * @generated
	 */
	TaskStatus createTaskStatus();

	/**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
	Artifact createArtifact();

	/**
	 * Returns a new object of class '<em>Set Task Push Notification Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Task Push Notification Response</em>'.
	 * @generated
	 */
	SetTaskPushNotificationResponse createSetTaskPushNotificationResponse();

	/**
	 * Returns a new object of class '<em>File Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Content</em>'.
	 * @generated
	 */
	FileContent createFileContent();

	/**
	 * Returns a new object of class '<em>Method Not Found Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Not Found Error</em>'.
	 * @generated
	 */
	MethodNotFoundError createMethodNotFoundError();

	/**
	 * Returns a new object of class '<em>Task Resubscription Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Resubscription Request</em>'.
	 * @generated
	 */
	TaskResubscriptionRequest createTaskResubscriptionRequest();

	/**
	 * Returns a new object of class '<em>JSONRPC Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSONRPC Message</em>'.
	 * @generated
	 */
	JSONRPCMessage createJSONRPCMessage();

	/**
	 * Returns a new object of class '<em>Task Id Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Id Params</em>'.
	 * @generated
	 */
	TaskIdParams createTaskIdParams();

	/**
	 * Returns a new object of class '<em>Task Not Cancelable Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Not Cancelable Error</em>'.
	 * @generated
	 */
	TaskNotCancelableError createTaskNotCancelableError();

	/**
	 * Returns a new object of class '<em>Cancel Task Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cancel Task Request</em>'.
	 * @generated
	 */
	CancelTaskRequest createCancelTaskRequest();

	/**
	 * Returns a new object of class '<em>Get Task Push Notification Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Task Push Notification Response</em>'.
	 * @generated
	 */
	GetTaskPushNotificationResponse createGetTaskPushNotificationResponse();

	/**
	 * Returns a new object of class '<em>Task Artifact Update Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Artifact Update Event</em>'.
	 * @generated
	 */
	TaskArtifactUpdateEvent createTaskArtifactUpdateEvent();

	/**
	 * Returns a new object of class '<em>Agent Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Provider</em>'.
	 * @generated
	 */
	AgentProvider createAgentProvider();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	A2aPackage getA2aPackage();

} //A2aFactory
