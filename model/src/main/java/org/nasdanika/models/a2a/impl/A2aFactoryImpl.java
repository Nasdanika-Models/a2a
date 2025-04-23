/**
 */
package org.nasdanika.models.a2a.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.a2a.A2ARequest;
import org.nasdanika.models.a2a.A2aFactory;
import org.nasdanika.models.a2a.A2aPackage;
import org.nasdanika.models.a2a.AgentAuthentication;
import org.nasdanika.models.a2a.AgentCapabilities;
import org.nasdanika.models.a2a.AgentCard;
import org.nasdanika.models.a2a.AgentProvider;
import org.nasdanika.models.a2a.AgentSkill;
import org.nasdanika.models.a2a.Artifact;
import org.nasdanika.models.a2a.AuthenticationInfo;
import org.nasdanika.models.a2a.CancelTaskRequest;
import org.nasdanika.models.a2a.CancelTaskResponse;
import org.nasdanika.models.a2a.DataPart;
import org.nasdanika.models.a2a.FileContent;
import org.nasdanika.models.a2a.FilePart;
import org.nasdanika.models.a2a.GetTaskPushNotificationRequest;
import org.nasdanika.models.a2a.GetTaskPushNotificationResponse;
import org.nasdanika.models.a2a.GetTaskRequest;
import org.nasdanika.models.a2a.GetTaskResponse;
import org.nasdanika.models.a2a.InvalidParamsError;
import org.nasdanika.models.a2a.InvalidRequestError;
import org.nasdanika.models.a2a.JSONParseError;
import org.nasdanika.models.a2a.JSONRPCError;
import org.nasdanika.models.a2a.JSONRPCMessage;
import org.nasdanika.models.a2a.JSONRPCRequest;
import org.nasdanika.models.a2a.JSONRPCResponse;
import org.nasdanika.models.a2a.Message;
import org.nasdanika.models.a2a.MethodNotFoundError;
import org.nasdanika.models.a2a.Part;
import org.nasdanika.models.a2a.PushNotificationConfig;
import org.nasdanika.models.a2a.PushNotificationNotSupportedError;
import org.nasdanika.models.a2a.SendTaskRequest;
import org.nasdanika.models.a2a.SendTaskResponse;
import org.nasdanika.models.a2a.SendTaskStreamingRequest;
import org.nasdanika.models.a2a.SendTaskStreamingResponse;
import org.nasdanika.models.a2a.SendTaskStreamingResponseResult;
import org.nasdanika.models.a2a.SetTaskPushNotificationRequest;
import org.nasdanika.models.a2a.SetTaskPushNotificationResponse;
import org.nasdanika.models.a2a.Task;
import org.nasdanika.models.a2a.TaskArtifactUpdateEvent;
import org.nasdanika.models.a2a.TaskIdParams;
import org.nasdanika.models.a2a.TaskNotCancelableError;
import org.nasdanika.models.a2a.TaskNotFoundError;
import org.nasdanika.models.a2a.TaskPushNotificationConfig;
import org.nasdanika.models.a2a.TaskQueryParams;
import org.nasdanika.models.a2a.TaskResubscriptionRequest;
import org.nasdanika.models.a2a.TaskSendParams;
import org.nasdanika.models.a2a.TaskState;
import org.nasdanika.models.a2a.TaskStatus;
import org.nasdanika.models.a2a.TaskStatusUpdateEvent;
import org.nasdanika.models.a2a.TextPart;
import org.nasdanika.models.a2a.UnsupportedOperationError;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class A2aFactoryImpl extends EFactoryImpl implements A2aFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static A2aFactory init() {
		try {
			A2aFactory theA2aFactory = (A2aFactory)EPackage.Registry.INSTANCE.getEFactory(A2aPackage.eNS_URI);
			if (theA2aFactory != null) {
				return theA2aFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new A2aFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A2aFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case A2aPackage.TASK: return createTask();
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR: return createUnsupportedOperationError();
			case A2aPackage.JSONRPC_REQUEST: return createJSONRPCRequest();
			case A2aPackage.TASK_STATUS_UPDATE_EVENT: return createTaskStatusUpdateEvent();
			case A2aPackage.AUTHENTICATION_INFO: return createAuthenticationInfo();
			case A2aPackage.SEND_TASK_STREAMING_RESPONSE_RESULT: return createSendTaskStreamingResponseResult();
			case A2aPackage.SEND_TASK_STREAMING_RESPONSE: return createSendTaskStreamingResponse();
			case A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG: return createTaskPushNotificationConfig();
			case A2aPackage.AGENT_CARD: return createAgentCard();
			case A2aPackage.AGENT_CAPABILITIES: return createAgentCapabilities();
			case A2aPackage.SEND_TASK_REQUEST: return createSendTaskRequest();
			case A2aPackage.JSON_PARSE_ERROR: return createJSONParseError();
			case A2aPackage.DATA_PART: return createDataPart();
			case A2aPackage.INVALID_REQUEST_ERROR: return createInvalidRequestError();
			case A2aPackage.A2A_REQUEST: return createA2ARequest();
			case A2aPackage.TASK_NOT_FOUND_ERROR: return createTaskNotFoundError();
			case A2aPackage.JSONRPC_RESPONSE: return createJSONRPCResponse();
			case A2aPackage.FILE_PART: return createFilePart();
			case A2aPackage.TASK_QUERY_PARAMS: return createTaskQueryParams();
			case A2aPackage.PUSH_NOTIFICATION_CONFIG: return createPushNotificationConfig();
			case A2aPackage.PART: return createPart();
			case A2aPackage.INTERNAL_ERROR: return createInternalError();
			case A2aPackage.AGENT_AUTHENTICATION: return createAgentAuthentication();
			case A2aPackage.PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR: return createPushNotificationNotSupportedError();
			case A2aPackage.GET_TASK_REQUEST: return createGetTaskRequest();
			case A2aPackage.AGENT_SKILL: return createAgentSkill();
			case A2aPackage.MESSAGE: return createMessage();
			case A2aPackage.SEND_TASK_STREAMING_REQUEST: return createSendTaskStreamingRequest();
			case A2aPackage.GET_TASK_PUSH_NOTIFICATION_REQUEST: return createGetTaskPushNotificationRequest();
			case A2aPackage.JSONRPC_ERROR: return createJSONRPCError();
			case A2aPackage.INVALID_PARAMS_ERROR: return createInvalidParamsError();
			case A2aPackage.CANCEL_TASK_RESPONSE: return createCancelTaskResponse();
			case A2aPackage.SEND_TASK_RESPONSE: return createSendTaskResponse();
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST: return createSetTaskPushNotificationRequest();
			case A2aPackage.TEXT_PART: return createTextPart();
			case A2aPackage.GET_TASK_RESPONSE: return createGetTaskResponse();
			case A2aPackage.TASK_SEND_PARAMS: return createTaskSendParams();
			case A2aPackage.TASK_STATUS: return createTaskStatus();
			case A2aPackage.ARTIFACT: return createArtifact();
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_RESPONSE: return createSetTaskPushNotificationResponse();
			case A2aPackage.FILE_CONTENT: return createFileContent();
			case A2aPackage.METHOD_NOT_FOUND_ERROR: return createMethodNotFoundError();
			case A2aPackage.TASK_RESUBSCRIPTION_REQUEST: return createTaskResubscriptionRequest();
			case A2aPackage.JSONRPC_MESSAGE: return createJSONRPCMessage();
			case A2aPackage.TASK_ID_PARAMS: return createTaskIdParams();
			case A2aPackage.TASK_NOT_CANCELABLE_ERROR: return createTaskNotCancelableError();
			case A2aPackage.CANCEL_TASK_REQUEST: return createCancelTaskRequest();
			case A2aPackage.GET_TASK_PUSH_NOTIFICATION_RESPONSE: return createGetTaskPushNotificationResponse();
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT: return createTaskArtifactUpdateEvent();
			case A2aPackage.AGENT_PROVIDER: return createAgentProvider();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case A2aPackage.TASK_STATE:
				return createTaskStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case A2aPackage.TASK_STATE:
				return convertTaskStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsupportedOperationError createUnsupportedOperationError() {
		UnsupportedOperationErrorImpl unsupportedOperationError = new UnsupportedOperationErrorImpl();
		return unsupportedOperationError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSONRPCRequest createJSONRPCRequest() {
		JSONRPCRequestImpl jsonrpcRequest = new JSONRPCRequestImpl();
		return jsonrpcRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskStatusUpdateEvent createTaskStatusUpdateEvent() {
		TaskStatusUpdateEventImpl taskStatusUpdateEvent = new TaskStatusUpdateEventImpl();
		return taskStatusUpdateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationInfo createAuthenticationInfo() {
		AuthenticationInfoImpl authenticationInfo = new AuthenticationInfoImpl();
		return authenticationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendTaskStreamingResponseResult createSendTaskStreamingResponseResult() {
		SendTaskStreamingResponseResultImpl sendTaskStreamingResponseResult = new SendTaskStreamingResponseResultImpl();
		return sendTaskStreamingResponseResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendTaskStreamingResponse createSendTaskStreamingResponse() {
		SendTaskStreamingResponseImpl sendTaskStreamingResponse = new SendTaskStreamingResponseImpl();
		return sendTaskStreamingResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskPushNotificationConfig createTaskPushNotificationConfig() {
		TaskPushNotificationConfigImpl taskPushNotificationConfig = new TaskPushNotificationConfigImpl();
		return taskPushNotificationConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentCard createAgentCard() {
		AgentCardImpl agentCard = new AgentCardImpl();
		return agentCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentCapabilities createAgentCapabilities() {
		AgentCapabilitiesImpl agentCapabilities = new AgentCapabilitiesImpl();
		return agentCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendTaskRequest createSendTaskRequest() {
		SendTaskRequestImpl sendTaskRequest = new SendTaskRequestImpl();
		return sendTaskRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSONParseError createJSONParseError() {
		JSONParseErrorImpl jsonParseError = new JSONParseErrorImpl();
		return jsonParseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataPart createDataPart() {
		DataPartImpl dataPart = new DataPartImpl();
		return dataPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvalidRequestError createInvalidRequestError() {
		InvalidRequestErrorImpl invalidRequestError = new InvalidRequestErrorImpl();
		return invalidRequestError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A2ARequest createA2ARequest() {
		A2ARequestImpl a2ARequest = new A2ARequestImpl();
		return a2ARequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskNotFoundError createTaskNotFoundError() {
		TaskNotFoundErrorImpl taskNotFoundError = new TaskNotFoundErrorImpl();
		return taskNotFoundError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSONRPCResponse createJSONRPCResponse() {
		JSONRPCResponseImpl jsonrpcResponse = new JSONRPCResponseImpl();
		return jsonrpcResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilePart createFilePart() {
		FilePartImpl filePart = new FilePartImpl();
		return filePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskQueryParams createTaskQueryParams() {
		TaskQueryParamsImpl taskQueryParams = new TaskQueryParamsImpl();
		return taskQueryParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PushNotificationConfig createPushNotificationConfig() {
		PushNotificationConfigImpl pushNotificationConfig = new PushNotificationConfigImpl();
		return pushNotificationConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.a2a.InternalError createInternalError() {
		InternalErrorImpl internalError = new InternalErrorImpl();
		return internalError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentAuthentication createAgentAuthentication() {
		AgentAuthenticationImpl agentAuthentication = new AgentAuthenticationImpl();
		return agentAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PushNotificationNotSupportedError createPushNotificationNotSupportedError() {
		PushNotificationNotSupportedErrorImpl pushNotificationNotSupportedError = new PushNotificationNotSupportedErrorImpl();
		return pushNotificationNotSupportedError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTaskRequest createGetTaskRequest() {
		GetTaskRequestImpl getTaskRequest = new GetTaskRequestImpl();
		return getTaskRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentSkill createAgentSkill() {
		AgentSkillImpl agentSkill = new AgentSkillImpl();
		return agentSkill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendTaskStreamingRequest createSendTaskStreamingRequest() {
		SendTaskStreamingRequestImpl sendTaskStreamingRequest = new SendTaskStreamingRequestImpl();
		return sendTaskStreamingRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTaskPushNotificationRequest createGetTaskPushNotificationRequest() {
		GetTaskPushNotificationRequestImpl getTaskPushNotificationRequest = new GetTaskPushNotificationRequestImpl();
		return getTaskPushNotificationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSONRPCError createJSONRPCError() {
		JSONRPCErrorImpl jsonrpcError = new JSONRPCErrorImpl();
		return jsonrpcError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvalidParamsError createInvalidParamsError() {
		InvalidParamsErrorImpl invalidParamsError = new InvalidParamsErrorImpl();
		return invalidParamsError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CancelTaskResponse createCancelTaskResponse() {
		CancelTaskResponseImpl cancelTaskResponse = new CancelTaskResponseImpl();
		return cancelTaskResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendTaskResponse createSendTaskResponse() {
		SendTaskResponseImpl sendTaskResponse = new SendTaskResponseImpl();
		return sendTaskResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetTaskPushNotificationRequest createSetTaskPushNotificationRequest() {
		SetTaskPushNotificationRequestImpl setTaskPushNotificationRequest = new SetTaskPushNotificationRequestImpl();
		return setTaskPushNotificationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextPart createTextPart() {
		TextPartImpl textPart = new TextPartImpl();
		return textPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTaskResponse createGetTaskResponse() {
		GetTaskResponseImpl getTaskResponse = new GetTaskResponseImpl();
		return getTaskResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskSendParams createTaskSendParams() {
		TaskSendParamsImpl taskSendParams = new TaskSendParamsImpl();
		return taskSendParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskStatus createTaskStatus() {
		TaskStatusImpl taskStatus = new TaskStatusImpl();
		return taskStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetTaskPushNotificationResponse createSetTaskPushNotificationResponse() {
		SetTaskPushNotificationResponseImpl setTaskPushNotificationResponse = new SetTaskPushNotificationResponseImpl();
		return setTaskPushNotificationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileContent createFileContent() {
		FileContentImpl fileContent = new FileContentImpl();
		return fileContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodNotFoundError createMethodNotFoundError() {
		MethodNotFoundErrorImpl methodNotFoundError = new MethodNotFoundErrorImpl();
		return methodNotFoundError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskResubscriptionRequest createTaskResubscriptionRequest() {
		TaskResubscriptionRequestImpl taskResubscriptionRequest = new TaskResubscriptionRequestImpl();
		return taskResubscriptionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSONRPCMessage createJSONRPCMessage() {
		JSONRPCMessageImpl jsonrpcMessage = new JSONRPCMessageImpl();
		return jsonrpcMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskIdParams createTaskIdParams() {
		TaskIdParamsImpl taskIdParams = new TaskIdParamsImpl();
		return taskIdParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskNotCancelableError createTaskNotCancelableError() {
		TaskNotCancelableErrorImpl taskNotCancelableError = new TaskNotCancelableErrorImpl();
		return taskNotCancelableError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CancelTaskRequest createCancelTaskRequest() {
		CancelTaskRequestImpl cancelTaskRequest = new CancelTaskRequestImpl();
		return cancelTaskRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetTaskPushNotificationResponse createGetTaskPushNotificationResponse() {
		GetTaskPushNotificationResponseImpl getTaskPushNotificationResponse = new GetTaskPushNotificationResponseImpl();
		return getTaskPushNotificationResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskArtifactUpdateEvent createTaskArtifactUpdateEvent() {
		TaskArtifactUpdateEventImpl taskArtifactUpdateEvent = new TaskArtifactUpdateEventImpl();
		return taskArtifactUpdateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentProvider createAgentProvider() {
		AgentProviderImpl agentProvider = new AgentProviderImpl();
		return agentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskState createTaskStateFromString(EDataType eDataType, String initialValue) {
		TaskState result = TaskState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A2aPackage getA2aPackage() {
		return (A2aPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static A2aPackage getPackage() {
		return A2aPackage.eINSTANCE;
	}

} //A2aFactoryImpl
