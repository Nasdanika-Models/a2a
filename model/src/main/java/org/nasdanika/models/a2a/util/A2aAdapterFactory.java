/**
 */
package org.nasdanika.models.a2a.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.a2a.A2aPackage
 * @generated
 */
public class A2aAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static A2aPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A2aAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = A2aPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A2aSwitch<Adapter> modelSwitch =
		new A2aSwitch<Adapter>() {
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseUnsupportedOperationError(UnsupportedOperationError object) {
				return createUnsupportedOperationErrorAdapter();
			}
			@Override
			public Adapter caseJSONRPCRequest(JSONRPCRequest object) {
				return createJSONRPCRequestAdapter();
			}
			@Override
			public Adapter caseTaskStatusUpdateEvent(TaskStatusUpdateEvent object) {
				return createTaskStatusUpdateEventAdapter();
			}
			@Override
			public Adapter caseAuthenticationInfo(AuthenticationInfo object) {
				return createAuthenticationInfoAdapter();
			}
			@Override
			public Adapter caseSendTaskStreamingResponseResult(SendTaskStreamingResponseResult object) {
				return createSendTaskStreamingResponseResultAdapter();
			}
			@Override
			public Adapter caseSendTaskStreamingResponse(SendTaskStreamingResponse object) {
				return createSendTaskStreamingResponseAdapter();
			}
			@Override
			public Adapter caseTaskPushNotificationConfig(TaskPushNotificationConfig object) {
				return createTaskPushNotificationConfigAdapter();
			}
			@Override
			public Adapter caseAgentCard(AgentCard object) {
				return createAgentCardAdapter();
			}
			@Override
			public Adapter caseAgentCapabilities(AgentCapabilities object) {
				return createAgentCapabilitiesAdapter();
			}
			@Override
			public Adapter caseSendTaskRequest(SendTaskRequest object) {
				return createSendTaskRequestAdapter();
			}
			@Override
			public Adapter caseJSONParseError(JSONParseError object) {
				return createJSONParseErrorAdapter();
			}
			@Override
			public Adapter caseDataPart(DataPart object) {
				return createDataPartAdapter();
			}
			@Override
			public Adapter caseInvalidRequestError(InvalidRequestError object) {
				return createInvalidRequestErrorAdapter();
			}
			@Override
			public Adapter caseA2ARequest(A2ARequest object) {
				return createA2ARequestAdapter();
			}
			@Override
			public Adapter caseTaskNotFoundError(TaskNotFoundError object) {
				return createTaskNotFoundErrorAdapter();
			}
			@Override
			public Adapter caseJSONRPCResponse(JSONRPCResponse object) {
				return createJSONRPCResponseAdapter();
			}
			@Override
			public Adapter caseFilePart(FilePart object) {
				return createFilePartAdapter();
			}
			@Override
			public Adapter caseTaskQueryParams(TaskQueryParams object) {
				return createTaskQueryParamsAdapter();
			}
			@Override
			public Adapter casePushNotificationConfig(PushNotificationConfig object) {
				return createPushNotificationConfigAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter caseInternalError(org.nasdanika.models.a2a.InternalError object) {
				return createInternalErrorAdapter();
			}
			@Override
			public Adapter caseAgentAuthentication(AgentAuthentication object) {
				return createAgentAuthenticationAdapter();
			}
			@Override
			public Adapter casePushNotificationNotSupportedError(PushNotificationNotSupportedError object) {
				return createPushNotificationNotSupportedErrorAdapter();
			}
			@Override
			public Adapter caseGetTaskRequest(GetTaskRequest object) {
				return createGetTaskRequestAdapter();
			}
			@Override
			public Adapter caseAgentSkill(AgentSkill object) {
				return createAgentSkillAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseSendTaskStreamingRequest(SendTaskStreamingRequest object) {
				return createSendTaskStreamingRequestAdapter();
			}
			@Override
			public Adapter caseGetTaskPushNotificationRequest(GetTaskPushNotificationRequest object) {
				return createGetTaskPushNotificationRequestAdapter();
			}
			@Override
			public Adapter caseJSONRPCError(JSONRPCError object) {
				return createJSONRPCErrorAdapter();
			}
			@Override
			public Adapter caseInvalidParamsError(InvalidParamsError object) {
				return createInvalidParamsErrorAdapter();
			}
			@Override
			public Adapter caseCancelTaskResponse(CancelTaskResponse object) {
				return createCancelTaskResponseAdapter();
			}
			@Override
			public Adapter caseSendTaskResponse(SendTaskResponse object) {
				return createSendTaskResponseAdapter();
			}
			@Override
			public Adapter caseSetTaskPushNotificationRequest(SetTaskPushNotificationRequest object) {
				return createSetTaskPushNotificationRequestAdapter();
			}
			@Override
			public Adapter caseTextPart(TextPart object) {
				return createTextPartAdapter();
			}
			@Override
			public Adapter caseGetTaskResponse(GetTaskResponse object) {
				return createGetTaskResponseAdapter();
			}
			@Override
			public Adapter caseTaskSendParams(TaskSendParams object) {
				return createTaskSendParamsAdapter();
			}
			@Override
			public Adapter caseTaskStatus(TaskStatus object) {
				return createTaskStatusAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseSetTaskPushNotificationResponse(SetTaskPushNotificationResponse object) {
				return createSetTaskPushNotificationResponseAdapter();
			}
			@Override
			public Adapter caseFileContent(FileContent object) {
				return createFileContentAdapter();
			}
			@Override
			public Adapter caseMethodNotFoundError(MethodNotFoundError object) {
				return createMethodNotFoundErrorAdapter();
			}
			@Override
			public Adapter caseTaskResubscriptionRequest(TaskResubscriptionRequest object) {
				return createTaskResubscriptionRequestAdapter();
			}
			@Override
			public Adapter caseJSONRPCMessage(JSONRPCMessage object) {
				return createJSONRPCMessageAdapter();
			}
			@Override
			public Adapter caseTaskIdParams(TaskIdParams object) {
				return createTaskIdParamsAdapter();
			}
			@Override
			public Adapter caseTaskNotCancelableError(TaskNotCancelableError object) {
				return createTaskNotCancelableErrorAdapter();
			}
			@Override
			public Adapter caseCancelTaskRequest(CancelTaskRequest object) {
				return createCancelTaskRequestAdapter();
			}
			@Override
			public Adapter caseGetTaskPushNotificationResponse(GetTaskPushNotificationResponse object) {
				return createGetTaskPushNotificationResponseAdapter();
			}
			@Override
			public Adapter caseTaskArtifactUpdateEvent(TaskArtifactUpdateEvent object) {
				return createTaskArtifactUpdateEventAdapter();
			}
			@Override
			public Adapter caseAgentProvider(AgentProvider object) {
				return createAgentProviderAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.UnsupportedOperationError <em>Unsupported Operation Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.UnsupportedOperationError
	 * @generated
	 */
	public Adapter createUnsupportedOperationErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.JSONRPCRequest <em>JSONRPC Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.JSONRPCRequest
	 * @generated
	 */
	public Adapter createJSONRPCRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.TaskStatusUpdateEvent <em>Task Status Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.TaskStatusUpdateEvent
	 * @generated
	 */
	public Adapter createTaskStatusUpdateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.AuthenticationInfo <em>Authentication Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.AuthenticationInfo
	 * @generated
	 */
	public Adapter createAuthenticationInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.SendTaskStreamingResponseResult <em>Send Task Streaming Response Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingResponseResult
	 * @generated
	 */
	public Adapter createSendTaskStreamingResponseResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.SendTaskStreamingResponse <em>Send Task Streaming Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingResponse
	 * @generated
	 */
	public Adapter createSendTaskStreamingResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.TaskPushNotificationConfig <em>Task Push Notification Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.TaskPushNotificationConfig
	 * @generated
	 */
	public Adapter createTaskPushNotificationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.AgentCard <em>Agent Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.AgentCard
	 * @generated
	 */
	public Adapter createAgentCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.AgentCapabilities <em>Agent Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.AgentCapabilities
	 * @generated
	 */
	public Adapter createAgentCapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.SendTaskRequest <em>Send Task Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.SendTaskRequest
	 * @generated
	 */
	public Adapter createSendTaskRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.JSONParseError <em>JSON Parse Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.JSONParseError
	 * @generated
	 */
	public Adapter createJSONParseErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.DataPart <em>Data Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.DataPart
	 * @generated
	 */
	public Adapter createDataPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.InvalidRequestError <em>Invalid Request Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.InvalidRequestError
	 * @generated
	 */
	public Adapter createInvalidRequestErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.A2ARequest <em>A2A Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.A2ARequest
	 * @generated
	 */
	public Adapter createA2ARequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.TaskNotFoundError <em>Task Not Found Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.TaskNotFoundError
	 * @generated
	 */
	public Adapter createTaskNotFoundErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.JSONRPCResponse <em>JSONRPC Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.JSONRPCResponse
	 * @generated
	 */
	public Adapter createJSONRPCResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.FilePart <em>File Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.FilePart
	 * @generated
	 */
	public Adapter createFilePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.TaskQueryParams <em>Task Query Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.TaskQueryParams
	 * @generated
	 */
	public Adapter createTaskQueryParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.PushNotificationConfig <em>Push Notification Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.PushNotificationConfig
	 * @generated
	 */
	public Adapter createPushNotificationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.InternalError <em>Internal Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.InternalError
	 * @generated
	 */
	public Adapter createInternalErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.AgentAuthentication <em>Agent Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.AgentAuthentication
	 * @generated
	 */
	public Adapter createAgentAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.PushNotificationNotSupportedError <em>Push Notification Not Supported Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.PushNotificationNotSupportedError
	 * @generated
	 */
	public Adapter createPushNotificationNotSupportedErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.GetTaskRequest <em>Get Task Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.GetTaskRequest
	 * @generated
	 */
	public Adapter createGetTaskRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.AgentSkill <em>Agent Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.AgentSkill
	 * @generated
	 */
	public Adapter createAgentSkillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.SendTaskStreamingRequest <em>Send Task Streaming Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.SendTaskStreamingRequest
	 * @generated
	 */
	public Adapter createSendTaskStreamingRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.GetTaskPushNotificationRequest <em>Get Task Push Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.GetTaskPushNotificationRequest
	 * @generated
	 */
	public Adapter createGetTaskPushNotificationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.JSONRPCError <em>JSONRPC Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.JSONRPCError
	 * @generated
	 */
	public Adapter createJSONRPCErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.InvalidParamsError <em>Invalid Params Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.InvalidParamsError
	 * @generated
	 */
	public Adapter createInvalidParamsErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.CancelTaskResponse <em>Cancel Task Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.CancelTaskResponse
	 * @generated
	 */
	public Adapter createCancelTaskResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.SendTaskResponse <em>Send Task Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.SendTaskResponse
	 * @generated
	 */
	public Adapter createSendTaskResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.SetTaskPushNotificationRequest <em>Set Task Push Notification Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.SetTaskPushNotificationRequest
	 * @generated
	 */
	public Adapter createSetTaskPushNotificationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.TextPart <em>Text Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.TextPart
	 * @generated
	 */
	public Adapter createTextPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.GetTaskResponse <em>Get Task Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.GetTaskResponse
	 * @generated
	 */
	public Adapter createGetTaskResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.TaskSendParams <em>Task Send Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.TaskSendParams
	 * @generated
	 */
	public Adapter createTaskSendParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.TaskStatus <em>Task Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.TaskStatus
	 * @generated
	 */
	public Adapter createTaskStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.SetTaskPushNotificationResponse <em>Set Task Push Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.SetTaskPushNotificationResponse
	 * @generated
	 */
	public Adapter createSetTaskPushNotificationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.FileContent <em>File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.FileContent
	 * @generated
	 */
	public Adapter createFileContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.MethodNotFoundError <em>Method Not Found Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.MethodNotFoundError
	 * @generated
	 */
	public Adapter createMethodNotFoundErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.TaskResubscriptionRequest <em>Task Resubscription Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.TaskResubscriptionRequest
	 * @generated
	 */
	public Adapter createTaskResubscriptionRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.JSONRPCMessage <em>JSONRPC Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.JSONRPCMessage
	 * @generated
	 */
	public Adapter createJSONRPCMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.TaskIdParams <em>Task Id Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.TaskIdParams
	 * @generated
	 */
	public Adapter createTaskIdParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.TaskNotCancelableError <em>Task Not Cancelable Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.TaskNotCancelableError
	 * @generated
	 */
	public Adapter createTaskNotCancelableErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.CancelTaskRequest <em>Cancel Task Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.CancelTaskRequest
	 * @generated
	 */
	public Adapter createCancelTaskRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.GetTaskPushNotificationResponse <em>Get Task Push Notification Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.GetTaskPushNotificationResponse
	 * @generated
	 */
	public Adapter createGetTaskPushNotificationResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.TaskArtifactUpdateEvent <em>Task Artifact Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.TaskArtifactUpdateEvent
	 * @generated
	 */
	public Adapter createTaskArtifactUpdateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.a2a.AgentProvider <em>Agent Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.a2a.AgentProvider
	 * @generated
	 */
	public Adapter createAgentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //A2aAdapterFactory
