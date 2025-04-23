/**
 */
package org.nasdanika.models.a2a.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.a2a.A2ARequest;
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
import org.nasdanika.models.a2a.TaskStatus;
import org.nasdanika.models.a2a.TaskStatusUpdateEvent;
import org.nasdanika.models.a2a.TextPart;
import org.nasdanika.models.a2a.UnsupportedOperationError;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.a2a.A2aPackage
 * @generated
 */
public class A2aSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static A2aPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A2aSwitch() {
		if (modelPackage == null) {
			modelPackage = A2aPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case A2aPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.UNSUPPORTED_OPERATION_ERROR: {
				UnsupportedOperationError unsupportedOperationError = (UnsupportedOperationError)theEObject;
				T result = caseUnsupportedOperationError(unsupportedOperationError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.JSONRPC_REQUEST: {
				JSONRPCRequest jsonrpcRequest = (JSONRPCRequest)theEObject;
				T result = caseJSONRPCRequest(jsonrpcRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.TASK_STATUS_UPDATE_EVENT: {
				TaskStatusUpdateEvent taskStatusUpdateEvent = (TaskStatusUpdateEvent)theEObject;
				T result = caseTaskStatusUpdateEvent(taskStatusUpdateEvent);
				if (result == null) result = caseSendTaskStreamingResponseResult(taskStatusUpdateEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.AUTHENTICATION_INFO: {
				AuthenticationInfo authenticationInfo = (AuthenticationInfo)theEObject;
				T result = caseAuthenticationInfo(authenticationInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.SEND_TASK_STREAMING_RESPONSE_RESULT: {
				SendTaskStreamingResponseResult sendTaskStreamingResponseResult = (SendTaskStreamingResponseResult)theEObject;
				T result = caseSendTaskStreamingResponseResult(sendTaskStreamingResponseResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.SEND_TASK_STREAMING_RESPONSE: {
				SendTaskStreamingResponse sendTaskStreamingResponse = (SendTaskStreamingResponse)theEObject;
				T result = caseSendTaskStreamingResponse(sendTaskStreamingResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.TASK_PUSH_NOTIFICATION_CONFIG: {
				TaskPushNotificationConfig taskPushNotificationConfig = (TaskPushNotificationConfig)theEObject;
				T result = caseTaskPushNotificationConfig(taskPushNotificationConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.AGENT_CARD: {
				AgentCard agentCard = (AgentCard)theEObject;
				T result = caseAgentCard(agentCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.AGENT_CAPABILITIES: {
				AgentCapabilities agentCapabilities = (AgentCapabilities)theEObject;
				T result = caseAgentCapabilities(agentCapabilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.SEND_TASK_REQUEST: {
				SendTaskRequest sendTaskRequest = (SendTaskRequest)theEObject;
				T result = caseSendTaskRequest(sendTaskRequest);
				if (result == null) result = caseA2ARequest(sendTaskRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.JSON_PARSE_ERROR: {
				JSONParseError jsonParseError = (JSONParseError)theEObject;
				T result = caseJSONParseError(jsonParseError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.DATA_PART: {
				DataPart dataPart = (DataPart)theEObject;
				T result = caseDataPart(dataPart);
				if (result == null) result = casePart(dataPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.INVALID_REQUEST_ERROR: {
				InvalidRequestError invalidRequestError = (InvalidRequestError)theEObject;
				T result = caseInvalidRequestError(invalidRequestError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.A2A_REQUEST: {
				A2ARequest a2ARequest = (A2ARequest)theEObject;
				T result = caseA2ARequest(a2ARequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.TASK_NOT_FOUND_ERROR: {
				TaskNotFoundError taskNotFoundError = (TaskNotFoundError)theEObject;
				T result = caseTaskNotFoundError(taskNotFoundError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.JSONRPC_RESPONSE: {
				JSONRPCResponse jsonrpcResponse = (JSONRPCResponse)theEObject;
				T result = caseJSONRPCResponse(jsonrpcResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.FILE_PART: {
				FilePart filePart = (FilePart)theEObject;
				T result = caseFilePart(filePart);
				if (result == null) result = casePart(filePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.TASK_QUERY_PARAMS: {
				TaskQueryParams taskQueryParams = (TaskQueryParams)theEObject;
				T result = caseTaskQueryParams(taskQueryParams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.PUSH_NOTIFICATION_CONFIG: {
				PushNotificationConfig pushNotificationConfig = (PushNotificationConfig)theEObject;
				T result = casePushNotificationConfig(pushNotificationConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.PART: {
				Part part = (Part)theEObject;
				T result = casePart(part);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.INTERNAL_ERROR: {
				org.nasdanika.models.a2a.InternalError internalError = (org.nasdanika.models.a2a.InternalError)theEObject;
				T result = caseInternalError(internalError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.AGENT_AUTHENTICATION: {
				AgentAuthentication agentAuthentication = (AgentAuthentication)theEObject;
				T result = caseAgentAuthentication(agentAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.PUSH_NOTIFICATION_NOT_SUPPORTED_ERROR: {
				PushNotificationNotSupportedError pushNotificationNotSupportedError = (PushNotificationNotSupportedError)theEObject;
				T result = casePushNotificationNotSupportedError(pushNotificationNotSupportedError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.GET_TASK_REQUEST: {
				GetTaskRequest getTaskRequest = (GetTaskRequest)theEObject;
				T result = caseGetTaskRequest(getTaskRequest);
				if (result == null) result = caseA2ARequest(getTaskRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.AGENT_SKILL: {
				AgentSkill agentSkill = (AgentSkill)theEObject;
				T result = caseAgentSkill(agentSkill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.SEND_TASK_STREAMING_REQUEST: {
				SendTaskStreamingRequest sendTaskStreamingRequest = (SendTaskStreamingRequest)theEObject;
				T result = caseSendTaskStreamingRequest(sendTaskStreamingRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.GET_TASK_PUSH_NOTIFICATION_REQUEST: {
				GetTaskPushNotificationRequest getTaskPushNotificationRequest = (GetTaskPushNotificationRequest)theEObject;
				T result = caseGetTaskPushNotificationRequest(getTaskPushNotificationRequest);
				if (result == null) result = caseA2ARequest(getTaskPushNotificationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.JSONRPC_ERROR: {
				JSONRPCError jsonrpcError = (JSONRPCError)theEObject;
				T result = caseJSONRPCError(jsonrpcError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.INVALID_PARAMS_ERROR: {
				InvalidParamsError invalidParamsError = (InvalidParamsError)theEObject;
				T result = caseInvalidParamsError(invalidParamsError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.CANCEL_TASK_RESPONSE: {
				CancelTaskResponse cancelTaskResponse = (CancelTaskResponse)theEObject;
				T result = caseCancelTaskResponse(cancelTaskResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.SEND_TASK_RESPONSE: {
				SendTaskResponse sendTaskResponse = (SendTaskResponse)theEObject;
				T result = caseSendTaskResponse(sendTaskResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_REQUEST: {
				SetTaskPushNotificationRequest setTaskPushNotificationRequest = (SetTaskPushNotificationRequest)theEObject;
				T result = caseSetTaskPushNotificationRequest(setTaskPushNotificationRequest);
				if (result == null) result = caseA2ARequest(setTaskPushNotificationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.TEXT_PART: {
				TextPart textPart = (TextPart)theEObject;
				T result = caseTextPart(textPart);
				if (result == null) result = casePart(textPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.GET_TASK_RESPONSE: {
				GetTaskResponse getTaskResponse = (GetTaskResponse)theEObject;
				T result = caseGetTaskResponse(getTaskResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.TASK_SEND_PARAMS: {
				TaskSendParams taskSendParams = (TaskSendParams)theEObject;
				T result = caseTaskSendParams(taskSendParams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.TASK_STATUS: {
				TaskStatus taskStatus = (TaskStatus)theEObject;
				T result = caseTaskStatus(taskStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.SET_TASK_PUSH_NOTIFICATION_RESPONSE: {
				SetTaskPushNotificationResponse setTaskPushNotificationResponse = (SetTaskPushNotificationResponse)theEObject;
				T result = caseSetTaskPushNotificationResponse(setTaskPushNotificationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.FILE_CONTENT: {
				FileContent fileContent = (FileContent)theEObject;
				T result = caseFileContent(fileContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.METHOD_NOT_FOUND_ERROR: {
				MethodNotFoundError methodNotFoundError = (MethodNotFoundError)theEObject;
				T result = caseMethodNotFoundError(methodNotFoundError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.TASK_RESUBSCRIPTION_REQUEST: {
				TaskResubscriptionRequest taskResubscriptionRequest = (TaskResubscriptionRequest)theEObject;
				T result = caseTaskResubscriptionRequest(taskResubscriptionRequest);
				if (result == null) result = caseA2ARequest(taskResubscriptionRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.JSONRPC_MESSAGE: {
				JSONRPCMessage jsonrpcMessage = (JSONRPCMessage)theEObject;
				T result = caseJSONRPCMessage(jsonrpcMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.TASK_ID_PARAMS: {
				TaskIdParams taskIdParams = (TaskIdParams)theEObject;
				T result = caseTaskIdParams(taskIdParams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.TASK_NOT_CANCELABLE_ERROR: {
				TaskNotCancelableError taskNotCancelableError = (TaskNotCancelableError)theEObject;
				T result = caseTaskNotCancelableError(taskNotCancelableError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.CANCEL_TASK_REQUEST: {
				CancelTaskRequest cancelTaskRequest = (CancelTaskRequest)theEObject;
				T result = caseCancelTaskRequest(cancelTaskRequest);
				if (result == null) result = caseA2ARequest(cancelTaskRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.GET_TASK_PUSH_NOTIFICATION_RESPONSE: {
				GetTaskPushNotificationResponse getTaskPushNotificationResponse = (GetTaskPushNotificationResponse)theEObject;
				T result = caseGetTaskPushNotificationResponse(getTaskPushNotificationResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.TASK_ARTIFACT_UPDATE_EVENT: {
				TaskArtifactUpdateEvent taskArtifactUpdateEvent = (TaskArtifactUpdateEvent)theEObject;
				T result = caseTaskArtifactUpdateEvent(taskArtifactUpdateEvent);
				if (result == null) result = caseSendTaskStreamingResponseResult(taskArtifactUpdateEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case A2aPackage.AGENT_PROVIDER: {
				AgentProvider agentProvider = (AgentProvider)theEObject;
				T result = caseAgentProvider(agentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsupported Operation Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsupported Operation Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsupportedOperationError(UnsupportedOperationError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSONRPC Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSONRPC Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONRPCRequest(JSONRPCRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Status Update Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Status Update Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskStatusUpdateEvent(TaskStatusUpdateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationInfo(AuthenticationInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Task Streaming Response Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Task Streaming Response Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendTaskStreamingResponseResult(SendTaskStreamingResponseResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Task Streaming Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Task Streaming Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendTaskStreamingResponse(SendTaskStreamingResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Push Notification Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Push Notification Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskPushNotificationConfig(TaskPushNotificationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentCard(AgentCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Capabilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentCapabilities(AgentCapabilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Task Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Task Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendTaskRequest(SendTaskRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Parse Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Parse Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONParseError(JSONParseError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPart(DataPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Request Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Request Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidRequestError(InvalidRequestError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A2A Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A2A Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA2ARequest(A2ARequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Not Found Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Not Found Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskNotFoundError(TaskNotFoundError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSONRPC Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSONRPC Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONRPCResponse(JSONRPCResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilePart(FilePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Query Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Query Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskQueryParams(TaskQueryParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Notification Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Notification Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushNotificationConfig(PushNotificationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalError(org.nasdanika.models.a2a.InternalError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentAuthentication(AgentAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Notification Not Supported Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Notification Not Supported Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushNotificationNotSupportedError(PushNotificationNotSupportedError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Task Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Task Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTaskRequest(GetTaskRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Skill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Skill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentSkill(AgentSkill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Task Streaming Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Task Streaming Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendTaskStreamingRequest(SendTaskStreamingRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Task Push Notification Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Task Push Notification Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTaskPushNotificationRequest(GetTaskPushNotificationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSONRPC Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSONRPC Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONRPCError(JSONRPCError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Params Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Params Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidParamsError(InvalidParamsError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Task Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Task Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelTaskResponse(CancelTaskResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Task Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Task Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendTaskResponse(SendTaskResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Task Push Notification Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Task Push Notification Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTaskPushNotificationRequest(SetTaskPushNotificationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextPart(TextPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Task Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Task Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTaskResponse(GetTaskResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Send Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Send Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskSendParams(TaskSendParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskStatus(TaskStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Task Push Notification Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Task Push Notification Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTaskPushNotificationResponse(SetTaskPushNotificationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileContent(FileContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Not Found Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Not Found Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodNotFoundError(MethodNotFoundError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Resubscription Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Resubscription Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskResubscriptionRequest(TaskResubscriptionRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSONRPC Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSONRPC Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONRPCMessage(JSONRPCMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Id Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Id Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskIdParams(TaskIdParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Not Cancelable Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Not Cancelable Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskNotCancelableError(TaskNotCancelableError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Task Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Task Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelTaskRequest(CancelTaskRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Task Push Notification Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Task Push Notification Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTaskPushNotificationResponse(GetTaskPushNotificationResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Artifact Update Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Artifact Update Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskArtifactUpdateEvent(TaskArtifactUpdateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentProvider(AgentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //A2aSwitch
